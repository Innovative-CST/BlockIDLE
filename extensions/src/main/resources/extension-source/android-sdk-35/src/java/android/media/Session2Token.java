package android.media;

import android.os.Bundle;
import android.os.Parcel;
import android.content.ComponentName;
import android.content.Context;
import android.os.Parcelable;

public final class Session2Token implements Parcelable
{
    @NonNull
    public static final Creator<Session2Token> CREATOR;
    public static final int TYPE_SESSION = 0;
    public static final int TYPE_SESSION_SERVICE = 1;
    
    public Session2Token(@NonNull final Context context, @NonNull final ComponentName serviceComponent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUid() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
