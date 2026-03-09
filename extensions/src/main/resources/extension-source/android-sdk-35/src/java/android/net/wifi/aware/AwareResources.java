package android.net.wifi.aware;

import android.os.Parcel;
import android.os.Parcelable;

public final class AwareResources implements Parcelable
{
    @NonNull
    public static final Creator<AwareResources> CREATOR;
    
    public AwareResources(final int availableDataPathsCount, final int availablePublishSessionsCount, final int availableSubscribeSessionsCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAvailableDataPathsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAvailablePublishSessionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAvailableSubscribeSessionsCount() {
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
