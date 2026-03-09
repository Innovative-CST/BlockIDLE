package android.gesture;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.File;

public final class GestureLibraries
{
    GestureLibraries() {
        throw new RuntimeException("Stub!");
    }
    
    public static GestureLibrary fromFile(final String path) {
        throw new RuntimeException("Stub!");
    }
    
    public static GestureLibrary fromFile(final File path) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static GestureLibrary fromFileDescriptor(@NonNull final ParcelFileDescriptor pfd) {
        throw new RuntimeException("Stub!");
    }
    
    public static GestureLibrary fromPrivateFile(final Context context, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static GestureLibrary fromRawResource(final Context context, final int resourceId) {
        throw new RuntimeException("Stub!");
    }
}
