package android.content.pm;

import android.graphics.drawable.Drawable;
import java.util.List;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.UserHandle;
import android.content.ComponentName;

public class CrossProfileApps
{
    public static final String ACTION_CAN_INTERACT_ACROSS_PROFILES_CHANGED = "android.content.pm.action.CAN_INTERACT_ACROSS_PROFILES_CHANGED";
    
    CrossProfileApps() {
        throw new RuntimeException("Stub!");
    }
    
    public void startMainActivity(@NonNull final ComponentName component, @NonNull final UserHandle targetUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void startMainActivity(@NonNull final ComponentName component, @NonNull final UserHandle targetUser, @Nullable final Activity callingActivity, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public void startActivity(@NonNull final Intent intent, @NonNull final UserHandle targetUser, @Nullable final Activity callingActivity) {
        throw new RuntimeException("Stub!");
    }
    
    public void startActivity(@NonNull final Intent intent, @NonNull final UserHandle targetUser, @Nullable final Activity callingActivity, @Nullable final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<UserHandle> getTargetUserProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProfile(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isManagedProfile(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getProfileSwitchingLabel(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable getProfileSwitchingIconDrawable(@NonNull final UserHandle userHandle) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canRequestInteractAcrossProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canInteractAcrossProfiles() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Intent createRequestInteractAcrossProfilesIntent() {
        throw new RuntimeException("Stub!");
    }
}
