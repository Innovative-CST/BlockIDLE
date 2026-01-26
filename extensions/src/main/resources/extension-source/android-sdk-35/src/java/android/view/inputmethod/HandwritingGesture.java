package android.view.inputmethod;

public abstract class HandwritingGesture
{
    public static final int GRANULARITY_CHARACTER = 2;
    public static final int GRANULARITY_WORD = 1;
    
    HandwritingGesture() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final String getFallbackText() {
        throw new RuntimeException("Stub!");
    }
}
