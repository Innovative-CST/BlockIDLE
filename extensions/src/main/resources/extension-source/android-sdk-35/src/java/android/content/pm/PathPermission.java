package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PatternMatcher;

public class PathPermission extends PatternMatcher
{
    @NonNull
    public static final Parcelable.Creator<PathPermission> CREATOR;
    
    public PathPermission(final String pattern, final int type, final String readPermission, final String writePermission) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public PathPermission(final Parcel src) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public String getReadPermission() {
        throw new RuntimeException("Stub!");
    }
    
    public String getWritePermission() {
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
