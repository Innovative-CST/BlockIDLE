package android.telecom;

import java.util.Collection;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class ConnectionService extends Service
{
    public static final String SERVICE_INTERFACE = "android.telecom.ConnectionService";
    
    public ConnectionService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onUnbind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final RemoteConnection createRemoteIncomingConnection(@NonNull final PhoneAccountHandle connectionManagerPhoneAccount, @NonNull final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final RemoteConnection createRemoteOutgoingConnection(@NonNull final PhoneAccountHandle connectionManagerPhoneAccount, @NonNull final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final RemoteConference createRemoteIncomingConference(@Nullable final PhoneAccountHandle connectionManagerPhoneAccount, @Nullable final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final RemoteConference createRemoteOutgoingConference(@Nullable final PhoneAccountHandle connectionManagerPhoneAccount, @Nullable final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public final void conferenceRemoteConnections(final RemoteConnection remoteConnection1, final RemoteConnection remoteConnection2) {
        throw new RuntimeException("Stub!");
    }
    
    public final void addConference(final Conference conference) {
        throw new RuntimeException("Stub!");
    }
    
    public final void addExistingConnection(final PhoneAccountHandle phoneAccountHandle, final Connection connection) {
        throw new RuntimeException("Stub!");
    }
    
    public final void connectionServiceFocusReleased() {
        throw new RuntimeException("Stub!");
    }
    
    public final Collection<Connection> getAllConnections() {
        throw new RuntimeException("Stub!");
    }
    
    public final Collection<Conference> getAllConferences() {
        throw new RuntimeException("Stub!");
    }
    
    public Connection onCreateIncomingConnection(final PhoneAccountHandle connectionManagerPhoneAccount, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Conference onCreateIncomingConference(@NonNull final PhoneAccountHandle connectionManagerPhoneAccount, @NonNull final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateIncomingConnectionFailed(final PhoneAccountHandle connectionManagerPhoneAccount, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateOutgoingConnectionFailed(final PhoneAccountHandle connectionManagerPhoneAccount, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateIncomingConferenceFailed(@Nullable final PhoneAccountHandle connectionManagerPhoneAccount, @Nullable final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreateOutgoingConferenceFailed(@NonNull final PhoneAccountHandle connectionManagerPhoneAccount, @NonNull final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public Connection onCreateOutgoingConnection(final PhoneAccountHandle connectionManagerPhoneAccount, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Conference onCreateOutgoingConference(@NonNull final PhoneAccountHandle connectionManagerPhoneAccount, @NonNull final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public Connection onCreateOutgoingHandoverConnection(final PhoneAccountHandle fromPhoneAccountHandle, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public Connection onCreateIncomingHandoverConnection(final PhoneAccountHandle fromPhoneAccountHandle, final ConnectionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHandoverFailed(final ConnectionRequest request, final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public void onConference(final Connection connection1, final Connection connection2) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRemoteConferenceAdded(final RemoteConference conference) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRemoteExistingConnectionAdded(final RemoteConnection connection) {
        throw new RuntimeException("Stub!");
    }
    
    public void onConnectionServiceFocusLost() {
        throw new RuntimeException("Stub!");
    }
    
    public void onConnectionServiceFocusGained() {
        throw new RuntimeException("Stub!");
    }
}
