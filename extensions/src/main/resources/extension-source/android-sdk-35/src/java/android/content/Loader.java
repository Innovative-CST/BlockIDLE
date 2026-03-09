package android.content;

import android.os.Handler;
import android.database.ContentObserver;
import java.io.PrintWriter;
import java.io.FileDescriptor;

@Deprecated
public class Loader<D>
{
    @Deprecated
    public Loader(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void deliverResult(final D data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void deliverCancellation() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerListener(final int id, final OnLoadCompleteListener<D> listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterListener(final OnLoadCompleteListener<D> listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerOnLoadCanceledListener(final OnLoadCanceledListener<D> listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterOnLoadCanceledListener(final OnLoadCanceledListener<D> listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAbandoned() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isReset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void startLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onStartLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean cancelLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean onCancelLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void forceLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onForceLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void stopLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onStopLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void abandon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onAbandon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onReset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean takeContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void commitContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void rollbackContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String dataToString(final D data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final class ForceLoadContentObserver extends ContentObserver
    {
        @Deprecated
        public ForceLoadContentObserver() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean deliverSelfNotifications() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public void onChange(final boolean selfChange) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnLoadCompleteListener<D>
    {
        @Deprecated
        void onLoadComplete(final Loader<D> p0, final D p1);
    }
    
    @Deprecated
    public interface OnLoadCanceledListener<D>
    {
        @Deprecated
        void onLoadCanceled(final Loader<D> p0);
    }
}
