package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class ModuleInfo implements Parcelable
{
    @NonNull
    public static final Creator<ModuleInfo> CREATOR;
    
    ModuleInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHidden() {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
