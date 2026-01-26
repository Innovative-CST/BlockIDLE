package android.text.method;

import java.util.Locale;

public class DateTimeKeyListener extends NumberKeyListener
{
    @Deprecated
    public static final char[] CHARACTERS;
    
    @Deprecated
    public DateTimeKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public DateTimeKeyListener(@Nullable final Locale locale) {
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
    public static DateTimeKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DateTimeKeyListener getInstance(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CHARACTERS = null;
    }
}
