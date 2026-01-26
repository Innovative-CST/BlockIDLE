package android.hardware.lights;

import android.os.Parcel;
import android.os.Parcelable;

public final class LightState implements Parcelable
{
    @NonNull
    public static final Creator<LightState> CREATOR;
    
    LightState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPlayerId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
        public Builder setColor(final int color) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPlayerId(final int playerId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LightState build() {
            throw new RuntimeException("Stub!");
        }
    }
}
