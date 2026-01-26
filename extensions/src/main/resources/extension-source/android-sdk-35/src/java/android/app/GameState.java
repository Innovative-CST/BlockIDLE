package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class GameState implements Parcelable
{
    @NonNull
    public static final Creator<GameState> CREATOR;
    public static final int MODE_CONTENT = 4;
    public static final int MODE_GAMEPLAY_INTERRUPTIBLE = 2;
    public static final int MODE_GAMEPLAY_UNINTERRUPTIBLE = 3;
    public static final int MODE_NONE = 1;
    public static final int MODE_UNKNOWN = 0;
    
    public GameState(final boolean isLoading, final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public GameState(final boolean isLoading, final int mode, final int label, final int quality) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLoading() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getQuality() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
