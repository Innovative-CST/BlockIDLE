package android.app;

import android.view.View;

@Deprecated
public abstract class FragmentTransaction
{
    @Deprecated
    public static final int TRANSIT_ENTER_MASK = 4096;
    @Deprecated
    public static final int TRANSIT_EXIT_MASK = 8192;
    @Deprecated
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    @Deprecated
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    @Deprecated
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    @Deprecated
    public static final int TRANSIT_NONE = 0;
    @Deprecated
    public static final int TRANSIT_UNSET = -1;
    
    @Deprecated
    public FragmentTransaction() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract FragmentTransaction add(final Fragment p0, final String p1);
    
    @Deprecated
    public abstract FragmentTransaction add(final int p0, final Fragment p1);
    
    @Deprecated
    public abstract FragmentTransaction add(final int p0, final Fragment p1, final String p2);
    
    @Deprecated
    public abstract FragmentTransaction replace(final int p0, final Fragment p1);
    
    @Deprecated
    public abstract FragmentTransaction replace(final int p0, final Fragment p1, final String p2);
    
    @Deprecated
    public abstract FragmentTransaction remove(final Fragment p0);
    
    @Deprecated
    public abstract FragmentTransaction hide(final Fragment p0);
    
    @Deprecated
    public abstract FragmentTransaction show(final Fragment p0);
    
    @Deprecated
    public abstract FragmentTransaction detach(final Fragment p0);
    
    @Deprecated
    public abstract FragmentTransaction attach(final Fragment p0);
    
    @Deprecated
    public abstract FragmentTransaction setPrimaryNavigationFragment(final Fragment p0);
    
    @Deprecated
    public abstract boolean isEmpty();
    
    @Deprecated
    public abstract FragmentTransaction setCustomAnimations(final int p0, final int p1);
    
    @Deprecated
    public abstract FragmentTransaction setCustomAnimations(final int p0, final int p1, final int p2, final int p3);
    
    @Deprecated
    public abstract FragmentTransaction setTransition(final int p0);
    
    @Deprecated
    public abstract FragmentTransaction addSharedElement(final View p0, final String p1);
    
    @Deprecated
    public abstract FragmentTransaction setTransitionStyle(final int p0);
    
    @Deprecated
    public abstract FragmentTransaction addToBackStack(@Nullable final String p0);
    
    @Deprecated
    public abstract boolean isAddToBackStackAllowed();
    
    @Deprecated
    public abstract FragmentTransaction disallowAddToBackStack();
    
    @Deprecated
    public abstract FragmentTransaction setBreadCrumbTitle(final int p0);
    
    @Deprecated
    public abstract FragmentTransaction setBreadCrumbTitle(final CharSequence p0);
    
    @Deprecated
    public abstract FragmentTransaction setBreadCrumbShortTitle(final int p0);
    
    @Deprecated
    public abstract FragmentTransaction setBreadCrumbShortTitle(final CharSequence p0);
    
    @Deprecated
    public abstract FragmentTransaction setReorderingAllowed(final boolean p0);
    
    @Deprecated
    public abstract FragmentTransaction runOnCommit(final Runnable p0);
    
    @Deprecated
    public abstract int commit();
    
    @Deprecated
    public abstract int commitAllowingStateLoss();
    
    @Deprecated
    public abstract void commitNow();
    
    @Deprecated
    public abstract void commitNowAllowingStateLoss();
}
