package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class CommandResponse extends BroadcastInfoResponse implements Parcelable
{
    @NonNull
    public static final Creator<CommandResponse> CREATOR;
    public static final String RESPONSE_TYPE_JSON = "json";
    public static final String RESPONSE_TYPE_XML = "xml";
    
    public CommandResponse(final int requestId, final int sequence, final int responseResult, @Nullable final String response, @NonNull final String responseType) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getResponseType() {
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
