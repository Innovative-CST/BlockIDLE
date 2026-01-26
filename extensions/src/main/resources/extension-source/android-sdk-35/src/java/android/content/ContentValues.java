package android.content;

import android.os.Parcel;
import java.util.Map;
import java.util.Set;
import android.os.Parcelable;

public final class ContentValues implements Parcelable
{
    @NonNull
    public static final Creator<ContentValues> CREATOR;
    public static final String TAG = "ContentValues";
    
    public ContentValues() {
        throw new RuntimeException("Stub!");
    }
    
    public ContentValues(final int size) {
        throw new RuntimeException("Stub!");
    }
    
    public ContentValues(final ContentValues from) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putAll(final ContentValues other) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Byte value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Short value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Integer value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Long value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Float value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Double value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final Boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public void put(final String key, final byte[] value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putNull(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public void remove(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsKey(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Object get(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public String getAsString(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Long getAsLong(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Integer getAsInteger(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Short getAsShort(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Byte getAsByte(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Double getAsDouble(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Float getAsFloat(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Boolean getAsBoolean(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getAsByteArray(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Map.Entry<String, Object>> valueSet() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> keySet() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
