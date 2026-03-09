package android.graphics.fonts;

public final class FontFamily
{
    FontFamily() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Font getFont(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Font font) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFont(@NonNull final Font font) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public FontFamily buildVariableFamily() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FontFamily build() {
            throw new RuntimeException("Stub!");
        }
    }
}
