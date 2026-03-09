package android.app.usage;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class UsageEventsQuery implements Parcelable
{
    @NonNull
    public static final Creator<UsageEventsQuery> CREATOR;
    
    UsageEventsQuery() {
        throw new RuntimeException("Stub!");
    }
    
    public long getBeginTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEndTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getEventTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getPackageNames() {
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
    
    public static final class Builder
    {
        public Builder(final long beginTimeMillis, final long endTimeMillis) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public UsageEventsQuery build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEventTypes(@NonNull final int... eventTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPackageNames(@NonNull final String... pkgNames) {
            throw new RuntimeException("Stub!");
        }
    }
}
