package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class StyleSpan extends MetricAffectingSpan implements ParcelableSpan
{
    public StyleSpan(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public StyleSpan(final int style, final int fontWeightAdjustment) {
        throw new RuntimeException("Stub!");
    }
    
    public StyleSpan(@NonNull final Parcel src) {
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
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFontWeightAdjustment() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateMeasureState(final TextPaint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
