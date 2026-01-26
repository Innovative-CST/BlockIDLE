package android.hardware.lights;

import android.os.Parcel;
import android.os.Parcelable;

public final class Light implements Parcelable
{
    @NonNull
    public static final Creator<Light> CREATOR;
    public static final int LIGHT_CAPABILITY_BRIGHTNESS = 1;
    public static final int LIGHT_CAPABILITY_COLOR_RGB = 2;
    @Deprecated
    public static final int LIGHT_CAPABILITY_RGB = 0;
    public static final int LIGHT_TYPE_INPUT = 10001;
    public static final int LIGHT_TYPE_KEYBOARD_BACKLIGHT = 10003;
    public static final int LIGHT_TYPE_MICROPHONE = 8;
    public static final int LIGHT_TYPE_PLAYER_ID = 10002;
    
    Light() {
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
    public boolean equals(@Nullable final Object obj) {
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
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrdinal() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBrightnessControl() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasRgbControl() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
