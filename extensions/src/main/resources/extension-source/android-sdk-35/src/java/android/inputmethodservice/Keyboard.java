package android.inputmethodservice;

import android.graphics.drawable.Drawable;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import java.util.List;
import android.content.Context;

@Deprecated
public class Keyboard
{
    @Deprecated
    public static final int EDGE_BOTTOM = 8;
    @Deprecated
    public static final int EDGE_LEFT = 1;
    @Deprecated
    public static final int EDGE_RIGHT = 2;
    @Deprecated
    public static final int EDGE_TOP = 4;
    @Deprecated
    public static final int KEYCODE_ALT = -6;
    @Deprecated
    public static final int KEYCODE_CANCEL = -3;
    @Deprecated
    public static final int KEYCODE_DELETE = -5;
    @Deprecated
    public static final int KEYCODE_DONE = -4;
    @Deprecated
    public static final int KEYCODE_MODE_CHANGE = -2;
    @Deprecated
    public static final int KEYCODE_SHIFT = -1;
    
    @Deprecated
    public Keyboard(final Context context, final int xmlLayoutResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Keyboard(final Context context, final int xmlLayoutResId, final int modeId, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Keyboard(final Context context, final int xmlLayoutResId, final int modeId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Keyboard(final Context context, final int layoutTemplateResId, final CharSequence characters, final int columns, final int horizontalPadding) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<Key> getKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<Key> getModifierKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getHorizontalGap() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setHorizontalGap(final int gap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getVerticalGap() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setVerticalGap(final int gap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getKeyHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setKeyHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getKeyWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void setKeyWidth(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMinWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setShifted(final boolean shiftState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isShifted() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getShiftKeyIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int[] getNearestKeys(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Row createRowFromXml(final Resources res, final XmlResourceParser parser) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Key createKeyFromXml(final Resources res, final Row parent, final int x, final int y, final XmlResourceParser parser) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Key
    {
        @Deprecated
        public int[] codes;
        @Deprecated
        public int edgeFlags;
        @Deprecated
        public int gap;
        @Deprecated
        public int height;
        @Deprecated
        public Drawable icon;
        @Deprecated
        public Drawable iconPreview;
        @Deprecated
        public CharSequence label;
        @Deprecated
        public boolean modifier;
        @Deprecated
        public boolean on;
        @Deprecated
        public CharSequence popupCharacters;
        @Deprecated
        public int popupResId;
        @Deprecated
        public boolean pressed;
        @Deprecated
        public boolean repeatable;
        @Deprecated
        public boolean sticky;
        @Deprecated
        public CharSequence text;
        @Deprecated
        public int width;
        @Deprecated
        public int x;
        @Deprecated
        public int y;
        
        @Deprecated
        public Key(final Row parent) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Key(final Resources res, final Row parent, final int x, final int y, final XmlResourceParser parser) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onPressed() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onReleased(final boolean inside) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isInside(final int x, final int y) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int squaredDistanceFrom(final int x, final int y) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int[] getCurrentDrawableState() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class Row
    {
        @Deprecated
        public int defaultHeight;
        @Deprecated
        public int defaultHorizontalGap;
        @Deprecated
        public int defaultWidth;
        @Deprecated
        public int mode;
        @Deprecated
        public int rowEdgeFlags;
        @Deprecated
        public int verticalGap;
        
        @Deprecated
        public Row(final Keyboard parent) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Row(final Resources res, final Keyboard parent, final XmlResourceParser parser) {
            throw new RuntimeException("Stub!");
        }
    }
}
