package android.view.autofill;

import android.os.Parcel;
import android.os.Parcelable;

public final class AutofillValue implements Parcelable
{
    @NonNull
    public static final Creator<AutofillValue> CREATOR;
    
    AutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getTextValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isText() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getToggleValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isToggle() {
        throw new RuntimeException("Stub!");
    }
    
    public int getListValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isList() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDateValue() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static AutofillValue forText(@Nullable final CharSequence value) {
        throw new RuntimeException("Stub!");
    }
    
    public static AutofillValue forToggle(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public static AutofillValue forList(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public static AutofillValue forDate(final long value) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
