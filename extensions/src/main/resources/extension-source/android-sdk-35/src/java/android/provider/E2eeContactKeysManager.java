package android.provider;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class E2eeContactKeysManager
{
    public static final int VERIFICATION_STATE_UNVERIFIED = 0;
    public static final int VERIFICATION_STATE_VERIFICATION_FAILED = 1;
    public static final int VERIFICATION_STATE_VERIFIED = 2;
    
    E2eeContactKeysManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void updateOrInsertE2eeContactKey(@NonNull final String lookupKey, @NonNull final String deviceId, @NonNull final String accountId, @NonNull final byte[] keyValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public E2eeContactKey getE2eeContactKey(@NonNull final String lookupKey, @NonNull final String deviceId, @NonNull final String accountId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<E2eeContactKey> getAllE2eeContactKeys(@NonNull final String lookupKey) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<E2eeContactKey> getOwnerE2eeContactKeys(@NonNull final String lookupKey) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateE2eeContactKeyLocalVerificationState(@NonNull final String lookupKey, @NonNull final String deviceId, @NonNull final String accountId, final int localVerificationState) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateE2eeContactKeyRemoteVerificationState(@NonNull final String lookupKey, @NonNull final String deviceId, @NonNull final String accountId, final int remoteVerificationState) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeE2eeContactKey(@NonNull final String lookupKey, @NonNull final String deviceId, @NonNull final String accountId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateOrInsertE2eeSelfKey(@NonNull final String deviceId, @NonNull final String accountId, @NonNull final byte[] keyValue) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateE2eeSelfKeyRemoteVerificationState(@NonNull final String deviceId, @NonNull final String accountId, final int remoteVerificationState) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxKeySizeBytes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public E2eeSelfKey getE2eeSelfKey(@NonNull final String deviceId, @NonNull final String accountId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<E2eeSelfKey> getAllE2eeSelfKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<E2eeSelfKey> getOwnerE2eeSelfKeys() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeE2eeSelfKey(@NonNull final String deviceId, @NonNull final String accountId) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class E2eeContactKey implements Parcelable
    {
        @NonNull
        public static final Creator<E2eeContactKey> CREATOR;
        
        E2eeContactKey() {
            throw new RuntimeException("Stub!");
        }
        
        public int getLocalVerificationState() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getDisplayName() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getPhoneNumber() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getEmailAddress() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
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
        
        @Nullable
        public String getDeviceId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getOwnerPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getAccountId() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeUpdated() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getKeyValue() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRemoteVerificationState() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class E2eeSelfKey implements Parcelable
    {
        @NonNull
        public static final Creator<E2eeSelfKey> CREATOR;
        
        E2eeSelfKey() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
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
        
        @Nullable
        public String getDeviceId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getOwnerPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getAccountId() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeUpdated() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getKeyValue() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRemoteVerificationState() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
