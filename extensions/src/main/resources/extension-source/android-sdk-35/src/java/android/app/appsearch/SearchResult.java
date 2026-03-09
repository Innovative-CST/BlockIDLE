package android.app.appsearch;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class SearchResult implements Parcelable
{
    @NonNull
    public static final Creator<SearchResult> CREATOR;
    
    SearchResult() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public GenericDocument getGenericDocument() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MatchInfo> getMatchInfos() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getDatabaseName() {
        throw new RuntimeException("Stub!");
    }
    
    public double getRankingSignal() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<SearchResult> getJoinedResults() {
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
        public Builder(@NonNull final String packageName, @NonNull final String databaseName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGenericDocument(@NonNull final GenericDocument document) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMatchInfo(@NonNull final MatchInfo matchInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRankingSignal(final double rankingSignal) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addJoinedResult(@NonNull final SearchResult joinedResult) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SearchResult build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MatchInfo implements Parcelable
    {
        @NonNull
        public static final Creator<MatchInfo> CREATOR;
        
        MatchInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getPropertyPath() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PropertyPath getPropertyPathObject() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getFullText() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MatchRange getExactMatchRange() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getExactMatch() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MatchRange getSubmatchRange() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getSubmatch() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MatchRange getSnippetRange() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getSnippet() {
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
            public Builder(@NonNull final String propertyPath) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExactMatchRange(@NonNull final MatchRange matchRange) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSubmatchRange(@NonNull final MatchRange matchRange) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSnippetRange(@NonNull final MatchRange matchRange) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public MatchInfo build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class MatchRange
    {
        public MatchRange(final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        public int getStart() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEnd() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
}
