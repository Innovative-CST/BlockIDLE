package android.text.method;

import java.util.Locale;

public class DateKeyListener extends NumberKeyListener
{
    @Deprecated
    public static final char[] CHARACTERS;
    
    @Deprecated
    public DateKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public DateKeyListener(@Nullable final Locale locale) {
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
    public static DateKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DateKeyListener getInstance(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CHARACTERS = null;
    }
}
