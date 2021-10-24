package сom.company.additional1;

public class ExceptionZero extends ArithmeticException{

    private String description;
    public ExceptionZero(String description) {
        super(description);
    }
}
