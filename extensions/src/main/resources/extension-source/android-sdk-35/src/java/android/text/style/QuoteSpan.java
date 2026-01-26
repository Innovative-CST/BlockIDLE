package android.text.style;

import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class QuoteSpan implements LeadingMarginSpan, ParcelableSpan
{
    public static final int STANDARD_COLOR = -16776961;
    public static final int STANDARD_GAP_WIDTH_PX = 2;
    public static final int STANDARD_STRIPE_WIDTH_PX = 2;
    
    public QuoteSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public QuoteSpan(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public QuoteSpan(final int color, final int stripeWidth, final int gapWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public QuoteSpan(@NonNull final Parcel src) {
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
    
    public int getColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStripeWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGapWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLeadingMargin(final boolean first) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawLeadingMargin(@NonNull final Canvas c, @NonNull final Paint p, final int x, final int dir, final int top, final int baseline, final int bottom, @NonNull final CharSequence text, final int start, final int end, final boolean first, @NonNull final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
