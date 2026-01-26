package android.media.metrics;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class PlaybackStateEvent extends Event implements Parcelable
{
    @NonNull
    public static final Creator<PlaybackStateEvent> CREATOR;
    public static final int STATE_ABANDONED = 15;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_ENDED = 11;
    public static final int STATE_FAILED = 13;
    public static final int STATE_INTERRUPTED_BY_AD = 14;
    public static final int STATE_JOINING_BACKGROUND = 1;
    public static final int STATE_JOINING_FOREGROUND = 2;
    public static final int STATE_NOT_STARTED = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PAUSED_BUFFERING = 7;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_SEEKING = 5;
    public static final int STATE_STOPPED = 12;
    public static final int STATE_SUPPRESSED = 9;
    public static final int STATE_SUPPRESSED_BUFFERING = 10;
    
    PlaybackStateEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public long getTimeSinceCreatedMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Bundle getMetricsBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setState(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimeSinceCreatedMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetricsBundle(@NonNull final Bundle metricsBundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PlaybackStateEvent build() {
            throw new RuntimeException("Stub!");
        }
    }
}
