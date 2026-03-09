package android.media;

import java.io.IOException;
import java.util.Set;
import java.util.List;
import android.os.Handler;
import android.app.PendingIntent;
import android.content.ComponentName;
import java.util.concurrent.Executor;
import android.view.KeyEvent;

public class AudioManager
{
    public static final String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
    public static final String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
    public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final String ACTION_MICROPHONE_MUTE_CHANGED = "android.media.action.MICROPHONE_MUTE_CHANGED";
    @Deprecated
    public static final String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
    public static final String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    public static final String ACTION_SPEAKERPHONE_STATE_CHANGED = "android.media.action.SPEAKERPHONE_STATE_CHANGED";
    public static final int ADJUST_LOWER = -1;
    public static final int ADJUST_MUTE = -100;
    public static final int ADJUST_RAISE = 1;
    public static final int ADJUST_SAME = 0;
    public static final int ADJUST_TOGGLE_MUTE = 101;
    public static final int ADJUST_UNMUTE = 100;
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_LOSS = -1;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
    public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
    public static final int AUDIOFOCUS_NONE = 0;
    public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
    public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
    public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
    public static final int AUDIO_SESSION_ID_GENERATE = 0;
    public static final int DIRECT_PLAYBACK_BITSTREAM_SUPPORTED = 4;
    public static final int DIRECT_PLAYBACK_NOT_SUPPORTED = 0;
    public static final int DIRECT_PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 3;
    public static final int DIRECT_PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final int ENCODED_SURROUND_OUTPUT_ALWAYS = 2;
    public static final int ENCODED_SURROUND_OUTPUT_AUTO = 0;
    public static final int ENCODED_SURROUND_OUTPUT_MANUAL = 3;
    public static final int ENCODED_SURROUND_OUTPUT_NEVER = 1;
    public static final int ENCODED_SURROUND_OUTPUT_UNKNOWN = -1;
    public static final int ERROR = -1;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
    public static final String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
    public static final String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
    public static final String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
    public static final String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
    public static final String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
    @Deprecated
    public static final String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
    @Deprecated
    public static final String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
    public static final int FLAG_ALLOW_RINGER_MODES = 2;
    public static final int FLAG_PLAY_SOUND = 4;
    public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int FLAG_SHOW_UI = 1;
    public static final int FLAG_VIBRATE = 16;
    public static final int FX_BACK = 10;
    public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
    public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
    public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
    public static final int FX_FOCUS_NAVIGATION_UP = 1;
    public static final int FX_KEYPRESS_DELETE = 7;
    public static final int FX_KEYPRESS_INVALID = 9;
    public static final int FX_KEYPRESS_RETURN = 8;
    public static final int FX_KEYPRESS_SPACEBAR = 6;
    public static final int FX_KEYPRESS_STANDARD = 5;
    public static final int FX_KEY_CLICK = 0;
    public static final int GET_DEVICES_ALL = 3;
    public static final int GET_DEVICES_INPUTS = 1;
    public static final int GET_DEVICES_OUTPUTS = 2;
    public static final int MODE_CALL_REDIRECT = 5;
    public static final int MODE_CALL_SCREENING = 4;
    public static final int MODE_COMMUNICATION_REDIRECT = 6;
    public static final int MODE_CURRENT = -1;
    public static final int MODE_INVALID = -2;
    public static final int MODE_IN_CALL = 2;
    public static final int MODE_IN_COMMUNICATION = 3;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_RINGTONE = 1;
    @Deprecated
    public static final int NUM_STREAMS = 5;
    public static final int PLAYBACK_OFFLOAD_GAPLESS_SUPPORTED = 2;
    public static final int PLAYBACK_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int PLAYBACK_OFFLOAD_SUPPORTED = 1;
    public static final String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
    public static final String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
    public static final String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = "android.media.property.SUPPORT_AUDIO_SOURCE_UNPROCESSED";
    public static final String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
    public static final String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
    public static final String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
    public static final int RINGER_MODE_NORMAL = 2;
    public static final int RINGER_MODE_SILENT = 0;
    public static final int RINGER_MODE_VIBRATE = 1;
    @Deprecated
    public static final int ROUTE_ALL = -1;
    @Deprecated
    public static final int ROUTE_BLUETOOTH = 4;
    @Deprecated
    public static final int ROUTE_BLUETOOTH_A2DP = 16;
    @Deprecated
    public static final int ROUTE_BLUETOOTH_SCO = 4;
    @Deprecated
    public static final int ROUTE_EARPIECE = 1;
    @Deprecated
    public static final int ROUTE_HEADSET = 8;
    @Deprecated
    public static final int ROUTE_SPEAKER = 2;
    public static final int SCO_AUDIO_STATE_CONNECTED = 1;
    public static final int SCO_AUDIO_STATE_CONNECTING = 2;
    public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
    public static final int SCO_AUDIO_STATE_ERROR = -1;
    public static final int STREAM_ACCESSIBILITY = 10;
    public static final int STREAM_ALARM = 4;
    public static final int STREAM_DTMF = 8;
    public static final int STREAM_MUSIC = 3;
    public static final int STREAM_NOTIFICATION = 5;
    public static final int STREAM_RING = 2;
    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_VOICE_CALL = 0;
    public static final int USE_DEFAULT_STREAM_TYPE = Integer.MIN_VALUE;
    @Deprecated
    public static final String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
    @Deprecated
    public static final int VIBRATE_SETTING_OFF = 0;
    @Deprecated
    public static final int VIBRATE_SETTING_ON = 1;
    @Deprecated
    public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
    @Deprecated
    public static final int VIBRATE_TYPE_NOTIFICATION = 1;
    @Deprecated
    public static final int VIBRATE_TYPE_RINGER = 0;
    
    AudioManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchMediaKeyEvent(final KeyEvent keyEvent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVolumeFixed() {
        throw new RuntimeException("Stub!");
    }
    
    public void adjustStreamVolume(final int streamType, final int direction, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void adjustVolume(final int direction, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void adjustSuggestedStreamVolume(final int direction, final int suggestedStreamType, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRingerMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRampingRingerEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamMaxVolume(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamMinVolume(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStreamVolume(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    public float getStreamVolumeDb(final int streamType, final int index, final int deviceType) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRingerMode(final int ringerMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStreamVolume(final int streamType, final int index, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeGroupIdForAttributes(@NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void adjustVolumeGroupVolume(final int groupId, final int direction, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVolumeGroupMuted(final int groupId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStreamSolo(final int streamType, final boolean state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setStreamMute(final int streamType, final boolean state) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStreamMute(final int streamType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldVibrate(final int vibrateType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getVibrateSetting(final int vibrateType) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVibrateSetting(final int vibrateType, final int vibrateSetting) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpeakerphoneOn(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSpeakerphoneOn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowedCapturePolicy(final int capturePolicy) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAllowedCapturePolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDirectPlaybackSupport(@NonNull final AudioFormat format, @NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isOffloadedPlaybackSupported(@NonNull final AudioFormat format, @NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static int getPlaybackOffloadSupport(@NonNull final AudioFormat format, @NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Spatializer getSpatializer() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBluetoothScoAvailableOffCall() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startBluetoothSco() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void stopBluetoothSco() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBluetoothScoOn(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBluetoothScoOn() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setBluetoothA2dpOn(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBluetoothA2dpOn() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWiredHeadsetOn(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isWiredHeadsetOn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMicrophoneMute(final boolean on) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMicrophoneMute() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnModeChangedListener(@NonNull final Executor executor, @NonNull final OnModeChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnModeChangedListener(@NonNull final OnModeChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCallScreeningModeSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRouting(final int mode, final int routes, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRouting(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMusicActive() {
        throw new RuntimeException("Stub!");
    }
    
    public int generateAudioSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setParameters(final String keyValuePairs) {
        throw new RuntimeException("Stub!");
    }
    
    public String getParameters(final String keys) {
        throw new RuntimeException("Stub!");
    }
    
    public void playSoundEffect(final int effectType) {
        throw new RuntimeException("Stub!");
    }
    
    public void playSoundEffect(final int effectType, final float volume) {
        throw new RuntimeException("Stub!");
    }
    
    public void loadSoundEffects() {
        throw new RuntimeException("Stub!");
    }
    
    public void unloadSoundEffects() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int requestAudioFocus(final OnAudioFocusChangeListener l, final int streamType, final int durationHint) {
        throw new RuntimeException("Stub!");
    }
    
    public int requestAudioFocus(@NonNull final AudioFocusRequest focusRequest) {
        throw new RuntimeException("Stub!");
    }
    
    public int abandonAudioFocusRequest(@NonNull final AudioFocusRequest focusRequest) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int abandonAudioFocus(final OnAudioFocusChangeListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerMediaButtonEventReceiver(final ComponentName eventReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerMediaButtonEventReceiver(final PendingIntent eventReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterMediaButtonEventReceiver(final ComponentName eventReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterMediaButtonEventReceiver(final PendingIntent eventReceiver) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerRemoteControlClient(final RemoteControlClient rcClient) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterRemoteControlClient(final RemoteControlClient rcClient) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerRemoteController(final RemoteController rctlr) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterRemoteController(final RemoteController rctlr) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAudioPlaybackCallback(@NonNull final AudioPlaybackCallback cb, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAudioPlaybackCallback(@NonNull final AudioPlaybackCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioPlaybackConfiguration> getActivePlaybackConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAudioRecordingCallback(@NonNull final AudioRecordingCallback cb, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAudioRecordingCallback(@NonNull final AudioRecordingCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioRecordingConfiguration> getActiveRecordingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioDeviceInfo> getAudioDevicesForAttributes(@NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public String getProperty(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getSupportedDeviceTypes(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public AudioDeviceInfo[] getDevices(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerAudioDeviceCallback(final AudioDeviceCallback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAudioDeviceCallback(final AudioDeviceCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public List<MicrophoneInfo> getMicrophones() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setEncodedSurroundMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEncodedSurroundMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setSurroundFormatEnabled(final int audioFormat, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSurroundFormatEnabled(final int audioFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isHapticPlaybackSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAudioHwSyncForSession(final int sessionId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setCommunicationDevice(@NonNull final AudioDeviceInfo device) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCommunicationDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AudioDeviceInfo getCommunicationDevice() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioDeviceInfo> getAvailableCommunicationDevices() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioProfile> getDirectProfilesForAttributes(@NonNull final AudioAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnCommunicationDeviceChangedListener(@NonNull final Executor executor, @NonNull final OnCommunicationDeviceChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnCommunicationDeviceChangedListener(@NonNull final OnCommunicationDeviceChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AudioMixerAttributes> getSupportedMixerAttributes(@NonNull final AudioDeviceInfo device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setPreferredMixerAttributes(@NonNull final AudioAttributes attributes, @NonNull final AudioDeviceInfo device, @NonNull final AudioMixerAttributes mixerAttributes) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AudioMixerAttributes getPreferredMixerAttributes(@NonNull final AudioAttributes attributes, @NonNull final AudioDeviceInfo device) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean clearPreferredMixerAttributes(@NonNull final AudioAttributes attributes, @NonNull final AudioDeviceInfo device) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnPreferredMixerAttributesChangedListener(@NonNull final Executor executor, @NonNull final OnPreferredMixerAttributesChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnPreferredMixerAttributesChangedListener(@NonNull final OnPreferredMixerAttributesChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class AudioPlaybackCallback
    {
        public AudioPlaybackCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onPlaybackConfigChanged(final List<AudioPlaybackConfiguration> configs) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public abstract static class AudioRecordingCallback
    {
        public AudioRecordingCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onRecordingConfigChanged(final List<AudioRecordingConfiguration> configs) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnPreferredMixerAttributesChangedListener
    {
        void onPreferredMixerAttributesChanged(@NonNull final AudioAttributes p0, @NonNull final AudioDeviceInfo p1, @Nullable final AudioMixerAttributes p2);
    }
    
    public interface OnModeChangedListener
    {
        void onModeChanged(final int p0);
    }
    
    public interface OnCommunicationDeviceChangedListener
    {
        void onCommunicationDeviceChanged(@Nullable final AudioDeviceInfo p0);
    }
    
    public interface OnAudioFocusChangeListener
    {
        void onAudioFocusChange(final int p0);
    }
}
