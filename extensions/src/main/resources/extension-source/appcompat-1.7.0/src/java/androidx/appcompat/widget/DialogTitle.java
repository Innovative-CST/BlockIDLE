package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.Layout;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class DialogTitle extends AppCompatTextView
{
    public DialogTitle(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    
    public DialogTitle(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }
    
    public DialogTitle(@NonNull final Context context) {
        super(context);
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final Layout layout = this.getLayout();
        if (layout != null) {
            final int lineCount = layout.getLineCount();
            if (lineCount > 0) {
                final int ellipsisCount = layout.getEllipsisCount(lineCount - 1);
                if (ellipsisCount > 0) {
                    this.setSingleLine(false);
                    this.setMaxLines(2);
                    final TypedArray a = this.getContext().obtainStyledAttributes((AttributeSet)null, R.styleable.TextAppearance, 16842817, 16973892);
                    final int textSize = a.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
                    if (textSize != 0) {
                        this.setTextSize(0, (float)textSize);
                    }
                    a.recycle();
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
    }
}
