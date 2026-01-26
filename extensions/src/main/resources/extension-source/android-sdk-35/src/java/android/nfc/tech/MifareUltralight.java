package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class MifareUltralight implements TagTechnology
{
    public static final int PAGE_SIZE = 4;
    public static final int TYPE_ULTRALIGHT = 1;
    public static final int TYPE_ULTRALIGHT_C = 2;
    public static final int TYPE_UNKNOWN = -1;
    
    MifareUltralight() {
        throw new RuntimeException("Stub!");
    }
    
    public static MifareUltralight get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] readPages(final int pageOffset) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writePage(final int pageOffset, final byte[] data) throws IOException {
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
