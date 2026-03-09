package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import android.text.Selection;
import android.text.Spannable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Nullable;
import android.content.Context;
import android.content.ContextWrapper;
import android.app.Activity;
import android.util.Log;
import android.view.DragEvent;
import android.content.ClipData;
import androidx.core.view.ContentInfoCompat;
import android.content.ClipboardManager;
import android.view.View;
import androidx.core.view.ViewCompat;
import android.os.Build;
import androidx.annotation.NonNull;
import android.widget.TextView;

final class AppCompatReceiveContentHelper
{
    private static final String LOG_TAG = "ReceiveContent";
    
    private AppCompatReceiveContentHelper() {
    }
    
    static boolean maybeHandleMenuActionViaPerformReceiveContent(@NonNull final TextView view, final int actionId) {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes((View)view) == null || (actionId != 16908322 && actionId != 16908337)) {
            return false;
        }
        final ClipboardManager cm = (ClipboardManager)view.getContext().getSystemService("clipboard");
        final ClipData clip = (cm == null) ? null : cm.getPrimaryClip();
        if (clip != null && clip.getItemCount() > 0) {
            final ContentInfoCompat payload = new ContentInfoCompat.Builder(clip, 1).setFlags((int)((actionId != 16908322) ? 1 : 0)).build();
            ViewCompat.performReceiveContent((View)view, payload);
        }
        return true;
    }
    
    static boolean maybeHandleDragEventViaPerformReceiveContent(@NonNull final View view, @NonNull final DragEvent event) {
        if (Build.VERSION.SDK_INT >= 31 || Build.VERSION.SDK_INT < 24 || event.getLocalState() != null || ViewCompat.getOnReceiveContentMimeTypes(view) == null) {
            return false;
        }
        final Activity activity = tryGetActivity(view);
        if (activity == null) {
            Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + (Object)view);
            return false;
        }
        if (event.getAction() == 1) {
            return !(view instanceof TextView);
        }
        return event.getAction() == 3 && ((view instanceof TextView) ? OnDropApi24Impl.onDropForTextView(event, (TextView)view, activity) : OnDropApi24Impl.onDropForView(event, view, activity));
    }
    
    @Nullable
    static Activity tryGetActivity(@NonNull final View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
        }
        return null;
    }
    
    @RequiresApi(24)
    private static final class OnDropApi24Impl
    {
        @DoNotInline
        static boolean onDropForTextView(@NonNull final DragEvent event, @NonNull final TextView view, @NonNull final Activity activity) {
            activity.requestDragAndDropPermissions(event);
            final int offset = view.getOffsetForPosition(event.getX(), event.getY());
            view.beginBatchEdit();
            try {
                Selection.setSelection((Spannable)view.getText(), offset);
                final ContentInfoCompat payload = new ContentInfoCompat.Builder(event.getClipData(), 3).build();
                ViewCompat.performReceiveContent((View)view, payload);
            }
            finally {
                view.endBatchEdit();
            }
            return true;
        }
        
        @DoNotInline
        static boolean onDropForView(@NonNull final DragEvent event, @NonNull final View view, @NonNull final Activity activity) {
            activity.requestDragAndDropPermissions(event);
            final ContentInfoCompat payload = new ContentInfoCompat.Builder(event.getClipData(), 3).build();
            ViewCompat.performReceiveContent(view, payload);
            return true;
        }
    }
}
