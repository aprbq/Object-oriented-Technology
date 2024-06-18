package week02.lab.lab3;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a five-digit integer: ");
        int num = sc.nextInt();
        sc.close();
        int a = num / 10000;
        int b = (num / 1000) % 10;
        int c = (num / 100) % 10;
        int d = (num / 10) % 10;
        int e = num % 10;
        int sum = a + b + c + d + e;
        System.out.println("The sum of all digits in " + num + " is " + sum +".");
    }
}

