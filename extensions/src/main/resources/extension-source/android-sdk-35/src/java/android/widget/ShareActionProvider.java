package android.widget;

import android.content.Intent;
import android.view.SubMenu;
import android.view.View;
import android.content.Context;
import android.view.ActionProvider;

public class ShareActionProvider extends ActionProvider
{
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    
    public ShareActionProvider(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setOnShareTargetSelectedListener(final OnShareTargetSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View onCreateActionView() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasSubMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onPrepareSubMenu(final SubMenu subMenu) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShareHistoryFileName(final String shareHistoryFile) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShareIntent(final Intent shareIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnShareTargetSelectedListener
    {
        boolean onShareTargetSelected(final ShareActionProvider p0, final Intent p1);
    }
}
