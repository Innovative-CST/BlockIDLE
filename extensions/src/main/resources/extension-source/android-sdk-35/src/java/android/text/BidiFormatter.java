package android.text;

import java.util.Locale;

public final class BidiFormatter
{
    BidiFormatter() {
        throw new RuntimeException("Stub!");
    }
    
    public static BidiFormatter getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static BidiFormatter getInstance(final boolean rtlContext) {
        throw new RuntimeException("Stub!");
    }
    
    public static BidiFormatter getInstance(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRtlContext() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getStereoReset() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRtl(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRtl(final CharSequence str) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String unicodeWrap(@Nullable final String str, final TextDirectionHeuristic heuristic, final boolean isolate) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence unicodeWrap(@Nullable final CharSequence str, final TextDirectionHeuristic heuristic, final boolean isolate) {
        throw new RuntimeException("Stub!");
    }
    
    public String unicodeWrap(final String str, final TextDirectionHeuristic heuristic) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence unicodeWrap(final CharSequence str, final TextDirectionHeuristic heuristic) {
        throw new RuntimeException("Stub!");
    }
    
    public String unicodeWrap(final String str, final boolean isolate) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence unicodeWrap(final CharSequence str, final boolean isolate) {
        throw new RuntimeException("Stub!");
    }
    
    public String unicodeWrap(final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence unicodeWrap(final CharSequence str) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final boolean rtlContext) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final Locale locale) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder stereoReset(final boolean stereoReset) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTextDirectionHeuristic(final TextDirectionHeuristic heuristic) {
            throw new RuntimeException("Stub!");
        }
        
        public BidiFormatter build() {
            throw new RuntimeException("Stub!");
        }
    }
}
