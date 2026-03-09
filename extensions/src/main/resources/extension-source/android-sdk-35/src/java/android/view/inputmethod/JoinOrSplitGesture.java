package android.view.inputmethod;

import android.os.Parcel;
import android.graphics.PointF;
import android.os.Parcelable;

public final class JoinOrSplitGesture extends HandwritingGesture implements Parcelable
{
    @NonNull
    public static final Creator<JoinOrSplitGesture> CREATOR;
    
    JoinOrSplitGesture() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PointF getJoinOrSplitPoint() {
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
        public Builder setJoinOrSplitPoint(@NonNull final PointF point) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackText(@Nullable final String fallbackText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public JoinOrSplitGesture build() {
            throw new RuntimeException("Stub!");
        }
    }
}
