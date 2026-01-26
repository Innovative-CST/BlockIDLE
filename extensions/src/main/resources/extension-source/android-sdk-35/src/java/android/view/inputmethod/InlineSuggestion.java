package android.view.inputmethod;

import android.os.Parcel;
import android.widget.inline.InlineContentView;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.util.Size;
import android.content.Context;
import android.os.Parcelable;

public final class InlineSuggestion implements Parcelable
{
    @NonNull
    public static final Creator<InlineSuggestion> CREATOR;
    
    InlineSuggestion() {
        throw new RuntimeException("Stub!");
    }
    
    public void inflate(@NonNull final Context context, @NonNull final Size size, @NonNull final Executor callbackExecutor, @NonNull final Consumer<InlineContentView> callback) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InlineSuggestionInfo getInfo() {
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
