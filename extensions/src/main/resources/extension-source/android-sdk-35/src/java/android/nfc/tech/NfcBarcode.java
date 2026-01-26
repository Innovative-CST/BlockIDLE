package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class NfcBarcode implements TagTechnology
{
    public static final int TYPE_KOVIO = 1;
    public static final int TYPE_UNKNOWN = -1;
    
    NfcBarcode() {
        throw new RuntimeException("Stub!");
    }
    
    public static NfcBarcode get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getBarcode() {
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
