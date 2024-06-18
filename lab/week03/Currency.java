package lab.week03;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency:");
        String cur = sc.nextLine();
        double total = 0;
        if (cur == "EUR") {
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount*37.45;
        } else if (cur == "KRW") {
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount*0.028;
        } else {
            System.out.println("Please choose the proper currency");
        }
        String formattedTotal = String.format("%.1f", total);
        System.out.println("You earn "+ formattedTotal + " THB");
        sc.close();
    }
}
