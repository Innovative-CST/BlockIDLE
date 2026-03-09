package android.util;

import java.io.IOException;
import java.util.Collection;

public class EventLog
{
    EventLog() {
        throw new RuntimeException("Stub!");
    }
    
    public static native int writeEvent(final int p0, final int p1);
    
    public static native int writeEvent(final int p0, final long p1);
    
    public static native int writeEvent(final int p0, final float p1);
    
    public static native int writeEvent(final int p0, final String p1);
    
    public static native int writeEvent(final int p0, final Object... p1);
    
    public static native void readEvents(final int[] p0, final Collection<Event> p1) throws IOException;
    
    public static String getTagName(final int tag) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getTagCode(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Event
    {
        Event() {
            throw new RuntimeException("Stub!");
        }
        
        public int getProcessId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getThreadId() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeNanos() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTag() {
            throw new RuntimeException("Stub!");
        }
        
        public synchronized Object getData() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
