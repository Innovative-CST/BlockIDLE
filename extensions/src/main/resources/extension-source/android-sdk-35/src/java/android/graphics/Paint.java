package android.graphics;

import android.os.LocaleList;
import java.util.Locale;

public class Paint
{
    public static final int ANTI_ALIAS_FLAG = 1;
    public static final int CURSOR_AFTER = 0;
    public static final int CURSOR_AT = 4;
    public static final int CURSOR_AT_OR_AFTER = 1;
    public static final int CURSOR_AT_OR_BEFORE = 3;
    public static final int CURSOR_BEFORE = 2;
    public static final int DEV_KERN_TEXT_FLAG = 256;
    public static final int DITHER_FLAG = 4;
    public static final int EMBEDDED_BITMAP_TEXT_FLAG = 1024;
    public static final int END_HYPHEN_EDIT_INSERT_ARMENIAN_HYPHEN = 3;
    public static final int END_HYPHEN_EDIT_INSERT_HYPHEN = 2;
    public static final int END_HYPHEN_EDIT_INSERT_MAQAF = 4;
    public static final int END_HYPHEN_EDIT_INSERT_UCAS_HYPHEN = 5;
    public static final int END_HYPHEN_EDIT_INSERT_ZWJ_AND_HYPHEN = 6;
    public static final int END_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int END_HYPHEN_EDIT_REPLACE_WITH_HYPHEN = 1;
    public static final int FAKE_BOLD_TEXT_FLAG = 32;
    public static final int FILTER_BITMAP_FLAG = 2;
    public static final int HINTING_OFF = 0;
    public static final int HINTING_ON = 1;
    public static final int LINEAR_TEXT_FLAG = 64;
    public static final int START_HYPHEN_EDIT_INSERT_HYPHEN = 1;
    public static final int START_HYPHEN_EDIT_INSERT_ZWJ = 2;
    public static final int START_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int STRIKE_THRU_TEXT_FLAG = 16;
    public static final int SUBPIXEL_TEXT_FLAG = 128;
    public static final int TEXT_RUN_FLAG_LEFT_EDGE = 8192;
    public static final int TEXT_RUN_FLAG_RIGHT_EDGE = 16384;
    public static final int UNDERLINE_TEXT_FLAG = 8;
    
    public Paint() {
        throw new RuntimeException("Stub!");
    }
    
    public Paint(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public Paint(final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final Paint src) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFlags(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHinting() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHinting(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isAntiAlias() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAntiAlias(final boolean aa) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isDither() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isLinearText() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLinearText(final boolean linearText) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isSubpixelText() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubpixelText(final boolean subpixelText) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isUnderlineText() {
        throw new RuntimeException("Stub!");
    }
    
    public float getUnderlinePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public float getUnderlineThickness() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUnderlineText(final boolean underlineText) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isStrikeThruText() {
        throw new RuntimeException("Stub!");
    }
    
    public float getStrikeThruPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public float getStrikeThruThickness() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrikeThruText(final boolean strikeThruText) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isFakeBoldText() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFakeBoldText(final boolean fakeBoldText) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isFilterBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterBitmap(final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    public Style getStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStyle(final Style style) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor() {
        throw new RuntimeException("Stub!");
    }
    
    public long getColorLong() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlpha(final int a) {
        throw new RuntimeException("Stub!");
    }
    
    public void setARGB(final int a, final int r, final int g, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public float getStrokeWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrokeWidth(final float width) {
        throw new RuntimeException("Stub!");
    }
    
    public float getStrokeMiter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrokeMiter(final float miter) {
        throw new RuntimeException("Stub!");
    }
    
    public Cap getStrokeCap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrokeCap(final Cap cap) {
        throw new RuntimeException("Stub!");
    }
    
    public Join getStrokeJoin() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrokeJoin(final Join join) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFillPath(final Path src, final Path dst) {
        throw new RuntimeException("Stub!");
    }
    
    public Shader getShader() {
        throw new RuntimeException("Stub!");
    }
    
    public Shader setShader(final Shader shader) {
        throw new RuntimeException("Stub!");
    }
    
    public ColorFilter getColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorFilter setColorFilter(final ColorFilter filter) {
        throw new RuntimeException("Stub!");
    }
    
    public Xfermode getXfermode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public Xfermode setXfermode(final Xfermode xfermode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBlendMode(@Nullable final BlendMode blendmode) {
        throw new RuntimeException("Stub!");
    }
    
    public PathEffect getPathEffect() {
        throw new RuntimeException("Stub!");
    }
    
    public PathEffect setPathEffect(final PathEffect effect) {
        throw new RuntimeException("Stub!");
    }
    
    public MaskFilter getMaskFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public MaskFilter setMaskFilter(final MaskFilter maskfilter) {
        throw new RuntimeException("Stub!");
    }
    
    public Typeface getTypeface() {
        throw new RuntimeException("Stub!");
    }
    
    public Typeface setTypeface(final Typeface typeface) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShadowLayer(final float radius, final float dx, final float dy, final int shadowColor) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShadowLayer(final float radius, final float dx, final float dy, final long shadowColor) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearShadowLayer() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowLayerRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowLayerDx() {
        throw new RuntimeException("Stub!");
    }
    
    public float getShadowLayerDy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getShadowLayerColor() {
        throw new RuntimeException("Stub!");
    }
    
    public long getShadowLayerColorLong() {
        throw new RuntimeException("Stub!");
    }
    
    public Align getTextAlign() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextAlign(final Align align) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Locale getTextLocale() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getTextLocales() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextLocale(@NonNull final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextLocales(@NonNull final LocaleList locales) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isElegantTextHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setElegantTextHeight(final boolean elegant) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextSize() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSize(final float textSize) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextScaleX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextScaleX(final float scaleX) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextSkewX() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextSkewX(final float skewX) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLetterSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLetterSpacing(final float letterSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public float getWordSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWordSpacing(final float wordSpacing) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFontFeatureSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFontFeatureSettings(final String settings) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFontVariationSettings() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setFontVariationSettings(final String fontVariationSettings) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartHyphenEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndHyphenEdit() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStartHyphenEdit(final int startHyphen) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEndHyphenEdit(final int endHyphen) {
        throw new RuntimeException("Stub!");
    }
    
    public float ascent() {
        throw new RuntimeException("Stub!");
    }
    
    public float descent() {
        throw new RuntimeException("Stub!");
    }
    
    public float getFontMetrics(final FontMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public FontMetrics getFontMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsForLocale(@NonNull final FontMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsInt(@NonNull final CharSequence text, final int start, final int count, final int contextStart, final int contextCount, final boolean isRtl, @NonNull final FontMetricsInt outMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsInt(@NonNull final char[] text, final int start, final int count, final int contextStart, final int contextCount, final boolean isRtl, @NonNull final FontMetricsInt outMetrics) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFontMetricsInt(final FontMetricsInt fmi) {
        throw new RuntimeException("Stub!");
    }
    
    public FontMetricsInt getFontMetricsInt() {
        throw new RuntimeException("Stub!");
    }
    
    public void getFontMetricsIntForLocale(@NonNull final FontMetricsInt metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFontSpacing() {
        throw new RuntimeException("Stub!");
    }
    
    public float measureText(final char[] text, final int index, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public float measureText(final String text, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public float measureText(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public float measureText(final CharSequence text, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public int breakText(final char[] text, final int index, final int count, final float maxWidth, final float[] measuredWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int breakText(final CharSequence text, final int start, final int end, final boolean measureForwards, final float maxWidth, final float[] measuredWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int breakText(final String text, final boolean measureForwards, final float maxWidth, final float[] measuredWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextWidths(final char[] text, final int index, final int count, final float[] widths) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextWidths(final CharSequence text, final int start, final int end, final float[] widths) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextWidths(final String text, final int start, final int end, final float[] widths) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextWidths(final String text, final float[] widths) {
        throw new RuntimeException("Stub!");
    }
    
    public float getTextRunAdvances(@NonNull final char[] chars, final int index, final int count, final int contextIndex, final int contextCount, final boolean isRtl, @Nullable final float[] advances, final int advancesIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextRunCursor(@NonNull final char[] text, final int contextStart, final int contextLength, final boolean isRtl, final int offset, final int cursorOpt) {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextRunCursor(@NonNull final CharSequence text, final int contextStart, final int contextEnd, final boolean isRtl, final int offset, final int cursorOpt) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTextPath(final char[] text, final int index, final int count, final float x, final float y, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTextPath(final String text, final int start, final int end, final float x, final float y, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTextBounds(final String text, final int start, final int end, final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTextBounds(@NonNull final CharSequence text, final int start, final int end, @NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void getTextBounds(final char[] text, final int index, final int count, final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasGlyph(final String string) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRunAdvance(final char[] text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRunAdvance(final CharSequence text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRunCharacterAdvance(@NonNull final char[] text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final int offset, @Nullable final float[] advances, final int advancesIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRunCharacterAdvance(@NonNull final CharSequence text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final int offset, @Nullable final float[] advances, final int advancesIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetForAdvance(final char[] text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final float advance) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetForAdvance(final CharSequence text, final int start, final int end, final int contextStart, final int contextEnd, final boolean isRtl, final float advance) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equalsForTextMeasurement(@NonNull final Paint other) {
        throw new RuntimeException("Stub!");
    }
    
    public enum Align
    {
        LEFT, 
        CENTER, 
        RIGHT;
    }
    
    public enum Cap
    {
        BUTT, 
        ROUND, 
        SQUARE;
    }
    
    public static class FontMetrics
    {
        public float ascent;
        public float bottom;
        public float descent;
        public float leading;
        public float top;
        
        public FontMetrics() {
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
    }
    
    public static class FontMetricsInt
    {
        public int ascent;
        public int bottom;
        public int descent;
        public int leading;
        public int top;
        
        public FontMetricsInt() {
            throw new RuntimeException("Stub!");
        }
        
        public void set(@NonNull final FontMetricsInt fontMetricsInt) {
            throw new RuntimeException("Stub!");
        }
        
        public void set(@NonNull final FontMetrics fontMetrics) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
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
    }
    
    public enum Join
    {
        MITER, 
        ROUND, 
        BEVEL;
    }
    
    public enum Style
    {
        FILL, 
        STROKE, 
        FILL_AND_STROKE;
    }
}
