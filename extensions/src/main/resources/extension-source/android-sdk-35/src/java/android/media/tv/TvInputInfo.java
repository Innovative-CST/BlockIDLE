package android.media.tv;

import android.content.ComponentName;
import android.os.Parcel;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;

public final class TvInputInfo implements Parcelable
{
    @NonNull
    public static final Creator<TvInputInfo> CREATOR;
    public static final String EXTRA_INPUT_ID = "android.media.tv.extra.INPUT_ID";
    public static final int TYPE_COMPONENT = 1004;
    public static final int TYPE_COMPOSITE = 1001;
    public static final int TYPE_DISPLAY_PORT = 1008;
    public static final int TYPE_DVI = 1006;
    public static final int TYPE_HDMI = 1007;
    public static final int TYPE_OTHER = 1000;
    public static final int TYPE_SCART = 1003;
    public static final int TYPE_SVIDEO = 1002;
    public static final int TYPE_TUNER = 0;
    public static final int TYPE_VGA = 1005;
    
    TvInputInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getParentId() {
        throw new RuntimeException("Stub!");
    }
    
    public ServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public Intent createSetupIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Intent createSettingsIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTunerCount() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canPauseRecording() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPassthroughInput() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHidden(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadLabel(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadCustomLabel(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable loadIcon(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final Context context, final ComponentName component) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTunerCount(final int tunerCount) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setCanRecord(final boolean canRecord) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCanPauseRecording(final boolean canPauseRecording) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtras(final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public TvInputInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
