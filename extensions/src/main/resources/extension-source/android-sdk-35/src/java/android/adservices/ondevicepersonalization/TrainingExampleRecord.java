package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import android.os.Parcelable;

public final class TrainingExampleRecord implements Parcelable
{
    @NonNull
    public static final Creator<TrainingExampleRecord> CREATOR;
    
    TrainingExampleRecord() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getTrainingExample() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getResumptionToken() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTrainingExample(@Nullable final byte... value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setResumptionToken(@Nullable final byte... value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TrainingExampleRecord build() {
            throw new RuntimeException("Stub!");
        }
    }
}
