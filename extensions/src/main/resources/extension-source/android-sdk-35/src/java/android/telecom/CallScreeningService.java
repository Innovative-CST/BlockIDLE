package android.telecom;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class CallScreeningService extends Service
{
    public static final String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
    
    public CallScreeningService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onUnbind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onScreenCall(@NonNull final Call.Details p0);
    
    public final void respondToCall(@NonNull final Call.Details callDetails, @NonNull final CallResponse response) {
        throw new RuntimeException("Stub!");
    }
    
    public static class CallResponse
    {
        public static final int CALL_COMPOSER_ATTACHMENT_LOCATION = 2;
        public static final int CALL_COMPOSER_ATTACHMENT_PICTURE = 1;
        public static final int CALL_COMPOSER_ATTACHMENT_PRIORITY = 8;
        public static final int CALL_COMPOSER_ATTACHMENT_SUBJECT = 4;
        
        CallResponse() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getDisallowCall() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getRejectCall() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getSilenceCall() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getSkipCallLog() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean getSkipNotification() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallComposerAttachmentsToShow() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        public static class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setDisallowCall(final boolean shouldDisallowCall) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setRejectCall(final boolean shouldRejectCall) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSilenceCall(final boolean shouldSilenceCall) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setSkipCallLog(final boolean shouldSkipCallLog) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setSkipNotification(final boolean shouldSkipNotification) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCallComposerAttachmentsToShow(final int callComposerAttachmentsToShow) {
                throw new RuntimeException("Stub!");
            }
            
            public CallResponse build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
