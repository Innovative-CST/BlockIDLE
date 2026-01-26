package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class PackageInfo implements Parcelable
{
    @NonNull
    public static final Creator<PackageInfo> CREATOR;
    public static final int INSTALL_LOCATION_AUTO = 0;
    public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
    public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
    public static final int REQUESTED_PERMISSION_GRANTED = 2;
    public static final int REQUESTED_PERMISSION_IMPLICIT = 4;
    public static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
    @Nullable
    public ActivityInfo[] activities;
    @Nullable
    public ApplicationInfo applicationInfo;
    @Nullable
    public Attribution[] attributions;
    public int baseRevisionCode;
    @Nullable
    public ConfigurationInfo[] configPreferences;
    @Nullable
    public FeatureGroupInfo[] featureGroups;
    public long firstInstallTime;
    @Nullable
    public int[] gids;
    public int installLocation;
    @Nullable
    public InstrumentationInfo[] instrumentation;
    public boolean isApex;
    public long lastUpdateTime;
    @NonNull
    public String packageName;
    @Nullable
    public PermissionInfo[] permissions;
    @Nullable
    public ProviderInfo[] providers;
    @Nullable
    public ActivityInfo[] receivers;
    @Nullable
    public FeatureInfo[] reqFeatures;
    @Nullable
    public String[] requestedPermissions;
    @Nullable
    public int[] requestedPermissionsFlags;
    @Nullable
    public ServiceInfo[] services;
    @Nullable
    public String sharedUserId;
    public int sharedUserLabel;
    @Deprecated
    @Nullable
    public Signature[] signatures;
    @Nullable
    public SigningInfo signingInfo;
    @NonNull
    public String[] splitNames;
    @NonNull
    public int[] splitRevisionCodes;
    @Deprecated
    public int versionCode;
    @Nullable
    public String versionName;
    
    public PackageInfo() {
        this.installLocation = 1;
        throw new RuntimeException("Stub!");
    }
    
    public long getLongVersionCode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLongVersionCode(final long longVersionCode) {
        throw new RuntimeException("Stub!");
    }
    
    public long getArchiveTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getApexPackageName() {
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
    
    static {
        CREATOR = null;
    }
}
