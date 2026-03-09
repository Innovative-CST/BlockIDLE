package android.content;

import android.os.Parcel;
import android.os.Parcelable;

public final class ComponentName implements Parcelable, Cloneable, Comparable<ComponentName>
{
    @NonNull
    public static final Creator<ComponentName> CREATOR;
    
    public ComponentName(@NonNull final String pkg, @NonNull final String cls) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName(@NonNull final Context pkg, @NonNull final String cls) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName(@NonNull final Context pkg, @NonNull final Class<?> cls) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ComponentName createRelative(@NonNull final String pkg, @NonNull final String cls) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ComponentName createRelative(@NonNull final Context pkg, @NonNull final String cls) {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName clone() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getShortClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String flattenToString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String flattenToShortString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static ComponentName unflattenFromString(@NonNull final String str) {
        throw new RuntimeException("Stub!");
    }
    
    public String toShortString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final ComponentName that) {
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
    
    public static void writeToParcel(final ComponentName c, final Parcel out) {
        throw new RuntimeException("Stub!");
    }
    
    public static ComponentName readFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
