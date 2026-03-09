package android.graphics.drawable.shapes;

import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Canvas;

public abstract class Shape implements Cloneable
{
    public Shape() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void draw(final Canvas p0, final Paint p1);
    
    public final void resize(final float width, final float height) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    protected void onResize(final float width, final float height) {
        throw new RuntimeException("Stub!");
    }
    
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    public Shape clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
