package week11.lab.lab2;


public class OperatorException extends Exception {
    public OperatorException() {

    }
    
    public OperatorException(String operator) {
        super(operator);
    }
}