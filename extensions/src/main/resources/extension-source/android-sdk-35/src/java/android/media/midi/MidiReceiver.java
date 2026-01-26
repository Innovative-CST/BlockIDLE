package android.media.midi;

import java.io.IOException;

public abstract class MidiReceiver
{
    public MidiReceiver() {
        throw new RuntimeException("Stub!");
    }
    
    public MidiReceiver(final int maxMessageSize) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onSend(final byte[] p0, final int p1, final int p2, final long p3) throws IOException;
    
    public void flush() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void onFlush() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMaxMessageSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final byte[] msg, final int offset, final int count) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final byte[] msg, final int offset, final int count, final long timestamp) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
