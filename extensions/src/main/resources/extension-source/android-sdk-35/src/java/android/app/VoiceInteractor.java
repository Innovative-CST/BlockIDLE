package android.app;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.concurrent.Executor;

public final class VoiceInteractor
{
    VoiceInteractor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean submitRequest(final Request request) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean submitRequest(final Request request, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public Request[] getActiveRequests() {
        throw new RuntimeException("Stub!");
    }
    
    public Request getActiveRequest(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean[] supportsCommands(final String[] commands) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerOnDestroyedCallback(@NonNull final Executor executor, @NonNull final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregisterOnDestroyedCallback(@NonNull final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyDirectActionsChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class AbortVoiceRequest extends Request
    {
        public AbortVoiceRequest(@Nullable final Prompt prompt, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAbortResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class CommandRequest extends Request
    {
        public CommandRequest(final String command, final Bundle args) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCommandResult(final boolean isCompleted, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class CompleteVoiceRequest extends Request
    {
        public CompleteVoiceRequest(@Nullable final Prompt prompt, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onCompleteResult(final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ConfirmationRequest extends Request
    {
        public ConfirmationRequest(@Nullable final Prompt prompt, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onConfirmationResult(final boolean confirmed, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class PickOptionRequest extends Request
    {
        public PickOptionRequest(@Nullable final Prompt prompt, final Option[] options, @Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        public void onPickOptionResult(final boolean finished, final Option[] selections, final Bundle result) {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Option implements Parcelable
        {
            @NonNull
            public static final Creator<Option> CREATOR;
            
            public Option(final CharSequence label, final int index) {
                throw new RuntimeException("Stub!");
            }
            
            public Option addSynonym(final CharSequence synonym) {
                throw new RuntimeException("Stub!");
            }
            
            public CharSequence getLabel() {
                throw new RuntimeException("Stub!");
            }
            
            public int getIndex() {
                throw new RuntimeException("Stub!");
            }
            
            public int countSynonyms() {
                throw new RuntimeException("Stub!");
            }
            
            public CharSequence getSynonymAt(final int index) {
                throw new RuntimeException("Stub!");
            }
            
            public void setExtras(final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
            
            public Bundle getExtras() {
                throw new RuntimeException("Stub!");
            }
            
            @Override
            public int describeContents() {
                throw new RuntimeException("Stub!");
            }
            
            @Override
            public void writeToParcel(final Parcel dest, final int flags) {
                throw new RuntimeException("Stub!");
            }
            
            static {
                CREATOR = null;
            }
        }
    }
    
    public static class Prompt implements Parcelable
    {
        @NonNull
        public static final Creator<Prompt> CREATOR;
        
        public Prompt(@NonNull final CharSequence[] voicePrompts, @NonNull final CharSequence visualPrompt) {
            throw new RuntimeException("Stub!");
        }
        
        public Prompt(@NonNull final CharSequence prompt) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getVoicePromptAt(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        public int countVoicePrompts() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getVisualPrompt() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    public abstract static class Request
    {
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        public void cancel() {
            throw new RuntimeException("Stub!");
        }
        
        public Context getContext() {
            throw new RuntimeException("Stub!");
        }
        
        public Activity getActivity() {
            throw new RuntimeException("Stub!");
        }
        
        public void onCancel() {
            throw new RuntimeException("Stub!");
        }
        
        public void onAttached(final Activity activity) {
            throw new RuntimeException("Stub!");
        }
        
        public void onDetached() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
