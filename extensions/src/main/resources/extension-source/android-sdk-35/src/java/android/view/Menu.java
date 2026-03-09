package android.view;

import android.content.Intent;
import android.content.ComponentName;

public interface Menu
{
    public static final int CATEGORY_ALTERNATIVE = 262144;
    public static final int CATEGORY_CONTAINER = 65536;
    public static final int CATEGORY_SECONDARY = 196608;
    public static final int CATEGORY_SYSTEM = 131072;
    public static final int FIRST = 1;
    public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;
    public static final int FLAG_APPEND_TO_GROUP = 1;
    public static final int FLAG_PERFORM_NO_CLOSE = 1;
    public static final int NONE = 0;
    public static final int SUPPORTED_MODIFIERS_MASK = 69647;
    
    MenuItem add(final CharSequence p0);
    
    MenuItem add(final int p0);
    
    MenuItem add(final int p0, final int p1, final int p2, final CharSequence p3);
    
    MenuItem add(final int p0, final int p1, final int p2, final int p3);
    
    SubMenu addSubMenu(final CharSequence p0);
    
    SubMenu addSubMenu(final int p0);
    
    SubMenu addSubMenu(final int p0, final int p1, final int p2, final CharSequence p3);
    
    SubMenu addSubMenu(final int p0, final int p1, final int p2, final int p3);
    
    int addIntentOptions(final int p0, final int p1, final int p2, final ComponentName p3, final Intent[] p4, final Intent p5, final int p6, final MenuItem[] p7);
    
    void removeItem(final int p0);
    
    void removeGroup(final int p0);
    
    void clear();
    
    void setGroupCheckable(final int p0, final boolean p1, final boolean p2);
    
    void setGroupVisible(final int p0, final boolean p1);
    
    void setGroupEnabled(final int p0, final boolean p1);
    
    boolean hasVisibleItems();
    
    MenuItem findItem(final int p0);
    
    int size();
    
    MenuItem getItem(final int p0);
    
    void close();
    
    boolean performShortcut(final int p0, final KeyEvent p1, final int p2);
    
    boolean isShortcutKey(final int p0, final KeyEvent p1);
    
    boolean performIdentifierAction(final int p0, final int p1);
    
    void setQwertyMode(final boolean p0);
    
    default void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        throw new RuntimeException("Stub!");
    }
}
