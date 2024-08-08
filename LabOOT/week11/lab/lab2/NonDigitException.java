package week11.lab.lab2;


public class NonDigitException extends Exception {
    public NonDigitException() {

    }
    
    public NonDigitException(String equation) {
        super(equation);
    }
}