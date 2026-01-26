package android.graphics.text;

import android.os.Parcel;
import android.os.Parcelable;

public final class LineBreakConfig implements Parcelable
{
    @NonNull
    public static final Creator<LineBreakConfig> CREATOR;
    public static final int HYPHENATION_DISABLED = 0;
    public static final int HYPHENATION_ENABLED = 1;
    public static final int HYPHENATION_UNSPECIFIED = -1;
    public static final int LINE_BREAK_STYLE_AUTO = 5;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_NO_BREAK = 4;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_STYLE_UNSPECIFIED = -1;
    public static final int LINE_BREAK_WORD_STYLE_AUTO = 2;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final int LINE_BREAK_WORD_STYLE_UNSPECIFIED = -1;
    
    LineBreakConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBreakStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineBreakWordStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHyphenation() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LineBreakConfig merge(@NonNull final LineBreakConfig config) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
        public Builder merge(@NonNull final LineBreakConfig config) {
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
        public Builder setHyphenation(final int hyphenation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public LineBreakConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
