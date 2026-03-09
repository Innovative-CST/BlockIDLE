package android.renderscript;

import android.content.Context;

@Deprecated
public class RenderScript
{
    @Deprecated
    public static final int CREATE_FLAG_LOW_LATENCY = 2;
    @Deprecated
    public static final int CREATE_FLAG_LOW_POWER = 4;
    @Deprecated
    public static final int CREATE_FLAG_NONE = 0;
    
    RenderScript() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static long getMinorVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMessageHandler(final RSMessageHandler msg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RSMessageHandler getMessageHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void sendMessage(final int id, final int[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setErrorHandler(final RSErrorHandler msg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RSErrorHandler getErrorHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPriority(final Priority p) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Context getApplicationContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static RenderScript create(final Context ctx) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static RenderScript create(final Context ctx, final ContextType ct) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static RenderScript create(final Context ctx, final ContextType ct, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void releaseAllContexts() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static RenderScript createMultiContext(final Context ctx, final ContextType ct, final int flags, final int API_number) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void contextDump() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void finish() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public enum ContextType
    {
        @Deprecated
        NORMAL, 
        @Deprecated
        DEBUG, 
        @Deprecated
        PROFILE;
    }
    
    @Deprecated
    public enum Priority
    {
        @Deprecated
        LOW, 
        @Deprecated
        NORMAL;
    }
    
    @Deprecated
    public static class RSErrorHandler implements Runnable
    {
        @Deprecated
        protected String mErrorMessage;
        @Deprecated
        protected int mErrorNum;
        
        @Deprecated
        public RSErrorHandler() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class RSMessageHandler implements Runnable
    {
        @Deprecated
        protected int[] mData;
        @Deprecated
        protected int mID;
        @Deprecated
        protected int mLength;
        
        @Deprecated
        public RSMessageHandler() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public void run() {
            throw new RuntimeException("Stub!");
        }
    }
}
