package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class FeatureInfo implements Parcelable
{
    @NonNull
    public static final Creator<FeatureInfo> CREATOR;
    public static final int FLAG_REQUIRED = 1;
    public static final int GL_ES_VERSION_UNDEFINED = 0;
    public int flags;
    public String name;
    public int reqGlEsVersion;
    public int version;
    
    public FeatureInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public FeatureInfo(final FeatureInfo orig) {
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
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public String getGlEsVersion() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
