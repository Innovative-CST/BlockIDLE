package android.view.inputmethod;

import android.os.Parcel;
import android.os.Parcelable;

public final class SurroundingText implements Parcelable
{
    @NonNull
    public static final Creator<SurroundingText> CREATOR;
    
    public SurroundingText(@NonNull final CharSequence text, final int selectionStart, final int selectionEnd, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
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
