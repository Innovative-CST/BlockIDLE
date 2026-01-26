package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public final class KeyboardShortcutInfo implements Parcelable
{
    @NonNull
    public static final Creator<KeyboardShortcutInfo> CREATOR;
    
    public KeyboardShortcutInfo(final CharSequence label, final int keycode, final int modifiers) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyboardShortcutInfo(final CharSequence label, final char baseCharacter, final int modifiers) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeycode() {
        throw new RuntimeException("Stub!");
    }
    
    public char getBaseCharacter() {
        throw new RuntimeException("Stub!");
    }
    
    public int getModifiers() {
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
