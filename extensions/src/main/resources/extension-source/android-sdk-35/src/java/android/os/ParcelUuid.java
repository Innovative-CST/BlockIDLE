package android.os;

import java.util.UUID;

public final class ParcelUuid implements Parcelable
{
    @NonNull
    public static final Creator<ParcelUuid> CREATOR;
    
    public ParcelUuid(final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelUuid fromString(final String uuid) {
        throw new RuntimeException("Stub!");
    }
    
    public UUID getUuid() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
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
