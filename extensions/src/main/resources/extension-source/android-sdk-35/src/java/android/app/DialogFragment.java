package android.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.content.DialogInterface;

@Deprecated
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
    @Deprecated
    public static final int STYLE_NORMAL = 0;
    @Deprecated
    public static final int STYLE_NO_FRAME = 2;
    @Deprecated
    public static final int STYLE_NO_INPUT = 3;
    @Deprecated
    public static final int STYLE_NO_TITLE = 1;
    
    @Deprecated
    public DialogFragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStyle(final int style, final int theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void show(final FragmentManager manager, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int show(final FragmentTransaction transaction, final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dismiss() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dismissAllowingStateLoss() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Dialog getDialog() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCancelable(final boolean cancelable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isCancelable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShowsDialog(final boolean showsDialog) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getShowsDialog() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onAttach(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDetach() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutInflater onGetLayoutInflater(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCancel(final DialogInterface dialog) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDismiss(final DialogInterface dialog) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onSaveInstanceState(final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDestroyView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
