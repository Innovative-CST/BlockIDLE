package android.opengl;

public abstract class EGLObjectHandle
{
    @Deprecated
    protected EGLObjectHandle(final int handle) {
        throw new RuntimeException("Stub!");
    }
    
    protected EGLObjectHandle(final long handle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public long getNativeHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
