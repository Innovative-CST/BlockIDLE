package android.graphics.drawable;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class LevelListDrawable extends DrawableContainer
{
    public LevelListDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void addLevel(final int low, final int high, final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(final Resources r, final XmlPullParser parser, final AttributeSet attrs, final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void setConstantState(@RecentlyNonNull final DrawableContainerState state) {
        throw new RuntimeException("Stub!");
    }
}
