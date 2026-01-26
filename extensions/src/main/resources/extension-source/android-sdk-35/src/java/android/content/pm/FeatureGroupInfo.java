package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class FeatureGroupInfo implements Parcelable
{
    @NonNull
    public static final Creator<FeatureGroupInfo> CREATOR;
    public FeatureInfo[] features;
    
    public FeatureGroupInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public FeatureGroupInfo(final FeatureGroupInfo other) {
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
