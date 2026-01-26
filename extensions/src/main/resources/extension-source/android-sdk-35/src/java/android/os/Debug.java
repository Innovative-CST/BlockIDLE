package android.os;

import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public final class Debug
{
    public static final int SHOW_CLASSLOADER = 2;
    public static final int SHOW_FULL_DETAIL = 1;
    public static final int SHOW_INITIALIZED = 4;
    @Deprecated
    public static final int TRACE_COUNT_ALLOCS = 1;
    
    Debug() {
        throw new RuntimeException("Stub!");
    }
    
    public static void waitForDebugger() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean waitingForDebugger() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDebuggerConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void changeDebugPort(final int port) {
        throw new RuntimeException("Stub!");
    }
    
    public static void startNativeTracing() {
        throw new RuntimeException("Stub!");
    }
    
    public static void stopNativeTracing() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void enableEmulatorTraceOutput() {
        throw new RuntimeException("Stub!");
    }
    
    public static void startMethodTracing() {
        throw new RuntimeException("Stub!");
    }
    
    public static void startMethodTracing(final String tracePath) {
        throw new RuntimeException("Stub!");
    }
    
    public static void startMethodTracing(final String tracePath, final int bufferSize) {
        throw new RuntimeException("Stub!");
    }
    
    public static void startMethodTracing(final String tracePath, final int bufferSize, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static void startMethodTracingSampling(final String tracePath, final int bufferSize, final int intervalUs) {
        throw new RuntimeException("Stub!");
    }
    
    public static void stopMethodTracing() {
        throw new RuntimeException("Stub!");
    }
    
    public static long threadCpuTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void startAllocCounting() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void stopAllocCounting() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalFreedCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalFreedCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalFreedSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalFreedSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalGcInvocationCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalGcInvocationCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalClassInitCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalClassInitCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalClassInitTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalClassInitTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalExternalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalExternalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalExternalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalExternalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalExternalFreedCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalExternalFreedCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getGlobalExternalFreedSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetGlobalExternalFreedSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getThreadAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetThreadAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getThreadAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetThreadAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getThreadExternalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetThreadExternalAllocCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getThreadExternalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetThreadExternalAllocSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getThreadGcInvocationCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetThreadGcInvocationCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void resetAllCounts() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getRuntimeStat(final String statName) {
        throw new RuntimeException("Stub!");
    }
    
    public static Map<String, String> getRuntimeStats() {
        throw new RuntimeException("Stub!");
    }
    
    public static native long getNativeHeapSize();
    
    public static native long getNativeHeapAllocatedSize();
    
    public static native long getNativeHeapFreeSize();
    
    public static native void getMemoryInfo(final MemoryInfo p0);
    
    public static native long getPss();
    
    public static native long getRss();
    
    @Deprecated
    public static int setAllocationLimit(final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int setGlobalAllocationLimit(final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static void printLoadedClasses(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getLoadedClassCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpHprofData(final String fileName) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static native int getBinderSentTransactions();
    
    public static native int getBinderReceivedTransactions();
    
    public static native int getBinderLocalObjectCount();
    
    public static native int getBinderProxyObjectCount();
    
    public static native int getBinderDeathObjectCount();
    
    public static boolean dumpService(final String name, final FileDescriptor fd, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    public static void attachJvmtiAgent(@NonNull final String library, @Nullable final String options, @Nullable final ClassLoader classLoader) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class InstructionCount
    {
        @Deprecated
        public InstructionCount() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean resetAndStart() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean collect() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int globalTotal() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int globalMethodInvocations() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MemoryInfo implements Parcelable
    {
        @NonNull
        public static final Creator<MemoryInfo> CREATOR;
        public int dalvikPrivateDirty;
        public int dalvikPss;
        public int dalvikSharedDirty;
        public int nativePrivateDirty;
        public int nativePss;
        public int nativeSharedDirty;
        public int otherPrivateDirty;
        public int otherPss;
        public int otherSharedDirty;
        
        public MemoryInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalPss() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalSwappablePss() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalPrivateDirty() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalSharedDirty() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalPrivateClean() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTotalSharedClean() {
            throw new RuntimeException("Stub!");
        }
        
        public String getMemoryStat(final String statName) {
            throw new RuntimeException("Stub!");
        }
        
        public Map<String, String> getMemoryStats() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void readFromParcel(final Parcel source) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
