package android.media.tv;

import android.os.Parcel;
import android.os.Parcelable;

public final class CommandRequest extends BroadcastInfoRequest implements Parcelable
{
    public static final String ARGUMENT_TYPE_JSON = "json";
    public static final String ARGUMENT_TYPE_XML = "xml";
    @NonNull
    public static final Creator<CommandRequest> CREATOR;
    
    public CommandRequest(final int requestId, final int option, @NonNull final String namespace, @NonNull final String name, @NonNull final String arguments, @NonNull final String argumentType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getArguments() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getArgumentType() {
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
