package android.graphics.pdf;

import android.graphics.Rect;
import android.graphics.Canvas;
import java.util.List;
import java.io.IOException;
import java.io.OutputStream;

public class PdfDocument
{
    public PdfDocument() {
        throw new RuntimeException("Stub!");
    }
    
    public Page startPage(final PageInfo pageInfo) {
        throw new RuntimeException("Stub!");
    }
    
    public void finishPage(final Page page) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeTo(final OutputStream out) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public List<PageInfo> getPages() {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Page
    {
        Page() {
            throw new RuntimeException("Stub!");
        }
        
        public Canvas getCanvas() {
            throw new RuntimeException("Stub!");
        }
        
        public PageInfo getInfo() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PageInfo
    {
        PageInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPageWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPageHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public Rect getContentRect() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPageNumber() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(final int pageWidth, final int pageHeight, final int pageNumber) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setContentRect(final Rect contentRect) {
                throw new RuntimeException("Stub!");
            }
            
            public PageInfo create() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
