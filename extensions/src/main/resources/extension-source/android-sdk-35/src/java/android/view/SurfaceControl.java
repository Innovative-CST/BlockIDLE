package android.view;

import java.util.concurrent.Executor;
import android.graphics.Region;
import java.util.function.Consumer;
import android.hardware.SyncFence;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;
import java.io.Closeable;
import android.os.Parcel;
import android.os.Parcelable;

public final class SurfaceControl implements Parcelable
{
    public static final int BUFFER_TRANSFORM_IDENTITY = 0;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = 1;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = 2;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = 3;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = 7;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = 4;
    @NonNull
    public static final Creator<SurfaceControl> CREATOR;
    
    SurfaceControl() {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValid() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SurfaceControl build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBufferSize(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFormat(final int format) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOpaque(final boolean opaque) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHidden(final boolean hidden) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setParent(@Nullable final SurfaceControl parent) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Transaction implements Closeable, Parcelable
    {
        @NonNull
        public static final Creator<Transaction> CREATOR;
        
        public Transaction() {
            throw new RuntimeException("Stub!");
        }
        
        public void apply() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setVisibility(@NonNull final SurfaceControl sc, final boolean visible) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setPosition(@NonNull final SurfaceControl sc, final float x, final float y) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setScale(@NonNull final SurfaceControl sc, final float scaleX, final float scaleY) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setBufferSize(@NonNull final SurfaceControl sc, final int w, final int h) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setLayer(@NonNull final SurfaceControl sc, final int z) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setAlpha(@NonNull final SurfaceControl sc, final float alpha) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Transaction setGeometry(@NonNull final SurfaceControl sc, @Nullable final Rect sourceCrop, @Nullable final Rect destFrame, final int orientation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setCrop(@NonNull final SurfaceControl sc, @Nullable final Rect crop) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction reparent(@NonNull final SurfaceControl sc, @Nullable final SurfaceControl newParent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setOpaque(@NonNull final SurfaceControl sc, final boolean isOpaque) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setFrameRate(@NonNull final SurfaceControl sc, final float frameRate, final int compatibility) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setFrameRate(@NonNull final SurfaceControl sc, final float frameRate, final int compatibility, final int changeFrameRateStrategy) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction clearFrameRate(@NonNull final SurfaceControl sc) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setBuffer(@NonNull final SurfaceControl sc, @Nullable final HardwareBuffer buffer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setBuffer(@NonNull final SurfaceControl sc, @Nullable final HardwareBuffer buffer, @Nullable final SyncFence fence) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setBuffer(@NonNull final SurfaceControl sc, @Nullable final HardwareBuffer buffer, @Nullable final SyncFence fence, @Nullable final Consumer<SyncFence> releaseCallback) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setBufferTransform(@NonNull final SurfaceControl sc, final int transform) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setDamageRegion(@NonNull final SurfaceControl sc, @Nullable final Region region) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setDataSpace(@NonNull final SurfaceControl sc, final int dataspace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setExtendedRangeBrightness(@NonNull final SurfaceControl sc, final float currentBufferRatio, final float desiredRatio) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setDesiredHdrHeadroom(@NonNull final SurfaceControl sc, final float desiredRatio) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction merge(@NonNull final Transaction other) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setFrameTimeline(final long vsyncId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction addTransactionCommittedListener(@NonNull final Executor executor, @NonNull final TransactionCommittedListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction addTransactionCompletedListener(@NonNull final Executor executor, @NonNull final Consumer<TransactionStats> listener) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Transaction setTrustedPresentationCallback(@NonNull final SurfaceControl sc, @NonNull final TrustedPresentationThresholds thresholds, @NonNull final Executor executor, @NonNull final Consumer<Boolean> listener) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Transaction clearTrustedPresentationCallback(@NonNull final SurfaceControl sc) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Transaction setDesiredPresentTimeNanos(final long desiredPresentTimeNanos) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public static final class TransactionStats
    {
        TransactionStats() {
            throw new RuntimeException("Stub!");
        }
        
        public long getLatchTimeNanos() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SyncFence getPresentFence() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static final class TrustedPresentationThresholds
    {
        @Deprecated
        public TrustedPresentationThresholds(final float minAlpha, final float minFractionRendered, final int stabilityRequirementMs) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface TransactionCommittedListener
    {
        void onTransactionCommitted();
    }
}
