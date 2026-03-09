package android.text;

import java.io.IOException;

public interface Editable extends CharSequence, GetChars, Spannable, Appendable
{
    Editable replace(final int p0, final int p1, final CharSequence p2, final int p3, final int p4);
    
    Editable replace(final int p0, final int p1, final CharSequence p2);
    
    Editable insert(final int p0, final CharSequence p1, final int p2, final int p3);
    
    Editable insert(final int p0, final CharSequence p1);
    
    Editable delete(final int p0, final int p1);
    
    Editable append(final CharSequence p0);
    
    Editable append(final CharSequence p0, final int p1, final int p2);
    
    Editable append(final char p0);
    
    void clear();
    
    void clearSpans();
    
    void setFilters(final InputFilter[] p0);
    
    InputFilter[] getFilters();
    
    public static class Factory
    {
        public Factory() {
            throw new RuntimeException("Stub!");
        }
        
        public static Factory getInstance() {
            throw new RuntimeException("Stub!");
        }
        
        public Editable newEditable(final CharSequence source) {
            throw new RuntimeException("Stub!");
        }
    }
}
