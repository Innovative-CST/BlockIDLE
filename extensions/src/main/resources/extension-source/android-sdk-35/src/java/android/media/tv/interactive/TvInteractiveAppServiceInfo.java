package android.media.tv.interactive;

import java.util.List;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.content.ComponentName;
import android.content.Context;
import android.os.Parcelable;

public final class TvInteractiveAppServiceInfo implements Parcelable
{
    @NonNull
    public static final Creator<TvInteractiveAppServiceInfo> CREATOR;
    public static final int INTERACTIVE_APP_TYPE_ATSC = 2;
    public static final int INTERACTIVE_APP_TYPE_GINGA = 4;
    public static final int INTERACTIVE_APP_TYPE_HBBTV = 1;
    public static final int INTERACTIVE_APP_TYPE_OTHER = Integer.MIN_VALUE;
    public static final int INTERACTIVE_APP_TYPE_TARGETED_AD = 8;
    
    public TvInteractiveAppServiceInfo(@NonNull final Context context, @NonNull final ComponentName component) {
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
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int getSupportedTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getCustomSupportedTypes() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
