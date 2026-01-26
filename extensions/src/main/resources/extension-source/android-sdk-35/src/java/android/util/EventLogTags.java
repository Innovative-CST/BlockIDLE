package android.util;

import java.io.BufferedReader;
import java.io.IOException;

@Deprecated
public class EventLogTags
{
    @Deprecated
    public EventLogTags() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public EventLogTags(final BufferedReader input) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Description get(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Description get(final int tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Description
    {
        @Deprecated
        public final String mName;
        @Deprecated
        public final int mTag;
        
        Description() {
            this.mName = null;
            this.mTag = 0;
            throw new RuntimeException("Stub!");
        }
    }
}
