package android.print.pdf;

import android.graphics.Rect;
import android.print.PrintAttributes;
import android.content.Context;
import android.graphics.pdf.PdfDocument;

public class PrintedPdfDocument extends PdfDocument
{
    public PrintedPdfDocument(@NonNull final Context context, @NonNull final PrintAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Page startPage(final int pageNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getPageContentRect() {
        throw new RuntimeException("Stub!");
    }
}
