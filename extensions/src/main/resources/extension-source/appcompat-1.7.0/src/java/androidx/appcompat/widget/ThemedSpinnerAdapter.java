package androidx.appcompat.widget;

import androidx.appcompat.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.Nullable;
import android.content.res.Resources;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter extends SpinnerAdapter
{
    void setDropDownViewTheme(@Nullable final Resources.Theme p0);
    
    @Nullable
    Resources.Theme getDropDownViewTheme();
    
    public static final class Helper
    {
        private final Context mContext;
        private final LayoutInflater mInflater;
        private LayoutInflater mDropDownInflater;
        
        public Helper(@NonNull final Context context) {
            this.mContext = context;
            this.mInflater = LayoutInflater.from(context);
        }
        
        public void setDropDownViewTheme(@Nullable final Resources.Theme theme) {
            if (theme == null) {
                this.mDropDownInflater = null;
            }
            else if (theme.equals((Object)this.mContext.getTheme())) {
                this.mDropDownInflater = this.mInflater;
            }
            else {
                final Context context = (Context)new ContextThemeWrapper(this.mContext, theme);
                this.mDropDownInflater = LayoutInflater.from(context);
            }
        }
        
        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            return (this.mDropDownInflater == null) ? null : this.mDropDownInflater.getContext().getTheme();
        }
        
        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            return (this.mDropDownInflater != null) ? this.mDropDownInflater : this.mInflater;
        }
    }
}
