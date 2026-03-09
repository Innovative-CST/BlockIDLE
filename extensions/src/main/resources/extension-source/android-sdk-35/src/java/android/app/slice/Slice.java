package android.app.slice;

import android.os.Bundle;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.app.PendingIntent;
import java.util.List;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class Slice implements Parcelable
{
    @Deprecated
    @NonNull
    public static final Creator<Slice> CREATOR;
    @Deprecated
    public static final String EXTRA_RANGE_VALUE = "android.app.slice.extra.RANGE_VALUE";
    @Deprecated
    public static final String EXTRA_TOGGLE_STATE = "android.app.slice.extra.TOGGLE_STATE";
    @Deprecated
    public static final String HINT_ACTIONS = "actions";
    @Deprecated
    public static final String HINT_ERROR = "error";
    @Deprecated
    public static final String HINT_HORIZONTAL = "horizontal";
    @Deprecated
    public static final String HINT_KEYWORDS = "keywords";
    @Deprecated
    public static final String HINT_LARGE = "large";
    @Deprecated
    public static final String HINT_LAST_UPDATED = "last_updated";
    @Deprecated
    public static final String HINT_LIST = "list";
    @Deprecated
    public static final String HINT_LIST_ITEM = "list_item";
    @Deprecated
    public static final String HINT_NO_TINT = "no_tint";
    @Deprecated
    public static final String HINT_PARTIAL = "partial";
    @Deprecated
    public static final String HINT_PERMISSION_REQUEST = "permission_request";
    @Deprecated
    public static final String HINT_SEE_MORE = "see_more";
    @Deprecated
    public static final String HINT_SELECTED = "selected";
    @Deprecated
    public static final String HINT_SHORTCUT = "shortcut";
    @Deprecated
    public static final String HINT_SUMMARY = "summary";
    @Deprecated
    public static final String HINT_TITLE = "title";
    @Deprecated
    public static final String HINT_TTL = "ttl";
    @Deprecated
    public static final String SUBTYPE_COLOR = "color";
    @Deprecated
    public static final String SUBTYPE_CONTENT_DESCRIPTION = "content_description";
    @Deprecated
    public static final String SUBTYPE_LAYOUT_DIRECTION = "layout_direction";
    @Deprecated
    public static final String SUBTYPE_MAX = "max";
    @Deprecated
    public static final String SUBTYPE_MESSAGE = "message";
    @Deprecated
    public static final String SUBTYPE_MILLIS = "millis";
    @Deprecated
    public static final String SUBTYPE_PRIORITY = "priority";
    @Deprecated
    public static final String SUBTYPE_RANGE = "range";
    @Deprecated
    public static final String SUBTYPE_SOURCE = "source";
    @Deprecated
    public static final String SUBTYPE_TOGGLE = "toggle";
    @Deprecated
    public static final String SUBTYPE_VALUE = "value";
    
    @Deprecated
    protected Slice(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public SliceSpec getSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<SliceItem> getItems() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<String> getHints() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isCallerNeeded() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    @Deprecated
    public static class Builder
    {
        @Deprecated
        public Builder(@NonNull final Uri uri, final SliceSpec spec) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder(@NonNull final Builder parent) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setCallerNeeded(final boolean callerNeeded) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addHints(final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addSubSlice(@NonNull final Slice slice, @Nullable final String subType) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addAction(@NonNull final PendingIntent action, @NonNull final Slice s, @Nullable final String subType) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addText(final CharSequence text, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addIcon(final Icon icon, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addRemoteInput(final RemoteInput remoteInput, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addInt(final int value, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addLong(final long value, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addBundle(final Bundle bundle, @Nullable final String subType, final List<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Slice build() {
            throw new RuntimeException("Stub!");
        }
    }
}
