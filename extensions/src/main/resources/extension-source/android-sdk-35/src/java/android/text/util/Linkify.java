package android.text.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.widget.TextView;
import android.text.style.URLSpan;
import java.util.function.Function;
import android.text.Spannable;

public class Linkify
{
    @Deprecated
    public static final int ALL = 15;
    public static final int EMAIL_ADDRESSES = 2;
    @Deprecated
    public static final int MAP_ADDRESSES = 8;
    public static final int PHONE_NUMBERS = 4;
    public static final int WEB_URLS = 1;
    public static final MatchFilter sPhoneNumberMatchFilter;
    public static final TransformFilter sPhoneNumberTransformFilter;
    public static final MatchFilter sUrlMatchFilter;
    
    public Linkify() {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable text, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable text, final int mask, @Nullable final Function<String, URLSpan> urlSpanFactory) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final TextView text, final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void addLinks(@NonNull final TextView text, @NonNull final Pattern pattern, @Nullable final String scheme) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void addLinks(@NonNull final TextView text, @NonNull final Pattern pattern, @Nullable final String scheme, @Nullable final MatchFilter matchFilter, @Nullable final TransformFilter transformFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void addLinks(@NonNull final TextView text, @NonNull final Pattern pattern, @Nullable final String defaultScheme, @Nullable final String[] schemes, @Nullable final MatchFilter matchFilter, @Nullable final TransformFilter transformFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable text, @NonNull final Pattern pattern, @Nullable final String scheme) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable spannable, @NonNull final Pattern pattern, @Nullable final String scheme, @Nullable final MatchFilter matchFilter, @Nullable final TransformFilter transformFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable spannable, @NonNull final Pattern pattern, @Nullable final String defaultScheme, @Nullable final String[] schemes, @Nullable final MatchFilter matchFilter, @Nullable final TransformFilter transformFilter) {
        throw new RuntimeException("Stub!");
    }
    
    public static final boolean addLinks(@NonNull final Spannable spannable, @NonNull final Pattern pattern, @Nullable final String defaultScheme, @Nullable final String[] schemes, @Nullable final MatchFilter matchFilter, @Nullable final TransformFilter transformFilter, @Nullable final Function<String, URLSpan> urlSpanFactory) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        sPhoneNumberMatchFilter = null;
        sPhoneNumberTransformFilter = null;
        sUrlMatchFilter = null;
    }
    
    public interface MatchFilter
    {
        boolean acceptMatch(final CharSequence p0, final int p1, final int p2);
    }
    
    public interface TransformFilter
    {
        String transformUrl(final Matcher p0, final String p1);
    }
}
