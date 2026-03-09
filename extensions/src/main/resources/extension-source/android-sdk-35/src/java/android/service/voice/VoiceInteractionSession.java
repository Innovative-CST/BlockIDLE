package android.service.voice;

import android.graphics.Region;
import android.graphics.Rect;
import android.app.VoiceInteractor;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.view.View;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.app.DirectAction;
import java.util.List;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import android.content.ComponentCallbacks2;
import android.view.KeyEvent;

public class VoiceInteractionSession implements KeyEvent.Callback, ComponentCallbacks2
{
    public static final String KEY_FOREGROUND_ACTIVITIES = "android.service.voice.FOREGROUND_ACTIVITIES";
    public static final String KEY_SHOW_SESSION_ID = "android.service.voice.SHOW_SESSION_ID";
    public static final int SHOW_SOURCE_ACTIVITY = 16;
    public static final int SHOW_SOURCE_APPLICATION = 8;
    public static final int SHOW_SOURCE_ASSIST_GESTURE = 4;
    public static final int SHOW_SOURCE_AUTOMOTIVE_SYSTEM_UI = 128;
    public static final int SHOW_SOURCE_NOTIFICATION = 64;
    public static final int SHOW_SOURCE_PUSH_TO_TALK = 32;
    public static final int SHOW_WITH_ASSIST = 1;
    public static final int SHOW_WITH_SCREENSHOT = 2;
    
    public VoiceInteractionSession(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public VoiceInteractionSession(final Context context, final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisabledShowContext(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisabledShowContext() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUserDisabledShowContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void show(final Bundle args, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void hide() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUiEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTheme(final int theme) {
        throw new RuntimeException("Stub!");
    }
    
    public void startVoiceActivity(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void startAssistantActivity(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void startAssistantActivity(@NonNull final Intent intent, @NonNull final Bundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public final void requestDirectActions(@NonNull final ActivityId activityId, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor resultExecutor, @NonNull final Consumer<List<DirectAction>> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDirectActionsInvalidated(@NonNull final ActivityId activityId) {
        throw new RuntimeException("Stub!");
    }
    
    public final void performDirectAction(@NonNull final DirectAction action, @Nullable final Bundle extras, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor resultExecutor, @NonNull final Consumer<Bundle> resultListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeepAwake(final boolean keepAwake) {
        throw new RuntimeException("Stub!");
    }
    
    public void closeSystemDialogs() {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutInflater getLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    public Dialog getWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void finish() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCreate() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPrepareShow(final Bundle args, final int showFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onShow(@Nullable final Bundle args, final int showFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHide() {
        throw new RuntimeException("Stub!");
    }
    
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    public View onCreateContentView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAssistStructureFailure(final Throwable failure) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHandleAssist(@Nullable final Bundle data, @Nullable final AssistStructure structure, @Nullable final AssistContent content) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHandleAssist(@NonNull final AssistState state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHandleAssistSecondary(@Nullable final Bundle data, @Nullable final AssistStructure structure, @Nullable final AssistContent content, final int index, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public void onHandleScreenshot(@Nullable final Bitmap screenshot) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyMultiple(final int keyCode, final int count, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBackPressed() {
        throw new RuntimeException("Stub!");
    }
    
    public void onCloseSystemDialogs() {
        throw new RuntimeException("Stub!");
    }
    
    public void onLockscreenShown() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    public void onComputeInsets(final Insets outInsets) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTaskStarted(final Intent intent, final int taskId) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTaskFinished(final Intent intent, final int taskId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean[] onGetSupportedCommands(final String[] commands) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestConfirmation(final ConfirmationRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestPickOption(final PickOptionRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestCompleteVoice(final CompleteVoiceRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestAbortVoice(final AbortVoiceRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRequestCommand(final CommandRequest request) {
        throw new RuntimeException("Stub!");
    }
    
    public void onCancelRequest(final Request request) {
        throw new RuntimeException("Stub!");
    }
    
    public final void registerVisibleActivityCallback(@NonNull final Executor executor, @NonNull final VisibleActivityCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public final void unregisterVisibleActivityCallback(@NonNull final VisibleActivityCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class AbortVoiceRequest extends Request
    {
        AbortVoiceRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public VoiceInteractor.Prompt getVoicePrompt() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public CharSequence getMessage() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendAbortResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ActivityId
    {
        ActivityId() {
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
    }
    
    public static final class AssistState
    {
        AssistState() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isFocused() {
            throw new RuntimeException("Stub!");
        }
        
        public int getIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCount() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ActivityId getActivityId() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bundle getAssistData() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public AssistStructure getAssistStructure() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public AssistContent getAssistContent() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CommandRequest extends Request
    {
        CommandRequest() {
            throw new RuntimeException("Stub!");
        }
        
        public String getCommand() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendIntermediateResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class CompleteVoiceRequest extends Request
    {
        CompleteVoiceRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public VoiceInteractor.Prompt getVoicePrompt() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public CharSequence getMessage() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendCompleteResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ConfirmationRequest extends Request
    {
        ConfirmationRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public VoiceInteractor.Prompt getVoicePrompt() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public CharSequence getPrompt() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendConfirmationResult(final boolean confirmed, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Insets
    {
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public final Rect contentInsets;
        public int touchableInsets;
        public final Region touchableRegion;
        
        public Insets() {
            this.contentInsets = null;
            this.touchableRegion = null;
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class PickOptionRequest extends Request
    {
        PickOptionRequest() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public VoiceInteractor.Prompt getVoicePrompt() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public CharSequence getPrompt() {
            throw new RuntimeException("Stub!");
        }
        
        public VoiceInteractor.PickOptionRequest.Option[] getOptions() {
            throw new RuntimeException("Stub!");
        }
        
        public void sendIntermediatePickOptionResult(final VoiceInteractor.PickOptionRequest.Option[] selections, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
        
        public void sendPickOptionResult(final VoiceInteractor.PickOptionRequest.Option[] selections, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Request
    {
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        public int getCallingUid() {
            throw new RuntimeException("Stub!");
        }
        
        public String getCallingPackage() {
            throw new RuntimeException("Stub!");
        }
        
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isActive() {
            throw new RuntimeException("Stub!");
        }
        
        public void cancel() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface VisibleActivityCallback
    {
        default void onVisible(@NonNull final VisibleActivityInfo activityInfo) {
            throw new RuntimeException("Stub!");
        }
        
        default void onInvisible(@NonNull final ActivityId activityId) {
            throw new RuntimeException("Stub!");
        }
    }
}
