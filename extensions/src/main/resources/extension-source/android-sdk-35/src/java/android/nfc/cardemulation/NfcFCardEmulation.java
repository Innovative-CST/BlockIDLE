package android.nfc.cardemulation;

import android.app.Activity;
import android.content.ComponentName;
import android.nfc.NfcAdapter;

public final class NfcFCardEmulation
{
    NfcFCardEmulation() {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized NfcFCardEmulation getInstance(final NfcAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSystemCodeForService(final ComponentName service) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerSystemCodeForService(final ComponentName service, final String systemCode) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregisterSystemCodeForService(final ComponentName service) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public String getNfcid2ForService(final ComponentName service) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setNfcid2ForService(final ComponentName service, final String nfcid2) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean enableService(final Activity activity, final ComponentName service) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean disableService(final Activity activity) throws RuntimeException {
        throw new RuntimeException("Stub!");
    }
}
