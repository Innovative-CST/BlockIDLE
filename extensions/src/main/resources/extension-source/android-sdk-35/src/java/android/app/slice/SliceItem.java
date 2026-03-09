package android.app.slice;

import android.os.Parcel;
import android.app.RemoteInput;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

@Deprecated
public final class SliceItem implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<SliceItem> CREATOR;
    @Deprecated
    public static final String FORMAT_ACTION = "action";
    @Deprecated
    public static final String FORMAT_BUNDLE = "bundle";
    @Deprecated
    public static final String FORMAT_IMAGE = "image";
    @Deprecated
    public static final String FORMAT_INT = "int";
    @Deprecated
    public static final String FORMAT_LONG = "long";
    @Deprecated
    public static final String FORMAT_REMOTE_INPUT = "input";
    @Deprecated
    public static final String FORMAT_SLICE = "slice";
    @Deprecated
    public static final String FORMAT_TEXT = "text";
    
    SliceItem() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public List<String> getHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSubType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bundle getBundle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PendingIntent getAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RemoteInput getRemoteInput() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getInt() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Slice getSlice() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getLong() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasHint(final String hint) {
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
