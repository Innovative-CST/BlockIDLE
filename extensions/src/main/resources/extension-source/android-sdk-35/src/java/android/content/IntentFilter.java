package android.content;

import android.util.AndroidException;
import android.os.Parcel;
import android.util.Printer;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;
import java.util.function.Predicate;
import java.util.Set;
import android.net.Uri;
import android.os.PatternMatcher;
import java.util.Iterator;
import android.os.Parcelable;

public class IntentFilter implements Parcelable
{
    @NonNull
    public static final Creator<IntentFilter> CREATOR;
    public static final int MATCH_ADJUSTMENT_MASK = 65535;
    public static final int MATCH_ADJUSTMENT_NORMAL = 32768;
    public static final int MATCH_CATEGORY_EMPTY = 1048576;
    public static final int MATCH_CATEGORY_HOST = 3145728;
    public static final int MATCH_CATEGORY_MASK = 268369920;
    public static final int MATCH_CATEGORY_PATH = 5242880;
    public static final int MATCH_CATEGORY_PORT = 4194304;
    public static final int MATCH_CATEGORY_SCHEME = 2097152;
    public static final int MATCH_CATEGORY_SCHEME_SPECIFIC_PART = 5767168;
    public static final int MATCH_CATEGORY_TYPE = 6291456;
    public static final int NO_MATCH_ACTION = -3;
    public static final int NO_MATCH_CATEGORY = -4;
    public static final int NO_MATCH_DATA = -2;
    public static final int NO_MATCH_TYPE = -1;
    public static final int SYSTEM_HIGH_PRIORITY = 1000;
    public static final int SYSTEM_LOW_PRIORITY = -1000;
    
    public IntentFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public IntentFilter(final String action) {
        throw new RuntimeException("Stub!");
    }
    
    public IntentFilter(final String action, final String dataType) throws MalformedMimeTypeException {
        throw new RuntimeException("Stub!");
    }
    
    public IntentFilter(final IntentFilter o) {
        throw new RuntimeException("Stub!");
    }
    
    public static IntentFilter create(final String action, final String dataType) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setPriority(final int priority) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getPriority() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addAction(final String action) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countActions() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getAction(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasAction(final String action) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean matchAction(final String action) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<String> actionsIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addDataType(final String type) throws MalformedMimeTypeException {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasDataType(final String type) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countDataTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDataType(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<String> typesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addDataScheme(final String scheme) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countDataSchemes() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getDataScheme(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasDataScheme(final String scheme) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<String> schemesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addDataSchemeSpecificPart(final String ssp, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countDataSchemeSpecificParts() {
        throw new RuntimeException("Stub!");
    }
    
    public final PatternMatcher getDataSchemeSpecificPart(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasDataSchemeSpecificPart(final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<PatternMatcher> schemeSpecificPartsIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addDataAuthority(final String host, final String port) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countDataAuthorities() {
        throw new RuntimeException("Stub!");
    }
    
    public final AuthorityEntry getDataAuthority(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasDataAuthority(final Uri data) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<AuthorityEntry> authoritiesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addDataPath(final String path, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countDataPaths() {
        throw new RuntimeException("Stub!");
    }
    
    public final PatternMatcher getDataPath(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasDataPath(final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<PatternMatcher> pathsIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addUriRelativeFilterGroup(@NonNull final UriRelativeFilterGroup group) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countUriRelativeFilterGroups() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final UriRelativeFilterGroup getUriRelativeFilterGroup(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final void clearUriRelativeFilterGroups() {
        throw new RuntimeException("Stub!");
    }
    
    public final int matchDataAuthority(final Uri data) {
        throw new RuntimeException("Stub!");
    }
    
    public final int matchData(final String type, final String scheme, final Uri data) {
        throw new RuntimeException("Stub!");
    }
    
    public final void addCategory(final String category) {
        throw new RuntimeException("Stub!");
    }
    
    public final int countCategories() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getCategory(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean hasCategory(final String category) {
        throw new RuntimeException("Stub!");
    }
    
    public final Iterator<String> categoriesIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final String matchCategories(final Set<String> categories) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Predicate<Intent> asPredicate() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Predicate<Intent> asPredicateWithTypeResolution(@NonNull final ContentResolver resolver) {
        throw new RuntimeException("Stub!");
    }
    
    public final int match(final ContentResolver resolver, final Intent intent, final boolean resolve, final String logTag) {
        throw new RuntimeException("Stub!");
    }
    
    public final int match(final String action, final String type, final String scheme, final Uri data, final Set<String> categories, final String logTag) {
        throw new RuntimeException("Stub!");
    }
    
    public void writeToXml(final XmlSerializer serializer) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromXml(final XmlPullParser parser) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final Printer du, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class AuthorityEntry
    {
        public AuthorityEntry(final String host, final String port) {
            throw new RuntimeException("Stub!");
        }
        
        public String getHost() {
            throw new RuntimeException("Stub!");
        }
        
        public int getPort() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(@Nullable final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        public int match(final Uri data) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MalformedMimeTypeException extends AndroidException
    {
        public MalformedMimeTypeException() {
            throw new RuntimeException("Stub!");
        }
        
        public MalformedMimeTypeException(final String name) {
            throw new RuntimeException("Stub!");
        }
    }
}
