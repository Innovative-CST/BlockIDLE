package android.graphics.drawable;

import android.graphics.Canvas;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class ClipDrawable extends DrawableWrapper
{
    public static final int HORIZONTAL = 1;
    public static final int VERTICAL = 2;
    
    public ClipDrawable(final Drawable drawable, final int gravity, final int orientation) {
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
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
}
