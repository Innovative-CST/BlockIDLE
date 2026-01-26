package android.media;

import org.xmlpull.v1.XmlPullParser;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class ApplicationMediaCapabilities implements Parcelable
{
    @NonNull
    public static final Creator<ApplicationMediaCapabilities> CREATOR;
    
    ApplicationMediaCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVideoMimeTypeSupported(@NonNull final String videoMime) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHdrTypeSupported(@NonNull final String hdrType) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFormatSpecified(@NonNull final String format) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSupportedVideoMimeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getUnsupportedVideoMimeTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getSupportedHdrTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getUnsupportedHdrTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ApplicationMediaCapabilities createFromXml(@NonNull final XmlPullParser xmlParser) {
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
        public ApplicationMediaCapabilities build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSupportedVideoMimeType(@NonNull final String codecMime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addUnsupportedVideoMimeType(@NonNull final String codecMime) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSupportedHdrType(@NonNull final String hdrType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addUnsupportedHdrType(@NonNull final String hdrType) {
            throw new RuntimeException("Stub!");
        }
    }
}
