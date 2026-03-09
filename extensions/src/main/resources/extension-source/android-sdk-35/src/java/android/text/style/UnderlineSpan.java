package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class UnderlineSpan extends CharacterStyle implements UpdateAppearance, ParcelableSpan
{
    public UnderlineSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public UnderlineSpan(@NonNull final Parcel src) {
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
    
    @Override
    public void updateDrawState(@NonNull final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
