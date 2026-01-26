package android.accounts;

import android.os.Parcel;
import android.os.Parcelable;

public class Account implements Parcelable
{
    @NonNull
    public static final Creator<Account> CREATOR;
    @NonNull
    public final String name;
    @NonNull
    public final String type;
    
    public Account(@NonNull final String name, @NonNull final String type) {
        this.name = null;
        this.type = null;
        throw new RuntimeException("Stub!");
    }
    
    public Account(final Parcel in) {
        this.name = null;
        this.type = null;
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
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
