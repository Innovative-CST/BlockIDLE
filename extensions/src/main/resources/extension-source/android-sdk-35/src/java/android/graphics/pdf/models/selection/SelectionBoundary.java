package android.graphics.pdf.models.selection;

import android.os.Parcel;
import android.graphics.Point;
import android.os.Parcelable;

public final class SelectionBoundary implements Parcelable
{
    @NonNull
    public static final Creator<SelectionBoundary> CREATOR;
    
    public SelectionBoundary(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public SelectionBoundary(@NonNull final Point point) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Point getPoint() {
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
    
    public boolean getIsRtl() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
