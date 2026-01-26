package android.view.textservice;

import android.os.Parcel;
import android.os.Parcelable;

public final class SuggestionsInfo implements Parcelable
{
    @NonNull
    public static final Creator<SuggestionsInfo> CREATOR;
    public static final int RESULT_ATTR_DONT_SHOW_UI_FOR_SUGGESTIONS = 16;
    public static final int RESULT_ATTR_HAS_RECOMMENDED_SUGGESTIONS = 4;
    public static final int RESULT_ATTR_IN_THE_DICTIONARY = 1;
    public static final int RESULT_ATTR_LOOKS_LIKE_GRAMMAR_ERROR = 8;
    public static final int RESULT_ATTR_LOOKS_LIKE_TYPO = 2;
    
    public SuggestionsInfo(final int suggestionsAttributes, final String[] suggestions) {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionsInfo(final int suggestionsAttributes, final String[] suggestions, final int cookie, final int sequence) {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionsInfo(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCookieAndSequence(final int cookie, final int sequence) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCookie() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSequence() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSuggestionsAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSuggestionsCount() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestionAt(final int i) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
