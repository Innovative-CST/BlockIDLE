package android.telecom;

import android.os.Parcel;
import android.os.UserHandle;
import android.content.ComponentName;
import android.os.Parcelable;

public final class PhoneAccountHandle implements Parcelable
{
    @NonNull
    public static final Creator<PhoneAccountHandle> CREATOR;
    
    public PhoneAccountHandle(@NonNull final ComponentName componentName, @NonNull final String id) {
        throw new RuntimeException("Stub!");
    }
    
    public PhoneAccountHandle(@NonNull final ComponentName componentName, @NonNull final String id, @NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public UserHandle getUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
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
