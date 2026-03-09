package android.telephony.mbms;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class FileServiceInfo extends ServiceInfo implements Parcelable
{
    @NonNull
    public static final Creator<FileServiceInfo> CREATOR;
    
    FileServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public List<FileInfo> getFiles() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
