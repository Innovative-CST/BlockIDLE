package android.media.tv.interactive;

import android.os.Parcel;
import android.net.Uri;
import android.content.ComponentName;
import android.os.Parcelable;

public final class AppLinkInfo implements Parcelable
{
    @NonNull
    public static final Creator<AppLinkInfo> CREATOR;
    
    public AppLinkInfo(@NonNull final String packageName, @NonNull final String className, @NonNull final String uriString) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ComponentName getComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
