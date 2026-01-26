package android.os;

import android.os.strictmode.Violation;
import java.util.concurrent.Executor;

public final class StrictMode
{
    StrictMode() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setThreadPolicy(final ThreadPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    public static ThreadPolicy getThreadPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static ThreadPolicy allowThreadDiskWrites() {
        throw new RuntimeException("Stub!");
    }
    
    public static ThreadPolicy allowThreadDiskReads() {
        throw new RuntimeException("Stub!");
    }
    
    public static void setVmPolicy(final VmPolicy policy) {
        throw new RuntimeException("Stub!");
    }
    
    public static VmPolicy getVmPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static void enableDefaults() {
        throw new RuntimeException("Stub!");
    }
    
    public static void noteSlowCall(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class ThreadPolicy
    {
        public static final ThreadPolicy LAX;
        
        ThreadPolicy() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            LAX = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public Builder(final ThreadPolicy policy) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectAll() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitAll() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectNetwork() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitNetwork() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectDiskReads() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitDiskReads() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectCustomSlowCalls() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitCustomSlowCalls() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitResourceMismatches() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectUnbufferedIo() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitUnbufferedIo() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectResourceMismatches() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectDiskWrites() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitDiskWrites() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectExplicitGc() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitExplicitGc() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDialog() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDeath() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDeathOnNetwork() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyFlashScreen() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyLog() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDropBox() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyListener(@NonNull final Executor executor, @NonNull final OnThreadViolationListener listener) {
                throw new RuntimeException("Stub!");
            }
            
            public ThreadPolicy build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class VmPolicy
    {
        public static final VmPolicy LAX;
        
        VmPolicy() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            LAX = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public Builder(final VmPolicy base) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setClassInstanceLimit(final Class klass, final int instanceLimit) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectActivityLeaks() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectNonSdkApiUsage() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitNonSdkApiUsage() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectAll() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectLeakedSqlLiteObjects() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectLeakedClosableObjects() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectLeakedRegistrationObjects() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectFileUriExposure() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectCleartextNetwork() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectContentUriWithoutPermission() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectUntaggedSockets() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectImplicitDirectBoot() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectCredentialProtectedWhileLocked() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectIncorrectContextUse() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder detectUnsafeIntentLaunch() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder permitUnsafeIntentLaunch() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDeath() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDeathOnCleartextNetwork() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDeathOnFileUriExposure() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyLog() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyDropBox() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder penaltyListener(@NonNull final Executor executor, @NonNull final OnVmViolationListener listener) {
                throw new RuntimeException("Stub!");
            }
            
            public VmPolicy build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public interface OnVmViolationListener
    {
        void onVmViolation(final Violation p0);
    }
    
    public interface OnThreadViolationListener
    {
        void onThreadViolation(final Violation p0);
    }
}
