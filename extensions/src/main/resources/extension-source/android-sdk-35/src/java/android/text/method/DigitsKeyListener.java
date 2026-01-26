package android.text.method;

import android.text.Spanned;
import java.util.Locale;

public class DigitsKeyListener extends NumberKeyListener
{
    @Deprecated
    public DigitsKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DigitsKeyListener(final boolean sign, final boolean decimal) {
        throw new RuntimeException("Stub!");
    }
    
    public DigitsKeyListener(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DigitsKeyListener(@Nullable final Locale locale, final boolean sign, final boolean decimal) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected char[] getAcceptedChars() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static DigitsKeyListener getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static DigitsKeyListener getInstance(final boolean sign, final boolean decimal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DigitsKeyListener getInstance(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DigitsKeyListener getInstance(@Nullable final Locale locale, final boolean sign, final boolean decimal) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static DigitsKeyListener getInstance(@NonNull final String accepted) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence filter(final CharSequence source, final int start, final int end, final Spanned dest, final int dstart, final int dend) {
        throw new RuntimeException("Stub!");
    }
}
