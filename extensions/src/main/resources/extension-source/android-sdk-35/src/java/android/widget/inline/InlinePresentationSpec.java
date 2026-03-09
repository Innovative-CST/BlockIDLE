package android.widget.inline;

import android.os.Parcel;
import android.os.Bundle;
import android.util.Size;
import android.os.Parcelable;

public final class InlinePresentationSpec implements Parcelable
{
    @NonNull
    public static final Creator<InlinePresentationSpec> CREATOR;
    
    InlinePresentationSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Size getMinSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Size getMaxSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getStyle() {
        throw new RuntimeException("Stub!");
    }
    
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
        public Builder(@NonNull final Size minSize, @NonNull final Size maxSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStyle(@NonNull final Bundle value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public InlinePresentationSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
