package android.widget;

import android.view.autofill.AutofillValue;
import android.view.ViewStructure;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;

public class TimePicker extends FrameLayout
{
    public TimePicker(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TimePicker(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TimePicker(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TimePicker(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setHour(final int hour) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHour() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinute(final int minute) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinute() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCurrentHour(@NonNull final Integer currentHour) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Integer getCurrentHour() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCurrentMinute(@NonNull final Integer currentMinute) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public Integer getCurrentMinute() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIs24HourView(@NonNull final Boolean is24HourView) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean is24HourView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnTimeChangedListener(final OnTimeChangedListener onTimeChangedListener) {
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
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean validateInput() {
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
    public CharSequence getAccessibilityClassName() {
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
    
    public interface OnTimeChangedListener
    {
        void onTimeChanged(final TimePicker p0, final int p1, final int p2);
    }
}
