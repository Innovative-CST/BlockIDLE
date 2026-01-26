package android.media;

import android.os.Bundle;
import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.content.Context;

public final class MediaRouter2
{
    MediaRouter2() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaRouter2 getInstance(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaRouter2 getInstance(@NonNull final Context context, @NonNull final String clientPackageName, @NonNull final Executor executor, @NonNull final Runnable onInstanceInvalidatedListener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ScanToken requestScan(@NonNull final ScanRequest scanRequest) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelScanRequest(@NonNull final ScanToken token) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerRouteCallback(@NonNull final Executor executor, @NonNull final RouteCallback routeCallback, @NonNull final RouteDiscoveryPreference preference) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterRouteCallback(@NonNull final RouteCallback routeCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerRouteListingPreferenceUpdatedCallback(@NonNull final Executor executor, @NonNull final Consumer<RouteListingPreference> routeListingPreferenceCallback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterRouteListingPreferenceUpdatedCallback(@NonNull final Consumer<RouteListingPreference> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showSystemOutputSwitcher() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRouteListingPreference(@Nullable final RouteListingPreference routeListingPreference) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RouteListingPreference getRouteListingPreference() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MediaRoute2Info> getRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerTransferCallback(@NonNull final Executor executor, @NonNull final TransferCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterTransferCallback(@NonNull final TransferCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerControllerCallback(@NonNull final Executor executor, @NonNull final ControllerCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterControllerCallback(@NonNull final ControllerCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnGetControllerHintsListener(@Nullable final OnGetControllerHintsListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void transferTo(@NonNull final MediaRoute2Info route) {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RoutingController getSystemController() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RoutingController getController(@NonNull final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RoutingController> getControllers() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRouteVolume(@NonNull final MediaRoute2Info route, final int volume) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class ControllerCallback
    {
        public ControllerCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onControllerUpdated(@NonNull final RoutingController controller) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class RouteCallback
    {
        public RouteCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRoutesAdded(@NonNull final List<MediaRoute2Info> routes) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRoutesRemoved(@NonNull final List<MediaRoute2Info> routes) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onRoutesChanged(@NonNull final List<MediaRoute2Info> routes) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRoutesUpdated(@NonNull final List<MediaRoute2Info> routes) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class RoutingController
    {
        RoutingController() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getId() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bundle getControlHints() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<MediaRoute2Info> getSelectedRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<MediaRoute2Info> getSelectableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<MediaRoute2Info> getDeselectableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<MediaRoute2Info> getTransferableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean wasTransferInitiatedBySelf() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RoutingSessionInfo getRoutingSessionInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolumeHandling() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolumeMax() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolume() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isReleased() {
            throw new RuntimeException("Stub!");
        }
        
        public void selectRoute(@NonNull final MediaRoute2Info route) {
            throw new RuntimeException("Stub!");
        }
        
        public void deselectRoute(@NonNull final MediaRoute2Info route) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        public void release() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ScanRequest
    {
        ScanRequest() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isScreenOffScan() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setScreenOffScan(final boolean isScreenOffScan) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public ScanRequest build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class ScanToken
    {
        ScanToken() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class TransferCallback
    {
        public TransferCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onTransfer(@NonNull final RoutingController oldController, @NonNull final RoutingController newController) {
            throw new RuntimeException("Stub!");
        }
        
        public void onTransferFailure(@NonNull final MediaRoute2Info requestedRoute) {
            throw new RuntimeException("Stub!");
        }
        
        public void onStop(@NonNull final RoutingController controller) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnGetControllerHintsListener
    {
        @Nullable
        Bundle onGetControllerHints(@NonNull final MediaRoute2Info p0);
    }
}
