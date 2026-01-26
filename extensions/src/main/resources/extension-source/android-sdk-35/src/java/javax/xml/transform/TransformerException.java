package javax.xml.transform;

import java.io.PrintWriter;
import java.io.PrintStream;

public class TransformerException extends Exception
{
    public TransformerException(final String message) {
        throw new RuntimeException("Stub!");
    }
    
    public TransformerException(final Throwable e) {
        throw new RuntimeException("Stub!");
    }
    
    public TransformerException(final String message, final Throwable e) {
        throw new RuntimeException("Stub!");
    }
    
    public TransformerException(final String message, final SourceLocator locator) {
        throw new RuntimeException("Stub!");
    }
    
    public TransformerException(final String message, final SourceLocator locator, final Throwable e) {
        throw new RuntimeException("Stub!");
    }
    
    public SourceLocator getLocator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocator(final SourceLocator location) {
        throw new RuntimeException("Stub!");
    }
    
    public Throwable getException() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Throwable getCause() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized Throwable initCause(final Throwable cause) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMessageAndLocation() {
        throw new RuntimeException("Stub!");
    }
    
    public String getLocationAsString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void printStackTrace() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void printStackTrace(final PrintStream s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void printStackTrace(final PrintWriter s) {
        throw new RuntimeException("Stub!");
    }
}
