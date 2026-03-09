package android.app;

import android.content.res.Resources;
import android.view.Display;
import android.content.Context;

public class Presentation extends Dialog
{
    public Presentation(final Context outerContext, final Display display) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Presentation(final Context outerContext, final Display display, final int theme) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Display getDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void show() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisplayRemoved() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisplayChanged() {
        throw new RuntimeException("Stub!");
    }
}
