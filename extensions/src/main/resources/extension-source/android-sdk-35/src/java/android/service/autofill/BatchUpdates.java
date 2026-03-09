package android.service.autofill;

import android.widget.RemoteViews;
import android.os.Parcel;
import android.os.Parcelable;

public final class BatchUpdates implements Parcelable
{
    @NonNull
    public static final Creator<BatchUpdates> CREATOR;
    
    BatchUpdates() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder updateTemplate(@NonNull final RemoteViews updates) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder transformChild(final int id, @NonNull final Transformation transformation) {
            throw new RuntimeException("Stub!");
        }
        
        public BatchUpdates build() {
            throw new RuntimeException("Stub!");
        }
    }
}
