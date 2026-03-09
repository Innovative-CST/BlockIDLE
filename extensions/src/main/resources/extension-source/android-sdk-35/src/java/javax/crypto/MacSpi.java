package javax.crypto;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;

public abstract class MacSpi
{
    public MacSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int engineGetMacLength();
    
    protected abstract void engineInit(final Key p0, final AlgorithmParameterSpec p1) throws InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract void engineUpdate(final byte p0);
    
    protected abstract void engineUpdate(final byte[] p0, final int p1, final int p2);
    
    protected void engineUpdate(final ByteBuffer input) {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract byte[] engineDoFinal();
    
    protected abstract void engineReset();
    
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
