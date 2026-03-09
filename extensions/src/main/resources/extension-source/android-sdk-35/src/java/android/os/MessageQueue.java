package android.os;

import java.io.FileDescriptor;

public final class MessageQueue
{
    MessageQueue() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIdle() {
        throw new RuntimeException("Stub!");
    }
    
    public void addIdleHandler(@NonNull final IdleHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeIdleHandler(@NonNull final IdleHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnFileDescriptorEventListener(@NonNull final FileDescriptor fd, final int events, @NonNull final OnFileDescriptorEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnFileDescriptorEventListener(@NonNull final FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnFileDescriptorEventListener
    {
        public static final int EVENT_ERROR = 4;
        public static final int EVENT_INPUT = 1;
        public static final int EVENT_OUTPUT = 2;
        
        int onFileDescriptorEvents(@NonNull final FileDescriptor p0, final int p1);
    }
    
    public interface IdleHandler
    {
        boolean queueIdle();
    }
}
