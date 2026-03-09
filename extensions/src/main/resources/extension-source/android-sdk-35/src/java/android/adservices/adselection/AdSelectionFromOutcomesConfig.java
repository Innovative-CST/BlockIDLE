package android.adservices.adselection;

import android.os.Parcel;
import android.net.Uri;
import android.adservices.common.AdSelectionSignals;
import java.util.List;
import android.adservices.common.AdTechIdentifier;
import android.os.Parcelable;

public final class AdSelectionFromOutcomesConfig implements Parcelable
{
    @NonNull
    public static final Creator<AdSelectionFromOutcomesConfig> CREATOR;
    
    AdSelectionFromOutcomesConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdTechIdentifier getSeller() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Long> getAdSelectionIds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdSelectionSignals getSelectionSignals() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getSelectionLogicUri() {
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
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
        public Builder setSeller(@NonNull final AdTechIdentifier seller) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdSelectionIds(@NonNull final List<Long> adSelectionIds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelectionSignals(@NonNull final AdSelectionSignals selectionSignals) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelectionLogicUri(@NonNull final Uri selectionLogicUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AdSelectionFromOutcomesConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
