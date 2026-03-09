package android.security.keystore;

import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyStore;

public class WrappedKeyEntry implements KeyStore.Entry
{
    public WrappedKeyEntry(final byte[] wrappedKeyBytes, final String wrappingKeyAlias, final String transformation, final AlgorithmParameterSpec algorithmParameterSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getWrappedKeyBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public String getWrappingKeyAlias() {
        throw new RuntimeException("Stub!");
    }
    
    public String getTransformation() {
        throw new RuntimeException("Stub!");
    }
    
    public AlgorithmParameterSpec getAlgorithmParameterSpec() {
        throw new RuntimeException("Stub!");
    }
}
