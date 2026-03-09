package android.app.appsearch;

import android.os.Parcel;
import android.os.Parcelable;

public final class SearchSuggestionResult implements Parcelable
{
    @NonNull
    public static final Creator<SearchSuggestionResult> CREATOR;
    
    SearchSuggestionResult() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getSuggestedResult() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int describeContents() {
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
        public Builder setSuggestedResult(@NonNull final String suggestedResult) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SearchSuggestionResult build() {
            throw new RuntimeException("Stub!");
        }
    }
}
