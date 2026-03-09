package android.app.job;

import android.app.Notification;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class JobService extends Service
{
    public static final int JOB_END_NOTIFICATION_POLICY_DETACH = 0;
    public static final int JOB_END_NOTIFICATION_POLICY_REMOVE = 1;
    public static final String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";
    
    public JobService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public final void jobFinished(final JobParameters params, final boolean wantsReschedule) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean onStartJob(final JobParameters p0);
    
    public abstract boolean onStopJob(final JobParameters p0);
    
    public void onNetworkChanged(@NonNull final JobParameters params) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateEstimatedNetworkBytes(@NonNull final JobParameters params, final long downloadBytes, final long uploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateEstimatedNetworkBytes(@NonNull final JobParameters params, @NonNull final JobWorkItem jobWorkItem, final long downloadBytes, final long uploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateTransferredNetworkBytes(@NonNull final JobParameters params, final long transferredDownloadBytes, final long transferredUploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public final void updateTransferredNetworkBytes(@NonNull final JobParameters params, @NonNull final JobWorkItem item, final long transferredDownloadBytes, final long transferredUploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setNotification(@NonNull final JobParameters params, final int notificationId, @NonNull final Notification notification, final int jobEndNotificationPolicy) {
        throw new RuntimeException("Stub!");
    }
}
