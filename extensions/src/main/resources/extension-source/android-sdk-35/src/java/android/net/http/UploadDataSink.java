package android.net.http;

public abstract class UploadDataSink
{
    public UploadDataSink() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onReadSucceeded(final boolean p0);
    
    public abstract void onReadError(@NonNull final Exception p0);
    
    public abstract void onRewindSucceeded();
    
    public abstract void onRewindError(@NonNull final Exception p0);
}
