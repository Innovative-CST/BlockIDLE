package android.app;

import android.util.AndroidException;
import android.os.Parcel;
import android.os.UserHandle;
import android.os.Handler;
import android.content.IntentSender;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;

public final class PendingIntent implements Parcelable
{
    @NonNull
    public static final Creator<PendingIntent> CREATOR;
    public static final int FLAG_ALLOW_UNSAFE_IMPLICIT_INTENT = 16777216;
    public static final int FLAG_CANCEL_CURRENT = 268435456;
    public static final int FLAG_IMMUTABLE = 67108864;
    public static final int FLAG_MUTABLE = 33554432;
    public static final int FLAG_NO_CREATE = 536870912;
    public static final int FLAG_ONE_SHOT = 1073741824;
    public static final int FLAG_UPDATE_CURRENT = 134217728;
    
    PendingIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getActivity(final Context context, final int requestCode, final Intent intent, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getActivity(final Context context, final int requestCode, @NonNull final Intent intent, final int flags, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getActivities(final Context context, final int requestCode, @NonNull final Intent[] intents, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getActivities(final Context context, final int requestCode, @NonNull final Intent[] intents, final int flags, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getBroadcast(final Context context, final int requestCode, @NonNull final Intent intent, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getService(final Context context, final int requestCode, @NonNull final Intent intent, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static PendingIntent getForegroundService(final Context context, final int requestCode, @NonNull final Intent intent, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public IntentSender getIntentSender() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void send() throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final int code) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final Context context, final int code, @Nullable final Intent intent) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(@Nullable final Bundle options) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final int code, @Nullable final OnFinished onFinished, @Nullable final Handler handler) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final Context context, final int code, @Nullable final Intent intent, @Nullable final OnFinished onFinished, @Nullable final Handler handler) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final Context context, final int code, @Nullable final Intent intent, @Nullable final OnFinished onFinished, @Nullable final Handler handler, @Nullable final String requiredPermission) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    public void send(final Context context, final int code, @Nullable final Intent intent, @Nullable final OnFinished onFinished, @Nullable final Handler handler, @Nullable final String requiredPermission, @Nullable final Bundle options) throws CanceledException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getTargetPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getCreatorPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCreatorUid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public UserHandle getCreatorUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImmutable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isForegroundService() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isService() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBroadcast() {
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
    
    public static void writePendingIntentOrNullToParcel(@Nullable final PendingIntent sender, @NonNull final Parcel out) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static PendingIntent readPendingIntentOrNullFromParcel(@NonNull final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class CanceledException extends AndroidException
    {
        public CanceledException() {
            throw new RuntimeException("Stub!");
        }
        
        public CanceledException(final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public CanceledException(final Exception cause) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnFinished
    {
        void onSendFinished(final PendingIntent p0, final Intent p1, final int p2, final String p3, final Bundle p4);
    }
}
