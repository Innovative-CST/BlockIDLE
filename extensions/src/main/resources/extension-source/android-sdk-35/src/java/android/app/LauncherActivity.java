package android.app;

import android.graphics.drawable.Drawable;
import android.content.pm.ResolveInfo;
import java.util.List;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;

@Deprecated
public abstract class LauncherActivity extends ListActivity
{
    @Deprecated
    public LauncherActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onCreate(final Bundle icicle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setTitle(final CharSequence title) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setTitle(final int titleId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onSetContentView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onListItemClick(final ListView l, final View v, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Intent intentForPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected ListItem itemForPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Intent getTargetIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected List<ResolveInfo> onQueryPackageManager(final Intent queryIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<ListItem> makeListItems() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public class IconResizer
    {
        @Deprecated
        public IconResizer() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Drawable createIconThumbnail(final Drawable icon) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class ListItem
    {
        @Deprecated
        public String className;
        @Deprecated
        public Bundle extras;
        @Deprecated
        public Drawable icon;
        @Deprecated
        public CharSequence label;
        @Deprecated
        public String packageName;
        @Deprecated
        public ResolveInfo resolveInfo;
        
        @Deprecated
        public ListItem() {
            throw new RuntimeException("Stub!");
        }
    }
}
