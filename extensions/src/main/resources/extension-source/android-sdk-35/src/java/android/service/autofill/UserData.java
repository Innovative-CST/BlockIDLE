package android.service.autofill;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class UserData implements Parcelable
{
    @NonNull
    public static final Creator<UserData> CREATOR;
    
    UserData() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFieldClassificationAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFieldClassificationAlgorithmForCategory(@NonNull final String categoryId) {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    public static int getMaxUserDataSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxFieldClassificationIdsSize() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxCategoryCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMinValueLength() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxValueLength() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String id, @NonNull final String value, @NonNull final String categoryId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFieldClassificationAlgorithm(@Nullable final String name, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFieldClassificationAlgorithmForCategory(@NonNull final String categoryId, @Nullable final String name, @Nullable final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder add(@NonNull final String value, @NonNull final String categoryId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public UserData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
