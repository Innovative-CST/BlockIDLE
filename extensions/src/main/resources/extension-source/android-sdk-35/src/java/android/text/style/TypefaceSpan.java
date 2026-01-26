package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.graphics.Typeface;
import android.text.ParcelableSpan;

public class TypefaceSpan extends MetricAffectingSpan implements ParcelableSpan
{
    public TypefaceSpan(@Nullable final String family) {
        throw new RuntimeException("Stub!");
    }
    
    public TypefaceSpan(@NonNull final Typeface typeface) {
        throw new RuntimeException("Stub!");
    }
    
    public TypefaceSpan(@NonNull final Parcel src) {
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
    
    @Nullable
    public String getFamily() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Typeface getTypeface() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(@NonNull final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateMeasureState(@NonNull final TextPaint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
