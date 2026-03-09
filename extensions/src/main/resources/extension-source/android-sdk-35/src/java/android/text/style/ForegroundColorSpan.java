package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class ForegroundColorSpan extends CharacterStyle implements UpdateAppearance, ParcelableSpan
{
    public ForegroundColorSpan(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public ForegroundColorSpan(@NonNull final Parcel src) {
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
    
    public int getForegroundColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(@NonNull final TextPaint textPaint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
