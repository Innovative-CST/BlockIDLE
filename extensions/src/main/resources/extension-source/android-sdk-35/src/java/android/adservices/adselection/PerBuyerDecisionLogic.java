package android.adservices.adselection;

import android.os.Parcel;
import android.adservices.common.AdTechIdentifier;
import java.util.Map;
import android.os.Parcelable;

public final class PerBuyerDecisionLogic implements Parcelable
{
    @NonNull
    public static final Creator<PerBuyerDecisionLogic> CREATOR;
    @NonNull
    public static final PerBuyerDecisionLogic EMPTY;
    
    public PerBuyerDecisionLogic(@NonNull final Map<AdTechIdentifier, DecisionLogic> perBuyerLogicMap) {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<AdTechIdentifier, DecisionLogic> getPerBuyerLogicMap() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
        EMPTY = null;
    }
}
