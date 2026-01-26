package android.speech;

public interface RecognitionSupportCallback
{
    void onSupportResult(@NonNull final RecognitionSupport p0);
    
    void onError(final int p0);
}
