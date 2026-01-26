package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class Rating implements Parcelable
{
    @NonNull
    public static final Creator<Rating> CREATOR;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;
    
    Rating() {
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
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rating newUnratedRating(final int ratingStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rating newHeartRating(final boolean hasHeart) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rating newThumbRating(final boolean thumbIsUp) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rating newStarRating(final int starRatingStyle, final float starRating) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rating newPercentageRating(final float percent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRated() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRatingStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasHeart() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isThumbUp() {
        throw new RuntimeException("Stub!");
    }
    
    public float getStarRating() {
        throw new RuntimeException("Stub!");
    }
    
    public float getPercentRating() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
