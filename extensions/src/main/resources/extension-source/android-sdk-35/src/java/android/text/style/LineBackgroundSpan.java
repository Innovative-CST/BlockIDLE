package android.text.style;

import android.os.Parcel;
import android.text.ParcelableSpan;
import android.graphics.Paint;
import android.graphics.Canvas;

public interface LineBackgroundSpan extends ParagraphStyle
{
    void drawBackground(@NonNull final Canvas p0, @NonNull final Paint p1, final int p2, final int p3, final int p4, final int p5, final int p6, @NonNull final CharSequence p7, final int p8, final int p9, final int p10);
    
    public static class Standard implements LineBackgroundSpan, ParcelableSpan
    {
        public Standard(final int color) {
            throw new RuntimeException("Stub!");
        }
        
        public Standard(@NonNull final Parcel src) {
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
        
        public final int getColor() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void drawBackground(@NonNull final Canvas canvas, @NonNull final Paint paint, final int left, final int right, final int top, final int baseline, final int bottom, @NonNull final CharSequence text, final int start, final int end, final int lineNumber) {
            throw new RuntimeException("Stub!");
        }
    }
}
