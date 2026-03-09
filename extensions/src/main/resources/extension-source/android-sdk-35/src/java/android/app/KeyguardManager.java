package android.app;

import java.util.concurrent.Executor;
import android.content.Intent;

public class KeyguardManager
{
    KeyguardManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Intent createConfirmDeviceCredentialIntent(final CharSequence title, final CharSequence description) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public KeyguardLock newKeyguardLock(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isKeyguardLocked() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isKeyguardSecure() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean inKeyguardRestrictedInputMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceLocked() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeviceSecure() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestDismissKeyguard(@NonNull final Activity activity, @Nullable final KeyguardDismissCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void exitKeyguardSecurely(final OnKeyguardExitResult callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void addKeyguardLockedStateListener(@NonNull final Executor executor, @NonNull final KeyguardLockedStateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeKeyguardLockedStateListener(@NonNull final KeyguardLockedStateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class KeyguardDismissCallback
    {
        public KeyguardDismissCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onDismissError() {
            throw new RuntimeException("Stub!");
        }
        
        public void onDismissSucceeded() {
            throw new RuntimeException("Stub!");
        }
        
        public void onDismissCancelled() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public class KeyguardLock
    {
        KeyguardLock() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void disableKeyguard() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void reenableKeyguard() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnKeyguardExitResult
    {
        @Deprecated
        void onKeyguardExitResult(final boolean p0);
    }
    
    @FunctionalInterface
    public interface KeyguardLockedStateListener
    {
        void onKeyguardLockedStateChanged(final boolean p0);
    }
}
