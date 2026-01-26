package android.view;

import android.os.Parcel;
import android.os.Bundle;
import android.net.Uri;
import android.content.ClipData;
import android.os.Parcelable;

public final class ContentInfo implements Parcelable
{
    @NonNull
    public static final Creator<ContentInfo> CREATOR;
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;
    
    ContentInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ClipData getClip() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSource() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getLinkUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final ContentInfo other) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ClipData clip, final int source) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClip(@NonNull final ClipData clip) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSource(final int source) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLinkUri(@Nullable final Uri linkUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ContentInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
