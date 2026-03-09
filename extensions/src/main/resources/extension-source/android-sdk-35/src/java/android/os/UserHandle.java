package android.os;

public final class UserHandle implements Parcelable
{
    @NonNull
    public static final Creator<UserHandle> CREATOR;
    
    public UserHandle(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    public static UserHandle getUserHandleForUid(final int uid) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
    
    public static void writeToParcel(final UserHandle h, final Parcel out) {
        throw new RuntimeException("Stub!");
    }
    
    public static UserHandle readFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
