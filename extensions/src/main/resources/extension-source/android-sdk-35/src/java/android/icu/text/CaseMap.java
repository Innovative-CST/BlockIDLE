package android.icu.text;

import java.util.Locale;

public abstract class CaseMap
{
    CaseMap() {
        throw new RuntimeException("Stub!");
    }
    
    public static Lower toLower() {
        throw new RuntimeException("Stub!");
    }
    
    public static Upper toUpper() {
        throw new RuntimeException("Stub!");
    }
    
    public static Title toTitle() {
        throw new RuntimeException("Stub!");
    }
    
    public static Fold fold() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract CaseMap omitUnchangedText();
    
    public static final class Fold extends CaseMap
    {
        Fold() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Fold omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }
        
        public Fold turkic() {
            throw new RuntimeException("Stub!");
        }
        
        public String apply(final CharSequence src) {
            throw new RuntimeException("Stub!");
        }
        
        public <A extends Appendable> A apply(final CharSequence src, final A dest, final Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Lower extends CaseMap
    {
        Lower() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Lower omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }
        
        public String apply(final Locale locale, final CharSequence src) {
            throw new RuntimeException("Stub!");
        }
        
        public <A extends Appendable> A apply(final Locale locale, final CharSequence src, final A dest, final Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Title extends CaseMap
    {
        Title() {
            throw new RuntimeException("Stub!");
        }
        
        public Title wholeString() {
            throw new RuntimeException("Stub!");
        }
        
        public Title sentences() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Title omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }
        
        public Title noLowercase() {
            throw new RuntimeException("Stub!");
        }
        
        public Title noBreakAdjustment() {
            throw new RuntimeException("Stub!");
        }
        
        public Title adjustToCased() {
            throw new RuntimeException("Stub!");
        }
        
        public String apply(final Locale locale, final BreakIterator iter, final CharSequence src) {
            throw new RuntimeException("Stub!");
        }
        
        public <A extends Appendable> A apply(final Locale locale, final BreakIterator iter, final CharSequence src, final A dest, final Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Upper extends CaseMap
    {
        Upper() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Upper omitUnchangedText() {
            throw new RuntimeException("Stub!");
        }
        
        public String apply(final Locale locale, final CharSequence src) {
            throw new RuntimeException("Stub!");
        }
        
        public <A extends Appendable> A apply(final Locale locale, final CharSequence src, final A dest, final Edits edits) {
            throw new RuntimeException("Stub!");
        }
    }
}
