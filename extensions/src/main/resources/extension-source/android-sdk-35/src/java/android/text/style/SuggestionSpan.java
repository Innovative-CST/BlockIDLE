package android.text.style;

import android.text.TextPaint;
import android.os.Parcel;
import java.util.Locale;
import android.content.Context;
import android.os.Parcelable;
import android.text.ParcelableSpan;

public class SuggestionSpan extends CharacterStyle implements ParcelableSpan
{
    @Deprecated
    public static final String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
    @NonNull
    public static final Parcelable.Creator<SuggestionSpan> CREATOR;
    public static final int FLAG_AUTO_CORRECTION = 4;
    public static final int FLAG_EASY_CORRECT = 1;
    public static final int FLAG_GRAMMAR_ERROR = 8;
    public static final int FLAG_MISSPELLED = 2;
    public static final int SUGGESTIONS_MAX_SIZE = 5;
    @Deprecated
    public static final String SUGGESTION_SPAN_PICKED_AFTER = "after";
    @Deprecated
    public static final String SUGGESTION_SPAN_PICKED_BEFORE = "before";
    @Deprecated
    public static final String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
    
    public SuggestionSpan(final Context context, final String[] suggestions, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionSpan(final Locale locale, final String[] suggestions, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionSpan(final Context context, final Locale locale, final String[] suggestions, final int flags, final Class<?> notificationTargetClass) {
        throw new RuntimeException("Stub!");
    }
    
    public SuggestionSpan(final Parcel src) {
        throw new RuntimeException("Stub!");
    }
    
    public String[] getSuggestions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public String getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Locale getLocaleObject() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFlags(final int flags) {
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
    
    @Override
    public int getSpanTypeId() {
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
    public void updateDrawState(final TextPaint tp) {
        throw new RuntimeException("Stub!");
    }
    
    public int getUnderlineColor() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
