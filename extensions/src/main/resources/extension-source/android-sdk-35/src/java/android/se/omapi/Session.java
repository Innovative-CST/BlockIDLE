package android.se.omapi;

import java.io.IOException;

public final class Session
{
    Session() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Reader getReader() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getATR() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClosed() {
        throw new RuntimeException("Stub!");
    }
    
    public void closeChannels() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Channel openBasicChannel(@Nullable final byte[] aid, @Nullable final byte p2) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Channel openBasicChannel(@Nullable final byte[] aid) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Channel openLogicalChannel(@Nullable final byte[] aid, @Nullable final byte p2) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Channel openLogicalChannel(@Nullable final byte[] aid) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
