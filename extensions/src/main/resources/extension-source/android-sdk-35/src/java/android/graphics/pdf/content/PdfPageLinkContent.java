package android.graphics.pdf.content;

import android.os.Parcel;
import android.net.Uri;
import android.graphics.RectF;
import java.util.List;
import android.os.Parcelable;

public final class PdfPageLinkContent implements Parcelable
{
    @NonNull
    public static final Creator<PdfPageLinkContent> CREATOR;
    
    public PdfPageLinkContent(@NonNull final List<RectF> bounds, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RectF> getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUri() {
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
