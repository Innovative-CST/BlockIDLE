package android.text;

import java.util.Iterator;
import java.util.Locale;
import java.util.List;
import android.content.Context;
import android.util.Printer;
import android.os.Parcel;
import java.util.regex.Pattern;
import android.os.Parcelable;

public class TextUtils
{
    public static final int CAP_MODE_CHARACTERS = 4096;
    public static final int CAP_MODE_SENTENCES = 16384;
    public static final int CAP_MODE_WORDS = 8192;
    public static final Parcelable.Creator<CharSequence> CHAR_SEQUENCE_CREATOR;
    public static final int SAFE_STRING_FLAG_FIRST_LINE = 4;
    public static final int SAFE_STRING_FLAG_SINGLE_LINE = 2;
    public static final int SAFE_STRING_FLAG_TRIM = 1;
    
    TextUtils() {
        throw new RuntimeException("Stub!");
    }
    
    public static void getChars(final CharSequence s, final int start, final int end, final char[] dest, final int destoff) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final char ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final char ch, final int start) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final char ch, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static int lastIndexOf(final CharSequence s, final char ch) {
        throw new RuntimeException("Stub!");
    }
    
    public static int lastIndexOf(final CharSequence s, final char ch, final int last) {
        throw new RuntimeException("Stub!");
    }
    
    public static int lastIndexOf(final CharSequence s, final char ch, final int start, final int last) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final CharSequence needle) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final CharSequence needle, final int start) {
        throw new RuntimeException("Stub!");
    }
    
    public static int indexOf(final CharSequence s, final CharSequence needle, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean regionMatches(final CharSequence one, final int toffset, final CharSequence two, final int ooffset, final int len) {
        throw new RuntimeException("Stub!");
    }
    
    public static String substring(final CharSequence source, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static String join(@NonNull final CharSequence delimiter, @NonNull final Object[] tokens) {
        throw new RuntimeException("Stub!");
    }
    
    public static String join(@NonNull final CharSequence delimiter, @NonNull final Iterable tokens) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] split(final String text, final String expression) {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] split(final String text, final Pattern pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence stringOrSpannedString(final CharSequence source) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isEmpty(@Nullable final CharSequence str) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getTrimmedLength(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean equals(final CharSequence a, final CharSequence b) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static CharSequence getReverse(final CharSequence source, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static void writeToParcel(@Nullable final CharSequence cs, @NonNull final Parcel p, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    public static void dumpSpans(final CharSequence cs, final Printer printer, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence replace(final CharSequence template, final String[] sources, final CharSequence[] destinations) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence expandTemplate(final CharSequence template, final CharSequence... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getOffsetBefore(final CharSequence text, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getOffsetAfter(final CharSequence text, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public static void copySpansFrom(final Spanned source, final int start, final int end, final Class kind, final Spannable dest, final int destoff) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence ellipsize(final CharSequence text, final TextPaint p, final float avail, final TruncateAt where) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence ellipsize(final CharSequence text, final TextPaint paint, final float avail, final TruncateAt where, final boolean preserveLength, @Nullable final EllipsizeCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence listEllipsize(@Nullable final Context context, @Nullable final List<CharSequence> elements, @NonNull final String separator, @NonNull final TextPaint paint, final float avail, final int moreId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static CharSequence commaEllipsize(final CharSequence text, final TextPaint p, final float avail, final String oneMore, final String more) {
        throw new RuntimeException("Stub!");
    }
    
    public static String htmlEncode(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    public static CharSequence concat(final CharSequence... text) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isGraphic(final CharSequence str) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static boolean isGraphic(final char c) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isDigitsOnly(final CharSequence str) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getCapsMode(final CharSequence cs, final int off, final int reqModes) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getLayoutDirectionFromLocale(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static CharSequence makeSafeForPresentation(@NonNull final String unclean, final int maxCharactersToConsider, final float ellipsizeDip, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CHAR_SEQUENCE_CREATOR = null;
    }
    
    public static class SimpleStringSplitter implements StringSplitter, Iterator<String>
    {
        public SimpleStringSplitter(final char delimiter) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void setString(final String string) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Iterator<String> iterator() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean hasNext() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String next() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void remove() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum TruncateAt
    {
        START, 
        MIDDLE, 
        END, 
        MARQUEE;
    }
    
    public interface StringSplitter extends Iterable<String>
    {
        void setString(final String p0);
    }
    
    public interface EllipsizeCallback
    {
        void ellipsized(final int p0, final int p1);
    }
}
