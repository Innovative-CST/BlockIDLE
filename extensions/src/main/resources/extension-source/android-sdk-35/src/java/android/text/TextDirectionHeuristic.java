package android.text;

public interface TextDirectionHeuristic
{
    boolean isRtl(final char[] p0, final int p1, final int p2);
    
    boolean isRtl(final CharSequence p0, final int p1, final int p2);
}
