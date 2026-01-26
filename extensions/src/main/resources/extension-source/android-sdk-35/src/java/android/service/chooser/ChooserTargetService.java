package android.service.chooser;

import android.os.IBinder;
import android.content.Intent;
import java.util.List;
import android.content.IntentFilter;
import android.content.ComponentName;
import android.app.Service;

@Deprecated
public abstract class ChooserTargetService extends Service
{
    @Deprecated
    public static final String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
    @Deprecated
    public static final String META_DATA_NAME = "android.service.chooser.chooser_target_service";
    @Deprecated
    public static final String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
    
    @Deprecated
    public ChooserTargetService() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract List<ChooserTarget> onGetChooserTargets(final ComponentName p0, final IntentFilter p1);
    
    @Deprecated
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
