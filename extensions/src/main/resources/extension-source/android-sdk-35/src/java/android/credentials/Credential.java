package android.credentials;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class Credential implements Parcelable
{
    @NonNull
    public static final Creator<Credential> CREATOR;
    @NonNull
    public static final String TYPE_PASSWORD_CREDENTIAL = "android.credentials.TYPE_PASSWORD_CREDENTIAL";
    
    public Credential(@NonNull final String type, @NonNull final Bundle data) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getData() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
