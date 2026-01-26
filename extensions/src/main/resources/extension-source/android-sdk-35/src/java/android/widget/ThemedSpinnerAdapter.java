package android.widget;

import android.content.res.Resources;

public interface ThemedSpinnerAdapter extends SpinnerAdapter
{
    void setDropDownViewTheme(@Nullable final Resources.Theme p0);
    
    @Nullable
    Resources.Theme getDropDownViewTheme();
}
