package android.webkit;

public class ConsoleMessage
{
    public ConsoleMessage(final String message, final String sourceId, final int lineNumber, final MessageLevel msgLevel) {
        throw new RuntimeException("Stub!");
    }
    
    public MessageLevel messageLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public String message() {
        throw new RuntimeException("Stub!");
    }
    
    public String sourceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int lineNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public enum MessageLevel
    {
        TIP, 
        LOG, 
        WARNING, 
        ERROR, 
        DEBUG;
    }
}
