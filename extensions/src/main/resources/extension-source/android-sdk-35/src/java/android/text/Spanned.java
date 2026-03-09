package android.text;

public interface Spanned extends CharSequence
{
    public static final int SPAN_COMPOSING = 256;
    public static final int SPAN_EXCLUSIVE_EXCLUSIVE = 33;
    public static final int SPAN_EXCLUSIVE_INCLUSIVE = 34;
    public static final int SPAN_INCLUSIVE_EXCLUSIVE = 17;
    public static final int SPAN_INCLUSIVE_INCLUSIVE = 18;
    public static final int SPAN_INTERMEDIATE = 512;
    public static final int SPAN_MARK_MARK = 17;
    public static final int SPAN_MARK_POINT = 18;
    public static final int SPAN_PARAGRAPH = 51;
    public static final int SPAN_POINT_MARK = 33;
    public static final int SPAN_POINT_MARK_MASK = 51;
    public static final int SPAN_POINT_POINT = 34;
    public static final int SPAN_PRIORITY = 16711680;
    public static final int SPAN_PRIORITY_SHIFT = 16;
    public static final int SPAN_USER = -16777216;
    public static final int SPAN_USER_SHIFT = 24;
    
     <T> T[] getSpans(final int p0, final int p1, final Class<T> p2);
    
    int getSpanStart(final Object p0);
    
    int getSpanEnd(final Object p0);
    
    int getSpanFlags(final Object p0);
    
    int nextSpanTransition(final int p0, final int p1, final Class p2);
}
