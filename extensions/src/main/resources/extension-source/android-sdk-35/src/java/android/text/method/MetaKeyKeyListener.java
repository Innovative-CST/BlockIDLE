package android.text.method;

import android.text.Editable;
import android.view.View;
import android.view.KeyEvent;
import android.text.Spannable;

public abstract class MetaKeyKeyListener
{
    public static final int META_ALT_LOCKED = 512;
    public static final int META_ALT_ON = 2;
    public static final int META_CAP_LOCKED = 256;
    public static final int META_SHIFT_ON = 1;
    public static final int META_SYM_LOCKED = 1024;
    public static final int META_SYM_ON = 4;
    
    public MetaKeyKeyListener() {
        throw new RuntimeException("Stub!");
    }
    
    public static void resetMetaState(final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final CharSequence text, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final CharSequence text, final int meta) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final CharSequence text, final int meta, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static void adjustMetaAfterKeypress(final Spannable content) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isMetaTracker(final CharSequence text, final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSelectingMetaTracker(final CharSequence text, final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    protected static void resetLockedMeta(final Spannable content) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onKeyDown(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onKeyUp(final View view, final Editable content, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearMetaKeyState(final View view, final Editable content, final int states) {
        throw new RuntimeException("Stub!");
    }
    
    public static void clearMetaKeyState(final Editable content, final int states) {
        throw new RuntimeException("Stub!");
    }
    
    public static long resetLockedMeta(final long state) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final long state) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getMetaState(final long state, final int meta) {
        throw new RuntimeException("Stub!");
    }
    
    public static long adjustMetaAfterKeypress(final long state) {
        throw new RuntimeException("Stub!");
    }
    
    public static long handleKeyDown(final long state, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public static long handleKeyUp(final long state, final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public long clearMetaKeyState(final long state, final int which) {
        throw new RuntimeException("Stub!");
    }
}
