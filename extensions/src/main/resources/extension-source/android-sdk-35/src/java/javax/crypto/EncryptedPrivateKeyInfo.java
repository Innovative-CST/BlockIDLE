package javax.crypto;

import java.security.Provider;
import java.security.NoSuchProviderException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

public class EncryptedPrivateKeyInfo
{
    public EncryptedPrivateKeyInfo(final byte[] encoded) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public EncryptedPrivateKeyInfo(final String algName, final byte[] encryptedData) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public EncryptedPrivateKeyInfo(final AlgorithmParameters algParams, final byte[] encryptedData) throws NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public String getAlgName() {
        throw new RuntimeException("Stub!");
    }
    
    public AlgorithmParameters getAlgParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getEncryptedData() {
        throw new RuntimeException("Stub!");
    }
    
    public PKCS8EncodedKeySpec getKeySpec(final Cipher cipher) throws InvalidKeySpecException {
        throw new RuntimeException("Stub!");
    }
    
    public PKCS8EncodedKeySpec getKeySpec(final Key decryptKey) throws InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public PKCS8EncodedKeySpec getKeySpec(final Key decryptKey, final String providerName) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        throw new RuntimeException("Stub!");
    }
    
    public PKCS8EncodedKeySpec getKeySpec(final Key decryptKey, final Provider provider) throws InvalidKeyException, NoSuchAlgorithmException {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getEncoded() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
