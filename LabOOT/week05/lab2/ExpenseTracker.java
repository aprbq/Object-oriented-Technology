package week05.lab.lab2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        double amount = 1000, totalIncome = 0, totalExpense = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        do {
            System.out.println("===== Expense Tracker =====\nCurrent amount: " + df.format(amount));
            System.out.println("+ : Income\n- : Expense \nx : Termination");
            System.out.print("Please enter your choice: ");
            choice = sc.next().charAt(0);
            switch (choice) {
                case '+':
                    double income = addIncome(amount, sc);
                    totalIncome += income - amount;
                    amount = income;
                    System.out.println();
                    break;
                case '-':
                    double expense = addExpense(amount, sc);
                    totalExpense += amount - expense;
                    amount = expense;
        
                    System.out.println();
                    break;
                case 'x':
                    System.out.println("Exiting...\n");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        } while (choice != 'x');
        printSummary(amount, totalIncome, totalExpense, df);
        sc.close();
    }

    public static double addIncome(double amount, Scanner sc) {
        System.out.print("Enter an income amount: ");
        double income = sc.nextDouble();
        amount += income;
        return amount;
    }

    public static double addExpense(double amount, Scanner sc) {
        System.out.print("Enter an expense amount: ");
        double expense = sc.nextDouble();
        if (expense > amount) {
            System.out.println("Invalid amount! Please try again.");
            return amount;
        } else {
            return amount-expense;
        }
    }

    public static void printSummary(double amount, double income, double expense, DecimalFormat df) {
        System.out.println("===== Summary =====");
        System.out.println("Total Income: " + df.format(income));
        System.out.println("Total Expense: " + df.format(expense));
        System.out.println("Total Amount: " + df.format(amount));
    }
}
