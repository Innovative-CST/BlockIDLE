package android.media;

public class MediaCasException extends Exception
{
    MediaCasException() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class DeniedByServerException extends MediaCasException
    {
        DeniedByServerException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class InsufficientResourceException extends MediaCasException
    {
        InsufficientResourceException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class NotProvisionedException extends MediaCasException
    {
        NotProvisionedException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ResourceBusyException extends MediaCasException
    {
        ResourceBusyException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class UnsupportedCasException extends MediaCasException
    {
        UnsupportedCasException() {
            throw new RuntimeException("Stub!");
        }
    }
}
