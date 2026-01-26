package android.security.keystore;

import java.util.Date;
import java.security.spec.KeySpec;

public class KeyInfo implements KeySpec
{
    KeyInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getKeystoreAlias() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isInsideSecureHardware() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrigin() {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeySize() {
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
    public String[] getBlockModes() {
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
    
    public boolean isUserAuthenticationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserConfirmationRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserAuthenticationValidityDurationSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserAuthenticationType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUserAuthenticationValidWhileOnBody() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInvalidatedByBiometricEnrollment() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTrustedUserPresenceRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSecurityLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRemainingUsageCount() {
        throw new RuntimeException("Stub!");
    }
}
