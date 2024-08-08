package lab.test;
import java.util.Scanner;

public class BankCheck {
    public static void main(String[] args) {
        int age, income, dept, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter nation: ");
        char nation = sc.next().charAt(0);

        System.out.print("Enter income: ");
        income = sc.nextInt();

        System.out.print("Enter dept: ");
        dept = sc.nextInt(); 

        total =income / 2;
        
        if (nation == 'f' || nation == 'F' || nation == 't' || nation == 'T') {
            if ((nation == 't' || nation == 'T')) {
                if (age >= 20 && income > 15000 && dept < total) {
                    System.out.print("Congratulation! ");
                }
                else {
                    System.out.print("Sorry bro");
                }
            } else {
                if (age >= 20 && income > 25000 && dept < total) {
                    System.out.print("Congratulation! ");
                }
                else {
                    System.out.print("Sorry bro");
                }
            }
        } else {
            System.out.print("Sorry bro");
        }
        sc.close();
        
    }
}
