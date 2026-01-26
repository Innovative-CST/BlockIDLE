package android.media.midi;

import java.io.IOException;
import java.io.Closeable;

public final class MidiInputPort extends MidiReceiver implements Closeable
{
    MidiInputPort() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPortNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onSend(final byte[] msg, final int offset, final int count, final long timestamp) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFlush() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
}
