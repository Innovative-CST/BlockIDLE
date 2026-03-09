package android.view;

import android.util.AndroidRuntimeException;
import android.os.Parcel;
import android.os.Parcelable;

public class KeyCharacterMap implements Parcelable
{
    public static final int ALPHA = 3;
    @Deprecated
    public static final int BUILT_IN_KEYBOARD = 0;
    public static final int COMBINING_ACCENT = Integer.MIN_VALUE;
    public static final int COMBINING_ACCENT_MASK = Integer.MAX_VALUE;
    @NonNull
    public static final Creator<KeyCharacterMap> CREATOR;
    public static final int FULL = 4;
    public static final char HEX_INPUT = '\uef00';
    public static final int MODIFIER_BEHAVIOR_CHORDED = 0;
    public static final int MODIFIER_BEHAVIOR_CHORDED_OR_TOGGLED = 1;
    public static final int NUMERIC = 1;
    public static final char PICKER_DIALOG_INPUT = '\uef01';
    public static final int PREDICTIVE = 2;
    public static final int SPECIAL_FUNCTION = 5;
    public static final int VIRTUAL_KEYBOARD = -1;
    
    KeyCharacterMap() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public static KeyCharacterMap load(final int deviceId) {
        throw new RuntimeException("Stub!");
    }
    
    public int get(final int keyCode, final int metaState) {
        throw new RuntimeException("Stub!");
    }
    
    public char getNumber(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public char getMatch(final int keyCode, final char[] chars) {
        throw new RuntimeException("Stub!");
    }
    
    public char getMatch(final int keyCode, final char[] chars, final int metaState) {
        throw new RuntimeException("Stub!");
    }
    
    public char getDisplayLabel(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getDeadChar(final int accent, final int c) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getKeyData(final int keyCode, final KeyData results) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyEvent[] getEvents(final char[] chars) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrintingKey(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getKeyboardType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getModifierBehavior() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean deviceHasKey(final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean[] deviceHasKeys(final int[] keyCodes) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    @Deprecated
    public static class KeyData
    {
        @Deprecated
        public static final int META_LENGTH = 4;
        @Deprecated
        public char displayLabel;
        @Deprecated
        public char[] meta;
        @Deprecated
        public char number;
        
        @Deprecated
        public KeyData() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class UnavailableException extends AndroidRuntimeException
    {
        public UnavailableException(final String msg) {
            throw new RuntimeException("Stub!");
        }
    }
}
