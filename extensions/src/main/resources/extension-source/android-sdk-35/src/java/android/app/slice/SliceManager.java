package android.app.slice;

import android.content.Intent;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import android.net.Uri;

@Deprecated
public class SliceManager
{
    @Deprecated
    public static final String CATEGORY_SLICE = "android.app.slice.category.SLICE";
    @Deprecated
    public static final String SLICE_METADATA_KEY = "android.metadata.SLICE_URI";
    
    SliceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void pinSlice(@NonNull final Uri uri, @NonNull final Set<SliceSpec> specs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unpinSlice(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Set<SliceSpec> getPinnedSpecs(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public List<Uri> getPinnedSlices() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Collection<Uri> getSliceDescendants(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Slice bindSlice(@NonNull final Uri uri, @NonNull final Set<SliceSpec> supportedSpecs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Uri mapIntentToUri(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Slice bindSlice(@NonNull final Intent intent, @NonNull final Set<SliceSpec> supportedSpecs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int checkSlicePermission(@NonNull final Uri uri, final int pid, final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void grantSlicePermission(@NonNull final String toPackage, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void revokeSlicePermission(@NonNull final String toPackage, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
}
