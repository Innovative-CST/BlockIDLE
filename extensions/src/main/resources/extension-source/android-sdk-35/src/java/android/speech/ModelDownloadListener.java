package android.speech;

public interface ModelDownloadListener
{
    void onProgress(final int p0);
    
    void onSuccess();
    
    void onScheduled();
    
    void onError(final int p0);
}
