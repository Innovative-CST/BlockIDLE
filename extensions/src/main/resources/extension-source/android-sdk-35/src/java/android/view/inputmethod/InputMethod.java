package android.view.inputmethod;

import android.os.ResultReceiver;
import android.os.IBinder;

public interface InputMethod
{
    public static final String SERVICE_INTERFACE = "android.view.InputMethod";
    public static final String SERVICE_META_DATA = "android.view.im";
    public static final int SHOW_EXPLICIT = 1;
    @Deprecated
    public static final int SHOW_FORCED = 2;
    
    void attachToken(final IBinder p0);
    
    void bindInput(final InputBinding p0);
    
    void unbindInput();
    
    void startInput(final InputConnection p0, final EditorInfo p1);
    
    void restartInput(final InputConnection p0, final EditorInfo p1);
    
    void createSession(final SessionCallback p0);
    
    void setSessionEnabled(final InputMethodSession p0, final boolean p1);
    
    void revokeSession(final InputMethodSession p0);
    
    void showSoftInput(final int p0, final ResultReceiver p1);
    
    void hideSoftInput(final int p0, final ResultReceiver p1);
    
    void changeInputMethodSubtype(final InputMethodSubtype p0);
    
    public interface SessionCallback
    {
        void sessionCreated(final InputMethodSession p0);
    }
}
