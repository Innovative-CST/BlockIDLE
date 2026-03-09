package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class PermissionInfo extends PackageItemInfo implements Parcelable
{
    @NonNull
    public static final Creator<PermissionInfo> CREATOR;
    public static final int FLAG_COSTS_MONEY = 1;
    public static final int FLAG_HARD_RESTRICTED = 4;
    public static final int FLAG_IMMUTABLY_RESTRICTED = 16;
    public static final int FLAG_INSTALLED = 1073741824;
    public static final int FLAG_SOFT_RESTRICTED = 8;
    public static final int PROTECTION_DANGEROUS = 1;
    public static final int PROTECTION_FLAG_APPOP = 64;
    public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
    public static final int PROTECTION_FLAG_INSTALLER = 256;
    public static final int PROTECTION_FLAG_INSTANT = 4096;
    public static final int PROTECTION_FLAG_PRE23 = 128;
    public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
    public static final int PROTECTION_FLAG_PRIVILEGED = 16;
    public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
    public static final int PROTECTION_FLAG_SETUP = 2048;
    @Deprecated
    public static final int PROTECTION_FLAG_SYSTEM = 16;
    public static final int PROTECTION_FLAG_VERIFIER = 512;
    public static final int PROTECTION_INTERNAL = 4;
    @Deprecated
    public static final int PROTECTION_MASK_BASE = 15;
    @Deprecated
    public static final int PROTECTION_MASK_FLAGS = 65520;
    public static final int PROTECTION_NORMAL = 0;
    public static final int PROTECTION_SIGNATURE = 2;
    @Deprecated
    public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
    public int descriptionRes;
    public int flags;
    @Nullable
    public String group;
    @Nullable
    public CharSequence nonLocalizedDescription;
    @Deprecated
    public int protectionLevel;
    
    @Deprecated
    public PermissionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PermissionInfo(@NonNull final PermissionInfo orig) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence loadDescription(@NonNull final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public int getProtection() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProtectionFlags() {
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
