package android.security;

import android.net.Uri;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;

public final class AppUriAuthenticationPolicy implements Parcelable
{
    @NonNull
    public static final Creator<AppUriAuthenticationPolicy> CREATOR;
    
    AppUriAuthenticationPolicy() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Map<Uri, String>> getAppAndUriMappings() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAppAndUriMapping(@NonNull final String appPackageName, @NonNull final Uri uri, @NonNull final String alias) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AppUriAuthenticationPolicy build() {
            throw new RuntimeException("Stub!");
        }
    }
}
