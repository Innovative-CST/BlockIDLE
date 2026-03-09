package androidx.appcompat.widget;

class RtlSpacingHelper
{
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft;
    private int mRight;
    private int mStart;
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRtl;
    private boolean mIsRelative;
    
    RtlSpacingHelper() {
        this.mLeft = 0;
        this.mRight = 0;
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mExplicitLeft = 0;
        this.mExplicitRight = 0;
        this.mIsRtl = false;
        this.mIsRelative = false;
    }
    
    public int getLeft() {
        return this.mLeft;
    }
    
    public int getRight() {
        return this.mRight;
    }
    
    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }
    
    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }
    
    public void setRelative(final int start, final int end) {
        this.mStart = start;
        this.mEnd = end;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (end != Integer.MIN_VALUE) {
                this.mLeft = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.mRight = start;
            }
        }
        else {
            if (start != Integer.MIN_VALUE) {
                this.mLeft = start;
            }
            if (end != Integer.MIN_VALUE) {
                this.mRight = end;
            }
        }
    }
    
    public void setAbsolute(final int left, final int right) {
        this.mIsRelative = false;
        if (left != Integer.MIN_VALUE) {
            this.mExplicitLeft = left;
            this.mLeft = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.mExplicitRight = right;
            this.mRight = right;
        }
    }
    
    public void setDirection(final boolean isRtl) {
        if (isRtl == this.mIsRtl) {
            return;
        }
        this.mIsRtl = isRtl;
        if (this.mIsRelative) {
            if (isRtl) {
                this.mLeft = ((this.mEnd != Integer.MIN_VALUE) ? this.mEnd : this.mExplicitLeft);
                this.mRight = ((this.mStart != Integer.MIN_VALUE) ? this.mStart : this.mExplicitRight);
            }
            else {
                this.mLeft = ((this.mStart != Integer.MIN_VALUE) ? this.mStart : this.mExplicitLeft);
                this.mRight = ((this.mEnd != Integer.MIN_VALUE) ? this.mEnd : this.mExplicitRight);
            }
        }
        else {
            this.mLeft = this.mExplicitLeft;
            this.mRight = this.mExplicitRight;
        }
    }
}
