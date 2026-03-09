package android.text;

public interface SpanWatcher extends NoCopySpan
{
    void onSpanAdded(final Spannable p0, final Object p1, final int p2, final int p3);
    
    void onSpanRemoved(final Spannable p0, final Object p1, final int p2, final int p3);
    
    void onSpanChanged(final Spannable p0, final Object p1, final int p2, final int p3, final int p4, final int p5);
}
