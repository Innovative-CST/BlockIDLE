package javax.xml.validation;

public abstract class SchemaFactoryLoader
{
    protected SchemaFactoryLoader() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract SchemaFactory newFactory(final String p0);
}
