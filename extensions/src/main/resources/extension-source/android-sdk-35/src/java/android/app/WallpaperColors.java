package android.app;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;

public final class WallpaperColors implements Parcelable
{
    @NonNull
    public static final Creator<WallpaperColors> CREATOR;
    public static final int HINT_SUPPORTS_DARK_TEXT = 1;
    public static final int HINT_SUPPORTS_DARK_THEME = 2;
    
    public WallpaperColors(final Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
    
    public WallpaperColors(@NonNull final Color primaryColor, @Nullable final Color secondaryColor, @Nullable final Color tertiaryColor) {
        throw new RuntimeException("Stub!");
    }
    
    public WallpaperColors(@NonNull final Color primaryColor, @Nullable final Color secondaryColor, @Nullable final Color tertiaryColor, final int colorHints) {
        throw new RuntimeException("Stub!");
    }
    
    public static WallpaperColors fromDrawable(final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public static WallpaperColors fromBitmap(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Color getPrimaryColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Color getSecondaryColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Color getTertiaryColor() {
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
    
    public int getColorHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
