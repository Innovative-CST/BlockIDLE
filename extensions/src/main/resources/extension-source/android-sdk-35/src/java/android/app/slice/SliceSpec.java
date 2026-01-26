package android.app.slice;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class SliceSpec implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<SliceSpec> CREATOR;
    
    @Deprecated
    public SliceSpec(@NonNull final String type, final int revision) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRevision() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean canRender(@NonNull final SliceSpec candidate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
