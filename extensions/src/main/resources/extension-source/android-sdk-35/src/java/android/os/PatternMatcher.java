package android.os;

public class PatternMatcher implements Parcelable
{
    @NonNull
    public static final Creator<PatternMatcher> CREATOR;
    public static final int PATTERN_ADVANCED_GLOB = 3;
    public static final int PATTERN_LITERAL = 0;
    public static final int PATTERN_PREFIX = 1;
    public static final int PATTERN_SIMPLE_GLOB = 2;
    public static final int PATTERN_SUFFIX = 4;
    
    public PatternMatcher(final String pattern, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public PatternMatcher(final Parcel src) {
        throw new RuntimeException("Stub!");
    }
    
    public final String getPath() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean match(final String str) {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
