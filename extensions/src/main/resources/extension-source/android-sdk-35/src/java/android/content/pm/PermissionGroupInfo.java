package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class PermissionGroupInfo extends PackageItemInfo implements Parcelable
{
    @NonNull
    public static final Creator<PermissionGroupInfo> CREATOR;
    public static final int FLAG_PERSONAL_INFO = 1;
    public int descriptionRes;
    public int flags;
    @Nullable
    public CharSequence nonLocalizedDescription;
    public int priority;
    
    @Deprecated
    public PermissionGroupInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PermissionGroupInfo(@NonNull final PermissionGroupInfo orig) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence loadDescription(@NonNull final PackageManager pm) {
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
