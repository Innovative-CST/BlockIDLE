package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class NfcV implements TagTechnology
{
    NfcV() {
        throw new RuntimeException("Stub!");
    }
    
    public static NfcV get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public byte getResponseFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public byte getDsfId() {
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
