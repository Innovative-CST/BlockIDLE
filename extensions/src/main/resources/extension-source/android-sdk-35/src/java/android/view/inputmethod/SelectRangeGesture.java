package android.view.inputmethod;

import android.os.Parcel;
import android.graphics.RectF;
import android.os.Parcelable;

public final class SelectRangeGesture extends PreviewableHandwritingGesture implements Parcelable
{
    @NonNull
    public static final Creator<SelectRangeGesture> CREATOR;
    
    SelectRangeGesture() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGranularity() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RectF getSelectionStartArea() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RectF getSelectionEndArea() {
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
        public Builder setSelectionStartArea(@NonNull final RectF startArea) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelectionEndArea(@NonNull final RectF endArea) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackText(@Nullable final String fallbackText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SelectRangeGesture build() {
            throw new RuntimeException("Stub!");
        }
    }
}
