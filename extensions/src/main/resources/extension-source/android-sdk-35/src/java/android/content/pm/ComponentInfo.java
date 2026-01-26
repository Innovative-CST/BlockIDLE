package android.content.pm;

import android.util.Printer;
import android.os.Parcel;

public class ComponentInfo extends PackageItemInfo
{
    public ApplicationInfo applicationInfo;
    public String[] attributionTags;
    public int descriptionRes;
    public boolean directBootAware;
    public boolean enabled;
    public boolean exported;
    public String processName;
    public String splitName;
    
    public ComponentInfo() {
        this.directBootAware = false;
        this.enabled = true;
        this.exported = false;
        throw new RuntimeException("Stub!");
    }
    
    public ComponentInfo(final ComponentInfo orig) {
        this.directBootAware = false;
        this.enabled = true;
        this.exported = false;
        throw new RuntimeException("Stub!");
    }
    
    protected ComponentInfo(final Parcel source) {
        this.directBootAware = false;
        this.enabled = true;
        this.exported = false;
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getIconResource() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLogoResource() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getBannerResource() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dumpFront(final Printer pw, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dumpBack(final Printer pw, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
}
