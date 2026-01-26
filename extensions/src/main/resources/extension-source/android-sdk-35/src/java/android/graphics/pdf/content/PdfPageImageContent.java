package android.graphics.pdf.content;

import android.os.Parcel;
import android.os.Parcelable;

public final class PdfPageImageContent implements Parcelable
{
    @NonNull
    public static final Creator<PdfPageImageContent> CREATOR;
    
    public PdfPageImageContent(@NonNull final String altText) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getAltText() {
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
