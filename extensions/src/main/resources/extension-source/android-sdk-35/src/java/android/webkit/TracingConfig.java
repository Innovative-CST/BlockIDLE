package android.webkit;

import java.util.Collection;
import java.util.List;

public class TracingConfig
{
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    
    TracingConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPredefinedCategories() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getCustomIncludedCategories() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTracingMode() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public TracingConfig build() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCategories(final int... predefinedCategories) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCategories(final String... categories) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addCategories(final Collection<String> categories) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setTracingMode(final int tracingMode) {
            throw new RuntimeException("Stub!");
        }
    }
}
