package android.app.admin;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class FactoryResetProtectionPolicy implements Parcelable
{
    @NonNull
    public static final Creator<FactoryResetProtectionPolicy> CREATOR;
    
    FactoryResetProtectionPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getFactoryResetProtectionAccounts() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFactoryResetProtectionEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, @Nullable final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFactoryResetProtectionAccounts(@NonNull final List<String> factoryResetProtectionAccounts) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFactoryResetProtectionEnabled(final boolean factoryResetProtectionEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FactoryResetProtectionPolicy build() {
            throw new RuntimeException("Stub!");
        }
    }
}
