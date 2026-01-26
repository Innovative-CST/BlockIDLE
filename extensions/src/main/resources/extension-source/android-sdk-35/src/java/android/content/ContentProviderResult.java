package android.content;

import android.os.Parcel;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

public class ContentProviderResult implements Parcelable
{
    @NonNull
    public static final Creator<ContentProviderResult> CREATOR;
    @Nullable
    public final Integer count;
    @Nullable
    public final Throwable exception;
    @Nullable
    public final Bundle extras;
    @Nullable
    public final Uri uri;
    
    public ContentProviderResult(@NonNull final Uri uri) {
        this.count = null;
        this.exception = null;
        this.extras = null;
        this.uri = null;
        throw new RuntimeException("Stub!");
    }
    
    public ContentProviderResult(final int count) {
        this.count = null;
        this.exception = null;
        this.extras = null;
        this.uri = null;
        throw new RuntimeException("Stub!");
    }
    
    public ContentProviderResult(@NonNull final Bundle extras) {
        this.count = null;
        this.exception = null;
        this.extras = null;
        this.uri = null;
        throw new RuntimeException("Stub!");
    }
    
    public ContentProviderResult(@NonNull final Throwable exception) {
        this.count = null;
        this.exception = null;
        this.extras = null;
        this.uri = null;
        throw new RuntimeException("Stub!");
    }
    
    public ContentProviderResult(final Parcel source) {
        this.count = null;
        this.exception = null;
        this.extras = null;
        this.uri = null;
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
