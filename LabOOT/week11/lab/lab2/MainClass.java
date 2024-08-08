package week11.lab.lab2;


import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");

        System.out.println("You have " + calc.getName());
        System.out.print("Enter your equation: ");
        String str = sc.nextLine();

        String[] sp = str.split(" ");
        sc.close();
        try {

            if (sp.length%2 == 0){
                throw new EquationException("Incomplete equation");
            }

            for (int i = 0; i < sp.length; i += 2){
                for (int j = 0; j < sp[i].length(); j++){
                    if (sp[i].charAt(j) != '.' && Character.isDigit(sp[i].charAt(j)) != true) {
                        throw new NonDigitException(sp[i] + " contains non-digit characters");
                    }
                }
            }

            double result = Double.parseDouble(sp[0]);

            for (int i = 1; i < sp.length; i += 2) {
                String operator = sp[i];
                double operand = Double.parseDouble(sp[i + 1]);

                switch (operator) {
                    case "+":
                        result = calc.add(result, operand);
                        break;
                    case "-":
                        result = calc.subtract(result, operand);
                        break;
                    case "*":
                        result = calc.multiply(result, operand);
                        break;
                    case "/":
                        if (operand==0){
                            throw new ArithmeticException();
                        }
                        result = calc.divide(result, operand);
                        break;
                    default:
                        throw new OperatorException(calc.getName() + " dose not have the " + operator + " operator");
                }
            }

            System.out.println(str+" = "+result);
        } 
        catch (NonDigitException ex) {
            System.out.println(ex.getMessage());
        }
        catch (OperatorException ex) {
            System.out.println(ex.getMessage());
        }
        catch (EquationException ex){
            System.out.println(ex.getMessage());
        }
        catch (ArithmeticException ex) {
            System.out.println("An Exception occured: "+ ex);
            System.out.println("Division by zero");
        }
    }
}