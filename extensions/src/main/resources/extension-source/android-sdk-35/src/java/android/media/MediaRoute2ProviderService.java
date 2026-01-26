package android.media;

import java.util.Collection;
import android.os.Bundle;
import java.util.List;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class MediaRoute2ProviderService extends Service
{
    public static final int REASON_INVALID_COMMAND = 4;
    public static final int REASON_NETWORK_ERROR = 2;
    public static final int REASON_REJECTED = 1;
    public static final int REASON_ROUTE_NOT_AVAILABLE = 3;
    public static final int REASON_UNKNOWN_ERROR = 0;
    public static final long REQUEST_ID_NONE = 0L;
    public static final String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
    
    public MediaRoute2ProviderService() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onSetRouteVolume(final long p0, @NonNull final String p1, final int p2);
    
    public abstract void onSetSessionVolume(final long p0, @NonNull final String p1, final int p2);
    
    @Nullable
    public final RoutingSessionInfo getSessionInfo(@NonNull final String sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final List<RoutingSessionInfo> getAllSessionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifySessionCreated(final long requestId, @NonNull final RoutingSessionInfo sessionInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifySessionUpdated(@NonNull final RoutingSessionInfo sessionInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifySessionReleased(@NonNull final String sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyRequestFailed(final long requestId, final int reason) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onCreateSession(final long p0, @NonNull final String p1, @NonNull final String p2, @Nullable final Bundle p3);
    
    public abstract void onReleaseSession(final long p0, @NonNull final String p1);
    
    public abstract void onSelectRoute(final long p0, @NonNull final String p1, @NonNull final String p2);
    
    public abstract void onDeselectRoute(final long p0, @NonNull final String p1, @NonNull final String p2);
    
    public abstract void onTransferToRoute(final long p0, @NonNull final String p1, @NonNull final String p2);
    
    public void onDiscoveryPreferenceChanged(@NonNull final RouteDiscoveryPreference preference) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyRoutes(@NonNull final Collection<MediaRoute2Info> routes) {
        throw new RuntimeException("Stub!");
    }
}
