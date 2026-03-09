package android.widget;

import android.view.ViewDebug;
import android.util.AttributeSet;
import android.content.Context;

@RemoteViews.RemoteView
public class TextClock extends TextView
{
    @Deprecated
    public static final CharSequence DEFAULT_FORMAT_12_HOUR;
    @Deprecated
    public static final CharSequence DEFAULT_FORMAT_24_HOUR;
    
    public TextClock(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextClock(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextClock(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextClock(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public CharSequence getFormat12Hour() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormat12Hour(final CharSequence format) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    public CharSequence getFormat24Hour() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormat24Hour(final CharSequence format) {
        throw new RuntimeException("Stub!");
    }
    
    public void refreshTime() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is24HourModeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public String getTimeZone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZone(final String timeZone) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onVisibilityAggregated(final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DEFAULT_FORMAT_12_HOUR = null;
        DEFAULT_FORMAT_24_HOUR = null;
    }
}
