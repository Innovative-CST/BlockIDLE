package android.content.pm;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class SharedLibraryInfo implements Parcelable
{
    @NonNull
    public static final Creator<SharedLibraryInfo> CREATOR;
    public static final int TYPE_BUILTIN = 0;
    public static final int TYPE_DYNAMIC = 1;
    public static final int TYPE_SDK_PACKAGE = 3;
    public static final int TYPE_STATIC = 2;
    public static final int VERSION_UNDEFINED = -1;
    
    SharedLibraryInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLongVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public VersionedPackage getDeclaringPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<VersionedPackage> getDependentPackages() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
