package android.view.inputmethod;

import android.os.Parcel;
import android.util.Printer;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.content.pm.ResolveInfo;
import android.content.Context;
import android.os.Parcelable;

public final class InputMethodInfo implements Parcelable
{
    public static final String ACTION_STYLUS_HANDWRITING_SETTINGS = "android.view.inputmethod.action.STYLUS_HANDWRITING_SETTINGS";
    @NonNull
    public static final Creator<InputMethodInfo> CREATOR;
    
    public InputMethodInfo(final Context context, final ResolveInfo service) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public InputMethodInfo(final String packageName, final String className, final CharSequence label, final String settingsActivity) {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }
    
    public ServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getComponent() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadLabel(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable loadIcon(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSettingsActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubtypeCount() {
        throw new RuntimeException("Stub!");
    }
    
    public InputMethodSubtype getSubtypeAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIsDefaultResourceId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConfigChanges() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsConnectionlessStylusHandwriting() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent createStylusHandwritingSettingsActivityIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final Printer pw, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean suppressesSpellChecker() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldShowInInputMethodPicker() {
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
