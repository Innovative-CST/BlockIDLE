package javax.crypto;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class ExemptionMechanism
{
    protected ExemptionMechanism(final ExemptionMechanismSpi exmechSpi, final Provider provider, final String mechanism) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public static final ExemptionMechanism getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final ExemptionMechanism getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final ExemptionMechanism getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isCryptoAllowed(final Key key) throws ExemptionMechanismException {
        throw new RuntimeException("Stub!");
    }
    
    public final int getOutputSize(final int inputLen) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key) throws ExemptionMechanismException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final AlgorithmParameterSpec params) throws ExemptionMechanismException, InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final AlgorithmParameters params) throws ExemptionMechanismException, InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] genExemptionBlob() throws ExemptionMechanismException, IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final int genExemptionBlob(final byte[] output) throws ExemptionMechanismException, IllegalStateException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final int genExemptionBlob(final byte[] output, final int outputOffset) throws ExemptionMechanismException, IllegalStateException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
}
