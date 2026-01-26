package android.adservices.adselection;

import android.os.Parcel;
import android.os.Parcelable;

public final class DecisionLogic implements Parcelable
{
    @NonNull
    public static final Creator<DecisionLogic> CREATOR;
    
    public DecisionLogic(@NonNull final String buyerDecisionLogic) {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getLogic() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
