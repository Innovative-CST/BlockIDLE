package android.nfc;

import android.os.Parcel;
import android.net.Uri;
import android.os.Parcelable;

public final class NdefRecord implements Parcelable
{
    @NonNull
    public static final Creator<NdefRecord> CREATOR;
    public static final byte[] RTD_ALTERNATIVE_CARRIER;
    public static final byte[] RTD_HANDOVER_CARRIER;
    public static final byte[] RTD_HANDOVER_REQUEST;
    public static final byte[] RTD_HANDOVER_SELECT;
    public static final byte[] RTD_SMART_POSTER;
    public static final byte[] RTD_TEXT;
    public static final byte[] RTD_URI;
    public static final short TNF_ABSOLUTE_URI = 3;
    public static final short TNF_EMPTY = 0;
    public static final short TNF_EXTERNAL_TYPE = 4;
    public static final short TNF_MIME_MEDIA = 2;
    public static final short TNF_UNCHANGED = 6;
    public static final short TNF_UNKNOWN = 5;
    public static final short TNF_WELL_KNOWN = 1;
    
    public NdefRecord(final short tnf, final byte[] type, final byte[] id, final byte[] payload) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NdefRecord(final byte[] data) throws FormatException {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createApplicationRecord(final String packageName) {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createUri(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createUri(final String uriString) {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createMime(final String mimeType, final byte[] mimeData) {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createExternal(final String domain, final String type, final byte[] data) {
        throw new RuntimeException("Stub!");
    }
    
    public static NdefRecord createTextRecord(final String languageCode, final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public short getTnf() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getType() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getId() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getPayload() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    public String toMimeType() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri toUri() {
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
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
        RTD_ALTERNATIVE_CARRIER = null;
        RTD_HANDOVER_CARRIER = null;
        RTD_HANDOVER_REQUEST = null;
        RTD_HANDOVER_SELECT = null;
        RTD_SMART_POSTER = null;
        RTD_TEXT = null;
        RTD_URI = null;
    }
}
