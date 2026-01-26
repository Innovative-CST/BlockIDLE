package android.app;

import java.io.PrintWriter;
import android.os.Parcel;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class RemoteAction implements Parcelable
{
    @NonNull
    public static final Creator<RemoteAction> CREATOR;
    
    public RemoteAction(@NonNull final Icon icon, @NonNull final CharSequence title, @NonNull final CharSequence contentDescription, @NonNull final PendingIntent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setShouldShowIcon(final boolean shouldShowIcon) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldShowIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PendingIntent getActionIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteAction clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final String prefix, final PrintWriter pw) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
