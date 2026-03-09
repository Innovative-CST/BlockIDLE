package android.text.style;

import android.view.View;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class URLSpan extends ClickableSpan implements ParcelableSpan
{
    public URLSpan(final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public URLSpan(@NonNull final Parcel src) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanTypeId() {
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
    
    public String getURL() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onClick(final View widget) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
