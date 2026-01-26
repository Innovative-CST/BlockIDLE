package android.content.pm;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import java.util.List;
import android.os.UserHandle;
import android.os.PersistableBundle;
import android.content.Intent;
import java.util.Set;
import android.content.ComponentName;
import android.content.LocusId;
import android.app.appsearch.GenericDocument;
import android.content.Context;
import android.os.Parcelable;

public final class ShortcutInfo implements Parcelable
{
    @NonNull
    public static final Creator<ShortcutInfo> CREATOR;
    public static final int DISABLED_REASON_APP_CHANGED = 2;
    public static final int DISABLED_REASON_BACKUP_NOT_SUPPORTED = 101;
    public static final int DISABLED_REASON_BY_APP = 1;
    public static final int DISABLED_REASON_NOT_DISABLED = 0;
    public static final int DISABLED_REASON_OTHER_RESTORE_ISSUE = 103;
    public static final int DISABLED_REASON_SIGNATURE_MISMATCH = 102;
    public static final int DISABLED_REASON_UNKNOWN = 3;
    public static final int DISABLED_REASON_VERSION_LOWER = 100;
    public static final String SHORTCUT_CATEGORY_CONVERSATION = "android.shortcut.conversation";
    public static final int SURFACE_LAUNCHER = 1;
    
    ShortcutInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ShortcutInfo createFromGenericDocument(@NonNull final Context context, @NonNull final GenericDocument document) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocusId getLocusId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getShortLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getLongLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDisabledMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisabledReason() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Set<String> getCategories() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent[] getIntents() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRank() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PersistableBundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public UserHandle getUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastChangedTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCached() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDynamic() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPinned() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDeclaredInManifest() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImmutable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasKeyFieldsOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExcludedFromSurfaces(final int surface) {
        throw new RuntimeException("Stub!");
    }
    
    public int getExcludedFromSurfaces() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Capability> getCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<CapabilityParams> getCapabilityParams(@NonNull final Capability capability) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder(final Context context, final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocusId(@NonNull final LocusId locusId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setActivity(@NonNull final ComponentName activity) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIcon(final Icon icon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartingTheme(final int themeResId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShortLabel(@NonNull final CharSequence shortLabel) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLongLabel(@NonNull final CharSequence longLabel) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisabledMessage(@NonNull final CharSequence disabledMessage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCategories(final Set<String> categories) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIntent(@NonNull final Intent intent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIntents(@NonNull final Intent[] intents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPerson(@NonNull final Person person) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPersons(@NonNull final Person[] persons) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLongLived(final boolean longLived) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRank(final int rank) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final PersistableBundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCapabilityBinding(@NonNull final Capability capability, @Nullable final CapabilityParams capabilityParams) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExcludedFromSurfaces(final int surfaces) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ShortcutInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
