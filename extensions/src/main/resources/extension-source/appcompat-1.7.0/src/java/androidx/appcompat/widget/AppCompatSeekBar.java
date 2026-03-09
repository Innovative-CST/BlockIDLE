package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar
{
    private final AppCompatSeekBarHelper mAppCompatSeekBarHelper;
    
    public AppCompatSeekBar(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatSeekBar(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.seekBarStyle);
    }
    
    public AppCompatSeekBar(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mAppCompatSeekBarHelper = new AppCompatSeekBarHelper(this)).loadFromAttributes(attrs, defStyleAttr);
    }
    
    protected synchronized void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.drawTickMarks(canvas);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.drawableStateChanged();
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.jumpDrawablesToCurrentState();
    }
}
