package android.content.om;

import android.os.Parcel;
import android.os.Parcelable;

public final class OverlayInfo implements Parcelable
{
    @NonNull
    public static final Creator<OverlayInfo> CREATOR;
    
    OverlayInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getOverlayName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getTargetPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTargetOverlayableName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public OverlayIdentifier getOverlayIdentifier() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
