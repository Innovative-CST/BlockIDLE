package android.content;

import android.view.KeyEvent;

public interface DialogInterface
{
    @Deprecated
    public static final int BUTTON1 = -1;
    @Deprecated
    public static final int BUTTON2 = -2;
    @Deprecated
    public static final int BUTTON3 = -3;
    public static final int BUTTON_NEGATIVE = -2;
    public static final int BUTTON_NEUTRAL = -3;
    public static final int BUTTON_POSITIVE = -1;
    
    void cancel();
    
    void dismiss();
    
    public interface OnShowListener
    {
        void onShow(final DialogInterface p0);
    }
    
    public interface OnMultiChoiceClickListener
    {
        void onClick(final DialogInterface p0, final int p1, final boolean p2);
    }
    
    public interface OnKeyListener
    {
        boolean onKey(final DialogInterface p0, final int p1, final KeyEvent p2);
    }
    
    public interface OnDismissListener
    {
        void onDismiss(final DialogInterface p0);
    }
    
    public interface OnClickListener
    {
        void onClick(final DialogInterface p0, final int p1);
    }
    
    public interface OnCancelListener
    {
        void onCancel(final DialogInterface p0);
    }
}
