package android.window;

import android.os.Parcel;
import android.os.Parcelable;

public final class TrustedPresentationThresholds implements Parcelable
{
    @NonNull
    public static final Creator<TrustedPresentationThresholds> CREATOR;
    
    public TrustedPresentationThresholds(final float minAlpha, final float minFractionRendered, final int stabilityRequirementMs) {
        throw new RuntimeException("Stub!");
    }
    
    public float getMinAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMinFractionRendered() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStabilityRequirementMillis() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
