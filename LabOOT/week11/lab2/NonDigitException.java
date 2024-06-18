package lab.week11;

public class NonDigitException extends Exception {
    public NonDigitException() {

    }
    
    public NonDigitException(String equation) {
        super(equation);
    }
}