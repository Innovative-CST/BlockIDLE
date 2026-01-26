package androidx.appcompat.widget;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import android.content.res.TypedArray;
import android.content.Context;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;
import androidx.annotation.NonNull;
import android.widget.EditText;

class AppCompatEmojiEditTextHelper
{
    @NonNull
    private final EditText mView;
    @NonNull
    private final EmojiEditTextHelper mEmojiEditTextHelper;
    
    AppCompatEmojiEditTextHelper(@NonNull final EditText view) {
        this.mView = view;
        this.mEmojiEditTextHelper = new EmojiEditTextHelper(view, false);
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
    
    boolean isEmojiCapableKeyListener(final KeyListener currentKeyListener) {
        return !(currentKeyListener instanceof NumberKeyListener);
    }
    
    void setEnabled(final boolean enabled) {
        this.mEmojiEditTextHelper.setEnabled(enabled);
    }
    
    boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
    }
    
    @Nullable
    KeyListener getKeyListener(@Nullable final KeyListener keyListener) {
        if (this.isEmojiCapableKeyListener(keyListener)) {
            return this.mEmojiEditTextHelper.getKeyListener(keyListener);
        }
        return keyListener;
    }
    
    @Nullable
    InputConnection onCreateInputConnection(@Nullable final InputConnection inputConnection, @NonNull final EditorInfo outAttrs) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, outAttrs);
    }
}
