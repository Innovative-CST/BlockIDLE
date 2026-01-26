package android.view.translation;

import android.view.View;

public interface ViewTranslationCallback
{
    boolean onShowTranslation(@NonNull final View p0);
    
    boolean onHideTranslation(@NonNull final View p0);
    
    boolean onClearTranslation(@NonNull final View p0);
}
