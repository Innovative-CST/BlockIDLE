package android.widget;

import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;
import android.content.Context;

public class PopupMenu
{
    public PopupMenu(final Context context, final View anchor) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupMenu(final Context context, final View anchor, final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupMenu(final Context context, final View anchor, final int gravity, final int popupStyleAttr, final int popupStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public View.OnTouchListener getDragToOpenListener() {
        throw new RuntimeException("Stub!");
    }
    
    public Menu getMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public MenuInflater getMenuInflater() {
        throw new RuntimeException("Stub!");
    }
    
    public void inflate(final int menuRes) {
        throw new RuntimeException("Stub!");
    }
    
    public void show() {
        throw new RuntimeException("Stub!");
    }
    
    public void dismiss() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnMenuItemClickListener(final OnMenuItemClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDismissListener(final OnDismissListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setForceShowIcon(final boolean forceShowIcon) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnMenuItemClickListener
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
    
    public interface OnDismissListener
    {
        void onDismiss(final PopupMenu p0);
    }
}
