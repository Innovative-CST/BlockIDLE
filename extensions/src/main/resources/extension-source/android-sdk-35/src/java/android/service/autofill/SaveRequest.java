package android.service.autofill;

import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;

public final class SaveRequest implements Parcelable
{
    @NonNull
    public static final Creator<SaveRequest> CREATOR;
    
    SaveRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<FillContext> getFillContexts() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getClientState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<String> getDatasetIds() {
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
    
    static {
        CREATOR = null;
    }
}
