package android.hardware.biometrics;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class PromptVerticalListContentView implements PromptContentView, Parcelable
{
    @NonNull
    public static final Creator<PromptVerticalListContentView> CREATOR;
    
    PromptVerticalListContentView() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxItemCount() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getMaxEachItemCharacterNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PromptContentItem> getListItems() {
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
        public Builder addListItem(@NonNull final PromptContentItem listItem) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addListItem(@NonNull final PromptContentItem listItem, final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PromptVerticalListContentView build() {
            throw new RuntimeException("Stub!");
        }
    }
}
