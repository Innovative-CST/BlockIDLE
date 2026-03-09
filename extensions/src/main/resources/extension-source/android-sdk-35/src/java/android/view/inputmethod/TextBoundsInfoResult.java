package android.view.inputmethod;

public final class TextBoundsInfoResult
{
    public static final int CODE_CANCELLED = 3;
    public static final int CODE_FAILED = 2;
    public static final int CODE_SUCCESS = 1;
    public static final int CODE_UNSUPPORTED = 0;
    
    public TextBoundsInfoResult(final int resultCode) {
        throw new RuntimeException("Stub!");
    }
    
    public TextBoundsInfoResult(final int resultCode, @Nullable final TextBoundsInfo textBoundsInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TextBoundsInfo getTextBoundsInfo() {
        throw new RuntimeException("Stub!");
    }
}
