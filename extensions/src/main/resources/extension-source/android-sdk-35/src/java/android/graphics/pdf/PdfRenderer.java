package android.graphics.pdf;

import android.graphics.pdf.models.FormEditRecord;
import android.graphics.pdf.models.FormWidgetInfo;
import android.graphics.pdf.content.PdfPageGotoLinkContent;
import android.graphics.pdf.content.PdfPageLinkContent;
import android.graphics.pdf.models.selection.PageSelection;
import android.graphics.pdf.models.selection.SelectionBoundary;
import android.graphics.pdf.models.PageMatchBounds;
import android.graphics.pdf.content.PdfPageImageContent;
import android.graphics.pdf.content.PdfPageTextContent;
import java.util.List;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Bitmap;
import java.io.IOException;
import android.os.ParcelFileDescriptor;

public final class PdfRenderer implements AutoCloseable
{
    public static final int DOCUMENT_LINEARIZED_TYPE_LINEARIZED = 1;
    public static final int DOCUMENT_LINEARIZED_TYPE_NON_LINEARIZED = 0;
    public static final int PDF_FORM_TYPE_ACRO_FORM = 1;
    public static final int PDF_FORM_TYPE_NONE = 0;
    public static final int PDF_FORM_TYPE_XFA_FOREGROUND = 3;
    public static final int PDF_FORM_TYPE_XFA_FULL = 2;
    
    public PdfRenderer(@NonNull final ParcelFileDescriptor fileDescriptor) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public PdfRenderer(@NonNull final ParcelFileDescriptor fileDescriptor, @NonNull final LoadParams params) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldScaleForPrinting() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDocumentLinearizationType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Page openPage(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPdfFormType() {
        throw new RuntimeException("Stub!");
    }
    
    public void write(@NonNull final ParcelFileDescriptor destination, final boolean removePasswordProtection) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public final class Page implements AutoCloseable
    {
        public static final int RENDER_MODE_FOR_DISPLAY = 1;
        public static final int RENDER_MODE_FOR_PRINT = 2;
        
        Page() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public void render(@NonNull final Bitmap destination, @Nullable final Rect destClip, @Nullable final Matrix transform, final int renderMode) {
            throw new RuntimeException("Stub!");
        }
        
        public void render(@NonNull final Bitmap destination, @Nullable final Rect destClip, @Nullable final Matrix transform, @NonNull final RenderParams params) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<PdfPageTextContent> getTextContents() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<PdfPageImageContent> getImageContents() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<PageMatchBounds> searchText(@NonNull final String query) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public PageSelection selectContent(@NonNull final SelectionBoundary start, @NonNull final SelectionBoundary stop) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<PdfPageLinkContent> getLinkContents() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<PdfPageGotoLinkContent> getGotoLinks() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<FormWidgetInfo> getFormWidgetInfos() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<FormWidgetInfo> getFormWidgetInfos(@NonNull final int[] types) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FormWidgetInfo getFormWidgetInfoAtIndex(final int widgetIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FormWidgetInfo getFormWidgetInfoAtPosition(final int x, final int y) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<Rect> applyEdit(@NonNull final FormEditRecord editRecord) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() throws Throwable {
            throw new RuntimeException("Stub!");
        }
    }
}
