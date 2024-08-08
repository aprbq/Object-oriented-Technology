#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <math.h>
#include <unistd.h>

typedef struct nd {
    int numData;
    char *strData;
    struct nd *next;
} node;

node *top = NULL;

void push(int numData, char *strData) {
    node *n = malloc(sizeof(node));
    if (strData) {
        n->strData = strdup(strData);
    } else {
        n->numData = numData;
    }
    n->next = top;
    top = n;
}

int pop(int *numData, char **strData) {
    if (top == NULL) {
        return 0;
    }
    if (numData) {
        *numData = top->numData;
    }
    if (strData) {
        *strData = top->strData;
    }
    node *temp = top;
    top = top->next;
    free(temp);
    
    return 1;
}

int isEmpty() {
    return (top == NULL);
}

void printStack(int isNumber) {
    node *reversed_stack = NULL;
    node *temp = top;
    while (temp != NULL) {
        node *n = malloc(sizeof(node));
        if (isNumber) {
            n->numData = temp->numData;
        } else {
            n->strData = strdup(temp->strData);
        }
        n->next = reversed_stack;
        reversed_stack = n;
        temp = temp->next;
    }
    temp = reversed_stack;
    while (temp != NULL) {
        if (isNumber) {
            printf("%d", temp->numData);
            if (temp->next != NULL)
                printf(",");
        } else {
            printf("%s", temp->strData);
        }
        temp = temp->next;
    }
    printf("\n");
}
int evaluatePostfix(char *postfix, int isNumber) {
    printf("------------------------------------------------------------");
    printf("\n%-6s %-12s %-15s\n", "Step", "Symbol", "Stack");
    printf("------------------------------------------------------------\n");
    
    int i = 0;
    while (postfix[i] != '\0') {
        printf(" %-7d %-10c ",i+1, postfix[i]);
        if (isdigit(postfix[i]) || isalpha(postfix[i])) {
            if (isdigit(postfix[i])) {
                push(postfix[i] - '0', NULL);
            } else {
                char strtemp[100];
                sprintf(strtemp, "%c", postfix[i]);
                push(0, strtemp);
            }
        } else {
            int operand2, operand1;
            char *operandStr2, *operandStr1;
            pop(&operand2, &operandStr2);
            pop(&operand1, &operandStr1);
            int result = 0;
            if (isNumber) {
                if (postfix[i] == '+') {
                    result = operand1 + operand2;
                } else if (postfix[i] == '-') {
                    result = operand1 - operand2;
                } else if (postfix[i] == '*') {
                    result = operand1 * operand2;
                } else if (postfix[i] == '/') {
                    result = operand1 / operand2;
                } else if (postfix[i] == '^') {
                    result = pow(operand1, operand2);
                }
                push(result, NULL);
            } else {
                char resultStr[100];
                snprintf(resultStr, 100, "(%s%c%s)", operandStr1, postfix[i], operandStr2);
                push(0, resultStr);
            }
        }
        printStack(isNumber);
        i++;
    }
    
    if (!isEmpty()) {
        if (isNumber) {
            int result;
            pop(&result, NULL);
            printf("------------------------------------------------------------\n");
            printf("Result: %d\n", result);
            printf("------------------------------------------------------------\n");
        } else {
            char *result;
            pop(NULL, &result);
            printf("------------------------------------------------------------\n");
            printf("Result: %s\n", result);
            printf("------------------------------------------------------------\n");
            free(result);
        }
    }
    return 0;
}

int main() {
    char postfix[100];
    printf("Enter postfix: ");
    scanf("%s", postfix);
    if (isdigit(postfix[0])) {
        evaluatePostfix(postfix, 1);
    } else {
        evaluatePostfix(postfix, 0);
    }

    sleep(500000);
    return 0;
}
