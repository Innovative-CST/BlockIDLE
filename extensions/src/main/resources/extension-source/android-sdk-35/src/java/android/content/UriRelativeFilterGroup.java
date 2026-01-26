package android.content;

import android.net.Uri;
import java.util.Collection;

public final class UriRelativeFilterGroup
{
    public static final int ACTION_ALLOW = 0;
    public static final int ACTION_BLOCK = 1;
    
    public UriRelativeFilterGroup(final int action) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAction() {
        throw new RuntimeException("Stub!");
    }
    
    public void addUriRelativeFilter(@NonNull final UriRelativeFilter uriRelativeFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<UriRelativeFilter> getUriRelativeFilters() {
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
