package android.nfc.tech;

import java.io.IOException;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.Tag;

public final class Ndef implements TagTechnology
{
    public static final String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
    public static final String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
    public static final String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
    public static final String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
    public static final String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
    
    Ndef() {
        throw new RuntimeException("Stub!");
    }
    
    public static Ndef get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public NdefMessage getCachedNdefMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSize() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWritable() {
        throw new RuntimeException("Stub!");
    }
    
    public NdefMessage getNdefMessage() throws FormatException, IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writeNdefMessage(final NdefMessage msg) throws FormatException, IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canMakeReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean makeReadOnly() throws IOException {
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
