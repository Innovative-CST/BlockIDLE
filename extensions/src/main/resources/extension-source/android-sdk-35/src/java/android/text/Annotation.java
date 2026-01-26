package android.text;

import android.os.Parcel;

public class Annotation implements ParcelableSpan
{
    public Annotation(final String key, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public Annotation(final Parcel src) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanTypeId() {
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
    
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public String getValue() {
        throw new RuntimeException("Stub!");
    }
}
