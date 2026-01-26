package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import android.text.ParcelableSpan;
import android.graphics.Paint;

public interface LineHeightSpan extends ParagraphStyle, WrapTogetherSpan
{
    void chooseHeight(final CharSequence p0, final int p1, final int p2, final int p3, final int p4, final Paint.FontMetricsInt p5);
    
    public static class Standard implements LineHeightSpan, ParcelableSpan
    {
        public Standard(final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public Standard(@NonNull final Parcel src) {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
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
        
        @Override
        public void chooseHeight(@NonNull final CharSequence text, final int start, final int end, final int spanstartv, final int lineHeight, @NonNull final Paint.FontMetricsInt fm) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface WithDensity extends LineHeightSpan
    {
        void chooseHeight(final CharSequence p0, final int p1, final int p2, final int p3, final int p4, final Paint.FontMetricsInt p5, final TextPaint p6);
    }
}
