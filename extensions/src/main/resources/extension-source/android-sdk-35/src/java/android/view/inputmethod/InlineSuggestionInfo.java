package android.view.inputmethod;

import android.os.Parcel;
import android.widget.inline.InlinePresentationSpec;
import android.os.Parcelable;

public final class InlineSuggestionInfo implements Parcelable
{
    @NonNull
    public static final Creator<InlineSuggestionInfo> CREATOR;
    public static final String SOURCE_AUTOFILL = "android:autofill";
    public static final String SOURCE_PLATFORM = "android:platform";
    public static final String TYPE_ACTION = "android:autofill:action";
    public static final String TYPE_SUGGESTION = "android:autofill:suggestion";
    
    InlineSuggestionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InlinePresentationSpec getInlinePresentationSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getSource() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] getAutofillHints() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPinned() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
