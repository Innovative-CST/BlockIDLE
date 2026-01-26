package android.content.pm;

import android.os.Parcel;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.content.Intent;

public class LabeledIntent extends Intent
{
    @NonNull
    public static final Parcelable.Creator<LabeledIntent> CREATOR;
    
    public LabeledIntent(final Intent origIntent, final String sourcePackage, final int labelRes, final int icon) {
        throw new RuntimeException("Stub!");
    }
    
    public LabeledIntent(final Intent origIntent, final String sourcePackage, final CharSequence nonLocalizedLabel, final int icon) {
        throw new RuntimeException("Stub!");
    }
    
    public LabeledIntent(final String sourcePackage, final int labelRes, final int icon) {
        throw new RuntimeException("Stub!");
    }
    
    public LabeledIntent(final String sourcePackage, final CharSequence nonLocalizedLabel, final int icon) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSourcePackage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLabelResource() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getNonLocalizedLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconResource() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadLabel(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable loadIcon(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void readFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
