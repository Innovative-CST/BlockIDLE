package android.content;

import android.os.Parcel;
import android.accounts.Account;
import android.os.Parcelable;

public class SyncInfo implements Parcelable
{
    public final Account account;
    public final String authority;
    public final long startTime;
    
    SyncInfo() {
        this.account = null;
        this.authority = null;
        this.startTime = 0L;
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
}
