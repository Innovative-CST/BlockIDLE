package android.graphics.pdf.models.selection;

import android.os.Parcel;
import android.graphics.pdf.content.PdfPageTextContent;
import java.util.List;
import android.os.Parcelable;

public final class PageSelection implements Parcelable
{
    @NonNull
    public static final Creator<PageSelection> CREATOR;
    
    public PageSelection(final int page, @NonNull final SelectionBoundary start, @NonNull final SelectionBoundary stop, @NonNull final List<PdfPageTextContent> selectedContents) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SelectionBoundary getStart() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SelectionBoundary getStop() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PdfPageTextContent> getSelectedTextContents() {
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
