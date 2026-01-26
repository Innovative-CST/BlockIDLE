package android.os;

public class ResultReceiver implements Parcelable
{
    @NonNull
    public static final Creator<ResultReceiver> CREATOR;
    
    public ResultReceiver(final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final int resultCode, final Bundle resultData) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onReceiveResult(final int resultCode, final Bundle resultData) {
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
