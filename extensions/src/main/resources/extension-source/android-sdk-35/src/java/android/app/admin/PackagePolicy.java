package android.app.admin;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class PackagePolicy implements Parcelable
{
    @NonNull
    public static final Creator<PackagePolicy> CREATOR;
    public static final int PACKAGE_POLICY_ALLOWLIST = 3;
    public static final int PACKAGE_POLICY_ALLOWLIST_AND_SYSTEM = 2;
    public static final int PACKAGE_POLICY_BLOCKLIST = 1;
    
    public PackagePolicy(final int policyType) {
        throw new RuntimeException("Stub!");
    }
    
    public PackagePolicy(final int policyType, @NonNull final Set<String> packageNames) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPolicyType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getPackageNames() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object thatObject) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
