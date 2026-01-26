package android.view;

import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.graphics.Rect;
import android.os.Handler;
import android.graphics.Bitmap;

public final class PixelCopy
{
    public static final int ERROR_DESTINATION_INVALID = 5;
    public static final int ERROR_SOURCE_INVALID = 4;
    public static final int ERROR_SOURCE_NO_DATA = 3;
    public static final int ERROR_TIMEOUT = 2;
    public static final int ERROR_UNKNOWN = 1;
    public static final int SUCCESS = 0;
    
    PixelCopy() {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final SurfaceView source, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final SurfaceView source, @Nullable final Rect srcRect, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final Surface source, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final Surface source, @Nullable final Rect srcRect, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final Window source, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final Window source, @Nullable final Rect srcRect, @NonNull final Bitmap dest, @NonNull final OnPixelCopyFinishedListener listener, @NonNull final Handler listenerThread) {
        throw new RuntimeException("Stub!");
    }
    
    public static void request(@NonNull final Request request, @NonNull final Executor callbackExecutor, @NonNull final Consumer<Result> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Request
    {
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bitmap getDestinationBitmap() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Rect getSourceRect() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Builder ofWindow(@NonNull final Window source) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Builder ofWindow(@NonNull final View source) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Builder ofSurface(@NonNull final Surface source) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public static Builder ofSurface(@NonNull final SurfaceView source) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSourceRect(@Nullable final Rect srcRect) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDestinationBitmap(@Nullable final Bitmap destination) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Result
    {
        Result() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStatus() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bitmap getBitmap() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnPixelCopyFinishedListener
    {
        void onPixelCopyFinished(final int p0);
    }
}
