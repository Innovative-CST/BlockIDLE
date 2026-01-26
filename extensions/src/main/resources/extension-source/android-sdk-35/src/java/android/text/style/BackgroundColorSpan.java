package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class BackgroundColorSpan extends CharacterStyle implements UpdateAppearance, ParcelableSpan
{
    public BackgroundColorSpan(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public BackgroundColorSpan(@NonNull final Parcel src) {
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
    
    public int getBackgroundColor() {
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
