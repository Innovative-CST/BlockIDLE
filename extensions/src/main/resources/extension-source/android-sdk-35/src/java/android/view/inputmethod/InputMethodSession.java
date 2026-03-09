package android.view.inputmethod;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.graphics.Rect;

public interface InputMethodSession
{
    void finishInput();
    
    void updateSelection(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    void viewClicked(final boolean p0);
    
    void updateCursor(final Rect p0);
    
    void displayCompletions(final CompletionInfo[] p0);
    
    void updateExtractedText(final int p0, final ExtractedText p1);
    
    void dispatchKeyEvent(final int p0, final KeyEvent p1, final EventCallback p2);
    
    void dispatchTrackballEvent(final int p0, final MotionEvent p1, final EventCallback p2);
    
    void dispatchGenericMotionEvent(final int p0, final MotionEvent p1, final EventCallback p2);
    
    void appPrivateCommand(final String p0, final Bundle p1);
    
    @Deprecated
    void toggleSoftInput(final int p0, final int p1);
    
    void updateCursorAnchorInfo(final CursorAnchorInfo p0);
    
    public interface EventCallback
    {
        void finishedEvent(final int p0, final boolean p1);
    }
}
