package week03.lab.lab3;

import java.util.Scanner;

public class TemperatureConverterWithTernary {
    public static void main(String[] args) {
        System.out.print("Please enter a temperature value in the Celsius scale: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double convertedTemp = 0;
        System.out.print("Please enter a temperature scale for conversion (K/F/R): ");
        char tempScale = sc.next().charAt(0);
        sc.close();
        String scaleName = "";
        convertedTemp += (tempScale == 'K' || tempScale == 'k') ? celsius + 273.15 :
                         (tempScale == 'F' || tempScale == 'f') ? (celsius * 9 / 5) + 32 :
                         (tempScale == 'R' || tempScale == 'r') ? (celsius + 273.15) * 1.8 : 0;

        scaleName += (tempScale == 'K' || tempScale == 'k') ? "Kelvin" :
                     (tempScale == 'F' || tempScale == 'f') ? "Fahrenheit" :
                     (tempScale == 'R' || tempScale == 'r') ? "Rankine" : "Invalid temperature scale!";

        if (convertedTemp>0) {
            System.out.print(scaleName + ": " + convertedTemp); 
        } else {
            System.out.print(scaleName); 
        }
    }
}
