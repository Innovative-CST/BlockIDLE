package android.os;

import android.media.AudioAttributes;

public final class VibrationAttributes implements Parcelable
{
    @NonNull
    public static final Creator<VibrationAttributes> CREATOR;
    public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 1;
    public static final int USAGE_ACCESSIBILITY = 66;
    public static final int USAGE_ALARM = 17;
    public static final int USAGE_CLASS_ALARM = 1;
    public static final int USAGE_CLASS_FEEDBACK = 2;
    public static final int USAGE_CLASS_MASK = 15;
    public static final int USAGE_CLASS_MEDIA = 3;
    public static final int USAGE_CLASS_UNKNOWN = 0;
    public static final int USAGE_COMMUNICATION_REQUEST = 65;
    public static final int USAGE_HARDWARE_FEEDBACK = 50;
    public static final int USAGE_MEDIA = 19;
    public static final int USAGE_NOTIFICATION = 49;
    public static final int USAGE_PHYSICAL_EMULATION = 34;
    public static final int USAGE_RINGTONE = 33;
    public static final int USAGE_TOUCH = 18;
    public static final int USAGE_UNKNOWN = 0;
    
    VibrationAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static VibrationAttributes createForUsage(final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    public int getUsageClass() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFlagSet(final int flag) {
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
    public boolean equals(@Nullable final Object o) {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@Nullable final VibrationAttributes vib) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AudioAttributes audio) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VibrationAttributes build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUsage(final int usage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int flags, final int mask) {
            throw new RuntimeException("Stub!");
        }
    }
}
