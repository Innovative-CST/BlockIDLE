package android.app.usage;

import android.os.Parcel;
import android.os.Parcelable;

public final class StorageStats implements Parcelable
{
    public static final int APP_DATA_TYPE_FILE_TYPE_APK = 3;
    public static final int APP_DATA_TYPE_FILE_TYPE_CURRENT_PROFILE = 2;
    public static final int APP_DATA_TYPE_FILE_TYPE_DEXOPT_ARTIFACT = 0;
    public static final int APP_DATA_TYPE_FILE_TYPE_DM = 4;
    public static final int APP_DATA_TYPE_FILE_TYPE_REFERENCE_PROFILE = 1;
    public static final int APP_DATA_TYPE_LIB = 5;
    @NonNull
    public static final Creator<StorageStats> CREATOR;
    
    StorageStats() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAppBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getAppBytesByDataType(final int dataType) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getCacheBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public long getExternalCacheBytes() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
