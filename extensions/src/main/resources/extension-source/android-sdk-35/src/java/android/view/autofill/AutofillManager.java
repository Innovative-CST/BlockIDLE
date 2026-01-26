package android.view.autofill;

import java.util.List;
import android.service.autofill.UserData;
import android.content.ComponentName;
import android.util.SparseArray;
import android.graphics.Rect;
import android.view.View;

public final class AutofillManager
{
    public static final String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
    public static final String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
    public static final String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = "android.view.autofill.extra.AUTHENTICATION_RESULT_EPHEMERAL_DATASET";
    public static final String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
    public static final String EXTRA_INLINE_SUGGESTIONS_REQUEST = "android.view.autofill.extra.INLINE_SUGGESTIONS_REQUEST";
    
    AutofillManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestAutofill(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestAutofill(@NonNull final View view, final int virtualId, @NonNull final Rect absBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewEntered(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyVirtualViewsReady(@NonNull final View view, @NonNull final SparseArray<VirtualViewFillInfo> infos) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewExited(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewVisibilityChanged(@NonNull final View view, final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewVisibilityChanged(@NonNull final View view, final int virtualId, final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewEntered(@NonNull final View view, final int virtualId, @NonNull final Rect absBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewExited(@NonNull final View view, final int virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyValueChanged(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyValueChanged(final View view, final int virtualId, final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewClicked(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public void notifyViewClicked(@NonNull final View view, final int virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    public void commit() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void disableAutofillServices() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasEnabledAutofillServices() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getAutofillServiceComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUserDataId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public UserData getUserData() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUserData(@Nullable final UserData userData) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFieldClassificationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDefaultFieldClassificationAlgorithm() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getAvailableFieldClassificationAlgorithms() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutofillSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AutofillId getNextAutofillId() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerCallback(@Nullable final AutofillCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterCallback(@Nullable final AutofillCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showAutofillDialog(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean showAutofillDialog(@NonNull final View view, final int virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class AutofillCallback
    {
        public static final int EVENT_INPUT_HIDDEN = 2;
        public static final int EVENT_INPUT_SHOWN = 1;
        public static final int EVENT_INPUT_UNAVAILABLE = 3;
        
        public AutofillCallback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onAutofillEvent(@NonNull final View view, final int event) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAutofillEvent(@NonNull final View view, final int virtualId, final int event) {
            throw new RuntimeException("Stub!");
        }
    }
}
