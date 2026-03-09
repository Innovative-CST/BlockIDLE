package android.app;

import android.os.Parcel;
import android.graphics.Rect;
import java.util.List;
import android.util.Rational;
import android.os.Parcelable;

public final class PictureInPictureParams implements Parcelable
{
    @NonNull
    public static final Creator<PictureInPictureParams> CREATOR;
    
    PictureInPictureParams() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rational getAspectRatio() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rational getExpandedAspectRatio() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RemoteAction> getActions() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteAction getCloseAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getSourceRectHint() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoEnterEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSeamlessResizeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getSubtitle() {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
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
        
        public Builder(@NonNull final PictureInPictureParams original) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setAspectRatio(final Rational aspectRatio) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExpandedAspectRatio(@Nullable final Rational expandedAspectRatio) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setActions(final List<RemoteAction> actions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCloseAction(@Nullable final RemoteAction action) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSourceRectHint(final Rect launchBounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAutoEnterEnabled(final boolean autoEnterEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSeamlessResizeEnabled(final boolean seamlessResizeEnabled) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTitle(@Nullable final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSubtitle(@Nullable final CharSequence subtitle) {
            throw new RuntimeException("Stub!");
        }
        
        public PictureInPictureParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
