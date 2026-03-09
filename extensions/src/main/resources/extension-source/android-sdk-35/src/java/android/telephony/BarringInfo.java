package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class BarringInfo implements Parcelable
{
    public static final int BARRING_SERVICE_TYPE_CS_FALLBACK = 5;
    public static final int BARRING_SERVICE_TYPE_CS_SERVICE = 0;
    public static final int BARRING_SERVICE_TYPE_CS_VOICE = 2;
    public static final int BARRING_SERVICE_TYPE_EMERGENCY = 8;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VIDEO = 7;
    public static final int BARRING_SERVICE_TYPE_MMTEL_VOICE = 6;
    public static final int BARRING_SERVICE_TYPE_MO_DATA = 4;
    public static final int BARRING_SERVICE_TYPE_MO_SIGNALLING = 3;
    public static final int BARRING_SERVICE_TYPE_PS_SERVICE = 1;
    public static final int BARRING_SERVICE_TYPE_SMS = 9;
    @NonNull
    public static final Creator<BarringInfo> CREATOR;
    
    BarringInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public BarringServiceInfo getBarringServiceInfo(final int service) {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object rhs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class BarringServiceInfo implements Parcelable
    {
        public static final int BARRING_TYPE_CONDITIONAL = 1;
        public static final int BARRING_TYPE_NONE = 0;
        public static final int BARRING_TYPE_UNCONDITIONAL = 2;
        public static final int BARRING_TYPE_UNKNOWN = -1;
        @NonNull
        public static final Creator<BarringServiceInfo> CREATOR;
        
        BarringServiceInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBarringType() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isConditionallyBarred() {
            throw new RuntimeException("Stub!");
        }
        
        public int getConditionalBarringFactor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getConditionalBarringTimeSeconds() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isBarred() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object rhs) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
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
        
        static {
            CREATOR = null;
        }
    }
}
