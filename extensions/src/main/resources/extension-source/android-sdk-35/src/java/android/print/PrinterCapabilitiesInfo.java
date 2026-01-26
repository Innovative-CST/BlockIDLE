package android.print;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class PrinterCapabilitiesInfo implements Parcelable
{
    @NonNull
    public static final Creator<PrinterCapabilitiesInfo> CREATOR;
    
    PrinterCapabilitiesInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PrintAttributes.MediaSize> getMediaSizes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PrintAttributes.Resolution> getResolutions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrintAttributes.Margins getMinMargins() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColorModes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDuplexModes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrintAttributes getDefaults() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
        public Builder(@NonNull final PrinterId printerId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMediaSize(@NonNull final PrintAttributes.MediaSize mediaSize, final boolean isDefault) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addResolution(@NonNull final PrintAttributes.Resolution resolution, final boolean isDefault) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMinMargins(@NonNull final PrintAttributes.Margins margins) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setColorModes(final int colorModes, final int defaultColorMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDuplexModes(final int duplexModes, final int defaultDuplexMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PrinterCapabilitiesInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
