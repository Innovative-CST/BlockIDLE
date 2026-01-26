package androidx.appcompat.app;

import androidx.annotation.Nullable;
import androidx.appcompat.view.ActionMode;

public interface AppCompatCallback
{
    void onSupportActionModeStarted(final ActionMode p0);
    
    void onSupportActionModeFinished(final ActionMode p0);
    
    @Nullable
    ActionMode onWindowStartingSupportActionMode(final ActionMode.Callback p0);
}
