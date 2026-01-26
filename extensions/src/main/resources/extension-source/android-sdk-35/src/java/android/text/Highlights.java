package android.text;

import android.graphics.Paint;

public class Highlights
{
    Highlights() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Paint getPaint(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getRanges(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRange(@NonNull final Paint paint, final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRanges(@NonNull final Paint paint, @NonNull final int... ranges) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Highlights build() {
            throw new RuntimeException("Stub!");
        }
    }
}
