package android.media;

import java.io.IOException;
import java.util.List;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;
import java.io.FileDescriptor;
import java.util.Map;

public class MediaMetadataRetriever implements AutoCloseable
{
    public static final int METADATA_KEY_ALBUM = 1;
    public static final int METADATA_KEY_ALBUMARTIST = 13;
    public static final int METADATA_KEY_ARTIST = 2;
    public static final int METADATA_KEY_AUTHOR = 3;
    public static final int METADATA_KEY_BITRATE = 20;
    public static final int METADATA_KEY_BITS_PER_SAMPLE = 39;
    public static final int METADATA_KEY_CAPTURE_FRAMERATE = 25;
    public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
    public static final int METADATA_KEY_COLOR_RANGE = 37;
    public static final int METADATA_KEY_COLOR_STANDARD = 35;
    public static final int METADATA_KEY_COLOR_TRANSFER = 36;
    public static final int METADATA_KEY_COMPILATION = 15;
    public static final int METADATA_KEY_COMPOSER = 4;
    public static final int METADATA_KEY_DATE = 5;
    public static final int METADATA_KEY_DISC_NUMBER = 14;
    public static final int METADATA_KEY_DURATION = 9;
    public static final int METADATA_KEY_EXIF_LENGTH = 34;
    public static final int METADATA_KEY_EXIF_OFFSET = 33;
    public static final int METADATA_KEY_GENRE = 6;
    public static final int METADATA_KEY_HAS_AUDIO = 16;
    public static final int METADATA_KEY_HAS_IMAGE = 26;
    public static final int METADATA_KEY_HAS_VIDEO = 17;
    public static final int METADATA_KEY_IMAGE_COUNT = 27;
    public static final int METADATA_KEY_IMAGE_HEIGHT = 30;
    public static final int METADATA_KEY_IMAGE_PRIMARY = 28;
    public static final int METADATA_KEY_IMAGE_ROTATION = 31;
    public static final int METADATA_KEY_IMAGE_WIDTH = 29;
    public static final int METADATA_KEY_LOCATION = 23;
    public static final int METADATA_KEY_MIMETYPE = 12;
    public static final int METADATA_KEY_NUM_TRACKS = 10;
    public static final int METADATA_KEY_SAMPLERATE = 38;
    public static final int METADATA_KEY_TITLE = 7;
    public static final int METADATA_KEY_VIDEO_FRAME_COUNT = 32;
    public static final int METADATA_KEY_VIDEO_HEIGHT = 19;
    public static final int METADATA_KEY_VIDEO_ROTATION = 24;
    public static final int METADATA_KEY_VIDEO_WIDTH = 18;
    public static final int METADATA_KEY_WRITER = 11;
    public static final int METADATA_KEY_XMP_LENGTH = 42;
    public static final int METADATA_KEY_XMP_OFFSET = 41;
    public static final int METADATA_KEY_YEAR = 8;
    public static final int OPTION_CLOSEST = 3;
    public static final int OPTION_CLOSEST_SYNC = 2;
    public static final int OPTION_NEXT_SYNC = 1;
    public static final int OPTION_PREVIOUS_SYNC = 0;
    
    public MediaMetadataRetriever() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final String path) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final String uri, final Map<String, String> headers) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final FileDescriptor fd, final long offset, final long length) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final FileDescriptor fd) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final Context context, final Uri uri) throws IllegalArgumentException, SecurityException {
        throw new RuntimeException("Stub!");
    }
    
    public void setDataSource(final MediaDataSource dataSource) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String extractMetadata(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtTime(final long timeUs, final int option) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtTime(final long timeUs, final int option, @NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getScaledFrameAtTime(final long timeUs, final int option, final int dstWidth, final int dstHeight) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getScaledFrameAtTime(final long timeUs, final int option, final int dstWidth, final int dstHeight, @NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtTime(final long timeUs) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtIndex(final int frameIndex, @NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getFrameAtIndex(final int frameIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Bitmap> getFramesAtIndex(final int frameIndex, final int numFrames, @NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Bitmap> getFramesAtIndex(final int frameIndex, final int numFrames) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getImageAtIndex(final int imageIndex, @NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getImageAtIndex(final int imageIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getPrimaryImage(@NonNull final BitmapParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getPrimaryImage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public byte[] getEmbeddedPicture() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public native void release() throws IOException;
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static final class BitmapParams
    {
        public BitmapParams() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPreferredConfig(@NonNull final Bitmap.Config config) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bitmap.Config getPreferredConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bitmap.Config getActualConfig() {
            throw new RuntimeException("Stub!");
        }
    }
}
