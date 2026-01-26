package android.widget;

import android.view.autofill.AutofillValue;
import android.view.ViewStructure;
import android.os.Parcelable;
import android.util.SparseArray;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.content.Context;

public class DatePicker extends FrameLayout
{
    public DatePicker(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePicker(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePicker(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePicker(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void init(final int year, final int monthOfYear, final int dayOfMonth, final OnDateChangedListener onDateChangedListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDateChangedListener(final OnDateChangedListener onDateChangedListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateDate(final int year, final int month, final int dayOfMonth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getYear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMonth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDayOfMonth() {
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
    
    @Override
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFirstDayOfWeek(final int firstDayOfWeek) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFirstDayOfWeek() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getCalendarViewShown() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CalendarView getCalendarView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCalendarViewShown(final boolean shown) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getSpinnersShown() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpinnersShown(final boolean shown) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dispatchProvideAutofillStructure(final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void autofill(final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAutofillType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AutofillValue getAutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnDateChangedListener
    {
        void onDateChanged(final DatePicker p0, final int p1, final int p2, final int p3);
    }
}
