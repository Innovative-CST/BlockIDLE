package android.service.carrier;

import android.os.RemoteException;
import android.os.IBinder;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import android.app.Service;

public abstract class CarrierMessagingService extends Service
{
    public static final int DOWNLOAD_STATUS_ERROR = 2;
    public static final int DOWNLOAD_STATUS_OK = 0;
    public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final int RECEIVE_OPTIONS_DEFAULT = 0;
    public static final int RECEIVE_OPTIONS_DROP = 1;
    public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
    public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
    public static final int SEND_STATUS_ERROR = 2;
    public static final int SEND_STATUS_OK = 0;
    public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
    public static final String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
    
    public CarrierMessagingService() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onFilterSms(@NonNull final MessagePdu pdu, @NonNull final String format, final int destPort, final int subId, @NonNull final ResultCallback<Boolean> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReceiveTextSms(@NonNull final MessagePdu pdu, @NonNull final String format, final int destPort, final int subId, @NonNull final ResultCallback<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSendTextSms(@NonNull final String text, final int subId, @NonNull final String destAddress, @NonNull final ResultCallback<SendSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSendTextSms(@NonNull final String text, final int subId, @NonNull final String destAddress, final int sendSmsFlag, @NonNull final ResultCallback<SendSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSendDataSms(@NonNull final byte[] data, final int subId, @NonNull final String destAddress, final int destPort, @NonNull final ResultCallback<SendSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSendDataSms(@NonNull final byte[] data, final int subId, @NonNull final String destAddress, final int destPort, final int sendSmsFlag, @NonNull final ResultCallback<SendSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSendMultipartTextSms(@NonNull final List<String> parts, final int subId, @NonNull final String destAddress, @NonNull final ResultCallback<SendMultipartSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSendMultipartTextSms(@NonNull final List<String> parts, final int subId, @NonNull final String destAddress, final int sendSmsFlag, @NonNull final ResultCallback<SendMultipartSmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSendMms(@NonNull final Uri pduUri, final int subId, @Nullable final Uri location, @NonNull final ResultCallback<SendMmsResult> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDownloadMms(@NonNull final Uri contentUri, final int subId, @NonNull final Uri location, @NonNull final ResultCallback<Integer> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class SendMmsResult
    {
        public SendMmsResult(final int sendStatus, @Nullable final byte[] sendConfPdu) {
            throw new RuntimeException("Stub!");
        }
        
        public int getSendStatus() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public byte[] getSendConfPdu() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SendMultipartSmsResult
    {
        public SendMultipartSmsResult(final int sendStatus, @Nullable final int[] messageRefs) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public int[] getMessageRefs() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSendStatus() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class SendSmsResult
    {
        public SendSmsResult(final int sendStatus, final int messageRef) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMessageRef() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSendStatus() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface ResultCallback<T>
    {
        void onReceiveResult(@NonNull final T p0) throws RemoteException;
    }
}
