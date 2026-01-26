package android.view.contentcapture;

import android.os.Parcel;
import android.content.LocusId;
import android.os.Parcelable;

public final class DataShareRequest implements Parcelable
{
    @NonNull
    public static final Creator<DataShareRequest> CREATOR;
    
    public DataShareRequest(@Nullable final LocusId locusId, @NonNull final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocusId getLocusId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
