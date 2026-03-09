package android.widget;

import android.util.AttributeSet;
import android.content.Context;

public class MultiAutoCompleteTextView extends AutoCompleteTextView
{
    public MultiAutoCompleteTextView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public MultiAutoCompleteTextView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public MultiAutoCompleteTextView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public MultiAutoCompleteTextView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setTokenizer(final Tokenizer t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void performFiltering(final CharSequence text, final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean enoughToFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void performValidation() {
        throw new RuntimeException("Stub!");
    }
    
    protected void performFiltering(final CharSequence text, final int start, final int end, final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void replaceText(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class CommaTokenizer implements Tokenizer
    {
        public CommaTokenizer() {
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
    
    public interface Tokenizer
    {
        int findTokenStart(final CharSequence p0, final int p1);
        
        int findTokenEnd(final CharSequence p0, final int p1);
        
        CharSequence terminateToken(final CharSequence p0);
    }
}
