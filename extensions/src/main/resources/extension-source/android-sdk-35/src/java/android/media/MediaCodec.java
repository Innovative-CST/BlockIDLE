package android.media;

import java.util.Set;
import java.util.List;
import android.os.Handler;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.nio.ByteBuffer;
import android.hardware.HardwareBuffer;
import java.util.ArrayDeque;
import android.view.Surface;
import java.io.IOException;

public final class MediaCodec
{
    public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
    public static final int BUFFER_FLAG_DECODE_ONLY = 32;
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
    @Deprecated
    public static final int BUFFER_FLAG_SYNC_FRAME = 1;
    public static final int CONFIGURE_FLAG_DETACHED_SURFACE = 8;
    public static final int CONFIGURE_FLAG_ENCODE = 1;
    public static final int CONFIGURE_FLAG_USE_BLOCK_MODEL = 2;
    public static final int CONFIGURE_FLAG_USE_CRYPTO_ASYNC = 4;
    public static final int CRYPTO_MODE_AES_CBC = 2;
    public static final int CRYPTO_MODE_AES_CTR = 1;
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    @Deprecated
    public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
    public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
    public static final int INFO_TRY_AGAIN_LATER = -1;
    public static final String PARAMETER_KEY_HDR10_PLUS_INFO = "hdr10-plus-info";
    public static final String PARAMETER_KEY_LOW_LATENCY = "low-latency";
    public static final String PARAMETER_KEY_OFFSET_TIME = "time-offset-us";
    public static final String PARAMETER_KEY_QP_OFFSET_MAP = "qp-offset-map";
    public static final String PARAMETER_KEY_QP_OFFSET_RECTS = "qp-offset-rects";
    public static final String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
    public static final String PARAMETER_KEY_SUSPEND = "drop-input-frames";
    public static final String PARAMETER_KEY_SUSPEND_TIME = "drop-start-time-us";
    public static final String PARAMETER_KEY_TUNNEL_PEEK = "tunnel-peek";
    public static final String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    
    MediaCodec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaCodec createDecoderByType(@NonNull final String type) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaCodec createEncoderByType(@NonNull final String type) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MediaCodec createByCodecName(@NonNull final String name) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public void configure(@Nullable final MediaFormat format, @Nullable final Surface surface, @Nullable final MediaCrypto crypto, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void configure(@Nullable final MediaFormat format, @Nullable final Surface surface, final int flags, @Nullable final MediaDescrambler descrambler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutputSurface(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    public void detachOutputSurface() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Surface createPersistentInputSurface() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputSurface(@NonNull final Surface surface) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native Surface createInputSurface();
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    public void flush() {
        throw new RuntimeException("Stub!");
    }
    
    public void queueInputBuffer(final int index, final int offset, final int size, final long presentationTimeUs, final int flags) throws CryptoException {
        throw new RuntimeException("Stub!");
    }
    
    public void queueInputBuffers(final int index, @NonNull final ArrayDeque<BufferInfo> bufferInfos) {
        throw new RuntimeException("Stub!");
    }
    
    public void queueSecureInputBuffer(final int index, final int offset, @NonNull final CryptoInfo info, final long presentationTimeUs, final int flags) throws CryptoException {
        throw new RuntimeException("Stub!");
    }
    
    public void queueSecureInputBuffers(final int index, @NonNull final ArrayDeque<BufferInfo> bufferInfos, @NonNull final ArrayDeque<CryptoInfo> cryptoInfos) {
        throw new RuntimeException("Stub!");
    }
    
    public int dequeueInputBuffer(final long timeoutUs) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Image mapHardwareBuffer(@NonNull final HardwareBuffer hardwareBuffer) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public QueueRequest getQueueRequest(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int dequeueOutputBuffer(@NonNull final BufferInfo info, final long timeoutUs) {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseOutputBuffer(final int index, final boolean render) {
        throw new RuntimeException("Stub!");
    }
    
    public void releaseOutputBuffer(final int index, final long renderTimestampNs) {
        throw new RuntimeException("Stub!");
    }
    
    public native void signalEndOfInputStream();
    
    @NonNull
    public MediaFormat getOutputFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaFormat getInputFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaFormat getOutputFormat(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public ByteBuffer[] getInputBuffers() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public ByteBuffer[] getOutputBuffers() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ByteBuffer getInputBuffer(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Image getInputImage(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ByteBuffer getOutputBuffer(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Image getOutputImage(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public OutputFrame getOutputFrame(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public native void setVideoScalingMode(final int p0);
    
    public void setAudioPresentation(@NonNull final AudioPresentation presentation) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public native String getCanonicalName();
    
    public PersistableBundle getMetrics() {
        throw new RuntimeException("Stub!");
    }
    
    public void setParameters(@Nullable final Bundle params) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final Callback cb, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCallback(@Nullable final Callback cb) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnFirstTunnelFrameReadyListener(@Nullable final Handler handler, @Nullable final OnFirstTunnelFrameReadyListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnFrameRenderedListener(@Nullable final OnFrameRenderedListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSupportedVendorParameters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParameterDescriptor getParameterDescriptor(@NonNull final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void subscribeToVendorParameters(@NonNull final List<String> names) {
        throw new RuntimeException("Stub!");
    }
    
    public void unsubscribeFromVendorParameters(@NonNull final List<String> names) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public MediaCodecInfo getCodecInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class BufferInfo
    {
        public int flags;
        public int offset;
        public long presentationTimeUs;
        public int size;
        
        public BufferInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public void set(final int newOffset, final int newSize, final long newTimeUs, final int newFlags) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onInputBufferAvailable(@NonNull final MediaCodec p0, final int p1);
        
        public abstract void onOutputBufferAvailable(@NonNull final MediaCodec p0, final int p1, @NonNull final BufferInfo p2);
        
        public void onOutputBuffersAvailable(@NonNull final MediaCodec codec, final int index, @NonNull final ArrayDeque<BufferInfo> infos) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onError(@NonNull final MediaCodec p0, @NonNull final CodecException p1);
        
        public void onCryptoError(@NonNull final MediaCodec codec, @NonNull final CryptoException e) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onOutputFormatChanged(@NonNull final MediaCodec p0, @NonNull final MediaFormat p1);
    }
    
    public static final class CodecException extends IllegalStateException
    {
        public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
        public static final int ERROR_RECLAIMED = 1101;
        
        CodecException() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isTransient() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isRecoverable() {
            throw new RuntimeException("Stub!");
        }
        
        public int getErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDiagnosticInfo() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CryptoException extends RuntimeException implements MediaDrmThrowable
    {
        @Deprecated
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        @Deprecated
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        @Deprecated
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        @Deprecated
        public static final int ERROR_KEY_EXPIRED = 2;
        @Deprecated
        public static final int ERROR_LOST_STATE = 9;
        @Deprecated
        public static final int ERROR_NO_KEY = 1;
        @Deprecated
        public static final int ERROR_RESOURCE_BUSY = 3;
        @Deprecated
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        @Deprecated
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        
        public CryptoException(final int errorCode, @Nullable final String detailMessage) {
            throw new RuntimeException("Stub!");
        }
        
        public int getErrorCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CryptoInfo getCryptoInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getVendorError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getOemError() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getErrorContext() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CryptoInfo
    {
        public byte[] iv;
        public byte[] key;
        public int mode;
        public int[] numBytesOfClearData;
        public int[] numBytesOfEncryptedData;
        public int numSubSamples;
        
        public CryptoInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public void set(final int newNumSubSamples, @NonNull final int[] newNumBytesOfClearData, @NonNull final int[] newNumBytesOfEncryptedData, @NonNull final byte[] newKey, @NonNull final byte[] newIV, final int newMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Pattern getPattern() {
            throw new RuntimeException("Stub!");
        }
        
        public void setPattern(final Pattern newPattern) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Pattern
        {
            public Pattern(final int blocksToEncrypt, final int blocksToSkip) {
                throw new RuntimeException("Stub!");
            }
            
            public void set(final int blocksToEncrypt, final int blocksToSkip) {
                throw new RuntimeException("Stub!");
            }
            
            public int getSkipBlocks() {
                throw new RuntimeException("Stub!");
            }
            
            public int getEncryptBlocks() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public class IncompatibleWithBlockModelException extends RuntimeException
    {
        IncompatibleWithBlockModelException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public class InvalidBufferFlagsException extends RuntimeException
    {
        InvalidBufferFlagsException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class LinearBlock
    {
        LinearBlock() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isMappable() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ByteBuffer map() {
            throw new RuntimeException("Stub!");
        }
        
        public void recycle() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected void finalize() {
            throw new RuntimeException("Stub!");
        }
        
        public static boolean isCodecCopyFreeCompatible(@NonNull final String[] codecNames) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public static LinearBlock obtain(final int capacity, @NonNull final String[] codecNames) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class MetricsConstants
    {
        public static final String CODEC = "android.media.mediacodec.codec";
        public static final String ENCODER = "android.media.mediacodec.encoder";
        public static final String HEIGHT = "android.media.mediacodec.height";
        public static final String MIME_TYPE = "android.media.mediacodec.mime";
        public static final String MODE = "android.media.mediacodec.mode";
        public static final String MODE_AUDIO = "audio";
        public static final String MODE_VIDEO = "video";
        public static final String ROTATION = "android.media.mediacodec.rotation";
        public static final String SECURE = "android.media.mediacodec.secure";
        public static final String WIDTH = "android.media.mediacodec.width";
        
        MetricsConstants() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class OutputFrame
    {
        OutputFrame() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public LinearBlock getLinearBlock() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public HardwareBuffer getHardwareBuffer() {
            throw new RuntimeException("Stub!");
        }
        
        public long getPresentationTimeUs() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ArrayDeque<BufferInfo> getBufferInfos() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaFormat getFormat() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Set<String> getChangedKeys() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ParameterDescriptor
    {
        ParameterDescriptor() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class QueueRequest
    {
        QueueRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setLinearBlock(@NonNull final LinearBlock block, final int offset, final int size) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setMultiFrameLinearBlock(@NonNull final LinearBlock block, @NonNull final ArrayDeque<BufferInfo> infos) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setEncryptedLinearBlock(@NonNull final LinearBlock block, final int offset, final int size, @NonNull final CryptoInfo cryptoInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setMultiFrameEncryptedLinearBlock(@NonNull final LinearBlock block, @NonNull final ArrayDeque<BufferInfo> bufferInfos, @NonNull final ArrayDeque<CryptoInfo> cryptoInfos) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setHardwareBuffer(@NonNull final HardwareBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setPresentationTimeUs(final long presentationTimeUs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setIntegerParameter(@NonNull final String key, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setLongParameter(@NonNull final String key, final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setFloatParameter(@NonNull final String key, final float value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setByteBufferParameter(@NonNull final String key, @NonNull final ByteBuffer value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public QueueRequest setStringParameter(@NonNull final String key, @NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public void queue() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnFrameRenderedListener
    {
        void onFrameRendered(@NonNull final MediaCodec p0, final long p1, final long p2);
    }
    
    public interface OnFirstTunnelFrameReadyListener
    {
        void onFirstTunnelFrameReady(@NonNull final MediaCodec p0);
    }
}
