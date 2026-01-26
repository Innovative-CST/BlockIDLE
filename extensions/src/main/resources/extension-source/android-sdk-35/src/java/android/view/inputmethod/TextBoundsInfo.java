package android.view.inputmethod;

import android.os.Parcel;
import android.text.Layout;
import android.text.SegmentFinder;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.os.Parcelable;

public final class TextBoundsInfo implements Parcelable
{
    @NonNull
    public static final Creator<TextBoundsInfo> CREATOR;
    public static final int FLAG_CHARACTER_LINEFEED = 2;
    public static final int FLAG_CHARACTER_PUNCTUATION = 4;
    public static final int FLAG_CHARACTER_WHITESPACE = 1;
    public static final int FLAG_LINE_IS_RTL = 8;
    
    TextBoundsInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getMatrix(@NonNull final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public void getCharacterBounds(final int index, @NonNull final RectF bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCharacterFlags(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCharacterBidiLevel(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SegmentFinder getWordSegmentFinder() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SegmentFinder getGraphemeSegmentFinder() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SegmentFinder getLineSegmentFinder() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetForPosition(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getRangeForRect(@NonNull final RectF area, @NonNull final SegmentFinder segmentFinder, @NonNull final Layout.TextInclusionStrategy inclusionStrategy) {
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
        public Builder(final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clear() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMatrix(@NonNull final Matrix matrix) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartAndEnd(final int start, final int end) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCharacterBounds(@NonNull final float[] characterBounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCharacterFlags(@NonNull final int[] characterFlags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCharacterBidiLevel(@NonNull final int[] characterBidiLevels) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setGraphemeSegmentFinder(@NonNull final SegmentFinder graphemeSegmentFinder) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setWordSegmentFinder(@NonNull final SegmentFinder wordSegmentFinder) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLineSegmentFinder(@NonNull final SegmentFinder lineSegmentFinder) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextBoundsInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
