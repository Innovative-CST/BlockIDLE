package android.text.style;

import android.os.Parcel;
import android.text.ParcelableSpan;
import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;

public interface LeadingMarginSpan extends ParagraphStyle
{
    int getLeadingMargin(final boolean p0);
    
    void drawLeadingMargin(final Canvas p0, final Paint p1, final int p2, final int p3, final int p4, final int p5, final int p6, final CharSequence p7, final int p8, final int p9, final boolean p10, final Layout p11);
    
    public static class Standard implements LeadingMarginSpan, ParcelableSpan
    {
        public Standard(final int first, final int rest) {
            throw new RuntimeException("Stub!");
        }
        
        public Standard(final int every) {
            throw new RuntimeException("Stub!");
        }
        
        public Standard(final Parcel src) {
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
        public int getLeadingMargin(final boolean first) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void drawLeadingMargin(final Canvas c, final Paint p, final int x, final int dir, final int top, final int baseline, final int bottom, final CharSequence text, final int start, final int end, final boolean first, final Layout layout) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface LeadingMarginSpan2 extends LeadingMarginSpan, WrapTogetherSpan
    {
        int getLeadingMarginLineCount();
    }
}
