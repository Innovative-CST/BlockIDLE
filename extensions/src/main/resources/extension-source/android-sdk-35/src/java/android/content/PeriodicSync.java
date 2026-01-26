package android.content;

import android.os.Parcel;
import android.os.Bundle;
import android.accounts.Account;
import android.os.Parcelable;

public class PeriodicSync implements Parcelable
{
    @NonNull
    public static final Creator<PeriodicSync> CREATOR;
    public final Account account;
    public final String authority;
    public final Bundle extras;
    public final long period;
    
    public PeriodicSync(final Account account, final String authority, final Bundle extras, final long periodInSeconds) {
        this.account = null;
        this.authority = null;
        this.extras = null;
        this.period = 0L;
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
    public boolean equals(@Nullable final Object o) {
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
