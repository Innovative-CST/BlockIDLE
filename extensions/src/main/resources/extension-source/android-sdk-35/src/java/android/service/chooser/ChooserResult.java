package android.service.chooser;

import android.os.Parcel;
import android.content.ComponentName;
import android.os.Parcelable;

public final class ChooserResult implements Parcelable
{
    public static final int CHOOSER_RESULT_COPY = 1;
    public static final int CHOOSER_RESULT_EDIT = 2;
    public static final int CHOOSER_RESULT_SELECTED_COMPONENT = 0;
    public static final int CHOOSER_RESULT_UNKNOWN = -1;
    @NonNull
    public static final Creator<ChooserResult> CREATOR;
    
    ChooserResult() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getSelectedComponent() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShortcut() {
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
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
