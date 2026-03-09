package android.text.style;

import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Bitmap;

public class ImageSpan extends DynamicDrawableSpan
{
    @Deprecated
    public ImageSpan(@NonNull final Bitmap b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ImageSpan(@NonNull final Bitmap b, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, @NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, @NonNull final Bitmap bitmap, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Drawable drawable, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Drawable drawable, @NonNull final String source) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Drawable drawable, @NonNull final String source, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, @NonNull final Uri uri, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public ImageSpan(@NonNull final Context context, final int resourceId, final int verticalAlignment) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable getDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
