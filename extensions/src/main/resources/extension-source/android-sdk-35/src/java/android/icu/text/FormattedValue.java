package android.icu.text;

import java.text.AttributedCharacterIterator;

public interface FormattedValue extends CharSequence
{
    String toString();
    
     <A extends Appendable> A appendTo(final A p0);
    
    boolean nextPosition(final ConstrainedFieldPosition p0);
    
    AttributedCharacterIterator toCharacterIterator();
}
