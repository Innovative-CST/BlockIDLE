package android.security;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.content.Context;
import java.security.spec.AlgorithmParameterSpec;

@Deprecated
public final class KeyPairGeneratorSpec implements AlgorithmParameterSpec
{
    KeyPairGeneratorSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getKeystoreAlias() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getKeyType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getKeySize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public AlgorithmParameterSpec getAlgorithmParameterSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public X500Principal getSubjectDN() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public BigInteger getSerialNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Date getStartDate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Date getEndDate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isEncryptionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static final class Builder
    {
        @Deprecated
        public Builder(@NonNull final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setAlias(@NonNull final String alias) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setKeyType(@NonNull final String keyType) throws NoSuchAlgorithmException {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setKeySize(final int keySize) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setAlgorithmParameterSpec(@NonNull final AlgorithmParameterSpec spec) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setSubject(@NonNull final X500Principal subject) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setSerialNumber(@NonNull final BigInteger serialNumber) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setStartDate(@NonNull final Date startDate) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setEndDate(@NonNull final Date endDate) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setEncryptionRequired() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public KeyPairGeneratorSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
