package android.text.style;

import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.os.Parcel;
import android.text.ParcelableSpan;

public class BulletSpan implements LeadingMarginSpan, ParcelableSpan
{
    public static final int STANDARD_GAP_WIDTH = 2;
    
    public BulletSpan() {
        throw new RuntimeException("Stub!");
    }
    
    public BulletSpan(final int gapWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public BulletSpan(final int gapWidth, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public BulletSpan(final int gapWidth, final int color, final int bulletRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public BulletSpan(@NonNull final Parcel src) {
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
    
    @Override
    public int getLeadingMargin(final boolean first) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGapWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBulletRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawLeadingMargin(@NonNull final Canvas canvas, @NonNull final Paint paint, final int x, final int dir, final int top, final int baseline, final int bottom, @NonNull final CharSequence text, final int start, final int end, final boolean first, @Nullable final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
