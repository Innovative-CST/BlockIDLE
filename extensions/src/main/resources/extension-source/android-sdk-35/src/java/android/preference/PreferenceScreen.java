package android.preference;

import android.os.Parcelable;
import android.view.View;
import android.app.Dialog;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.util.AttributeSet;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.AdapterView;

@Deprecated
public final class PreferenceScreen extends PreferenceGroup implements AdapterView.OnItemClickListener, DialogInterface.OnDismissListener
{
    PreferenceScreen() {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ListAdapter getRootAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected ListAdapter onCreateRootAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void bind(final ListView listView) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDismiss(final DialogInterface dialog) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Dialog getDialog() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onItemClick(final AdapterView parent, final View view, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected boolean isOnSameScreenAsChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
}
