package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.os.LocaleList;
import java.util.Locale;
import android.text.ParcelableSpan;

public class LocaleSpan extends MetricAffectingSpan implements ParcelableSpan
{
    public LocaleSpan(@Nullable final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public LocaleSpan(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    public LocaleSpan(final Parcel source) {
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
    
    @Nullable
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getLocales() {
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
