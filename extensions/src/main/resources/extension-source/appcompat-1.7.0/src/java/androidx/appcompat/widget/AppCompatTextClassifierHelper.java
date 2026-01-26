package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import android.view.textclassifier.TextClassificationManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.annotation.Nullable;
import android.view.textclassifier.TextClassifier;
import androidx.annotation.NonNull;
import android.widget.TextView;

final class AppCompatTextClassifierHelper
{
    @NonNull
    private TextView mTextView;
    @Nullable
    private TextClassifier mTextClassifier;
    
    AppCompatTextClassifierHelper(@NonNull final TextView textView) {
        this.mTextView = (TextView)Preconditions.checkNotNull((Object)textView);
    }
    
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable final TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
    
    @RequiresApi(api = 26)
    @NonNull
    public TextClassifier getTextClassifier() {
        if (this.mTextClassifier == null) {
            return Api26Impl.getTextClassifier(this.mTextView);
        }
        return this.mTextClassifier;
    }
    
    @RequiresApi(26)
    private static final class Api26Impl
    {
        @DoNotInline
        @NonNull
        static TextClassifier getTextClassifier(@NonNull final TextView textView) {
            final TextClassificationManager tcm = (TextClassificationManager)textView.getContext().getSystemService((Class)TextClassificationManager.class);
            if (tcm != null) {
                return tcm.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }
}
