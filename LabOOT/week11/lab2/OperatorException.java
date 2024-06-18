package lab.week11;

public class OperatorException extends Exception {
    public OperatorException() {

    }
    
    public OperatorException(String operator) {
        super(operator);
    }
}