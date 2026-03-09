package androidx.appcompat.app;

import androidx.annotation.RestrictTo;
import androidx.annotation.NonNull;
import android.app.Dialog;
import androidx.annotation.Nullable;
import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment
{
    public AppCompatDialogFragment() {
    }
    
    public AppCompatDialogFragment(@LayoutRes final int contentLayoutId) {
        super(contentLayoutId);
    }
    
    @NonNull
    public Dialog onCreateDialog(@Nullable final Bundle savedInstanceState) {
        return (Dialog)new AppCompatDialog(this.getContext(), this.getTheme());
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setupDialog(@NonNull final Dialog dialog, final int style) {
        if (dialog instanceof AppCompatDialog) {
            final AppCompatDialog acd = (AppCompatDialog)dialog;
            switch (style) {
                case 3: {
                    dialog.getWindow().addFlags(24);
                }
                case 1:
                case 2: {
                    acd.supportRequestWindowFeature(1);
                    break;
                }
            }
        }
        else {
            super.setupDialog(dialog, style);
        }
    }
}
