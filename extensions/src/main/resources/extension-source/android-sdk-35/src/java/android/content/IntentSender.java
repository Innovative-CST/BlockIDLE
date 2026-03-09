package android.content;

import android.os.Bundle;
import android.util.AndroidException;
import android.os.Parcel;
import android.os.UserHandle;
import android.os.Handler;
import android.os.Parcelable;

public class IntentSender implements Parcelable
{
    @NonNull
    public static final Creator<IntentSender> CREATOR;
    
    IntentSender() {
        throw new RuntimeException("Stub!");
    }
    
    public void sendIntent(final Context context, final int code, final Intent intent, final OnFinished onFinished, final Handler handler) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    public void sendIntent(final Context context, final int code, final Intent intent, final OnFinished onFinished, final Handler handler, final String requiredPermission) throws SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getTargetPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public String getCreatorPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCreatorUid() {
        throw new RuntimeException("Stub!");
    }
    
    public UserHandle getCreatorUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object otherObj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static void writeIntentSenderOrNullToParcel(final IntentSender sender, final Parcel out) {
        throw new RuntimeException("Stub!");
    }
    
    public static IntentSender readIntentSenderOrNullFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class SendIntentException extends AndroidException
    {
        public SendIntentException() {
            throw new RuntimeException("Stub!");
        }
        
        public SendIntentException(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public SendIntentException(final Exception cause) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnFinished
    {
        void onSendFinished(final IntentSender p0, final Intent p1, final int p2, final String p3, final Bundle p4);
    }
}
