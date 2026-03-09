package android.nfc;

public final class NfcEvent
{
    public final NfcAdapter nfcAdapter;
    public final int peerLlcpMajorVersion;
    public final int peerLlcpMinorVersion;
    
    NfcEvent() {
        this.nfcAdapter = null;
        this.peerLlcpMajorVersion = 0;
        this.peerLlcpMinorVersion = 0;
        throw new RuntimeException("Stub!");
    }
}
