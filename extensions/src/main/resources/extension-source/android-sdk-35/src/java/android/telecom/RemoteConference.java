package android.telecom;

import android.os.Handler;
import android.os.Bundle;
import java.util.List;

public final class RemoteConference
{
    RemoteConference() {
        throw new RuntimeException("Stub!");
    }
    
    public List<RemoteConnection> getConnections() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionProperties() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public void disconnect() {
        throw new RuntimeException("Stub!");
    }
    
    public void separate(final RemoteConnection connection) {
        throw new RuntimeException("Stub!");
    }
    
    public void merge() {
        throw new RuntimeException("Stub!");
    }
    
    public void swap() {
        throw new RuntimeException("Stub!");
    }
    
    public void hold() {
        throw new RuntimeException("Stub!");
    }
    
    public void unhold() {
        throw new RuntimeException("Stub!");
    }
    
    public DisconnectCause getDisconnectCause() {
        throw new RuntimeException("Stub!");
    }
    
    public void playDtmfTone(final char digit) {
        throw new RuntimeException("Stub!");
    }
    
    public void stopDtmfTone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallAudioState(final CallAudioState state) {
        throw new RuntimeException("Stub!");
    }
    
    public List<RemoteConnection> getConferenceableConnections() {
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
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onStateChanged(final RemoteConference conference, final int oldState, final int newState) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDisconnected(final RemoteConference conference, final DisconnectCause disconnectCause) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionAdded(final RemoteConference conference, final RemoteConnection connection) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionRemoved(final RemoteConference conference, final RemoteConnection connection) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionCapabilitiesChanged(final RemoteConference conference, final int connectionCapabilities) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConnectionPropertiesChanged(final RemoteConference conference, final int connectionProperties) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConferenceableConnectionsChanged(final RemoteConference conference, final List<RemoteConnection> conferenceableConnections) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDestroyed(final RemoteConference conference) {
            throw new RuntimeException("Stub!");
        }
        
        public void onExtrasChanged(final RemoteConference conference, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
    }
}
