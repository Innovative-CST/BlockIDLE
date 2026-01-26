package android.media.midi;

public abstract class MidiSender
{
    public MidiSender() {
        throw new RuntimeException("Stub!");
    }
    
    public void connect(final MidiReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect(final MidiReceiver receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onConnect(final MidiReceiver p0);
    
    public abstract void onDisconnect(final MidiReceiver p0);
}
