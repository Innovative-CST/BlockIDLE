package android.service.autofill;

import android.widget.RemoteViews;
import android.os.Parcel;
import android.os.Parcelable;

public final class CustomDescription implements Parcelable
{
    @NonNull
    public static final Creator<CustomDescription> CREATOR;
    
    CustomDescription() {
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
        public Builder(@NonNull final RemoteViews parentPresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addChild(final int id, @NonNull final Transformation transformation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder batchUpdate(@NonNull final Validator condition, @NonNull final BatchUpdates updates) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addOnClickAction(final int id, @NonNull final OnClickAction action) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CustomDescription build() {
            throw new RuntimeException("Stub!");
        }
    }
}
