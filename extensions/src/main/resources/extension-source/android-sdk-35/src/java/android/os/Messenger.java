package android.os;

public final class Messenger implements Parcelable
{
    @NonNull
    public static final Creator<Messenger> CREATOR;
    
    public Messenger(final Handler target) {
        throw new RuntimeException("Stub!");
    }
    
    public Messenger(final IBinder target) {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final Message message) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder getBinder() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object otherObj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    public static void writeMessengerOrNullToParcel(final Messenger messenger, final Parcel out) {
        throw new RuntimeException("Stub!");
    }
    
    public static Messenger readMessengerOrNullFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
