// Custom exception class for division by zero
public class CustomDivisionException extends Exception {

    // Constructor to set the exception message
    public CustomDivisionException() {
        super("Error: you cannot divide by zero");
    }
}
