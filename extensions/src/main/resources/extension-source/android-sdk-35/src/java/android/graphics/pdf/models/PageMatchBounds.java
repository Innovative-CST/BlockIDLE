package android.graphics.pdf.models;

import android.os.Parcel;
import android.graphics.RectF;
import java.util.List;
import android.os.Parcelable;

public final class PageMatchBounds implements Parcelable
{
    @NonNull
    public static final Creator<PageMatchBounds> CREATOR;
    
    public PageMatchBounds(@NonNull final List<RectF> bounds, final int textStartIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RectF> getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextStartIndex() {
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
    
    static {
        CREATOR = null;
    }
}
