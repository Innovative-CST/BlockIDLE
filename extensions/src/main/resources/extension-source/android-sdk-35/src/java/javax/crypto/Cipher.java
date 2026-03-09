package javax.crypto;

import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.AlgorithmParameters;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

public class Cipher
{
    public static final int DECRYPT_MODE = 2;
    public static final int ENCRYPT_MODE = 1;
    public static final int PRIVATE_KEY = 2;
    public static final int PUBLIC_KEY = 1;
    public static final int SECRET_KEY = 3;
    public static final int UNWRAP_MODE = 4;
    public static final int WRAP_MODE = 3;
    
    protected Cipher(final CipherSpi cipherSpi, final Provider provider, final String transformation) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Cipher getInstance(final String transformation) throws NoSuchAlgorithmException, NoSuchPaddingException {
        throw new RuntimeException("Stub!");
    }
    
    public static final Cipher getInstance(final String transformation, final String provider) throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public static final Cipher getInstance(final String transformation, final Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException {
        throw new RuntimeException("Stub!");
    }
    
    public final Provider getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getBlockSize() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getOutputSize(final int inputLen) {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] getIV() {
        throw new RuntimeException("Stub!");
    }
    
    public final AlgorithmParameters getParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public final ExemptionMechanism getExemptionMechanism() {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key, final SecureRandom random) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key, final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key, final AlgorithmParameterSpec params, final SecureRandom random) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key, final AlgorithmParameters params) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Key key, final AlgorithmParameters params, final SecureRandom random) throws InvalidAlgorithmParameterException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Certificate certificate) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final void init(final int opmode, final Certificate certificate, final SecureRandom random) throws InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] update(final byte[] input) {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] update(final byte[] input, final int inputOffset, final int inputLen) {
        throw new RuntimeException("Stub!");
    }
    
    public final int update(final byte[] input, final int inputOffset, final int inputLen, final byte[] output) throws ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final int update(final byte[] input, final int inputOffset, final int inputLen, final byte[] output, final int outputOffset) throws ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final int update(final ByteBuffer input, final ByteBuffer output) throws ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] doFinal() throws BadPaddingException, IllegalBlockSizeException {
        throw new RuntimeException("Stub!");
    }
    
    public final int doFinal(final byte[] output, final int outputOffset) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] doFinal(final byte[] input) throws BadPaddingException, IllegalBlockSizeException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] doFinal(final byte[] input, final int inputOffset, final int inputLen) throws BadPaddingException, IllegalBlockSizeException {
        throw new RuntimeException("Stub!");
    }
    
    public final int doFinal(final byte[] input, final int inputOffset, final int inputLen, final byte[] output) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final int doFinal(final byte[] input, final int inputOffset, final int inputLen, final byte[] output, final int outputOffset) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final int doFinal(final ByteBuffer input, final ByteBuffer output) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new RuntimeException("Stub!");
    }
    
    public final byte[] wrap(final Key key) throws IllegalBlockSizeException, InvalidKeyException {
        throw new RuntimeException("Stub!");
    }
    
    public final Key unwrap(final byte[] wrappedKey, final String wrappedKeyAlgorithm, final int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMaxAllowedKeyLength(final String transformation) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public static final AlgorithmParameterSpec getMaxAllowedParameterSpec(final String transformation) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateAAD(final byte[] src) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateAAD(final byte[] src, final int offset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateAAD(final ByteBuffer src) {
        throw new RuntimeException("Stub!");
    }
}
