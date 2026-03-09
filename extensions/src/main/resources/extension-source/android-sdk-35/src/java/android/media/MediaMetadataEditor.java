package android.media;

import android.graphics.Bitmap;

@Deprecated
public abstract class MediaMetadataEditor
{
    @Deprecated
    public static final int BITMAP_KEY_ARTWORK = 100;
    @Deprecated
    public static final int RATING_KEY_BY_OTHERS = 101;
    @Deprecated
    public static final int RATING_KEY_BY_USER = 268435457;
    
    MediaMetadataEditor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void apply();
    
    @Deprecated
    public synchronized void clear() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void addEditableKey(final int key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void removeEditableKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized int[] getEditableKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized MediaMetadataEditor putString(final int key, final String value) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized MediaMetadataEditor putLong(final int key, final long value) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized MediaMetadataEditor putBitmap(final int key, final Bitmap bitmap) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized MediaMetadataEditor putObject(final int key, final Object value) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized long getLong(final int key, final long defaultValue) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized String getString(final int key, final String defaultValue) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized Bitmap getBitmap(final int key, final Bitmap defaultValue) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized Object getObject(final int key, final Object defaultValue) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
}
