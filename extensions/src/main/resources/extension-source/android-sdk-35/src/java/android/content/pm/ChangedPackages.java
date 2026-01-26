package android.content.pm;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class ChangedPackages implements Parcelable
{
    @NonNull
    public static final Creator<ChangedPackages> CREATOR;
    
    public ChangedPackages(final int sequenceNumber, @NonNull final List<String> packageNames) {
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
    
    public int getSequenceNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getPackageNames() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
