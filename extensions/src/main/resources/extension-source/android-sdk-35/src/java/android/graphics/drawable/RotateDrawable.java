package android.graphics.drawable;

import android.graphics.Canvas;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class RotateDrawable extends DrawableWrapper
{
    public RotateDrawable() {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(@NonNull final Resources.Theme t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFromDegrees(final float fromDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFromDegrees() {
        throw new RuntimeException("Stub!");
    }
    
    public void setToDegrees(final float toDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public float getToDegrees() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotX(final float pivotX) {
        throw new RuntimeException("Stub!");
    }
    
    public float getPivotX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotXRelative(final boolean relative) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPivotXRelative() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotY(final float pivotY) {
        throw new RuntimeException("Stub!");
    }
    
    public float getPivotY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPivotYRelative(final boolean relative) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPivotYRelative() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
}
