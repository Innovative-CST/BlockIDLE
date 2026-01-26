package android.widget;

import android.view.autofill.AutofillValue;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

public abstract class AbsSpinner extends AdapterView<SpinnerAdapter>
{
    public AbsSpinner(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSpinner(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSpinner(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AbsSpinner(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final SpinnerAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelection(final int position, final boolean animate) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelection(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getSelectedView() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void requestLayout() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpinnerAdapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int pointToPosition(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
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
}
