package android.app.job;

import android.app.Notification;
import android.os.IBinder;
import android.app.Service;

public abstract class JobServiceEngine
{
    public JobServiceEngine(final Service service) {
        throw new RuntimeException("Stub!");
    }
    
    public final IBinder getBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean onStartJob(final JobParameters p0);
    
    public abstract boolean onStopJob(final JobParameters p0);
    
    public void jobFinished(final JobParameters params, final boolean needsReschedule) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNetworkChanged(@NonNull final JobParameters params) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateTransferredNetworkBytes(@NonNull final JobParameters params, @Nullable final JobWorkItem item, final long downloadBytes, final long uploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateEstimatedNetworkBytes(@NonNull final JobParameters params, @Nullable final JobWorkItem item, final long downloadBytes, final long uploadBytes) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNotification(@NonNull final JobParameters params, final int notificationId, @NonNull final Notification notification, final int jobEndNotificationPolicy) {
        throw new RuntimeException("Stub!");
    }
}
