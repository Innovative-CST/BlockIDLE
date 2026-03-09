package android.graphics.drawable;

import android.os.Parcel;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;

public final class Icon implements Parcelable
{
    @NonNull
    public static final Creator<Icon> CREATOR;
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    
    Icon() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getResPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    public void loadDrawableAsync(@NonNull final Context context, @NonNull final Message andThen) {
        throw new RuntimeException("Stub!");
    }
    
    public void loadDrawableAsync(@NonNull final Context context, final OnDrawableLoadedListener listener, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable loadDrawable(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithResource(final Context context, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithResource(final String resPackage, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithBitmap(final Bitmap bits) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithAdaptiveBitmap(final Bitmap bits) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithData(final byte[] data, final int offset, final int length) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithContentUri(final String uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithContentUri(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithAdaptiveBitmapContentUri(@NonNull final String uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithAdaptiveBitmapContentUri(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon setTint(final int tint) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon setTintList(final ColorStateList tintList) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon setTintMode(@NonNull final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon setTintBlendMode(@NonNull final BlendMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Icon createWithFilePath(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public interface OnDrawableLoadedListener
    {
        void onDrawableLoaded(final Drawable p0);
    }
}
