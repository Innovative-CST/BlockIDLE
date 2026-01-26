package android.media;

import android.media.metrics.LogSessionId;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.List;
import java.util.UUID;

public final class MediaDrm implements AutoCloseable
{
    @Deprecated
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    @Deprecated
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int EVENT_SESSION_RECLAIMED = 5;
    public static final int EVENT_VENDOR_DEFINED = 4;
    public static final int HDCP_LEVEL_UNKNOWN = 0;
    public static final int HDCP_NONE = 1;
    public static final int HDCP_NO_DIGITAL_OUTPUT = Integer.MAX_VALUE;
    public static final int HDCP_V1 = 2;
    public static final int HDCP_V2 = 3;
    public static final int HDCP_V2_1 = 4;
    public static final int HDCP_V2_2 = 5;
    public static final int HDCP_V2_3 = 6;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;
    public static final int OFFLINE_LICENSE_STATE_RELEASED = 2;
    public static final int OFFLINE_LICENSE_STATE_UNKNOWN = 0;
    public static final int OFFLINE_LICENSE_STATE_USABLE = 1;
    public static final String PROPERTY_ALGORITHMS = "algorithms";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
    public static final String PROPERTY_VENDOR = "vendor";
    public static final String PROPERTY_VERSION = "version";
    public static final int SECURITY_LEVEL_HW_SECURE_ALL = 5;
    public static final int SECURITY_LEVEL_HW_SECURE_CRYPTO = 3;
    public static final int SECURITY_LEVEL_HW_SECURE_DECODE = 4;
    public static final int SECURITY_LEVEL_SW_SECURE_CRYPTO = 1;
    public static final int SECURITY_LEVEL_SW_SECURE_DECODE = 2;
    public static final int SECURITY_LEVEL_UNKNOWN = 0;
    
    public MediaDrm(@NonNull final UUID uuid) throws UnsupportedSchemeException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCryptoSchemeSupported(@NonNull final UUID uuid) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCryptoSchemeSupported(@NonNull final UUID uuid, @NonNull final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isCryptoSchemeSupported(@NonNull final UUID uuid, @NonNull final String mimeType, final int securityLevel) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static List<UUID> getSupportedCryptoSchemes() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnExpirationUpdateListener(@Nullable final OnExpirationUpdateListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnExpirationUpdateListener(@NonNull final Executor executor, @NonNull final OnExpirationUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnExpirationUpdateListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnKeyStatusChangeListener(@Nullable final OnKeyStatusChangeListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnKeyStatusChangeListener(@NonNull final Executor executor, @NonNull final OnKeyStatusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnKeyStatusChangeListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSessionLostStateListener(@Nullable final OnSessionLostStateListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSessionLostStateListener(@NonNull final Executor executor, @Nullable final OnSessionLostStateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnSessionLostStateListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnEventListener(@Nullable final OnEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnEventListener(@Nullable final OnEventListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnEventListener(@NonNull final Executor executor, @NonNull final OnEventListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearOnEventListener() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] openSession() throws NotProvisionedException, ResourceBusyException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] openSession(final int level) throws NotProvisionedException, ResourceBusyException {
        throw new RuntimeException("Stub!");
    }
    
    public void closeSession(@NonNull final byte[] sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public KeyRequest getKeyRequest(@NonNull final byte[] scope, @Nullable final byte[] init, @Nullable final String mimeType, final int keyType, @Nullable final HashMap<String, String> optionalParameters) throws NotProvisionedException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public native byte[] provideKeyResponse(@NonNull final byte[] p0, @NonNull final byte[] p1) throws DeniedByServerException, NotProvisionedException;
    
    public native void restoreKeys(@NonNull final byte[] p0, @NonNull final byte[] p1);
    
    public native void removeKeys(@NonNull final byte[] p0);
    
    @NonNull
    public native HashMap<String, String> queryKeyStatus(@NonNull final byte[] p0);
    
    @NonNull
    public ProvisionRequest getProvisionRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public void provideProvisionResponse(@NonNull final byte[] response) throws DeniedByServerException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native List<byte[]> getOfflineLicenseKeySetIds();
    
    public native void removeOfflineLicense(@NonNull final byte[] p0);
    
    public native int getOfflineLicenseState(@NonNull final byte[] p0);
    
    @Deprecated
    @NonNull
    public native List<byte[]> getSecureStops();
    
    @Deprecated
    @NonNull
    public native List<byte[]> getSecureStopIds();
    
    @Deprecated
    @NonNull
    public native byte[] getSecureStop(@NonNull final byte[] p0);
    
    @Deprecated
    public native void releaseSecureStops(@NonNull final byte[] p0);
    
    @Deprecated
    public native void removeSecureStop(@NonNull final byte[] p0);
    
    @Deprecated
    public native void removeAllSecureStops();
    
    @Deprecated
    public void releaseAllSecureStops() {
        throw new RuntimeException("Stub!");
    }
    
    public native int getConnectedHdcpLevel();
    
    public native int getMaxHdcpLevel();
    
    public native int getOpenSessionCount();
    
    public native int getMaxSessionCount();
    
    public static int getMaxSecurityLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public native int getSecurityLevel(@NonNull final byte[] p0);
    
    @NonNull
    public native String getPropertyString(@NonNull final String p0);
    
    public native void setPropertyString(@NonNull final String p0, @NonNull final String p1);
    
    @NonNull
    public native byte[] getPropertyByteArray(final String p0);
    
    public native void setPropertyByteArray(@NonNull final String p0, @NonNull final byte[] p1);
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public CryptoSession getCryptoSession(@NonNull final byte[] sessionId, @NonNull final String cipherAlgorithm, @NonNull final String macAlgorithm) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requiresSecureDecoder(@NonNull final String mime) {
        throw new RuntimeException("Stub!");
    }
    
    public native boolean requiresSecureDecoder(@NonNull final String p0, final int p1);
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PlaybackComponent getPlaybackComponent(@NonNull final byte[] sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native List<LogMessage> getLogMessages();
    
    public final class CryptoSession
    {
        CryptoSession() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] encrypt(@NonNull final byte[] keyid, @NonNull final byte[] input, @NonNull final byte[] iv) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] decrypt(@NonNull final byte[] keyid, @NonNull final byte[] input, @NonNull final byte[] iv) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] sign(@NonNull final byte[] keyid, @NonNull final byte[] message) {
            throw new RuntimeException("Stub!");
        }
        
        public boolean verify(@NonNull final byte[] keyid, @NonNull final byte[] message, @NonNull final byte[] signature) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ErrorCodes
    {
        public static final int ERROR_CERTIFICATE_MALFORMED = 10;
        public static final int ERROR_CERTIFICATE_MISSING = 11;
        public static final int ERROR_CRYPTO_LIBRARY = 12;
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        public static final int ERROR_GENERIC_OEM = 13;
        public static final int ERROR_GENERIC_PLUGIN = 14;
        public static final int ERROR_INIT_DATA = 15;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        public static final int ERROR_KEY_EXPIRED = 2;
        public static final int ERROR_KEY_NOT_LOADED = 16;
        public static final int ERROR_LICENSE_PARSE = 17;
        public static final int ERROR_LICENSE_POLICY = 18;
        public static final int ERROR_LICENSE_RELEASE = 19;
        public static final int ERROR_LICENSE_REQUEST_REJECTED = 20;
        public static final int ERROR_LICENSE_RESTORE = 21;
        public static final int ERROR_LICENSE_STATE = 22;
        public static final int ERROR_LOST_STATE = 9;
        public static final int ERROR_MEDIA_FRAMEWORK = 23;
        public static final int ERROR_NO_KEY = 1;
        public static final int ERROR_PROVISIONING_CERTIFICATE = 24;
        public static final int ERROR_PROVISIONING_CONFIG = 25;
        public static final int ERROR_PROVISIONING_PARSE = 26;
        public static final int ERROR_PROVISIONING_REQUEST_REJECTED = 27;
        public static final int ERROR_PROVISIONING_RETRY = 28;
        public static final int ERROR_RESOURCE_BUSY = 3;
        public static final int ERROR_RESOURCE_CONTENTION = 29;
        public static final int ERROR_SECURE_STOP_RELEASE = 30;
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        public static final int ERROR_STORAGE_READ = 31;
        public static final int ERROR_STORAGE_WRITE = 32;
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        public static final int ERROR_ZERO_SUBSAMPLES = 33;
        
        ErrorCodes() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class KeyRequest
    {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_UPDATE = 4;
        
        KeyRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] getData() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDefaultUrl() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRequestType() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class KeyStatus
    {
        public static final int STATUS_EXPIRED = 1;
        public static final int STATUS_INTERNAL_ERROR = 4;
        public static final int STATUS_OUTPUT_NOT_ALLOWED = 2;
        public static final int STATUS_PENDING = 3;
        public static final int STATUS_USABLE = 0;
        public static final int STATUS_USABLE_IN_FUTURE = 5;
        
        KeyStatus() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStatusCode() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] getKeyId() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class LogMessage
    {
        LogMessage() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimestampMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPriority() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getMessage() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MediaDrmStateException extends IllegalStateException implements MediaDrmThrowable
    {
        MediaDrmStateException() {
            throw new RuntimeException("Stub!");
        }
        
        public int getErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getVendorError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getOemError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getErrorContext() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isTransient() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDiagnosticInfo() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String CLOSE_SESSION_ERROR_COUNT = "drm.mediadrm.close_session.error.count";
        public static final String CLOSE_SESSION_ERROR_LIST = "drm.mediadrm.close_session.error.list";
        public static final String CLOSE_SESSION_OK_COUNT = "drm.mediadrm.close_session.ok.count";
        public static final String EVENT_KEY_EXPIRED_COUNT = "drm.mediadrm.event.KEY_EXPIRED.count";
        public static final String EVENT_KEY_NEEDED_COUNT = "drm.mediadrm.event.KEY_NEEDED.count";
        public static final String EVENT_PROVISION_REQUIRED_COUNT = "drm.mediadrm.event.PROVISION_REQUIRED.count";
        public static final String EVENT_SESSION_RECLAIMED_COUNT = "drm.mediadrm.event.SESSION_RECLAIMED.count";
        public static final String EVENT_VENDOR_DEFINED_COUNT = "drm.mediadrm.event.VENDOR_DEFINED.count";
        public static final String GET_DEVICE_UNIQUE_ID_ERROR_COUNT = "drm.mediadrm.get_device_unique_id.error.count";
        public static final String GET_DEVICE_UNIQUE_ID_ERROR_LIST = "drm.mediadrm.get_device_unique_id.error.list";
        public static final String GET_DEVICE_UNIQUE_ID_OK_COUNT = "drm.mediadrm.get_device_unique_id.ok.count";
        public static final String GET_KEY_REQUEST_ERROR_COUNT = "drm.mediadrm.get_key_request.error.count";
        public static final String GET_KEY_REQUEST_ERROR_LIST = "drm.mediadrm.get_key_request.error.list";
        public static final String GET_KEY_REQUEST_OK_COUNT = "drm.mediadrm.get_key_request.ok.count";
        public static final String GET_KEY_REQUEST_OK_TIME_MICROS = "drm.mediadrm.get_key_request.ok.average_time_micros";
        public static final String GET_PROVISION_REQUEST_ERROR_COUNT = "drm.mediadrm.get_provision_request.error.count";
        public static final String GET_PROVISION_REQUEST_ERROR_LIST = "drm.mediadrm.get_provision_request.error.list";
        public static final String GET_PROVISION_REQUEST_OK_COUNT = "drm.mediadrm.get_provision_request.ok.count";
        public static final String KEY_STATUS_EXPIRED_COUNT = "drm.mediadrm.key_status.EXPIRED.count";
        public static final String KEY_STATUS_INTERNAL_ERROR_COUNT = "drm.mediadrm.key_status.INTERNAL_ERROR.count";
        public static final String KEY_STATUS_OUTPUT_NOT_ALLOWED_COUNT = "drm.mediadrm.key_status_change.OUTPUT_NOT_ALLOWED.count";
        public static final String KEY_STATUS_PENDING_COUNT = "drm.mediadrm.key_status_change.PENDING.count";
        public static final String KEY_STATUS_USABLE_COUNT = "drm.mediadrm.key_status_change.USABLE.count";
        public static final String OPEN_SESSION_ERROR_COUNT = "drm.mediadrm.open_session.error.count";
        public static final String OPEN_SESSION_ERROR_LIST = "drm.mediadrm.open_session.error.list";
        public static final String OPEN_SESSION_OK_COUNT = "drm.mediadrm.open_session.ok.count";
        public static final String PROVIDE_KEY_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_key_response.error.count";
        public static final String PROVIDE_KEY_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_key_response.error.list";
        public static final String PROVIDE_KEY_RESPONSE_OK_COUNT = "drm.mediadrm.provide_key_response.ok.count";
        public static final String PROVIDE_KEY_RESPONSE_OK_TIME_MICROS = "drm.mediadrm.provide_key_response.ok.average_time_micros";
        public static final String PROVIDE_PROVISION_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_provision_response.error.count";
        public static final String PROVIDE_PROVISION_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_provision_response.error.list";
        public static final String PROVIDE_PROVISION_RESPONSE_OK_COUNT = "drm.mediadrm.provide_provision_response.ok.count";
        public static final String SESSION_END_TIMES_MS = "drm.mediadrm.session_end_times_ms";
        public static final String SESSION_START_TIMES_MS = "drm.mediadrm.session_start_times_ms";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class PlaybackComponent
    {
        PlaybackComponent() {
            throw new RuntimeException("Stub!");
        }
        
        public void setLogSessionId(@NonNull final LogSessionId logSessionId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LogSessionId getLogSessionId() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ProvisionRequest
    {
        ProvisionRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] getData() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDefaultUrl() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SessionException extends RuntimeException implements MediaDrmThrowable
    {
        @Deprecated
        public static final int ERROR_RESOURCE_CONTENTION = 1;
        @Deprecated
        public static final int ERROR_UNKNOWN = 0;
        
        public SessionException(final int errorCode, @Nullable final String detailMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getVendorError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getOemError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getErrorContext() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isTransient() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnSessionLostStateListener
    {
        void onSessionLostState(@NonNull final MediaDrm p0, @NonNull final byte[] p1);
    }
    
    public interface OnKeyStatusChangeListener
    {
        void onKeyStatusChange(@NonNull final MediaDrm p0, @NonNull final byte[] p1, @NonNull final List<KeyStatus> p2, final boolean p3);
    }
    
    public interface OnExpirationUpdateListener
    {
        void onExpirationUpdate(@NonNull final MediaDrm p0, @NonNull final byte[] p1, final long p2);
    }
    
    public interface OnEventListener
    {
        void onEvent(@NonNull final MediaDrm p0, @Nullable final byte[] p1, final int p2, final int p3, @Nullable final byte[] p4);
    }
}
