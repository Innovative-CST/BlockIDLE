package android.security.keystore;

import java.util.Set;
import java.util.Date;
import java.security.KeyStore;

public final class KeyProtection implements KeyStore.ProtectionParameter
{
    KeyProtection() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Date getKeyValidityStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Date getKeyValidityForConsumptionEnd() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Date getKeyValidityForOriginationEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPurposes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getEncryptionPaddings() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getSignaturePaddings() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getDigests() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDigestsSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getMgf1Digests() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public boolean isMgf1DigestsSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getBlockModes() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRandomizedEncryptionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserAuthenticationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserConfirmationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserAuthenticationType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserAuthenticationValidityDurationSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserPresenceRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserAuthenticationValidWhileOnBody() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInvalidatedByBiometricEnrollment() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUnlockedDeviceRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxUsageCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder(final int purposes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyValidityStart(final Date startDate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyValidityEnd(final Date endDate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyValidityForOriginationEnd(final Date endDate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyValidityForConsumptionEnd(final Date endDate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEncryptionPaddings(final String... paddings) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSignaturePaddings(final String... paddings) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDigests(final String... digests) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMgf1Digests(@Nullable final String... mgf1Digests) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBlockModes(final String... blockModes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRandomizedEncryptionRequired(final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAuthenticationRequired(final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserConfirmationRequired(final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setUserAuthenticationValidityDurationSeconds(final int seconds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAuthenticationParameters(final int timeout, final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserPresenceRequired(final boolean required) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserAuthenticationValidWhileOnBody(final boolean remainsValid) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInvalidatedByBiometricEnrollment(final boolean invalidateKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUnlockedDeviceRequired(final boolean unlockedDeviceRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIsStrongBoxBacked(final boolean isStrongBoxBacked) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxUsageCount(final int maxUsageCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public KeyProtection build() {
            throw new RuntimeException("Stub!");
        }
    }
}
