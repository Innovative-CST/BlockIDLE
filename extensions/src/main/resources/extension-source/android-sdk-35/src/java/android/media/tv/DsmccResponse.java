package android.media.tv;

import android.os.Parcel;
import java.util.List;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class DsmccResponse extends BroadcastInfoResponse implements Parcelable
{
    public static final String BIOP_MESSAGE_TYPE_DIRECTORY = "directory";
    public static final String BIOP_MESSAGE_TYPE_FILE = "file";
    public static final String BIOP_MESSAGE_TYPE_SERVICE_GATEWAY = "service_gateway";
    public static final String BIOP_MESSAGE_TYPE_STREAM = "stream";
    @NonNull
    public static final Creator<DsmccResponse> CREATOR;
    
    public DsmccResponse(final int requestId, final int sequence, final int responseResult, @Nullable final ParcelFileDescriptor file) {
        throw new RuntimeException("Stub!");
    }
    
    public DsmccResponse(final int requestId, final int sequence, final int responseResult, final boolean isServiceGateway, @Nullable final List<String> childList) {
        throw new RuntimeException("Stub!");
    }
    
    public DsmccResponse(final int requestId, final int sequence, final int responseResult, @Nullable final int[] eventIds, @Nullable final String[] eventNames) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getBiopMessageType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelFileDescriptor getFile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getChildList() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getStreamEventIds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getStreamEventNames() {
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
