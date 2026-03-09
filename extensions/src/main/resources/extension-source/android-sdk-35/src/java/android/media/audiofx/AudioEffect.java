package android.media.audiofx;

import java.util.UUID;

public class AudioEffect
{
    public static final String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
    public static final String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
    public static final String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
    public static final int ALREADY_EXISTS = -2;
    public static final int CONTENT_TYPE_GAME = 2;
    public static final int CONTENT_TYPE_MOVIE = 1;
    public static final int CONTENT_TYPE_MUSIC = 0;
    public static final int CONTENT_TYPE_VOICE = 3;
    public static final String EFFECT_AUXILIARY = "Auxiliary";
    public static final String EFFECT_INSERT = "Insert";
    public static final String EFFECT_POST_PROCESSING = "Post Processing";
    public static final String EFFECT_PRE_PROCESSING = "Pre Processing";
    public static final UUID EFFECT_TYPE_AEC;
    public static final UUID EFFECT_TYPE_AGC;
    public static final UUID EFFECT_TYPE_BASS_BOOST;
    public static final UUID EFFECT_TYPE_DYNAMICS_PROCESSING;
    public static final UUID EFFECT_TYPE_ENV_REVERB;
    public static final UUID EFFECT_TYPE_EQUALIZER;
    @NonNull
    public static final UUID EFFECT_TYPE_HAPTIC_GENERATOR;
    public static final UUID EFFECT_TYPE_LOUDNESS_ENHANCER;
    public static final UUID EFFECT_TYPE_NS;
    public static final UUID EFFECT_TYPE_PRESET_REVERB;
    public static final UUID EFFECT_TYPE_VIRTUALIZER;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -4;
    public static final int ERROR_DEAD_OBJECT = -7;
    public static final int ERROR_INVALID_OPERATION = -5;
    public static final int ERROR_NO_INIT = -3;
    public static final int ERROR_NO_MEMORY = -6;
    public static final String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
    public static final String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
    public static final String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
    public static final int SUCCESS = 0;
    
    AudioEffect() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public Descriptor getDescriptor() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public static Descriptor[] queryEffects() {
        throw new RuntimeException("Stub!");
    }
    
    public int setEnabled(final boolean enabled) throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getEnabled() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasControl() throws IllegalStateException {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnableStatusListener(final OnEnableStatusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setControlStatusListener(final OnControlStatusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        EFFECT_TYPE_AEC = null;
        EFFECT_TYPE_AGC = null;
        EFFECT_TYPE_BASS_BOOST = null;
        EFFECT_TYPE_DYNAMICS_PROCESSING = null;
        EFFECT_TYPE_ENV_REVERB = null;
        EFFECT_TYPE_EQUALIZER = null;
        EFFECT_TYPE_HAPTIC_GENERATOR = null;
        EFFECT_TYPE_LOUDNESS_ENHANCER = null;
        EFFECT_TYPE_NS = null;
        EFFECT_TYPE_PRESET_REVERB = null;
        EFFECT_TYPE_VIRTUALIZER = null;
    }
    
    public static class Descriptor
    {
        public String connectMode;
        public String implementor;
        public String name;
        public UUID type;
        public UUID uuid;
        
        public Descriptor() {
            throw new RuntimeException("Stub!");
        }
        
        public Descriptor(final String type, final String uuid, final String connectMode, final String name, final String implementor) {
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
    }
    
    public interface OnEnableStatusChangeListener
    {
        void onEnableStatusChange(final AudioEffect p0, final boolean p1);
    }
    
    public interface OnControlStatusChangeListener
    {
        void onControlStatusChange(final AudioEffect p0, final boolean p1);
    }
}
