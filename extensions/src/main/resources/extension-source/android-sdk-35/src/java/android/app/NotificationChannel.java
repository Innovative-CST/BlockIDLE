package android.app;

import android.os.VibrationEffect;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class NotificationChannel implements Parcelable
{
    @NonNull
    public static final Creator<NotificationChannel> CREATOR;
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
    public static final String EDIT_CONVERSATION = "conversation";
    public static final String EDIT_IMPORTANCE = "importance";
    public static final String EDIT_LAUNCHER = "launcher";
    public static final String EDIT_LOCKED_DEVICE = "locked";
    public static final String EDIT_SOUND = "sound";
    public static final String EDIT_VIBRATION = "vibration";
    public static final String EDIT_ZEN = "zen";
    
    public NotificationChannel(final String id, final CharSequence name, final int importance) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBlockable(final boolean blockable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setName(final CharSequence name) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDescription(final String description) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGroup(final String groupId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShowBadge(final boolean showBadge) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSound(final Uri sound, final AudioAttributes audioAttributes) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableLights(final boolean lights) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightColor(final int argb) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableVibration(final boolean vibration) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVibrationPattern(final long[] vibrationPattern) {
        throw new RuntimeException("Stub!");
    }
    
    public void setVibrationEffect(@Nullable final VibrationEffect effect) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImportance(final int importance) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBypassDnd(final boolean bypassDnd) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLockscreenVisibility(final int lockscreenVisibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAllowBubbles(final boolean allowBubbles) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConversationId(@NonNull final String parentChannelId, @NonNull final String conversationId) {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getImportance() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBypassDnd() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConversation() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImportantConversation() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getSound() {
        throw new RuntimeException("Stub!");
    }
    
    public AudioAttributes getAudioAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldShowLights() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLightColor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldVibrate() {
        throw new RuntimeException("Stub!");
    }
    
    public long[] getVibrationPattern() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public VibrationEffect getVibrationEffect() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLockscreenVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canShowBadge() {
        throw new RuntimeException("Stub!");
    }
    
    public String getGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBubble() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getParentChannelId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getConversationId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBlockable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDemoted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasUserSetImportance() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasUserSetSound() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
