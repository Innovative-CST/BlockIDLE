package android.graphics;

public class Path
{
    public Path() {
        throw new RuntimeException("Stub!");
    }
    
    public Path(@Nullable final Path src) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void rewind() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(@NonNull final Path src) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PathIterator getPathIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Path path, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean op(@NonNull final Path path1, @NonNull final Path path2, @NonNull final Op op) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isConvex() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public FillType getFillType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFillType(@NonNull final FillType ft) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInverseFillType() {
        throw new RuntimeException("Stub!");
    }
    
    public void toggleInverseFillType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRect(@Nullable final RectF rect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void computeBounds(@NonNull final RectF bounds, final boolean exact) {
        throw new RuntimeException("Stub!");
    }
    
    public void incReserve(final int extraPtCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void moveTo(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void rMoveTo(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void lineTo(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void rLineTo(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void quadTo(final float x1, final float y1, final float x2, final float y2) {
        throw new RuntimeException("Stub!");
    }
    
    public void rQuadTo(final float dx1, final float dy1, final float dx2, final float dy2) {
        throw new RuntimeException("Stub!");
    }
    
    public void conicTo(final float x1, final float y1, final float x2, final float y2, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public void rConicTo(final float dx1, final float dy1, final float dx2, final float dy2, final float weight) {
        throw new RuntimeException("Stub!");
    }
    
    public void cubicTo(final float x1, final float y1, final float x2, final float y2, final float x3, final float y3) {
        throw new RuntimeException("Stub!");
    }
    
    public void rCubicTo(final float x1, final float y1, final float x2, final float y2, final float x3, final float y3) {
        throw new RuntimeException("Stub!");
    }
    
    public void arcTo(@NonNull final RectF oval, final float startAngle, final float sweepAngle, final boolean forceMoveTo) {
        throw new RuntimeException("Stub!");
    }
    
    public void arcTo(@NonNull final RectF oval, final float startAngle, final float sweepAngle) {
        throw new RuntimeException("Stub!");
    }
    
    public void arcTo(final float left, final float top, final float right, final float bottom, final float startAngle, final float sweepAngle, final boolean forceMoveTo) {
        throw new RuntimeException("Stub!");
    }
    
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public void addRect(@NonNull final RectF rect, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRect(final float left, final float top, final float right, final float bottom, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOval(@NonNull final RectF oval, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOval(final float left, final float top, final float right, final float bottom, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addCircle(final float x, final float y, final float radius, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addArc(@NonNull final RectF oval, final float startAngle, final float sweepAngle) {
        throw new RuntimeException("Stub!");
    }
    
    public void addArc(final float left, final float top, final float right, final float bottom, final float startAngle, final float sweepAngle) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRoundRect(@NonNull final RectF rect, final float rx, final float ry, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRoundRect(final float left, final float top, final float right, final float bottom, final float rx, final float ry, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRoundRect(@NonNull final RectF rect, @NonNull final float[] radii, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addRoundRect(final float left, final float top, final float right, final float bottom, @NonNull final float[] radii, @NonNull final Direction dir) {
        throw new RuntimeException("Stub!");
    }
    
    public void addPath(@NonNull final Path src, final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void addPath(@NonNull final Path src) {
        throw new RuntimeException("Stub!");
    }
    
    public void addPath(@NonNull final Path src, @NonNull final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void offset(final float dx, final float dy, @Nullable final Path dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void offset(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLastPoint(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void transform(@NonNull final Matrix matrix, @Nullable final Path dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void transform(@NonNull final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] approximate(final float acceptableError) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGenerationId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInterpolatable(@NonNull final Path otherPath) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean interpolate(@NonNull final Path otherPath, final float t, @NonNull final Path interpolatedPath) {
        throw new RuntimeException("Stub!");
    }
    
    public enum Direction
    {
        CW, 
        CCW;
    }
    
    public enum FillType
    {
        WINDING, 
        EVEN_ODD, 
        INVERSE_WINDING, 
        INVERSE_EVEN_ODD;
    }
    
    public enum Op
    {
        DIFFERENCE, 
        INTERSECT, 
        UNION, 
        XOR, 
        REVERSE_DIFFERENCE;
    }
}
