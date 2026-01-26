package android.media.midi;

import java.io.IOException;
import java.io.Closeable;

public final class MidiDevice implements Closeable
{
    MidiDevice() {
        throw new RuntimeException("Stub!");
    }
    
    public MidiDeviceInfo getInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public MidiInputPort openInputPort(final int portNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public MidiOutputPort openOutputPort(final int portNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public MidiConnection connectPorts(final MidiInputPort inputPort, final int outputPortNumber) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public class MidiConnection implements Closeable
    {
        MidiConnection() {
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
}
