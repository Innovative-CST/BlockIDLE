package android.view.textclassifier;

import android.os.Parcel;
import android.os.Parcelable;

public final class TextClassificationContext implements Parcelable
{
    @NonNull
    public static final Creator<TextClassificationContext> CREATOR;
    
    TextClassificationContext() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getWidgetType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getWidgetVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String packageName, @NonNull final String widgetType) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setWidgetVersion(@Nullable final String widgetVersion) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextClassificationContext build() {
            throw new RuntimeException("Stub!");
        }
    }
}
