package android.app;

import android.os.Parcel;
import android.util.Printer;
import android.net.Uri;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.content.pm.ResolveInfo;
import android.content.Context;
import android.os.Parcelable;

public final class WallpaperInfo implements Parcelable
{
    @NonNull
    public static final Creator<WallpaperInfo> CREATOR;
    
    public WallpaperInfo(final Context context, final ResolveInfo service) throws IOException, XmlPullParserException {
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
    
    public Drawable loadThumbnail(final PackageManager pm) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadAuthor(final PackageManager pm) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadDescription(final PackageManager pm) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public Uri loadContextUri(final PackageManager pm) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence loadContextDescription(final PackageManager pm) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getShowMetadataInPreview() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSettingsActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getSettingsSliceUri() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean supportsMultipleDisplays() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldUseDefaultUnfoldTransition() {
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
