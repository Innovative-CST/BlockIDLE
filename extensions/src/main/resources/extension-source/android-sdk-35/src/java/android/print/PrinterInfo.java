package android.print;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrinterInfo implements Parcelable
{
    @NonNull
    public static final Creator<PrinterInfo> CREATOR;
    public static final int STATUS_BUSY = 2;
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    
    PrinterInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrinterId getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PrinterCapabilitiesInfo getCapabilities() {
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
        public Builder(@NonNull final PrinterId printerId, @NonNull final String name, final int status) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final PrinterInfo other) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStatus(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIconResourceId(final int iconResourceId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasCustomPrinterIcon(final boolean hasCustomPrinterIcon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@NonNull final String description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInfoIntent(@NonNull final PendingIntent infoIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCapabilities(@NonNull final PrinterCapabilitiesInfo capabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PrinterInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
