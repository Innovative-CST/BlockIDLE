package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class ClosedSubscriberGroupInfo implements Parcelable
{
    @NonNull
    public static final Creator<ClosedSubscriberGroupInfo> CREATOR;
    
    ClosedSubscriberGroupInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getCsgIndicator() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getHomeNodebName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCsgIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int type) {
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
