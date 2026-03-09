package android.os;

public final class CpuUsageInfo implements Parcelable
{
    @NonNull
    public static final Creator<CpuUsageInfo> CREATOR;
    
    CpuUsageInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public long getActive() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotal() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
