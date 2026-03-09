package android.database;

import java.util.Collection;
import android.net.Uri;
import android.os.Handler;

public abstract class ContentObserver
{
    public ContentObserver(final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean deliverSelfNotifications() {
        throw new RuntimeException("Stub!");
    }
    
    public void onChange(final boolean selfChange) {
        throw new RuntimeException("Stub!");
    }
    
    public void onChange(final boolean selfChange, @Nullable final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public void onChange(final boolean selfChange, @Nullable final Uri uri, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onChange(final boolean selfChange, @NonNull final Collection<Uri> uris, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void dispatchChange(final boolean selfChange) {
        throw new RuntimeException("Stub!");
    }
    
    public final void dispatchChange(final boolean selfChange, @Nullable final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public final void dispatchChange(final boolean selfChange, @Nullable final Uri uri, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public final void dispatchChange(final boolean selfChange, @NonNull final Collection<Uri> uris, final int flags) {
        throw new RuntimeException("Stub!");
    }
}
