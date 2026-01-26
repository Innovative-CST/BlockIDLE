package android.renderscript;

import android.content.res.Resources;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;

@Deprecated
public class Allocation extends BaseObj
{
    @Deprecated
    public static final int USAGE_GRAPHICS_CONSTANTS = 8;
    @Deprecated
    public static final int USAGE_GRAPHICS_RENDER_TARGET = 16;
    @Deprecated
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    @Deprecated
    public static final int USAGE_GRAPHICS_VERTEX = 4;
    @Deprecated
    public static final int USAGE_IO_INPUT = 32;
    @Deprecated
    public static final int USAGE_IO_OUTPUT = 64;
    @Deprecated
    public static final int USAGE_SCRIPT = 1;
    @Deprecated
    public static final int USAGE_SHARED = 128;
    
    Allocation() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Element getElement() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getUsage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAutoPadding(final boolean useAutoPadding) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getBytesSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Type getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void syncAll(final int srcLocation) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ioSend() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void ioReceive() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final BaseObj[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFromUnchecked(final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFromUnchecked(final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFromUnchecked(final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFromUnchecked(final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFromUnchecked(final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final Bitmap b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyFrom(final Allocation a) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFromFieldPacker(final int xoff, final FieldPacker fp) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFromFieldPacker(final int xoff, final int component_number, final FieldPacker fp) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFromFieldPacker(final int xoff, final int yoff, final int zoff, final int component_number, final FieldPacker fp) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void generateMipmaps() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFromUnchecked(final int off, final int count, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFromUnchecked(final int off, final int count, final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFromUnchecked(final int off, final int count, final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFromUnchecked(final int off, final int count, final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFromUnchecked(final int off, final int count, final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeFrom(final int off, final int count, final Allocation data, final int dataOff) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final short[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final int[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final float[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final int w, final int h, final Allocation data, final int dataXoff, final int dataYoff) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeFrom(final int xoff, final int yoff, final Bitmap data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy3DRangeFrom(final int xoff, final int yoff, final int zoff, final int w, final int h, final int d, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy3DRangeFrom(final int xoff, final int yoff, final int zoff, final int w, final int h, final int d, final Allocation data, final int dataXoff, final int dataYoff, final int dataZoff) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final Bitmap b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copyTo(final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public synchronized void resize(final int dimX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeToUnchecked(final int off, final int count, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeToUnchecked(final int off, final int count, final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeToUnchecked(final int off, final int count, final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeToUnchecked(final int off, final int count, final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeToUnchecked(final int off, final int count, final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeTo(final int off, final int count, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeTo(final int off, final int count, final int[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeTo(final int off, final int count, final short[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeTo(final int off, final int count, final byte[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy1DRangeTo(final int off, final int count, final float[] d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeTo(final int xoff, final int yoff, final int w, final int h, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeTo(final int xoff, final int yoff, final int w, final int h, final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeTo(final int xoff, final int yoff, final int w, final int h, final short[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeTo(final int xoff, final int yoff, final int w, final int h, final int[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy2DRangeTo(final int xoff, final int yoff, final int w, final int h, final float[] data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void copy3DRangeTo(final int xoff, final int yoff, final int zoff, final int w, final int h, final int d, final Object array) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createTyped(final RenderScript rs, final Type type, final MipmapControl mips, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createTyped(final RenderScript rs, final Type type, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createTyped(final RenderScript rs, final Type type) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createSized(final RenderScript rs, final Element e, final int count, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createSized(final RenderScript rs, final Element e, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createFromBitmap(final RenderScript rs, final Bitmap b, final MipmapControl mips, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ByteBuffer getByteBuffer() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation[] createAllocations(final RenderScript rs, final Type t, final int usage, final int numAlloc) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getStride() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSurface(final Surface sur) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createFromBitmap(final RenderScript rs, final Bitmap b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createCubemapFromBitmap(final RenderScript rs, final Bitmap b, final MipmapControl mips, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createCubemapFromBitmap(final RenderScript rs, final Bitmap b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createCubemapFromCubeFaces(final RenderScript rs, final Bitmap xpos, final Bitmap xneg, final Bitmap ypos, final Bitmap yneg, final Bitmap zpos, final Bitmap zneg, final MipmapControl mips, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createCubemapFromCubeFaces(final RenderScript rs, final Bitmap xpos, final Bitmap xneg, final Bitmap ypos, final Bitmap yneg, final Bitmap zpos, final Bitmap zneg) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createFromBitmapResource(final RenderScript rs, final Resources res, final int id, final MipmapControl mips, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createFromBitmapResource(final RenderScript rs, final Resources res, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Allocation createFromString(final RenderScript rs, final String str, final int usage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnBufferAvailableListener(final OnBufferAvailableListener callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public enum MipmapControl
    {
        @Deprecated
        MIPMAP_NONE, 
        @Deprecated
        MIPMAP_FULL, 
        @Deprecated
        MIPMAP_ON_SYNC_TO_TEXTURE;
    }
    
    @Deprecated
    public interface OnBufferAvailableListener
    {
        @Deprecated
        void onBufferAvailable(final Allocation p0);
    }
}
