package android.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Loader;
import android.os.Bundle;

@Deprecated
public abstract class LoaderManager
{
    @Deprecated
    public LoaderManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract <D> Loader<D> initLoader(final int p0, final Bundle p1, final LoaderCallbacks<D> p2);
    
    @Deprecated
    public abstract <D> Loader<D> restartLoader(final int p0, final Bundle p1, final LoaderCallbacks<D> p2);
    
    @Deprecated
    public abstract void destroyLoader(final int p0);
    
    @Deprecated
    public abstract <D> Loader<D> getLoader(final int p0);
    
    @Deprecated
    public abstract void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3);
    
    @Deprecated
    public static void enableDebugLogging(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface LoaderCallbacks<D>
    {
        @Deprecated
        Loader<D> onCreateLoader(final int p0, final Bundle p1);
        
        @Deprecated
        void onLoadFinished(final Loader<D> p0, final D p1);
        
        @Deprecated
        void onLoaderReset(final Loader<D> p0);
    }
}
