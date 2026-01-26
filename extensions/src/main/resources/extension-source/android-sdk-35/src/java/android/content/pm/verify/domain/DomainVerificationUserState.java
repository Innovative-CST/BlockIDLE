package android.content.pm.verify.domain;

import android.os.Parcel;
import java.util.Map;
import android.os.UserHandle;
import android.os.Parcelable;

public final class DomainVerificationUserState implements Parcelable
{
    @NonNull
    public static final Creator<DomainVerificationUserState> CREATOR;
    public static final int DOMAIN_STATE_NONE = 0;
    public static final int DOMAIN_STATE_SELECTED = 1;
    public static final int DOMAIN_STATE_VERIFIED = 2;
    
    DomainVerificationUserState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UserHandle getUser() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean isLinkHandlingAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Integer> getHostToStateMap() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
