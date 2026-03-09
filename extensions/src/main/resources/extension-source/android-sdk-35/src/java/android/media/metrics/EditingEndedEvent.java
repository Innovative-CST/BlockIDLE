package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

public final class EditingEndedEvent extends Event implements Parcelable
{
    @NonNull
    public static final Creator<EditingEndedEvent> CREATOR;
    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = 18;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 11;
    public static final int ERROR_CODE_DECODING_FAILED = 12;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 13;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = 14;
    public static final int ERROR_CODE_ENCODING_FAILED = 15;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = 16;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 2;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 6;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 9;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 7;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 4;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 5;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 8;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 10;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 3;
    public static final int ERROR_CODE_MUXING_FAILED = 19;
    public static final int ERROR_CODE_NONE = 1;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 17;
    public static final int FINAL_STATE_CANCELED = 2;
    public static final int FINAL_STATE_ERROR = 3;
    public static final int FINAL_STATE_SUCCEEDED = 1;
    public static final long OPERATION_TYPE_AUDIO_EDIT = 8L;
    public static final long OPERATION_TYPE_AUDIO_TRANSCODE = 2L;
    public static final long OPERATION_TYPE_AUDIO_TRANSMUX = 32L;
    public static final long OPERATION_TYPE_PAUSED = 64L;
    public static final long OPERATION_TYPE_RESUMED = 128L;
    public static final long OPERATION_TYPE_VIDEO_EDIT = 4L;
    public static final long OPERATION_TYPE_VIDEO_TRANSCODE = 1L;
    public static final long OPERATION_TYPE_VIDEO_TRANSMUX = 16L;
    public static final int PROGRESS_PERCENT_UNKNOWN = -1;
    public static final int TIME_SINCE_CREATED_UNKNOWN = -1;
    
    EditingEndedEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFinalState() {
        throw new RuntimeException("Stub!");
    }
    
    public float getFinalProgressPercent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getErrorCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getExporterName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMuxerName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MediaItemInfo> getInputMediaItemInfos() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public MediaItemInfo getOutputMediaItemInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public long getOperationTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Bundle getMetricsBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int finalState) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFinalProgressPercent(final float finalProgressPercent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimeSinceCreatedMillis(final long timeSinceCreatedMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExporterName(@NonNull final String exporterName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMuxerName(@NonNull final String muxerName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setErrorCode(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInputMediaItemInfo(@NonNull final MediaItemInfo mediaItemInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOutputMediaItemInfo(@NonNull final MediaItemInfo mediaItemInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addOperationType(final long operationType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EditingEndedEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
}
