package android.database;

import java.util.ArrayList;

public abstract class Observable<T>
{
    protected final ArrayList<T> mObservers;
    
    public Observable() {
        this.mObservers = null;
        throw new RuntimeException("Stub!");
    }
    
    public void registerObserver(final T observer) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterObserver(final T observer) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAll() {
        throw new RuntimeException("Stub!");
    }
}
