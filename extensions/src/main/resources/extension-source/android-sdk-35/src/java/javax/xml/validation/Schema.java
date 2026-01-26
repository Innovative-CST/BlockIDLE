package javax.xml.validation;

public abstract class Schema
{
    protected Schema() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Validator newValidator();
    
    public abstract ValidatorHandler newValidatorHandler();
}
