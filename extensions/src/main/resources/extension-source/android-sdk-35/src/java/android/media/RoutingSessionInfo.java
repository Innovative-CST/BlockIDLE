package android.media;

import android.os.UserHandle;
import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

public final class RoutingSessionInfo implements Parcelable
{
    @NonNull
    public static final Creator<RoutingSessionInfo> CREATOR;
    public static final int TRANSFER_REASON_APP = 2;
    public static final int TRANSFER_REASON_FALLBACK = 0;
    public static final int TRANSFER_REASON_SYSTEM_REQUEST = 1;
    
    RoutingSessionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getClientPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSelectedRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSelectableRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getDeselectableRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getTransferableRoutes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeHandling() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeMax() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolume() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getControlHints() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransferReason() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String id, @NonNull final String clientPackageName) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final RoutingSessionInfo sessionInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@Nullable final CharSequence name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearSelectedRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSelectedRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeSelectedRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearSelectableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSelectableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeSelectableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearDeselectableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDeselectableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeDeselectableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearTransferableRoutes() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addTransferableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeTransferableRoute(@NonNull final String routeId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolumeHandling(final int volumeHandling) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolumeMax(final int volumeMax) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setControlHints(@Nullable final Bundle controlHints) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransferReason(final int transferReason) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransferInitiator(@Nullable final UserHandle transferInitiatorUserHandle, @Nullable final String transferInitiatorPackageName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RoutingSessionInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
