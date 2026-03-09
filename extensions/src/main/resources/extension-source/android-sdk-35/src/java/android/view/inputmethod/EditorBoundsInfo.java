package android.view.inputmethod;

import android.os.Parcel;
import android.graphics.RectF;
import android.os.Parcelable;

public final class EditorBoundsInfo implements Parcelable
{
    @NonNull
    public static final Creator<EditorBoundsInfo> CREATOR;
    
    EditorBoundsInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RectF getEditorBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RectF getHandwritingBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
        public Builder setEditorBounds(@Nullable final RectF bounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHandwritingBounds(@Nullable final RectF bounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public EditorBoundsInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
