package android.view.inputmethod;

import android.os.Parcel;
import android.util.Printer;
import java.util.Set;
import java.util.List;
import android.os.LocaleList;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputType;

public class EditorInfo implements InputType, Parcelable
{
    @NonNull
    public static final Creator<EditorInfo> CREATOR;
    public static final int IME_ACTION_DONE = 6;
    public static final int IME_ACTION_GO = 2;
    public static final int IME_ACTION_NEXT = 5;
    public static final int IME_ACTION_NONE = 1;
    public static final int IME_ACTION_PREVIOUS = 7;
    public static final int IME_ACTION_SEARCH = 3;
    public static final int IME_ACTION_SEND = 4;
    public static final int IME_ACTION_UNSPECIFIED = 0;
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NAVIGATE_NEXT = 134217728;
    public static final int IME_FLAG_NAVIGATE_PREVIOUS = 67108864;
    public static final int IME_FLAG_NO_ACCESSORY_ACTION = 536870912;
    public static final int IME_FLAG_NO_ENTER_ACTION = 1073741824;
    public static final int IME_FLAG_NO_EXTRACT_UI = 268435456;
    public static final int IME_FLAG_NO_FULLSCREEN = 33554432;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    public static final int IME_MASK_ACTION = 255;
    public static final int IME_NULL = 0;
    public int actionId;
    public CharSequence actionLabel;
    @Nullable
    public String[] contentMimeTypes;
    public Bundle extras;
    public int fieldId;
    public String fieldName;
    @Nullable
    public LocaleList hintLocales;
    public CharSequence hintText;
    public int imeOptions;
    public int initialCapsMode;
    public int initialSelEnd;
    public int initialSelStart;
    public int inputType;
    public CharSequence label;
    public String packageName;
    public String privateImeOptions;
    
    public EditorInfo() {
        this.actionId = 0;
        this.imeOptions = 0;
        this.initialCapsMode = 0;
        this.initialSelEnd = -1;
        this.initialSelStart = -1;
        this.inputType = 0;
        throw new RuntimeException("Stub!");
    }
    
    public void setSupportedHandwritingGestures(@NonNull final List<Class<? extends HandwritingGesture>> gestures) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Class<? extends HandwritingGesture>> getSupportedHandwritingGestures() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSupportedHandwritingGesturePreviews(@NonNull final Set<Class<? extends PreviewableHandwritingGesture>> gestures) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Class<? extends PreviewableHandwritingGesture>> getSupportedHandwritingGesturePreviews() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStylusHandwritingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStylusHandwritingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInitialSurroundingText(@NonNull final CharSequence sourceText) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInitialSurroundingSubText(@NonNull final CharSequence subText, final int subTextStart) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getInitialTextBeforeCursor(final int length, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getInitialSelectedText(final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getInitialTextAfterCursor(final int length, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SurroundingText getInitialSurroundingText(final int beforeLength, final int afterLength, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public final void makeCompatible(final int targetSdkVersion) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInitialToolType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInitialToolType(final int toolType) {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final Printer pw, final String prefix) {
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
