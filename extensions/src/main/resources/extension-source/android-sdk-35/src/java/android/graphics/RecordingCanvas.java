package android.graphics;

import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

public final class RecordingCanvas extends Canvas
{
    RecordingCanvas() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDensity(final int density) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isHardwareAccelerated() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setBitmap(final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getMaximumBitmapWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getMaximumBitmapHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void enableZ() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void disableZ() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawRenderNode(@NonNull final RenderNode renderNode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawTextOnPath(@NonNull final char[] text, final int index, final int count, @NonNull final Path path, final float hOffset, final float vOffset, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawTextOnPath(@NonNull final String text, @NonNull final Path path, final float hOffset, final float vOffset, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void drawPosText(@NonNull final char[] text, final int index, final int count, @NonNull final float[] pos, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void drawPosText(@NonNull final String text, @NonNull final float[] pos, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawOval(final float left, final float top, final float right, final float bottom, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawOval(@NonNull final RectF oval, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawDoubleRoundRect(@NonNull final RectF outer, final float outerRx, final float outerRy, @NonNull final RectF inner, final float innerRx, final float innerRy, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawDoubleRoundRect(@NonNull final RectF outer, @NonNull final float[] outerRadii, @NonNull final RectF inner, @NonNull final float[] innerRadii, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPoint(final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPatch(@NonNull final NinePatch patch, @NonNull final Rect dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPatch(@NonNull final NinePatch patch, @NonNull final RectF dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawBitmap(@NonNull final Bitmap bitmap, final float left, final float top, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawBitmap(@NonNull final Bitmap bitmap, @NonNull final Matrix matrix, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawBitmap(@NonNull final Bitmap bitmap, @Nullable final Rect src, @NonNull final Rect dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawBitmap(@NonNull final Bitmap bitmap, @Nullable final Rect src, @NonNull final RectF dst, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void drawBitmap(@NonNull final int[] colors, final int offset, final int stride, final float x, final float y, final int width, final int height, final boolean hasAlpha, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final void drawBitmap(@NonNull final int[] colors, final int offset, final int stride, final int x, final int y, final int width, final int height, final boolean hasAlpha, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawColor(final int color, @NonNull final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawColor(final int color, @NonNull final BlendMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawColor(final long color, @NonNull final BlendMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPoints(final float[] pts, final int offset, final int count, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPoints(@NonNull final float[] pts, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRoundRect(final float left, final float top, final float right, final float bottom, final float rx, final float ry, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRoundRect(@NonNull final RectF rect, final float rx, final float ry, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPaint(@NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawBitmapMesh(@NonNull final Bitmap bitmap, final int meshWidth, final int meshHeight, @NonNull final float[] verts, final int vertOffset, @Nullable final int[] colors, final int colorOffset, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawTextRun(@NonNull final char[] text, final int index, final int count, final int contextIndex, final int contextCount, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawTextRun(@NonNull final CharSequence text, final int start, final int end, final int contextStart, final int contextEnd, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawTextRun(@NonNull final MeasuredText measuredText, final int start, final int end, final int contextStart, final int contextEnd, final float x, final float y, final boolean isRtl, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawMesh(@NonNull final Mesh mesh, @Nullable final BlendMode blendMode, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawCircle(final float cx, final float cy, final float radius, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawText(@NonNull final char[] text, final int index, final int count, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawText(@NonNull final CharSequence text, final int start, final int end, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawText(@NonNull final String text, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawText(@NonNull final String text, final int start, final int end, final float x, final float y, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawArc(final float left, final float top, final float right, final float bottom, final float startAngle, final float sweepAngle, final boolean useCenter, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawArc(@NonNull final RectF oval, final float startAngle, final float sweepAngle, final boolean useCenter, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawLine(final float startX, final float startY, final float stopX, final float stopY, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawVertices(@NonNull final VertexMode mode, final int vertexCount, @NonNull final float[] verts, final int vertOffset, @Nullable final float[] texs, final int texOffset, @Nullable final int[] colors, final int colorOffset, @Nullable final short[] indices, final int indexOffset, final int indexCount, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRGB(final int r, final int g, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawLines(@NonNull final float[] pts, final int offset, final int count, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawLines(@NonNull final float[] pts, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    public void drawRegion(@NonNull final Region region, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPicture(@NonNull final Picture picture) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPicture(@NonNull final Picture picture, @NonNull final Rect dst) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPicture(@NonNull final Picture picture, @NonNull final RectF dst) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawGlyphs(@NonNull final int[] glyphIds, final int glyphIdOffset, @NonNull final float[] positions, final int positionOffset, final int glyphCount, @NonNull final Font font, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawARGB(final int a, final int r, final int g, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawPath(@NonNull final Path path, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRect(final float left, final float top, final float right, final float bottom, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRect(@NonNull final Rect r, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void drawRect(@NonNull final RectF rect, @NonNull final Paint paint) {
        throw new RuntimeException("Stub!");
    }
}
