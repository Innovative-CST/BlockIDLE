package android.media.tv;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class DsmccRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<DsmccRequest> CREATOR;
    
    public DsmccRequest(final int requestId, final int option, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
