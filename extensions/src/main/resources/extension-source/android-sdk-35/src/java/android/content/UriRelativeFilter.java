package android.content;

import android.net.Uri;

public final class UriRelativeFilter
{
    public static final int FRAGMENT = 2;
    public static final int PATH = 0;
    public static final int QUERY = 1;
    
    public UriRelativeFilter(final int uriPart, final int patternType, @NonNull final String filter) {
        throw new RuntimeException("Stub!");
    }
    
    public int getUriPart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPatternType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean matchData(@NonNull final Uri data) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
