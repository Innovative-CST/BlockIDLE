package android.media;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class Session2Command implements Parcelable
{
    public static final int COMMAND_CODE_CUSTOM = 0;
    @NonNull
    public static final Creator<Session2Command> CREATOR;
    
    public Session2Command(final int commandCode) {
        throw new RuntimeException("Stub!");
    }
    
    public Session2Command(@NonNull final String action, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCommandCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getCustomAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getCustomExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Result
    {
        public static final int RESULT_ERROR_UNKNOWN_ERROR = -1;
        public static final int RESULT_INFO_SKIPPED = 1;
        public static final int RESULT_SUCCESS = 0;
        
        public Result(final int resultCode, @Nullable final Bundle resultData) {
            throw new RuntimeException("Stub!");
        }
        
        public int getResultCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bundle getResultData() {
            throw new RuntimeException("Stub!");
        }
    }
}
