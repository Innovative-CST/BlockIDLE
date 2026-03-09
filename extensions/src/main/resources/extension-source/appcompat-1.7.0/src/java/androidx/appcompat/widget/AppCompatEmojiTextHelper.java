package androidx.appcompat.widget;

import android.text.method.TransformationMethod;
import android.text.InputFilter;
import android.content.res.TypedArray;
import android.content.Context;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;
import androidx.annotation.NonNull;
import android.widget.TextView;

class AppCompatEmojiTextHelper
{
    @NonNull
    private final TextView mView;
    @NonNull
    private final EmojiTextViewHelper mEmojiTextViewHelper;
    
    AppCompatEmojiTextHelper(@NonNull final TextView view) {
        this.mView = view;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(view, false);
    }
    
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        final Context context = this.mView.getContext();
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.AppCompatTextView, defStyleAttr, 0);
        boolean enabled = true;
        try {
            if (a.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled)) {
                enabled = a.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
        }
        finally {
            a.recycle();
        }
        this.setEnabled(enabled);
    }
    
    void setEnabled(final boolean enabled) {
        this.mEmojiTextViewHelper.setEnabled(enabled);
    }
    
    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }
    
    @NonNull
    InputFilter[] getFilters(@NonNull final InputFilter[] filters) {
        return this.mEmojiTextViewHelper.getFilters(filters);
    }
    
    void setAllCaps(final boolean allCaps) {
        this.mEmojiTextViewHelper.setAllCaps(allCaps);
    }
    
    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable final TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
