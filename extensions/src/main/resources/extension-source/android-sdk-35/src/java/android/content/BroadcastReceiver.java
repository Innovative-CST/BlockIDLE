package android.content;

import android.os.Bundle;
import android.os.IBinder;

public abstract class BroadcastReceiver
{
    public BroadcastReceiver() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onReceive(final Context p0, final Intent p1);
    
    public final PendingResult goAsync() {
        throw new RuntimeException("Stub!");
    }
    
    public IBinder peekService(final Context myContext, final Intent service) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setResultCode(final int code) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getResultCode() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setResultData(final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getResultData() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setResultExtras(final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final Bundle getResultExtras(final boolean makeMap) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setResult(final int code, final String data, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getAbortBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public final void abortBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public final void clearAbortBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isOrderedBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isInitialStickyBroadcast() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setOrderedHint(final boolean isOrdered) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSentFromUid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSentFromPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setDebugUnregister(final boolean debug) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean getDebugUnregister() {
        throw new RuntimeException("Stub!");
    }
    
    public static class PendingResult
    {
        PendingResult() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setResultCode(final int code) {
            throw new RuntimeException("Stub!");
        }
        
        public final int getResultCode() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setResultData(final String data) {
            throw new RuntimeException("Stub!");
        }
        
        public final String getResultData() {
            throw new RuntimeException("Stub!");
        }
        
        public final void setResultExtras(final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public final Bundle getResultExtras(final boolean makeMap) {
            throw new RuntimeException("Stub!");
        }
        
        public final void setResult(final int code, final String data, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public final boolean getAbortBroadcast() {
            throw new RuntimeException("Stub!");
        }
        
        public final void abortBroadcast() {
            throw new RuntimeException("Stub!");
        }
        
        public final void clearAbortBroadcast() {
            throw new RuntimeException("Stub!");
        }
        
        public final void finish() {
            throw new RuntimeException("Stub!");
        }
    }
}
