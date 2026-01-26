package android.view.accessibility;

import android.graphics.Typeface;
import java.util.Locale;

public class CaptioningManager
{
    CaptioningManager() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public final float getFontScale() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CaptionStyle getUserStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isSystemAudioCaptioningEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isSystemAudioCaptioningUiEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void addCaptioningChangeListener(@NonNull final CaptioningChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeCaptioningChangeListener(@NonNull final CaptioningChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCallCaptioningEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class CaptionStyle
    {
        public static final int EDGE_TYPE_DEPRESSED = 4;
        public static final int EDGE_TYPE_DROP_SHADOW = 2;
        public static final int EDGE_TYPE_NONE = 0;
        public static final int EDGE_TYPE_OUTLINE = 1;
        public static final int EDGE_TYPE_RAISED = 3;
        public static final int EDGE_TYPE_UNSPECIFIED = -1;
        public final int backgroundColor;
        public final int edgeColor;
        public final int edgeType;
        public final int foregroundColor;
        public final int windowColor;
        
        CaptionStyle() {
            this.backgroundColor = 0;
            this.edgeColor = 0;
            this.edgeType = 0;
            this.foregroundColor = 0;
            this.windowColor = 0;
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasBackgroundColor() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasForegroundColor() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasEdgeType() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasEdgeColor() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasWindowColor() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Typeface getTypeface() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class CaptioningChangeListener
    {
        public CaptioningChangeListener() {
            throw new RuntimeException("Stub!");
        }
        
        public void onEnabledChanged(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void onUserStyleChanged(@NonNull final CaptionStyle userStyle) {
            throw new RuntimeException("Stub!");
        }
        
        public void onLocaleChanged(@Nullable final Locale locale) {
            throw new RuntimeException("Stub!");
        }
        
        public void onFontScaleChanged(final float fontScale) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSystemAudioCaptioningChanged(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
        
        public void onSystemAudioCaptioningUiChanged(final boolean enabled) {
            throw new RuntimeException("Stub!");
        }
    }
}
