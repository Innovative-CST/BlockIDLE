package android.telephony;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class AvailableNetworkInfo implements Parcelable
{
    @NonNull
    public static final Creator<AvailableNetworkInfo> CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = 3;
    public static final int PRIORITY_MED = 2;
    
    public AvailableNetworkInfo(final int subId, final int priority, @NonNull final List<String> mccMncs, @NonNull final List<Integer> bands) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPriority() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getMccMncs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getBands() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RadioAccessSpecifier> getRadioAccessSpecifiers() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int subId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPriority(final int priority) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMccMncs(@NonNull final List<String> mccMncs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRadioAccessSpecifiers(@NonNull final List<RadioAccessSpecifier> radioAccessSpecifiers) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AvailableNetworkInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
