package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.widget.ProgressBar;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.RatingBar;

public class AppCompatRatingBar extends RatingBar
{
    private final AppCompatProgressBarHelper mAppCompatProgressBarHelper;
    
    public AppCompatRatingBar(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatRatingBar(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.ratingBarStyle);
    }
    
    public AppCompatRatingBar(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mAppCompatProgressBarHelper = new AppCompatProgressBarHelper((ProgressBar)this)).loadFromAttributes(attrs, defStyleAttr);
    }
    
    protected synchronized void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final Bitmap sampleTile = this.mAppCompatProgressBarHelper.getSampleTile();
        if (sampleTile != null) {
            final int width = sampleTile.getWidth() * this.getNumStars();
            this.setMeasuredDimension(View.resolveSizeAndState(width, widthMeasureSpec, 0), this.getMeasuredHeight());
        }
    }
}
