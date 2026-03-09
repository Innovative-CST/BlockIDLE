package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.ParcelableSpan;

public final class SuggestionRangeSpan extends CharacterStyle implements ParcelableSpan
{
    @NonNull
    public static final Parcelable.Creator<SuggestionRangeSpan> CREATOR;
    
    public SuggestionRangeSpan() {
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
    
    public void setBackgroundColor(final int backgroundColor) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBackgroundColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(@NonNull final TextPaint tp) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
