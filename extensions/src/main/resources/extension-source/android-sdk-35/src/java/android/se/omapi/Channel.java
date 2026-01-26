package android.se.omapi;

import java.io.IOException;

public final class Channel implements java.nio.channels.Channel
{
    Channel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpen() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBasicChannel() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] transmit(@NonNull final byte[] command) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Session getSession() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getSelectResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean selectNext() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
