package lab.week03;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter num: ");
        float num = sc.nextFloat();
        sc.close();
        
        String result ;

        result = (num > 0) ? " is the positive" : (num < 0) ? " is the negative" : " is the";
        result += ((int)(num) % 2 == 0) ? " even " : " odd ";
        result += (num % 1 == 0) ? "integer number." : "real number.";

        System.out.print(num + result);

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