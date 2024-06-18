package week05.lab.lab1;

import java.util.Scanner;

public class FactorialFinding {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System. in);
    System.out.print("Please enter a non-negative integer: ");
    int num = sc.nextInt ();
    printResult(num);
    sc.close();
    }
    public static int factorial(int n) {
        if ( n == 0|| n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void printResult(int n) {
        System.out.println("Factorial of " + n + ": " + factorial(n));
    }
}
    