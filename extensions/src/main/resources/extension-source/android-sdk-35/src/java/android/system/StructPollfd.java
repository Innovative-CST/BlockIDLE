package android.system;

import java.io.FileDescriptor;

public final class StructPollfd
{
    public short events;
    public FileDescriptor fd;
    public short revents;
    public Object userData;
    
    public StructPollfd() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
