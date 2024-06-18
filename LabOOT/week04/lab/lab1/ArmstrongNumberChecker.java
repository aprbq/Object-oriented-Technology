package week04.lab.lab1;

import java.util.Scanner; 
public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, temp, digit;
        System.out.print("Please enter a positive integer: ");
        int number = sc.nextInt();
        sc.close();
        temp = number;
        while (temp != 0) {
            temp /= 10;
            count++ ;
        }
        temp = number;
        while (temp !=  0) {
            digit = temp % 10 ;
            sum += Math.pow(digit,count);
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstong number.");
        } else {
            System.out.println(number + " is not an Armstong number.");
        }
    }
}
