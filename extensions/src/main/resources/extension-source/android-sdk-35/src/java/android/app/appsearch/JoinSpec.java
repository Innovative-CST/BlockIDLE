package android.app.appsearch;

import android.os.Parcel;
import android.os.Parcelable;

public final class JoinSpec implements Parcelable
{
    public static final int AGGREGATION_SCORING_AVG_RANKING_SIGNAL = 3;
    public static final int AGGREGATION_SCORING_MAX_RANKING_SIGNAL = 4;
    public static final int AGGREGATION_SCORING_MIN_RANKING_SIGNAL = 2;
    public static final int AGGREGATION_SCORING_OUTER_RESULT_RANKING_SIGNAL = 0;
    public static final int AGGREGATION_SCORING_RESULT_COUNT = 1;
    public static final int AGGREGATION_SCORING_SUM_RANKING_SIGNAL = 5;
    @NonNull
    public static final Creator<JoinSpec> CREATOR;
    
    JoinSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNestedQuery() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getChildPropertyExpression() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxJoinedResultCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SearchSpec getNestedSearchSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAggregationScoringStrategy() {
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
        public Builder(@NonNull final String childPropertyExpression) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNestedSearch(@NonNull final String nestedQuery, @NonNull final SearchSpec nestedSearchSpec) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxJoinedResultCount(final int maxJoinedResultCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAggregationScoringStrategy(final int aggregationScoringStrategy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public JoinSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
