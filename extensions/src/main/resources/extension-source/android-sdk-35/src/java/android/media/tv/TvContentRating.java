package android.media.tv;

import java.util.List;

public final class TvContentRating
{
    public static final TvContentRating UNRATED;
    
    TvContentRating() {
        throw new RuntimeException("Stub!");
    }
    
    public static TvContentRating createRating(final String domain, final String ratingSystem, final String rating, final String... subRatings) {
        throw new RuntimeException("Stub!");
    }
    
    public static TvContentRating unflattenFromString(final String ratingString) {
        throw new RuntimeException("Stub!");
    }
    
    public String getDomain() {
        throw new RuntimeException("Stub!");
    }
    
    public String getRatingSystem() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMainRating() {
        throw new RuntimeException("Stub!");
    }
    
    public List<String> getSubRatings() {
        throw new RuntimeException("Stub!");
    }
    
    public String flattenToString() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(@NonNull final TvContentRating rating) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        UNRATED = null;
    }
}
