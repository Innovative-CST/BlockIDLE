package android.media.midi;

import java.io.IOException;
import java.io.Closeable;

public final class MidiOutputPort extends MidiSender implements Closeable
{
    MidiOutputPort() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPortNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConnect(final MidiReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDisconnect(final MidiReceiver receiver) {
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
