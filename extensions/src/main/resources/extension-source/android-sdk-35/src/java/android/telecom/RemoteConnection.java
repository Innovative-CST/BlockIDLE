package android.telecom;

import android.view.Surface;
import java.util.List;
import android.os.Bundle;
import android.net.Uri;
import android.os.Handler;

public final class RemoteConnection
{
    RemoteConnection() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(final Callback callback, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public DisconnectCause getDisconnectCause() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVoipAudioMode() {
        throw new RuntimeException("Stub!");
    }
    
    public StatusHints getStatusHints() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAddressPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getCallerDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCallerDisplayNamePresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoState() {
        throw new RuntimeException("Stub!");
    }
    
    public VideoProvider getVideoProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRingbackRequested() {
        throw new RuntimeException("Stub!");
    }
    
    public void abort() {
        throw new RuntimeException("Stub!");
    }
    
    public void answer() {
        throw new RuntimeException("Stub!");
    }
    
    public void reject() {
        throw new RuntimeException("Stub!");
    }
    
    public void hold() {
        throw new RuntimeException("Stub!");
    }
    
    public void unhold() {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public void playDtmfTone(final char digit) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopDtmfTone() {
        throw new RuntimeException("Stub!");
    }
    
    public void postDialContinue(final boolean proceed) {
        throw new RuntimeException("Stub!");
    }
    
    public void pullExternalCall() {
        throw new RuntimeException("Stub!");
    }
    
    public void addConferenceParticipants(@NonNull final List<Uri> participants) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallAudioState(final CallAudioState state) {
        throw new RuntimeException("Stub!");
    }
    
    public List<RemoteConnection> getConferenceableConnections() {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteConference getConference() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStateChanged(final RemoteConnection connection, final int state) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(final RemoteConnection connection, final DisconnectCause disconnectCause) {
            throw new RuntimeException("Stub!");
        }
        
        public void onRingbackRequested(final RemoteConnection connection, final boolean ringback) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionCapabilitiesChanged(final RemoteConnection connection, final int connectionCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionPropertiesChanged(final RemoteConnection connection, final int connectionProperties) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPostDialWait(final RemoteConnection connection, final String remainingPostDialSequence) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPostDialChar(final RemoteConnection connection, final char nextChar) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVoipAudioChanged(final RemoteConnection connection, final boolean isVoip) {
            throw new RuntimeException("Stub!");
        }
        
        public void onStatusHintsChanged(final RemoteConnection connection, final StatusHints statusHints) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAddressChanged(final RemoteConnection connection, final Uri address, final int presentation) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCallerDisplayNameChanged(final RemoteConnection connection, final String callerDisplayName, final int presentation) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoStateChanged(final RemoteConnection connection, final int videoState) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDestroyed(final RemoteConnection connection) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConferenceableConnectionsChanged(final RemoteConnection connection, final List<RemoteConnection> conferenceableConnections) {
            throw new RuntimeException("Stub!");
        }
        
        public void onVideoProviderChanged(final RemoteConnection connection, final VideoProvider videoProvider) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConferenceChanged(final RemoteConnection connection, final RemoteConference conference) {
            throw new RuntimeException("Stub!");
        }
        
        public void onExtrasChanged(final RemoteConnection connection, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionEvent(final RemoteConnection connection, final String event, final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class VideoProvider
    {
        VideoProvider() {
            throw new RuntimeException("Stub!");
        }
        
        public void registerCallback(final Callback l) {
            throw new RuntimeException("Stub!");
        }
        
        public void unregisterCallback(final Callback l) {
            throw new RuntimeException("Stub!");
        }
        
        public void setCamera(final String cameraId) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreviewSurface(final Surface surface) {
            throw new RuntimeException("Stub!");
        }
        
        public void setDisplaySurface(final Surface surface) {
            throw new RuntimeException("Stub!");
        }
        
        public void setDeviceOrientation(final int rotation) {
            throw new RuntimeException("Stub!");
        }
        
        public void setZoom(final float value) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendSessionModifyRequest(final VideoProfile fromProfile, final VideoProfile toProfile) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendSessionModifyResponse(final VideoProfile responseProfile) {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCameraCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        public void requestCallDataUsage() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPauseImage(final Uri uri) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract static class Callback
        {
            public Callback() {
                throw new RuntimeException("Stub!");
            }
            
            public void onSessionModifyRequestReceived(final VideoProvider videoProvider, final VideoProfile videoProfile) {
                throw new RuntimeException("Stub!");
            }
            
            public void onSessionModifyResponseReceived(final VideoProvider videoProvider, final int status, final VideoProfile requestedProfile, final VideoProfile responseProfile) {
                throw new RuntimeException("Stub!");
            }
            
            public void onCallSessionEvent(final VideoProvider videoProvider, final int event) {
                throw new RuntimeException("Stub!");
            }
            
            public void onPeerDimensionsChanged(final VideoProvider videoProvider, final int width, final int height) {
                throw new RuntimeException("Stub!");
            }
            
            public void onCallDataUsageChanged(final VideoProvider videoProvider, final long dataUsage) {
                throw new RuntimeException("Stub!");
            }
            
            public void onCameraCapabilitiesChanged(final VideoProvider videoProvider, final VideoProfile.CameraCapabilities cameraCapabilities) {
                throw new RuntimeException("Stub!");
            }
            
            public void onVideoQualityChanged(final VideoProvider videoProvider, final int videoQuality) {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
