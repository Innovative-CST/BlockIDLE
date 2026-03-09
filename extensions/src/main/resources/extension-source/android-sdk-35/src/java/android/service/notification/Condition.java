package android.service.notification;

import android.content.Context;
import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class Condition implements Parcelable
{
    @NonNull
    public static final Creator<Condition> CREATOR;
    public static final int FLAG_RELEVANT_ALWAYS = 2;
    public static final int FLAG_RELEVANT_NOW = 1;
    public static final String SCHEME = "condition";
    public static final int SOURCE_CONTEXT = 3;
    public static final int SOURCE_SCHEDULE = 2;
    public static final int SOURCE_UNKNOWN = 0;
    public static final int SOURCE_USER_ACTION = 1;
    public static final int STATE_ERROR = 3;
    public static final int STATE_FALSE = 0;
    public static final int STATE_TRUE = 1;
    public static final int STATE_UNKNOWN = 2;
    public final int flags;
    public final int icon;
    public final Uri id;
    public final String line1;
    public final String line2;
    public final int source;
    public final int state;
    public final String summary;
    
    public Condition(final Uri id, final String summary, final int state) {
        this.flags = 0;
        this.icon = 0;
        this.id = null;
        this.line1 = null;
        this.line2 = null;
        this.source = 0;
        this.state = 0;
        this.summary = null;
        throw new RuntimeException("Stub!");
    }
    
    public Condition(@Nullable final Uri id, @Nullable final String summary, final int state, final int source) {
        this.flags = 0;
        this.icon = 0;
        this.id = null;
        this.line1 = null;
        this.line2 = null;
        this.source = 0;
        this.state = 0;
        this.summary = null;
        throw new RuntimeException("Stub!");
    }
    
    public Condition(final Uri id, final String summary, final String line1, final String line2, final int icon, final int state, final int flags) {
        this.flags = 0;
        this.icon = 0;
        this.id = null;
        this.line1 = null;
        this.line2 = null;
        this.source = 0;
        this.state = 0;
        this.summary = null;
        throw new RuntimeException("Stub!");
    }
    
    public Condition(@Nullable final Uri id, @Nullable final String summary, @Nullable final String line1, @Nullable final String line2, final int icon, final int state, final int source, final int flags) {
        this.flags = 0;
        this.icon = 0;
        this.id = null;
        this.line1 = null;
        this.line2 = null;
        this.source = 0;
        this.state = 0;
        this.summary = null;
        throw new RuntimeException("Stub!");
    }
    
    public Condition(final Parcel source) {
        this.flags = 0;
        this.icon = 0;
        this.id = null;
        this.line1 = null;
        this.line2 = null;
        this.source = 0;
        this.state = 0;
        this.summary = null;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static String stateToString(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public static String relevanceToString(final int flags) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public Condition copy() {
        throw new RuntimeException("Stub!");
    }
    
    public static Uri.Builder newId(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isValidId(final Uri id, final String pkg) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
