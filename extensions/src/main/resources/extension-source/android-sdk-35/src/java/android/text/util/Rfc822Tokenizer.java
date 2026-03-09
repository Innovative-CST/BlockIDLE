package android.text.util;

import java.util.Collection;
import android.widget.MultiAutoCompleteTextView;

public class Rfc822Tokenizer implements MultiAutoCompleteTextView.Tokenizer
{
    public Rfc822Tokenizer() {
        throw new RuntimeException("Stub!");
    }
    
    public static void tokenize(final CharSequence text, final Collection<Rfc822Token> out) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rfc822Token[] tokenize(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int findTokenStart(final CharSequence text, final int cursor) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int findTokenEnd(final CharSequence text, final int cursor) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence terminateToken(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
}
