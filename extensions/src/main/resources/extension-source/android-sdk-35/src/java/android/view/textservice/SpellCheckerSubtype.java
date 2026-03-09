package android.view.textservice;

import android.os.Parcel;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import android.os.Parcelable;

public final class SpellCheckerSubtype implements Parcelable
{
    @NonNull
    public static final Creator<SpellCheckerSubtype> CREATOR;
    
    @Deprecated
    public SpellCheckerSubtype(final int nameId, final String locale, final String extraValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNameResId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public String getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getLanguageTag() {
        throw new RuntimeException("Stub!");
    }
    
    public String getExtraValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsExtraValueKey(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public String getExtraValueOf(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getDisplayName(final Context context, final String packageName, final ApplicationInfo appInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
