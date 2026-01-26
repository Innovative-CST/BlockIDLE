package android.view.inputmethod;

import android.os.Parcel;
import android.graphics.RectF;
import android.os.Parcelable;

public final class DeleteRangeGesture extends PreviewableHandwritingGesture implements Parcelable
{
    @NonNull
    public static final Creator<DeleteRangeGesture> CREATOR;
    
    DeleteRangeGesture() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGranularity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RectF getDeletionStartArea() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RectF getDeletionEndArea() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGranularity(final int granularity) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeletionStartArea(@NonNull final RectF startArea) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeletionEndArea(@NonNull final RectF endArea) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackText(@Nullable final String fallbackText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DeleteRangeGesture build() {
            throw new RuntimeException("Stub!");
        }
    }
}
