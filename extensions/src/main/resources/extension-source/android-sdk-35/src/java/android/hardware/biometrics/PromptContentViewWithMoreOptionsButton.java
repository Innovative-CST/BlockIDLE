package android.hardware.biometrics;

import java.util.concurrent.Executor;
import android.os.Parcel;
import android.content.DialogInterface;
import android.os.Parcelable;

public final class PromptContentViewWithMoreOptionsButton implements PromptContentView, Parcelable
{
    @NonNull
    public static final Creator<PromptContentViewWithMoreOptionsButton> CREATOR;
    
    PromptContentViewWithMoreOptionsButton() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DialogInterface.OnClickListener getMoreOptionsButtonListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@NonNull final String description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMoreOptionsButtonListener(@NonNull final Executor executor, @NonNull final DialogInterface.OnClickListener listener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PromptContentViewWithMoreOptionsButton build() {
            throw new RuntimeException("Stub!");
        }
    }
}
