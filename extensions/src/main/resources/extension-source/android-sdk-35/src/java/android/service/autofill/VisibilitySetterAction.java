package android.service.autofill;

import android.os.Parcel;
import android.os.Parcelable;

public final class VisibilitySetterAction implements OnClickAction, Parcelable
{
    @NonNull
    public static final Creator<VisibilitySetterAction> CREATOR;
    
    VisibilitySetterAction() {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int id, final int visibility) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVisibility(final int id, final int visibility) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VisibilitySetterAction build() {
            throw new RuntimeException("Stub!");
        }
    }
}
