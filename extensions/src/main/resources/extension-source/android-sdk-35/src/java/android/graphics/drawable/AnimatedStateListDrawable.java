package android.graphics.drawable;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class AnimatedStateListDrawable extends StateListDrawable
{
    public AnimatedStateListDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setVisible(final boolean visible, final boolean restart) {
        throw new RuntimeException("Stub!");
    }
    
    public void addState(@NonNull final int[] stateSet, @NonNull final Drawable drawable, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Drawable & Animatable> void addTransition(final int fromId, final int toId, @NonNull final T transition, final boolean reversible) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onStateChange(final int[] stateSet) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(@Nullable final Resources.Theme theme) {
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
