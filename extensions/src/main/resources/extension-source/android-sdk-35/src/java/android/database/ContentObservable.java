package android.database;

import android.net.Uri;

public class ContentObservable extends Observable<ContentObserver>
{
    public ContentObservable() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerObserver(final ContentObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchChange(final boolean selfChange) {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchChange(final boolean selfChange, final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifyChange(final boolean selfChange) {
        throw new RuntimeException("Stub!");
    }
}
