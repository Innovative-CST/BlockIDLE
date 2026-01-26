package android.app;

import android.os.Bundle;
import android.content.Context;
import android.widget.DatePicker;
import android.content.DialogInterface;

public class DatePickerDialog extends AlertDialog implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener
{
    public DatePickerDialog(@NonNull final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePickerDialog(@NonNull final Context context, final int themeResId) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePickerDialog(@NonNull final Context context, @Nullable final OnDateSetListener listener, final int year, final int month, final int dayOfMonth) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public DatePickerDialog(@NonNull final Context context, final int themeResId, @Nullable final OnDateSetListener listener, final int year, final int monthOfYear, final int dayOfMonth) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDateChanged(@NonNull final DatePicker view, final int year, final int month, final int dayOfMonth) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDateSetListener(@Nullable final OnDateSetListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onClick(@NonNull final DialogInterface dialog, final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DatePicker getDatePicker() {
        throw new RuntimeException("Stub!");
    }
    
    public void updateDate(final int year, final int month, final int dayOfMonth) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Bundle onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnDateSetListener
    {
        void onDateSet(final DatePicker p0, final int p1, final int p2, final int p3);
    }
}
