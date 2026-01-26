package android.hardware.biometrics;

import android.os.Parcel;
import android.os.Parcelable;

public final class PromptContentItemBulletedText implements PromptContentItem, Parcelable
{
    @NonNull
    public static final Creator<PromptContentItemBulletedText> CREATOR;
    
    public PromptContentItemBulletedText(@NonNull final String text) {
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
}
