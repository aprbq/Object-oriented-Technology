package lab.test;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter integer number: ");

        int num = sc.nextInt();
        int count=0;

        for (int i = 1; i <= num; i++) {
            if (num%i == 0) count++;
        }
        if (count == 2) {
            System.out.print(num+" is Prime number.");
        } else {
            System.out.print(num+" is Not Prime number.");
        }
    }
}
