package android.view.inputmethod;

import android.graphics.Matrix;
import java.util.List;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;

public final class CursorAnchorInfo implements Parcelable
{
    @NonNull
    public static final Creator<CursorAnchorInfo> CREATOR;
    public static final int FLAG_HAS_INVISIBLE_REGION = 2;
    public static final int FLAG_HAS_VISIBLE_REGION = 1;
    public static final int FLAG_IS_RTL = 4;
    
    public CursorAnchorInfo(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getComposingTextStart() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getComposingText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInsertionMarkerFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public float getInsertionMarkerHorizontal() {
        throw new RuntimeException("Stub!");
    }
    
    public float getInsertionMarkerTop() {
        throw new RuntimeException("Stub!");
    }
    
    public float getInsertionMarkerBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    public float getInsertionMarkerBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public RectF getCharacterBounds(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCharacterBoundsFlags(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RectF> getVisibleLineBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public EditorBoundsInfo getEditorBoundsInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TextAppearanceInfo getTextAppearanceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix getMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
        
        public Builder setSelectionRange(final int newStart, final int newEnd) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setComposingText(final int composingTextStart, final CharSequence composingText) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setInsertionMarkerLocation(final float horizontalPosition, final float lineTop, final float lineBaseline, final float lineBottom, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCharacterBounds(final int index, final float left, final float top, final float right, final float bottom, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEditorBoundsInfo(@Nullable final EditorBoundsInfo bounds) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setMatrix(final Matrix matrix) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextAppearanceInfo(@Nullable final TextAppearanceInfo textAppearanceInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addVisibleLineBounds(final float left, final float top, final float right, final float bottom) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearVisibleLineBounds() {
            throw new RuntimeException("Stub!");
        }
        
        public CursorAnchorInfo build() {
            throw new RuntimeException("Stub!");
        }
        
        public void reset() {
            throw new RuntimeException("Stub!");
        }
    }
}
