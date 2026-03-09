package android.text.style;

import android.os.Parcel;
import android.graphics.text.LineBreakConfig;
import android.os.Parcelable;
import android.text.ParcelableSpan;

public final class LineBreakConfigSpan implements ParcelableSpan
{
    @NonNull
    public static final Parcelable.Creator<LineBreakConfigSpan> CREATOR;
    
    public LineBreakConfigSpan(@NonNull final LineBreakConfig lineBreakConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LineBreakConfig getLineBreakConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LineBreakConfigSpan createNoBreakSpan() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static LineBreakConfigSpan createNoHyphenationSpan() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanTypeId() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
