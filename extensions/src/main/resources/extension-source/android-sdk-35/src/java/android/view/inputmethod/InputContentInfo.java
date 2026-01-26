package android.view.inputmethod;

import android.os.Parcel;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Parcelable;

public final class InputContentInfo implements Parcelable
{
    @NonNull
    public static final Creator<InputContentInfo> CREATOR;
    
    public InputContentInfo(@NonNull final Uri contentUri, @NonNull final ClipDescription description) {
        throw new RuntimeException("Stub!");
    }
    
    public InputContentInfo(@NonNull final Uri contentUri, @NonNull final ClipDescription description, @Nullable final Uri linkUri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getContentUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ClipDescription getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getLinkUri() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestPermission() {
        throw new RuntimeException("Stub!");
    }
    
    public void releasePermission() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
