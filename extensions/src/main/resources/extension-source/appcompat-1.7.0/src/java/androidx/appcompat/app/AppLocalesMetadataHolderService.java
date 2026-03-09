package androidx.appcompat.app;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.os.Build;
import android.content.pm.ServiceInfo;
import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.app.Service;

public final class AppLocalesMetadataHolderService extends Service
{
    @NonNull
    public IBinder onBind(@NonNull final Intent intent) {
        throw new UnsupportedOperationException();
    }
    
    @NonNull
    public static ServiceInfo getServiceInfo(@NonNull final Context context) throws PackageManager.NameNotFoundException {
        int flags = 128;
        if (Build.VERSION.SDK_INT >= 24) {
            flags |= Api24Impl.getDisabledComponentFlag();
        }
        else {
            flags |= 0x200;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class)AppLocalesMetadataHolderService.class), flags);
    }
    
    @RequiresApi(24)
    private static class Api24Impl
    {
        @DoNotInline
        static int getDisabledComponentFlag() {
            return 512;
        }
    }
}
