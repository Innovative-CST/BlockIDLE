package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class IsoDep implements TagTechnology
{
    IsoDep() {
        throw new RuntimeException("Stub!");
    }
    
    public static IsoDep get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeout(final int timeout) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTimeout() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getHistoricalBytes() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getHiLayerResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] transceive(final byte[] data) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxTransceiveLength() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExtendedLengthApduSupported() {
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
