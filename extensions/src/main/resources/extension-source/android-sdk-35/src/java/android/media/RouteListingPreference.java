package android.media;

import android.os.Parcel;
import android.content.ComponentName;
import java.util.List;
import android.os.Parcelable;

public final class RouteListingPreference implements Parcelable
{
    public static final String ACTION_TRANSFER_MEDIA = "android.media.action.TRANSFER_MEDIA";
    @NonNull
    public static final Creator<RouteListingPreference> CREATOR;
    public static final String EXTRA_ROUTE_ID = "android.media.extra.ROUTE_ID";
    
    RouteListingPreference() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Item> getItems() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getUseSystemOrdering() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ComponentName getLinkedItemComponentName() {
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
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
        
        @NonNull
        public Builder setItems(@NonNull final List<Item> items) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUseSystemOrdering(final boolean useSystemOrdering) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLinkedItemComponentName(@Nullable final ComponentName linkedItemComponentName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RouteListingPreference build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Item implements Parcelable
    {
        @NonNull
        public static final Creator<Item> CREATOR;
        public static final int FLAG_ONGOING_SESSION = 1;
        public static final int FLAG_ONGOING_SESSION_MANAGED = 2;
        public static final int FLAG_SUGGESTED = 4;
        public static final int SELECTION_BEHAVIOR_GO_TO_APP = 2;
        public static final int SELECTION_BEHAVIOR_NONE = 0;
        public static final int SELECTION_BEHAVIOR_TRANSFER = 1;
        public static final int SUBTEXT_AD_ROUTING_DISALLOWED = 4;
        public static final int SUBTEXT_CUSTOM = 10000;
        public static final int SUBTEXT_DEVICE_LOW_POWER = 5;
        public static final int SUBTEXT_DOWNLOADED_CONTENT_ROUTING_DISALLOWED = 3;
        public static final int SUBTEXT_ERROR_UNKNOWN = 1;
        public static final int SUBTEXT_NONE = 0;
        public static final int SUBTEXT_SUBSCRIPTION_REQUIRED = 2;
        public static final int SUBTEXT_TRACK_UNSUPPORTED = 7;
        public static final int SUBTEXT_UNAUTHORIZED = 6;
        
        Item() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getRouteId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSelectionBehavior() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSubText() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getCustomSubtextMessage() {
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
        
        @Override
        public boolean equals(final Object other) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final String routeId) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSelectionBehavior(final int selectionBehavior) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setFlags(final int flags) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setSubText(final int subText) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCustomSubtextMessage(@Nullable final CharSequence customSubtextMessage) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Item build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
