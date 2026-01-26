package javax.crypto;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;
import java.security.Key;

public abstract class ExemptionMechanismSpi
{
    public ExemptionMechanismSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int engineGetOutputSize(final int p0);
    
    protected abstract void engineInit(final Key p0) throws ExemptionMechanismException, InvalidKeyException;
    
    protected abstract void engineInit(final Key p0, final AlgorithmParameterSpec p1) throws ExemptionMechanismException, InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract void engineInit(final Key p0, final AlgorithmParameters p1) throws ExemptionMechanismException, InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract byte[] engineGenExemptionBlob() throws ExemptionMechanismException;
    
    protected abstract int engineGenExemptionBlob(final byte[] p0, final int p1) throws ExemptionMechanismException, ShortBufferException;
}
