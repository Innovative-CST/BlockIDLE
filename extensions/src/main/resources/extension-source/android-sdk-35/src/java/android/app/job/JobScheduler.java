package android.app.job;

import java.util.Map;
import java.util.List;

public abstract class JobScheduler
{
    public static final int PENDING_JOB_REASON_APP = 1;
    public static final int PENDING_JOB_REASON_APP_STANDBY = 2;
    public static final int PENDING_JOB_REASON_BACKGROUND_RESTRICTION = 3;
    public static final int PENDING_JOB_REASON_CONSTRAINT_BATTERY_NOT_LOW = 4;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CHARGING = 5;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONNECTIVITY = 6;
    public static final int PENDING_JOB_REASON_CONSTRAINT_CONTENT_TRIGGER = 7;
    public static final int PENDING_JOB_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int PENDING_JOB_REASON_CONSTRAINT_MINIMUM_LATENCY = 9;
    public static final int PENDING_JOB_REASON_CONSTRAINT_PREFETCH = 10;
    public static final int PENDING_JOB_REASON_CONSTRAINT_STORAGE_NOT_LOW = 11;
    public static final int PENDING_JOB_REASON_DEVICE_STATE = 12;
    public static final int PENDING_JOB_REASON_EXECUTING = -1;
    public static final int PENDING_JOB_REASON_INVALID_JOB_ID = -2;
    public static final int PENDING_JOB_REASON_JOB_SCHEDULER_OPTIMIZATION = 13;
    public static final int PENDING_JOB_REASON_QUOTA = 14;
    public static final int PENDING_JOB_REASON_UNDEFINED = 0;
    public static final int PENDING_JOB_REASON_USER = 15;
    public static final int RESULT_FAILURE = 0;
    public static final int RESULT_SUCCESS = 1;
    
    public JobScheduler() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public JobScheduler forNamespace(@NonNull final String namespace) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int schedule(@NonNull final JobInfo p0);
    
    public abstract int enqueue(@NonNull final JobInfo p0, @NonNull final JobWorkItem p1);
    
    public abstract void cancel(final int p0);
    
    public abstract void cancelAll();
    
    public void cancelInAllNamespaces() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<JobInfo> getAllPendingJobs();
    
    @NonNull
    public Map<String, List<JobInfo>> getPendingJobsInAllNamespaces() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract JobInfo getPendingJob(final int p0);
    
    public int getPendingJobReason(final int jobId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canRunUserInitiatedJobs() {
        throw new RuntimeException("Stub!");
    }
}
