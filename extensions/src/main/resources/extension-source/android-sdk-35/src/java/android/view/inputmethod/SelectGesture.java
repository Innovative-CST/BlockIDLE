package android.view.inputmethod;

import android.os.Parcel;
import android.graphics.RectF;
import android.os.Parcelable;

public final class SelectGesture extends PreviewableHandwritingGesture implements Parcelable
{
    @NonNull
    public static final Creator<SelectGesture> CREATOR;
    
    SelectGesture() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGranularity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RectF getSelectionArea() {
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
        public Builder setSelectionArea(@NonNull final RectF area) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackText(@Nullable final String fallbackText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SelectGesture build() {
            throw new RuntimeException("Stub!");
        }
    }
}
