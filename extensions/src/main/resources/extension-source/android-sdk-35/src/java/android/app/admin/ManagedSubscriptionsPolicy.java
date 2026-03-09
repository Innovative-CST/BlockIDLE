package android.app.admin;

import android.os.Parcel;
import android.os.Parcelable;

public final class ManagedSubscriptionsPolicy implements Parcelable
{
    @NonNull
    public static final Creator<ManagedSubscriptionsPolicy> CREATOR;
    public static final int TYPE_ALL_MANAGED_SUBSCRIPTIONS = 1;
    public static final int TYPE_ALL_PERSONAL_SUBSCRIPTIONS = 0;
    
    public ManagedSubscriptionsPolicy(final int policyType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPolicyType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    @Override
    public boolean equals(final Object thatObject) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
