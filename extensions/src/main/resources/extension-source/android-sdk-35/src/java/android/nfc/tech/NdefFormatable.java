package android.nfc.tech;

import java.io.IOException;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.Tag;

public final class NdefFormatable implements TagTechnology
{
    NdefFormatable() {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefFormatable get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public void format(final NdefMessage firstMessage) throws FormatException, IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void formatReadOnly(final NdefMessage firstMessage) throws FormatException, IOException {
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
