package android.media.tv;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class SectionResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<SectionResponse> CREATOR;
    
    public SectionResponse(final int requestId, final int sequence, final int responseResult, final int sessionId, final int version, @Nullable final Bundle sessionData) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getSessionData() {
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
