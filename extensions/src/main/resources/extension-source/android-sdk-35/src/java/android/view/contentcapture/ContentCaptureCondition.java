package android.view.contentcapture;

import android.os.Parcel;
import android.content.LocusId;
import android.os.Parcelable;

public final class ContentCaptureCondition implements Parcelable
{
    @NonNull
    public static final Creator<ContentCaptureCondition> CREATOR;
    public static final int FLAG_IS_REGEX = 2;
    
    public ContentCaptureCondition(@NonNull final LocusId locusId, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocusId getLocusId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
