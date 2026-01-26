package android.service.chooser;

import android.os.Parcel;
import android.os.Bundle;
import android.content.ComponentName;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

@Deprecated
public final class ChooserTarget implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<ChooserTarget> CREATOR;
    
    @Deprecated
    public ChooserTarget(final CharSequence title, final Icon icon, final float score, final ComponentName componentName, @Nullable final Bundle intentExtras) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public float getScore() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ComponentName getComponentName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bundle getIntentExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
