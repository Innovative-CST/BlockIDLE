package android.media;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class Session2CommandGroup implements Parcelable
{
    @NonNull
    public static final Creator<Session2CommandGroup> CREATOR;
    
    Session2CommandGroup() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCommand(@NonNull final Session2Command command) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasCommand(final int commandCode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Session2Command> getCommands() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Session2CommandGroup commandGroup) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addCommand(@NonNull final Session2Command command) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder removeCommand(@NonNull final Session2Command command) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Session2CommandGroup build() {
            throw new RuntimeException("Stub!");
        }
    }
}
