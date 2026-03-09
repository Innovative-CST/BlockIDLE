package android.view;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class KeyboardShortcutGroup implements Parcelable
{
    @NonNull
    public static final Creator<KeyboardShortcutGroup> CREATOR;
    
    public KeyboardShortcutGroup(@Nullable final CharSequence label, @NonNull final List<KeyboardShortcutInfo> items) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyboardShortcutGroup(@Nullable final CharSequence label) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public List<KeyboardShortcutInfo> getItems() {
        throw new RuntimeException("Stub!");
    }
    
    public void addItem(final KeyboardShortcutInfo item) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
