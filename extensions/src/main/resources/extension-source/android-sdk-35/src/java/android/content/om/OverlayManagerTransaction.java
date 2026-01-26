package android.content.om;

import android.os.Parcel;
import android.os.Parcelable;

public final class OverlayManagerTransaction implements Parcelable
{
    @NonNull
    public static final Creator<OverlayManagerTransaction> CREATOR;
    
    OverlayManagerTransaction() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static OverlayManagerTransaction newInstance() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void registerFabricatedOverlay(@NonNull final FabricatedOverlay overlay) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void unregisterFabricatedOverlay(@NonNull final OverlayIdentifier overlay) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
