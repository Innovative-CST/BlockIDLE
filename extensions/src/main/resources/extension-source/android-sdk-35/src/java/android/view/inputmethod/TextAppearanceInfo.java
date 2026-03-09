package android.view.inputmethod;

import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;

public final class TextAppearanceInfo implements Parcelable
{
    @NonNull
    public static final Creator<TextAppearanceInfo> CREATOR;
    
    TextAppearanceInfo() {
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
    
    public float getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getTextLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSystemFontFamilyName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextFontWeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAllCaps() {
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
    
    public int getShadowColor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isElegantTextHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFallbackLineSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public float getLetterSpacing() {
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
    
    public int getLineBreakStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBreakWordStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextScaleX() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHighlightTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHintTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLinkTextColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextSize(final float textSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextLocales(@NonNull final LocaleList textLocales) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSystemFontFamilyName(@Nullable final String systemFontFamilyName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextFontWeight(final int textFontWeight) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextStyle(final int textStyle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllCaps(final boolean allCaps) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShadowDx(final float shadowDx) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShadowDy(final float shadowDy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShadowRadius(final float shadowRadius) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShadowColor(final int shadowColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setElegantTextHeight(final boolean elegantTextHeight) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFallbackLineSpacing(final boolean fallbackLineSpacing) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLetterSpacing(final float letterSpacing) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontFeatureSettings(@Nullable final String fontFeatureSettings) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontVariationSettings(@Nullable final String fontVariationSettings) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineBreakStyle(final int lineBreakStyle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineBreakWordStyle(final int lineBreakWordStyle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextScaleX(final float textScaleX) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHighlightTextColor(final int highlightTextColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextColor(final int textColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHintTextColor(final int hintTextColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLinkTextColor(final int linkTextColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextAppearanceInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
