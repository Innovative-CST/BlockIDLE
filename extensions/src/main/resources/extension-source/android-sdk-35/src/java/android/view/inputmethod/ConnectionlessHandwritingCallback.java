package android.view.inputmethod;

public interface ConnectionlessHandwritingCallback
{
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_NO_TEXT_RECOGNIZED = 0;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_OTHER = 2;
    public static final int CONNECTIONLESS_HANDWRITING_ERROR_UNSUPPORTED = 1;
    
    void onResult(@NonNull final CharSequence p0);
    
    void onError(final int p0);
}
