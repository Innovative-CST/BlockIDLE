package android.text.style;

import android.text.TextPaint;
import android.graphics.Typeface;
import android.os.LocaleList;
import android.os.Parcel;
import android.content.res.ColorStateList;
import android.content.Context;
import android.text.ParcelableSpan;

public class TextAppearanceSpan extends MetricAffectingSpan implements ParcelableSpan
{
    public TextAppearanceSpan(final Context context, final int appearance) {
        throw new RuntimeException("Stub!");
    }
    
    public TextAppearanceSpan(final Context context, final int appearance, final int colorList) {
        throw new RuntimeException("Stub!");
    }
    
    public TextAppearanceSpan(final String family, final int style, final int size, final ColorStateList color, final ColorStateList linkColor) {
        throw new RuntimeException("Stub!");
    }
    
    public TextAppearanceSpan(final Parcel src) {
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
    
    public String getFamily() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorStateList getTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorStateList getLinkTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextFontWeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocaleList getTextLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Typeface getTypeface() {
        throw new RuntimeException("Stub!");
    }
    
    public int getShadowColor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowDx() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowDy() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowRadius() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFontFeatureSettings() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFontVariationSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isElegantTextHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public float getLetterSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateDrawState(final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void updateMeasureState(final TextPaint ds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
