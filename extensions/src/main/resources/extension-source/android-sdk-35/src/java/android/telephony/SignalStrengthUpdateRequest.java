package android.telephony;

import android.os.Parcel;
import java.util.Collection;
import android.os.Parcelable;

public final class SignalStrengthUpdateRequest implements Parcelable
{
    @NonNull
    public static final Creator<SignalStrengthUpdateRequest> CREATOR;
    
    SignalStrengthUpdateRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<SignalThresholdInfo> getSignalThresholdInfos() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReportingRequestedWhileIdle() {
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
    public boolean equals(final Object other) {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSignalThresholdInfos(@NonNull final Collection<SignalThresholdInfo> signalThresholdInfos) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReportingRequestedWhileIdle(final boolean isReportingRequestedWhileIdle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SignalStrengthUpdateRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
