package android.content;

import android.os.Parcel;
import android.os.Parcelable;

public final class AttributionSource implements Parcelable
{
    @NonNull
    public static final Creator<AttributionSource> CREATOR;
    
    AttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AttributionSource myAttributionSource() {
        throw new RuntimeException("Stub!");
    }
    
    public void enforceCallingUid() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean checkCallingUid() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTrusted(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public int getUid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AttributionSource getNext() {
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
    
    public static final class Builder
    {
        public Builder(final int uid) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AttributionSource current) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPid(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPackageName(@Nullable final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAttributionTag(@Nullable final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeviceId(final int deviceId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNext(@Nullable final AttributionSource value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AttributionSource build() {
            throw new RuntimeException("Stub!");
        }
    }
}
