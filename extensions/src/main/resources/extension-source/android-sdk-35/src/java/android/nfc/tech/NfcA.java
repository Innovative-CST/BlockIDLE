package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class NfcA implements TagTechnology
{
    NfcA() {
        throw new RuntimeException("Stub!");
    }
    
    public static NfcA get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getAtqa() {
        throw new RuntimeException("Stub!");
    }
    
    public short getSak() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] transceive(final byte[] data) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxTransceiveLength() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeout(final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Tag getTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void connect() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
