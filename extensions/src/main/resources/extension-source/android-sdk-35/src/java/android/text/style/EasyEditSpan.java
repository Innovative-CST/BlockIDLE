package android.text.style;

import android.os.Parcel;
import android.app.PendingIntent;
import android.text.ParcelableSpan;

public class EasyEditSpan implements ParcelableSpan
{
    public static final String EXTRA_TEXT_CHANGED_TYPE = "android.text.style.EXTRA_TEXT_CHANGED_TYPE";
    public static final int TEXT_DELETED = 1;
    public static final int TEXT_MODIFIED = 2;
    
    public EasyEditSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public EasyEditSpan(final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public EasyEditSpan(@NonNull final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanTypeId() {
        throw new RuntimeException("Stub!");
    }
}
