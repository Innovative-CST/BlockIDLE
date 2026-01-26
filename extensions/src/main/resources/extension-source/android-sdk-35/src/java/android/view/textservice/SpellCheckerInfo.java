package android.view.textservice;

import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.content.ComponentName;
import android.os.Parcelable;

public final class SpellCheckerInfo implements Parcelable
{
    @NonNull
    public static final Creator<SpellCheckerInfo> CREATOR;
    
    SpellCheckerInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getComponent() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadLabel(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable loadIcon(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public ServiceInfo getServiceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSettingsActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubtypeCount() {
        throw new RuntimeException("Stub!");
    }
    
    public SpellCheckerSubtype getSubtypeAt(final int index) {
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
