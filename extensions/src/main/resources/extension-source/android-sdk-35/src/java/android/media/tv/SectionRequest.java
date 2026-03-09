package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class SectionRequest extends BroadcastInfoRequest implements Parcelable
{
    @NonNull
    public static final Creator<SectionRequest> CREATOR;
    
    public SectionRequest(final int requestId, final int option, final int tsPid, final int tableId, final int version) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTsPid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTableId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
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
