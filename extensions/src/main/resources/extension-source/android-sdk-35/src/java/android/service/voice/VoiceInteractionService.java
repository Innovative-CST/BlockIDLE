package android.service.voice;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.IBinder;
import android.content.Intent;
import java.util.Set;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.app.Service;

public class VoiceInteractionService extends Service
{
    public static final String SERVICE_INTERFACE = "android.service.voice.VoiceInteractionService";
    public static final String SERVICE_META_DATA = "android.voice_interaction";
    
    public VoiceInteractionService() {
        throw new RuntimeException("Stub!");
    }
    
    public void onLaunchVoiceAssistFromKeyguard() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPrepareToShowSession(@NonNull final Bundle args, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onShowSessionFailed(@NonNull final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isActiveService(final Context context, final ComponentName service) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisabledShowContext(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisabledShowContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void showSession(final Bundle args, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> onGetSupportedVoiceActions(@NonNull final Set<String> voiceActions) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onReady() {
        throw new RuntimeException("Stub!");
    }
    
    public void onShutdown() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setUiHints(@NonNull final Bundle hints) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dump(final FileDescriptor fd, final PrintWriter pw, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
