package android.service.autofill;

import android.os.Parcel;
import android.content.IntentSender;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

public final class FillRequest implements Parcelable
{
    @NonNull
    public static final Creator<FillRequest> CREATOR;
    public static final int FLAG_COMPATIBILITY_MODE_REQUEST = 2;
    public static final int FLAG_MANUAL_REQUEST = 1;
    public static final int FLAG_SUPPORTS_FILL_DIALOG = 64;
    
    FillRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<FillContext> getFillContexts() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getClientState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InlineSuggestionsRequest getInlineSuggestionsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IntentSender getDelayedFillIntentSender() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
