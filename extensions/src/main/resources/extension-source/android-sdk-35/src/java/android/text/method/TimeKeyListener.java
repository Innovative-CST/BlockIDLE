package android.text.method;

import java.util.Locale;

public class TimeKeyListener extends NumberKeyListener
{
    @Deprecated
    public static final char[] CHARACTERS;
    
    @Deprecated
    public TimeKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public TimeKeyListener(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    protected char[] getAcceptedChars() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static TimeKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static TimeKeyListener getInstance(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CHARACTERS = null;
    }
}
