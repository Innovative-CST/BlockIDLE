package android.speech;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class AlternativeSpan implements Parcelable
{
    @NonNull
    public static final Creator<AlternativeSpan> CREATOR;
    
    public AlternativeSpan(final int startPosition, final int endPosition, @NonNull final List<String> alternatives) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getAlternatives() {
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
