package android.telephony.data;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class UrspRule implements Parcelable
{
    @NonNull
    public static final Creator<UrspRule> CREATOR;
    
    UrspRule() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrecedence() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TrafficDescriptor> getTrafficDescriptors() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<RouteSelectionDescriptor> getRouteSelectionDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
