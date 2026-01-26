package android.os;

import java.util.concurrent.Executor;

public final class BugreportManager
{
    BugreportManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void startConnectivityBugreport(@NonNull final ParcelFileDescriptor bugreportFd, @NonNull final Executor executor, @NonNull final BugreportCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelBugreport() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class BugreportCallback
    {
        public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
        public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
        public static final int BUGREPORT_ERROR_NO_BUGREPORT_TO_RETRIEVE = 6;
        public static final int BUGREPORT_ERROR_RUNTIME = 2;
        public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
        public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
        
        public BugreportCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onProgress(final float progress) {
            throw new RuntimeException("Stub!");
        }
        
        public void onError(final int errorCode) {
            throw new RuntimeException("Stub!");
        }
        
        public void onFinished() {
            throw new RuntimeException("Stub!");
        }
        
        public void onEarlyReportFinished() {
            throw new RuntimeException("Stub!");
        }
    }
}
