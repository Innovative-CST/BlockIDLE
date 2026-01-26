package android.content.pm;

import android.content.Intent;
import android.content.IntentSender;
import java.util.List;

public class ShortcutManager
{
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    
    ShortcutManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setDynamicShortcuts(@NonNull final List<ShortcutInfo> shortcutInfoList) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ShortcutInfo> getDynamicShortcuts() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ShortcutInfo> getManifestShortcuts() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ShortcutInfo> getShortcuts(final int matchFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addDynamicShortcuts(@NonNull final List<ShortcutInfo> shortcutInfoList) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeDynamicShortcuts(@NonNull final List<String> shortcutIds) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllDynamicShortcuts() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeLongLivedShortcuts(@NonNull final List<String> shortcutIds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ShortcutInfo> getPinnedShortcuts() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean updateShortcuts(@NonNull final List<ShortcutInfo> shortcutInfoList) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableShortcuts(@NonNull final List<String> shortcutIds) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableShortcuts(@NonNull final List<String> shortcutIds, final CharSequence disabledMessage) {
        throw new RuntimeException("Stub!");
    }
    
    public void enableShortcuts(@NonNull final List<String> shortcutIds) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxShortcutCountPerActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRateLimitingActive() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconMaxHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void reportShortcutUsed(final String shortcutId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequestPinShortcutSupported() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean requestPinShortcut(@NonNull final ShortcutInfo shortcut, @Nullable final IntentSender resultIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public Intent createShortcutResultIntent(@NonNull final ShortcutInfo shortcut) {
        throw new RuntimeException("Stub!");
    }
    
    public void pushDynamicShortcut(@NonNull final ShortcutInfo shortcut) {
        throw new RuntimeException("Stub!");
    }
}
