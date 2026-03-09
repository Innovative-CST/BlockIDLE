package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class NfcB implements TagTechnology
{
    NfcB() {
        throw new RuntimeException("Stub!");
    }
    
    public static NfcB get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getApplicationData() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getProtocolInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] transceive(final byte[] data) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxTransceiveLength() {
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
