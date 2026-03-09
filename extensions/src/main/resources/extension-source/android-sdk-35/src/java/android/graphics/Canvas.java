package android.graphics;

import android.graphics.text.MeasuredText;
import android.graphics.fonts.Font;

public class Canvas
{
    public static final int ALL_SAVE_FLAG = 31;
    
    public Canvas() {
        throw new RuntimeException("Stub!");
    }
    
    public Canvas(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHardwareAccelerated() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBitmap(@Nullable final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableZ() {
        throw new RuntimeException("Stub!");
    }
    
    public void disableZ() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDensity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDensity(final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumBitmapWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaximumBitmapHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int save() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int saveLayer(@Nullable final RectF bounds, @Nullable final Paint paint, final int saveFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int saveLayer(@Nullable final RectF bounds, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int saveLayer(final float left, final float top, final float right, final float bottom, @Nullable final Paint paint, final int saveFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int saveLayer(final float left, final float top, final float right, final float bottom, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int saveLayerAlpha(@Nullable final RectF bounds, final int alpha, final int saveFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int saveLayerAlpha(@Nullable final RectF bounds, final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int saveLayerAlpha(final float left, final float top, final float right, final float bottom, final int alpha, final int saveFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public int saveLayerAlpha(final float left, final float top, final float right, final float bottom, final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    public void restore() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSaveCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void restoreToCount(final int saveCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void translate(final float dx, final float dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void scale(final float sx, final float sy) {
        throw new RuntimeException("Stub!");
    }
    
    public final void scale(final float sx, final float sy, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void rotate(final float degrees) {
        throw new RuntimeException("Stub!");
    }
    
    public final void rotate(final float degrees, final float px, final float py) {
        throw new RuntimeException("Stub!");
    }
    
    public void skew(final float sx, final float sy) {
        throw new RuntimeException("Stub!");
    }
    
    public void concat(@Nullable final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public void concat(@Nullable final Matrix44 m) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMatrix(@Nullable final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void getMatrix(@NonNull final Matrix ctm) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public final Matrix getMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean clipRect(@NonNull final RectF rect, @NonNull final Region.Op op) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean clipRect(@NonNull final Rect rect, @NonNull final Region.Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipRect(@NonNull final RectF rect) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipOutRect(@NonNull final RectF rect) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipRect(@NonNull final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipOutRect(@NonNull final Rect rect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean clipRect(final float left, final float top, final float right, final float bottom, @NonNull final Region.Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipRect(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipOutRect(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipRect(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipOutRect(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean clipPath(@NonNull final Path path, @NonNull final Region.Op op) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipPath(@NonNull final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clipOutPath(@NonNull final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public void clipShader(@NonNull final Shader shader) {
        throw new RuntimeException("Stub!");
    }
    
    public void clipOutShader(@NonNull final Shader shader) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public DrawFilter getDrawFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDrawFilter(@Nullable final DrawFilter filter) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean quickReject(@NonNull final RectF rect, @NonNull final EdgeType type) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean quickReject(@NonNull final RectF rect) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean quickReject(@NonNull final Path path, @NonNull final EdgeType type) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean quickReject(@NonNull final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean quickReject(final float left, final float top, final float right, final float bottom, @NonNull final EdgeType type) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean quickReject(final float left, final float top, final float right, final float bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getClipBounds(@NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Rect getClipBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPicture(@NonNull final Picture picture) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPicture(@NonNull final Picture picture, @NonNull final RectF dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPicture(@NonNull final Picture picture, @NonNull final Rect dst) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawArc(@NonNull final RectF oval, final float startAngle, final float sweepAngle, final boolean useCenter, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawArc(final float left, final float top, final float right, final float bottom, final float startAngle, final float sweepAngle, final boolean useCenter, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawARGB(final int a, final int r, final int g, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBitmap(@NonNull final Bitmap bitmap, final float left, final float top, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBitmap(@NonNull final Bitmap bitmap, @Nullable final Rect src, @NonNull final RectF dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBitmap(@NonNull final Bitmap bitmap, @Nullable final Rect src, @NonNull final Rect dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void drawBitmap(@NonNull final int[] colors, final int offset, final int stride, final float x, final float y, final int width, final int height, final boolean hasAlpha, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void drawBitmap(@NonNull final int[] colors, final int offset, final int stride, final int x, final int y, final int width, final int height, final boolean hasAlpha, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBitmap(@NonNull final Bitmap bitmap, @NonNull final Matrix matrix, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawBitmapMesh(@NonNull final Bitmap bitmap, final int meshWidth, final int meshHeight, @NonNull final float[] verts, final int vertOffset, @Nullable final int[] colors, final int colorOffset, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawCircle(final float cx, final float cy, final float radius, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawColor(final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawColor(final int color, @NonNull final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawColor(final int color, @NonNull final BlendMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawColor(final long color, @NonNull final BlendMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawLine(final float startX, final float startY, final float stopX, final float stopY, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawLines(@NonNull final float[] pts, final int offset, final int count, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawLines(@NonNull final float[] pts, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawOval(@NonNull final RectF oval, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawOval(final float left, final float top, final float right, final float bottom, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPaint(@NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPatch(@NonNull final NinePatch patch, @NonNull final Rect dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPatch(@NonNull final NinePatch patch, @NonNull final RectF dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPath(@NonNull final Path path, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPoint(final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPoints(final float[] pts, final int offset, final int count, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawPoints(@NonNull final float[] pts, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void drawPosText(@NonNull final char[] text, final int index, final int count, @NonNull final float[] pos, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void drawPosText(@NonNull final String text, @NonNull final float[] pos, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRect(@NonNull final RectF rect, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRect(@NonNull final Rect r, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRect(final float left, final float top, final float right, final float bottom, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRGB(final int r, final int g, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRoundRect(@NonNull final RectF rect, final float rx, final float ry, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRoundRect(final float left, final float top, final float right, final float bottom, final float rx, final float ry, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawDoubleRoundRect(@NonNull final RectF outer, final float outerRx, final float outerRy, @NonNull final RectF inner, final float innerRx, final float innerRy, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawDoubleRoundRect(@NonNull final RectF outer, @NonNull final float[] outerRadii, @NonNull final RectF inner, @NonNull final float[] innerRadii, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawGlyphs(@NonNull final int[] glyphIds, final int glyphIdOffset, @NonNull final float[] positions, final int positionOffset, final int glyphCount, @NonNull final Font font, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawText(@NonNull final char[] text, final int index, final int count, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawText(@NonNull final String text, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawText(@NonNull final String text, final int start, final int end, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawText(@NonNull final CharSequence text, final int start, final int end, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawTextOnPath(@NonNull final char[] text, final int index, final int count, @NonNull final Path path, final float hOffset, final float vOffset, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawTextOnPath(@NonNull final String text, @NonNull final Path path, final float hOffset, final float vOffset, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawTextRun(@NonNull final char[] text, final int index, final int count, final int contextIndex, final int contextCount, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawTextRun(@NonNull final CharSequence text, final int start, final int end, final int contextStart, final int contextEnd, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawTextRun(@NonNull final MeasuredText text, final int start, final int end, final int contextStart, final int contextEnd, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawVertices(@NonNull final VertexMode mode, final int vertexCount, @NonNull final float[] verts, final int vertOffset, @Nullable final float[] texs, final int texOffset, @Nullable final int[] colors, final int colorOffset, @Nullable final short[] indices, final int indexOffset, final int indexCount, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRenderNode(@NonNull final RenderNode renderNode) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawMesh(@NonNull final Mesh mesh, @Nullable final BlendMode blendMode, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public enum EdgeType
    {
        @Deprecated
        BW, 
        @Deprecated
        AA;
    }
    
    public enum VertexMode
    {
        TRIANGLES, 
        TRIANGLE_STRIP, 
        TRIANGLE_FAN;
    }
}
