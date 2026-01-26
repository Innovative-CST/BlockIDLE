package android.graphics.pdf.content;

import android.os.Parcel;
import android.graphics.RectF;
import java.util.List;
import android.os.Parcelable;

public final class PdfPageTextContent implements Parcelable
{
    @NonNull
    public static final Creator<PdfPageTextContent> CREATOR;
    
    public PdfPageTextContent(@NonNull final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public PdfPageTextContent(@NonNull final String text, @NonNull final List<RectF> bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getText() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RectF> getBounds() {
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
