package android.view;

import android.graphics.Path;
import java.util.List;
import android.graphics.Rect;
import android.graphics.Insets;

public final class DisplayCutout
{
    public DisplayCutout(@NonNull final Insets safeInsets, @Nullable final Rect boundLeft, @Nullable final Rect boundTop, @Nullable final Rect boundRight, @Nullable final Rect boundBottom) {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayCutout(@NonNull final Insets safeInsets, @Nullable final Rect boundLeft, @Nullable final Rect boundTop, @Nullable final Rect boundRight, @Nullable final Rect boundBottom, @NonNull final Insets waterfallInsets) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DisplayCutout(@Nullable final Rect safeInsets, @Nullable final List<Rect> boundingRects) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Insets getWaterfallInsets() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSafeInsetTop() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSafeInsetBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSafeInsetLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSafeInsetRight() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Rect> getBoundingRects() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBoundingRectLeft() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBoundingRectTop() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBoundingRectRight() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getBoundingRectBottom() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Path getCutoutPath() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DisplayCutout build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSafeInsets(@NonNull final Insets safeInsets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWaterfallInsets(@NonNull final Insets waterfallInsets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRectLeft(@NonNull final Rect boundingRectLeft) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRectTop(@NonNull final Rect boundingRectTop) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRectRight(@NonNull final Rect boundingRectRight) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBoundingRectBottom(@NonNull final Rect boundingRectBottom) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCutoutPath(@NonNull final Path cutoutPath) {
            throw new RuntimeException("Stub!");
        }
    }
}
