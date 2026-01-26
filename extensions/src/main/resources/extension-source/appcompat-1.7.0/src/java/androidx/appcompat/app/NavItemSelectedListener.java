package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

class NavItemSelectedListener implements AdapterView.OnItemSelectedListener
{
    private final ActionBar.OnNavigationListener mListener;
    
    public NavItemSelectedListener(final ActionBar.OnNavigationListener listener) {
        this.mListener = listener;
    }
    
    public void onItemSelected(final AdapterView<?> parent, final View view, final int position, final long id) {
        if (this.mListener != null) {
            this.mListener.onNavigationItemSelected(position, id);
        }
    }
    
    public void onNothingSelected(final AdapterView<?> parent) {
    }
}
