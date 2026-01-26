package javax.crypto;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class Mac implements Cloneable
{
    protected Mac(final MacSpi macSpi, final Provider provider, final String algorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public static final Mac getInstance(final String algorithm) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final Mac getInstance(final String algorithm, final String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final Mac getInstance(final String algorithm, final Provider provider) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMacLength() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final Key key, final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void update(final byte input) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void update(final byte[] input) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void update(final byte[] input, final int offset, final int len) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void update(final ByteBuffer input) {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] doFinal() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void doFinal(final byte[] output, final int outOffset) throws IllegalStateException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] doFinal(final byte[] input) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public final void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public final Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
