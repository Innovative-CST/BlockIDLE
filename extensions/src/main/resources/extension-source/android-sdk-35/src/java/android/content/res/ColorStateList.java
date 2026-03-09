package android.content.res;

import android.os.Parcel;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.os.Parcelable;

public class ColorStateList implements Parcelable
{
    @NonNull
    public static final Creator<ColorStateList> CREATOR;
    
    public ColorStateList(final int[][] states, final int[] colors) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorStateList valueOf(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static ColorStateList createFromXml(final Resources r, final XmlPullParser parser) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ColorStateList createFromXml(@NonNull final Resources r, @NonNull final XmlPullParser parser, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorStateList withAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ColorStateList withLStar(final float lStar) {
        throw new RuntimeException("Stub!");
    }
    
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColorForState(@Nullable final int[] stateSet, final int defaultColor) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDefaultColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
