package android.app;

import android.view.View;

@Deprecated
public abstract class FragmentContainer
{
    @Deprecated
    public FragmentContainer() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public abstract <T extends View> T onFindViewById(final int p0);
    
    @Deprecated
    public abstract boolean onHasView();
}
