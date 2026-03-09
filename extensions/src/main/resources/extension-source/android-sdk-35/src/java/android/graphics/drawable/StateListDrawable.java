package android.graphics.drawable;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class StateListDrawable extends DrawableContainer
{
    public StateListDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void addState(final int[] stateSet, final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasFocusStateSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onStateChange(final int[] stateSet) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(final Resources r, final XmlPullParser parser, final AttributeSet attrs, final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public int getStateCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getStateSet(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getStateDrawable(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int findStateDrawableIndex(@NonNull final int[] stateSet) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void setConstantState(@RecentlyNonNull final DrawableContainerState state) {
        throw new RuntimeException("Stub!");
    }
}
