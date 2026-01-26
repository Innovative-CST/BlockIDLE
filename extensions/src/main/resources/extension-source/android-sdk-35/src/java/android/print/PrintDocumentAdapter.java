package android.print;

import android.os.ParcelFileDescriptor;
import android.os.Bundle;
import android.os.CancellationSignal;

public abstract class PrintDocumentAdapter
{
    public static final String EXTRA_PRINT_PREVIEW = "EXTRA_PRINT_PREVIEW";
    
    public PrintDocumentAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onLayout(final PrintAttributes p0, final PrintAttributes p1, final CancellationSignal p2, final LayoutResultCallback p3, final Bundle p4);
    
    public abstract void onWrite(final PageRange[] p0, final ParcelFileDescriptor p1, final CancellationSignal p2, final WriteResultCallback p3);
    
    public void onFinish() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class LayoutResultCallback
    {
        LayoutResultCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onLayoutFinished(final PrintDocumentInfo info, final boolean changed) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLayoutFailed(final CharSequence error) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLayoutCancelled() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class WriteResultCallback
    {
        WriteResultCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onWriteFinished(final PageRange[] pages) {
            throw new RuntimeException("Stub!");
        }
        
        public void onWriteFailed(final CharSequence error) {
            throw new RuntimeException("Stub!");
        }
        
        public void onWriteCancelled() {
            throw new RuntimeException("Stub!");
        }
    }
}
