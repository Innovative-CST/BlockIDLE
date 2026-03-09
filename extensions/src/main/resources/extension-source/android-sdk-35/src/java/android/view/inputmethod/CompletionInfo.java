package android.view.inputmethod;

import android.os.Parcel;
import android.os.Parcelable;

public final class CompletionInfo implements Parcelable
{
    @NonNull
    public static final Creator<CompletionInfo> CREATOR;
    
    public CompletionInfo(final long id, final int index, final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public CompletionInfo(final long id, final int index, final CharSequence text, final CharSequence label) {
        throw new RuntimeException("Stub!");
    }
    
    public long getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
