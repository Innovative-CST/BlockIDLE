package android.service.controls;

import android.os.Parcel;
import android.service.controls.templates.ControlTemplate;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.app.PendingIntent;
import android.os.Parcelable;

public final class Control implements Parcelable
{
    @NonNull
    public static final Creator<Control> CREATOR;
    public static final int STATUS_DISABLED = 4;
    public static final int STATUS_ERROR = 3;
    public static final int STATUS_NOT_FOUND = 2;
    public static final int STATUS_OK = 1;
    public static final int STATUS_UNKNOWN = 0;
    
    Control() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getControlId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDeviceType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getSubtitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getStructure() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getZone() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PendingIntent getAppIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getCustomIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getCustomColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ControlTemplate getControlTemplate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getStatusText() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAuthRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class StatefulBuilder
    {
        public StatefulBuilder(@NonNull final String controlId, @NonNull final PendingIntent appIntent) {
            throw new RuntimeException("Stub!");
        }
        
        public StatefulBuilder(@NonNull final Control control) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setControlId(@NonNull final String controlId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setDeviceType(final int deviceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setTitle(@NonNull final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setSubtitle(@NonNull final CharSequence subtitle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setStructure(@Nullable final CharSequence structure) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setZone(@Nullable final CharSequence zone) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setAppIntent(@NonNull final PendingIntent appIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setCustomIcon(@Nullable final Icon customIcon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setCustomColor(@Nullable final ColorStateList customColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setStatus(final int status) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setControlTemplate(@NonNull final ControlTemplate controlTemplate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setStatusText(@NonNull final CharSequence statusText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatefulBuilder setAuthRequired(final boolean authRequired) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Control build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class StatelessBuilder
    {
        public StatelessBuilder(@NonNull final String controlId, @NonNull final PendingIntent appIntent) {
            throw new RuntimeException("Stub!");
        }
        
        public StatelessBuilder(@NonNull final Control control) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setControlId(@NonNull final String controlId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setDeviceType(final int deviceType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setTitle(@NonNull final CharSequence title) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setSubtitle(@NonNull final CharSequence subtitle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setStructure(@Nullable final CharSequence structure) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setZone(@Nullable final CharSequence zone) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setAppIntent(@NonNull final PendingIntent appIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setCustomIcon(@Nullable final Icon customIcon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public StatelessBuilder setCustomColor(@Nullable final ColorStateList customColor) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Control build() {
            throw new RuntimeException("Stub!");
        }
    }
}
