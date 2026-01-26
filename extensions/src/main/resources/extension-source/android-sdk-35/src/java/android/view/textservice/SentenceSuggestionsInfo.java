package android.view.textservice;

import android.os.Parcel;
import android.os.Parcelable;

public final class SentenceSuggestionsInfo implements Parcelable
{
    @NonNull
    public static final Creator<SentenceSuggestionsInfo> CREATOR;
    
    public SentenceSuggestionsInfo(final SuggestionsInfo[] suggestionsInfos, final int[] offsets, final int[] lengths) {
        throw new RuntimeException("Stub!");
    }
    
    public SentenceSuggestionsInfo(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSuggestionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionsInfo getSuggestionsInfoAt(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOffsetAt(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLengthAt(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
