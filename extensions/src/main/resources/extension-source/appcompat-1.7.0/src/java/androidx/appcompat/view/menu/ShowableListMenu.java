package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface ShowableListMenu
{
    void show();
    
    void dismiss();
    
    boolean isShowing();
    
    ListView getListView();
}
