package android.graphics.fonts;

import java.io.IOException;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.graphics.RectF;
import android.graphics.Paint;
import android.os.LocaleList;
import java.io.File;
import java.nio.ByteBuffer;

public final class Font
{
    Font() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ByteBuffer getBuffer() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public File getFile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public FontStyle getStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTtcIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public FontVariationAxis[] getAxes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getLocaleList() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGlyphBounds(final int glyphId, @NonNull final Paint paint, @Nullable final RectF outBoundingBox) {
        throw new RuntimeException("Stub!");
    }
    
    public void getMetrics(@NonNull final Paint paint, @Nullable final Paint.FontMetrics outMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final ByteBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final File path) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ParcelFileDescriptor fd) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ParcelFileDescriptor fd, final long offset, final long size) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AssetManager am, @NonNull final String path) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Resources res, final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Font font) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWeight(final int weight) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSlant(final int slant) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTtcIndex(final int ttcIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontVariationSettings(@Nullable final String variationSettings) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontVariationSettings(@Nullable final FontVariationAxis[] axes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Font build() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
