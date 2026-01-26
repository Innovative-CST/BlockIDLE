package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;

public final class MifareClassic implements TagTechnology
{
    public static final int BLOCK_SIZE = 16;
    public static final byte[] KEY_DEFAULT;
    public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY;
    public static final byte[] KEY_NFC_FORUM;
    public static final int SIZE_1K = 1024;
    public static final int SIZE_2K = 2048;
    public static final int SIZE_4K = 4096;
    public static final int SIZE_MINI = 320;
    public static final int TYPE_CLASSIC = 0;
    public static final int TYPE_PLUS = 1;
    public static final int TYPE_PRO = 2;
    public static final int TYPE_UNKNOWN = -1;
    
    MifareClassic() {
        throw new RuntimeException("Stub!");
    }
    
    public static MifareClassic get(final Tag tag) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSectorCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBlockCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBlockCountInSector(final int sectorIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int blockToSector(final int blockIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int sectorToBlock(final int sectorIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean authenticateSectorWithKeyA(final int sectorIndex, final byte[] key) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean authenticateSectorWithKeyB(final int sectorIndex, final byte[] key) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] readBlock(final int blockIndex) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void writeBlock(final int blockIndex, final byte[] data) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void increment(final int blockIndex, final int value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void decrement(final int blockIndex, final int value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void transfer(final int blockIndex) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void restore(final int blockIndex) throws IOException {
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
    
    static {
        KEY_DEFAULT = null;
        KEY_MIFARE_APPLICATION_DIRECTORY = null;
        KEY_NFC_FORUM = null;
    }
}
