package android.media;

import android.view.Display;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.content.Context;

public class MediaRouter
{
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
    public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
    public static final int ROUTE_TYPE_USER = 8388608;
    
    MediaRouter() {
        throw new RuntimeException("Stub!");
    }
    
    public RouteInfo getDefaultRoute() {
        throw new RuntimeException("Stub!");
    }
    
    public RouteInfo getSelectedRoute(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public void addCallback(final int types, final Callback cb) {
        throw new RuntimeException("Stub!");
    }
    
    public void addCallback(final int types, final Callback cb, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeCallback(final Callback cb) {
        throw new RuntimeException("Stub!");
    }
    
    public void selectRoute(final int types, @NonNull final RouteInfo route) {
        throw new RuntimeException("Stub!");
    }
    
    public void addUserRoute(final UserRouteInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeUserRoute(final UserRouteInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearUserRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCategoryCount() {
        throw new RuntimeException("Stub!");
    }
    
    public RouteCategory getCategoryAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRouteCount() {
        throw new RuntimeException("Stub!");
    }
    
    public RouteInfo getRouteAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public UserRouteInfo createUserRoute(final RouteCategory category) {
        throw new RuntimeException("Stub!");
    }
    
    public RouteCategory createRouteCategory(final CharSequence name, final boolean isGroupable) {
        throw new RuntimeException("Stub!");
    }
    
    public RouteCategory createRouteCategory(final int nameResId, final boolean isGroupable) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onRouteSelected(final MediaRouter p0, final int p1, final RouteInfo p2);
        
        public abstract void onRouteUnselected(final MediaRouter p0, final int p1, final RouteInfo p2);
        
        public abstract void onRouteAdded(final MediaRouter p0, final RouteInfo p1);
        
        public abstract void onRouteRemoved(final MediaRouter p0, final RouteInfo p1);
        
        public abstract void onRouteChanged(final MediaRouter p0, final RouteInfo p1);
        
        public abstract void onRouteGrouped(final MediaRouter p0, final RouteInfo p1, final RouteGroup p2, final int p3);
        
        public abstract void onRouteUngrouped(final MediaRouter p0, final RouteInfo p1, final RouteGroup p2);
        
        public abstract void onRouteVolumeChanged(final MediaRouter p0, final RouteInfo p1);
        
        public void onRoutePresentationDisplayChanged(final MediaRouter router, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class RouteCategory
    {
        RouteCategory() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public List<RouteInfo> getRoutes(final List<RouteInfo> out) {
            throw new RuntimeException("Stub!");
        }
        
        public int getSupportedTypes() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isGroupable() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class RouteGroup extends RouteInfo
    {
        RouteGroup() {
            throw new RuntimeException("Stub!");
        }
        
        public void addRoute(final RouteInfo route) {
            throw new RuntimeException("Stub!");
        }
        
        public void addRoute(final RouteInfo route, final int insertAt) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeRoute(final RouteInfo route) {
            throw new RuntimeException("Stub!");
        }
        
        public void removeRoute(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        public int getRouteCount() {
            throw new RuntimeException("Stub!");
        }
        
        public RouteInfo getRouteAt(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        public void setIconDrawable(final Drawable icon) {
            throw new RuntimeException("Stub!");
        }
        
        public void setIconResource(final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void requestSetVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void requestUpdateVolume(final int direction) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class RouteInfo
    {
        public static final int DEVICE_TYPE_BLUETOOTH = 3;
        public static final int DEVICE_TYPE_SPEAKER = 2;
        public static final int DEVICE_TYPE_TV = 1;
        public static final int DEVICE_TYPE_UNKNOWN = 0;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        
        RouteInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName(final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getDescription() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getStatus() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSupportedTypes() {
            throw new RuntimeException("Stub!");
        }
        
        public int getDeviceType() {
            throw new RuntimeException("Stub!");
        }
        
        public RouteGroup getGroup() {
            throw new RuntimeException("Stub!");
        }
        
        public RouteCategory getCategory() {
            throw new RuntimeException("Stub!");
        }
        
        public Drawable getIconDrawable() {
            throw new RuntimeException("Stub!");
        }
        
        public void setTag(final Object tag) {
            throw new RuntimeException("Stub!");
        }
        
        public Object getTag() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPlaybackType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPlaybackStream() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolume() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestSetVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestUpdateVolume(final int direction) {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolumeMax() {
            throw new RuntimeException("Stub!");
        }
        
        public int getVolumeHandling() {
            throw new RuntimeException("Stub!");
        }
        
        public Display getPresentationDisplay() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isEnabled() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isConnecting() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class SimpleCallback extends Callback
    {
        public SimpleCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteSelected(final MediaRouter router, final int type, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteUnselected(final MediaRouter router, final int type, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteAdded(final MediaRouter router, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteRemoved(final MediaRouter router, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteChanged(final MediaRouter router, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteGrouped(final MediaRouter router, final RouteInfo info, final RouteGroup group, final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteUngrouped(final MediaRouter router, final RouteInfo info, final RouteGroup group) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onRouteVolumeChanged(final MediaRouter router, final RouteInfo info) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class UserRouteInfo extends RouteInfo
    {
        UserRouteInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public void setName(final CharSequence name) {
            throw new RuntimeException("Stub!");
        }
        
        public void setName(final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        public void setDescription(final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        public void setStatus(final CharSequence status) {
            throw new RuntimeException("Stub!");
        }
        
        public void setRemoteControlClient(final RemoteControlClient rcc) {
            throw new RuntimeException("Stub!");
        }
        
        public RemoteControlClient getRemoteControlClient() {
            throw new RuntimeException("Stub!");
        }
        
        public void setIconDrawable(final Drawable icon) {
            throw new RuntimeException("Stub!");
        }
        
        public void setIconResource(final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVolumeCallback(final VolumeCallback vcb) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPlaybackType(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVolumeHandling(final int volumeHandling) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void requestSetVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void requestUpdateVolume(final int direction) {
            throw new RuntimeException("Stub!");
        }
        
        public void setVolumeMax(final int volumeMax) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPlaybackStream(final int stream) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class VolumeCallback
    {
        public VolumeCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onVolumeUpdateRequest(final RouteInfo p0, final int p1);
        
        public abstract void onVolumeSetRequest(final RouteInfo p0, final int p1);
    }
}
