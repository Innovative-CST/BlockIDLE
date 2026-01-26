package android.app.people;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConversationStatus implements Parcelable
{
    public static final int ACTIVITY_ANNIVERSARY = 2;
    public static final int ACTIVITY_AUDIO = 4;
    public static final int ACTIVITY_BIRTHDAY = 1;
    public static final int ACTIVITY_GAME = 6;
    public static final int ACTIVITY_LOCATION = 7;
    public static final int ACTIVITY_NEW_STORY = 3;
    public static final int ACTIVITY_OTHER = 0;
    public static final int ACTIVITY_UPCOMING_BIRTHDAY = 8;
    public static final int ACTIVITY_VIDEO = 5;
    public static final int AVAILABILITY_AVAILABLE = 0;
    public static final int AVAILABILITY_BUSY = 1;
    public static final int AVAILABILITY_OFFLINE = 2;
    public static final int AVAILABILITY_UNKNOWN = -1;
    @NonNull
    public static final Creator<ConversationStatus> CREATOR;
    
    ConversationStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAvailability() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEndTimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String id, @NonNull final int activity) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAvailability(final int availability) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIcon(@Nullable final Icon icon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setStartTimeMillis(final long startTimeMs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEndTimeMillis(final long endTimeMs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ConversationStatus build() {
            throw new RuntimeException("Stub!");
        }
    }
}
