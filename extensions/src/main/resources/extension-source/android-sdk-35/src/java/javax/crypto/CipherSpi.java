package javax.crypto;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.Key;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;

public abstract class CipherSpi
{
    public CipherSpi() {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract void engineSetMode(final String p0) throws NoSuchAlgorithmException;
    
    protected abstract void engineSetPadding(final String p0) throws NoSuchPaddingException;
    
    protected abstract int engineGetBlockSize();
    
    protected abstract int engineGetOutputSize(final int p0);
    
    protected abstract byte[] engineGetIV();
    
    protected abstract AlgorithmParameters engineGetParameters();
    
    protected abstract void engineInit(final int p0, final Key p1, final SecureRandom p2) throws InvalidKeyException;
    
    protected abstract void engineInit(final int p0, final Key p1, final AlgorithmParameterSpec p2, final SecureRandom p3) throws InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract void engineInit(final int p0, final Key p1, final AlgorithmParameters p2, final SecureRandom p3) throws InvalidAlgorithmParameterException, InvalidKeyException;
    
    protected abstract byte[] engineUpdate(final byte[] p0, final int p1, final int p2);
    
    protected abstract int engineUpdate(final byte[] p0, final int p1, final int p2, final byte[] p3, final int p4) throws ShortBufferException;
    
    protected int engineUpdate(final ByteBuffer input, final ByteBuffer output) throws ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract byte[] engineDoFinal(final byte[] p0, final int p1, final int p2) throws BadPaddingException, IllegalBlockSizeException;
    
    protected abstract int engineDoFinal(final byte[] p0, final int p1, final int p2, final byte[] p3, final int p4) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException;
    
    protected int engineDoFinal(final ByteBuffer input, final ByteBuffer output) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    protected byte[] engineWrap(final Key key) throws IllegalBlockSizeException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    protected Key engineUnwrap(final byte[] wrappedKey, final String wrappedKeyAlgorithm, final int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    protected int engineGetKeySize(final Key key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    protected void engineUpdateAAD(final byte[] src, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    protected void engineUpdateAAD(final ByteBuffer src) {
        throw new RuntimeException("Stub!");
    }
}
