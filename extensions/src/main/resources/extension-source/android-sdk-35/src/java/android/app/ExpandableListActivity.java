package android.app;

import android.widget.ExpandableListAdapter;
import android.os.Bundle;
import android.view.ContextMenu;
import android.widget.ExpandableListView;
import android.view.View;

@Deprecated
public class ExpandableListActivity extends Activity implements View.OnCreateContextMenuListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener
{
    @Deprecated
    public ExpandableListActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onChildClick(final ExpandableListView parent, final View v, final int groupPosition, final int childPosition, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onGroupCollapse(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onGroupExpand(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onRestoreInstanceState(final Bundle state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setListAdapter(final ExpandableListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ExpandableListView getExpandableListView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ExpandableListAdapter getExpandableListAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getSelectedId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getSelectedPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setSelectedChild(final int groupPosition, final int childPosition, final boolean shouldExpandGroup) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectedGroup(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
}
