package android.speech;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class AlternativeSpans implements Parcelable
{
    @NonNull
    public static final Creator<AlternativeSpans> CREATOR;
    
    public AlternativeSpans(@NonNull final List<AlternativeSpan> spans) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AlternativeSpan> getSpans() {
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
