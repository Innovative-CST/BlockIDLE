package android.view.translation;

import android.os.Parcel;
import android.os.Parcelable;

public final class TranslationCapability implements Parcelable
{
    @NonNull
    public static final Creator<TranslationCapability> CREATOR;
    public static final int STATE_AVAILABLE_TO_DOWNLOAD = 1;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_NOT_AVAILABLE = 4;
    public static final int STATE_ON_DEVICE = 3;
    
    TranslationCapability() {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranslationSpec getSourceSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranslationSpec getTargetSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUiTranslationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSupportedTranslationFlags() {
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
