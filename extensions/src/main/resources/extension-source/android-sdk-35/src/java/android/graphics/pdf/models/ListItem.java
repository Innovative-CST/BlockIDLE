package android.graphics.pdf.models;

import android.os.Parcel;
import android.os.Parcelable;

public final class ListItem implements Parcelable
{
    @NonNull
    public static final Creator<ListItem> CREATOR;
    
    public ListItem(@NonNull final String label, final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSelected() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
