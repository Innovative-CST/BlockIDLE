package android.content;

import java.io.PrintWriter;
import java.io.FileDescriptor;

@Deprecated
public abstract class AsyncTaskLoader<D> extends Loader<D>
{
    @Deprecated
    public AsyncTaskLoader(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUpdateThrottle(final long delayMS) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onForceLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected boolean onCancelLoad() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCanceled(final D data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract D loadInBackground();
    
    @Deprecated
    protected D onLoadInBackground() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void cancelLoadInBackground() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isLoadInBackgroundCanceled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
