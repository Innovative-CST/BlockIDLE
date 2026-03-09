package android.view.textservice;

import android.os.Parcel;
import android.os.Parcelable;

public final class TextInfo implements Parcelable
{
    @NonNull
    public static final Creator<TextInfo> CREATOR;
    
    public TextInfo(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public TextInfo(final String text, final int cookie, final int sequenceNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public TextInfo(final CharSequence charSequence, final int start, final int end, final int cookie, final int sequenceNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public TextInfo(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public String getText() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getCharSequence() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCookie() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSequence() {
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
