package android.view;

import android.content.Context;

public abstract class ActionProvider
{
    public ActionProvider(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract View onCreateActionView();
    
    @NonNull
    public View onCreateActionView(@NonNull final MenuItem forItem) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean overridesItemVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
    
    public void refreshVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onPerformDefaultAction() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSubMenu() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPrepareSubMenu(@NonNull final SubMenu subMenu) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVisibilityListener(@Nullable final VisibilityListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface VisibilityListener
    {
        void onActionProviderVisibilityChanged(final boolean p0);
    }
}
