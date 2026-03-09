package android.print;

import android.os.Parcel;
import android.os.Parcelable;

public final class PageRange implements Parcelable
{
    public static final PageRange ALL_PAGES;
    @NonNull
    public static final Creator<PageRange> CREATOR;
    
    public PageRange(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public int getStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEnd() {
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
    
    static {
        ALL_PAGES = null;
        CREATOR = null;
    }
}
