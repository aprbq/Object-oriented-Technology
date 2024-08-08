package week03.lab.lab2;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        double num = sc.nextDouble();
        sc.close();
        String result = "";

        result += (num>0) ? " positive" : (num<0) ? " negative" : "";
        result += ((int)(num)%2 == 0) ? " even " : " odd ";
        result += (num%1 == 0) ? "integer" : "real";
        System.out.print(num + " is the" + result + " number.");
        /*if (num > 0) {
            result += "positive";
        } else if (num < 0) {
            result += "negative";
        } 
        if ((int)num % 2 == 0) {
            result += " even ";
        } else {
            result += " odd ";
        }
        if (num % 1 == 0) {
            result += "integer";
        } else {
            result += "real";
        }*/
    }
}
