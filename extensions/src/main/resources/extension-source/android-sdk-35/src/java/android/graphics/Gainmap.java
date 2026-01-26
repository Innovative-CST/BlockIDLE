package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public final class Gainmap implements Parcelable
{
    @NonNull
    public static final Creator<Gainmap> CREATOR;
    
    public Gainmap(@NonNull final Bitmap gainmapContents) {
        throw new RuntimeException("Stub!");
    }
    
    public Gainmap(@NonNull final Gainmap gainmap, @NonNull final Bitmap gainmapContents) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap getGainmapContents() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGainmapContents(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRatioMin(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getRatioMin() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRatioMax(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getRatioMax() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGamma(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getGamma() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEpsilonSdr(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getEpsilonSdr() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEpsilonHdr(final float r, final float g, final float b) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getEpsilonHdr() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplayRatioForFullHdr(final float max) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float getDisplayRatioForFullHdr() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMinDisplayRatioForHdrTransition(final float min) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float getMinDisplayRatioForHdrTransition() {
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
}
