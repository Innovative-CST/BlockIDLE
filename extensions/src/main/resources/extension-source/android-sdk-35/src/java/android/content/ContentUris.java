package android.content;

import android.net.Uri;

public class ContentUris
{
    public ContentUris() {
        throw new RuntimeException("Stub!");
    }
    
    public static long parseId(@NonNull final Uri contentUri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Uri.Builder appendId(@NonNull final Uri.Builder builder, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Uri withAppendedId(@NonNull final Uri contentUri, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Uri removeId(@NonNull final Uri contentUri) {
        throw new RuntimeException("Stub!");
    }
}
