package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface MenuItemHoverListener
{
    void onItemHoverExit(@NonNull final MenuBuilder p0, @NonNull final MenuItem p1);
    
    void onItemHoverEnter(@NonNull final MenuBuilder p0, @NonNull final MenuItem p1);
}
