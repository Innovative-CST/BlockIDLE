package android.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;

public class CalendarView extends FrameLayout
{
    public CalendarView(@NonNull final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CalendarView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CalendarView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CalendarView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShownWeekCount(final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getShownWeekCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectedWeekBackgroundColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSelectedWeekBackgroundColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFocusedMonthDateColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getFocusedMonthDateColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUnfocusedMonthDateColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getUnfocusedMonthDateColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWeekNumberColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getWeekNumberColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWeekSeparatorLineColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getWeekSeparatorLineColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectedDateVerticalBar(final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectedDateVerticalBar(final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Drawable getSelectedDateVerticalBar() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWeekDayTextAppearance(final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWeekDayTextAppearance() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDateTextAppearance(final int resourceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDateTextAppearance() {
        throw new RuntimeException("Stub!");
    }
    
    public long getMinDate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinDate(final long minDate) {
        throw new RuntimeException("Stub!");
    }
    
    public long getMaxDate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxDate(final long maxDate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShowWeekNumber(final boolean showWeekNumber) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getShowWeekNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFirstDayOfWeek() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFirstDayOfWeek(final int firstDayOfWeek) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDateChangeListener(final OnDateChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public long getDate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDate(final long date) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDate(final long date, final boolean animate, final boolean center) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnDateChangeListener
    {
        void onSelectedDayChange(@NonNull final CalendarView p0, final int p1, final int p2, final int p3);
    }
}
