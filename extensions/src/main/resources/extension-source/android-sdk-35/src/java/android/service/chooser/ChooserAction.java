package android.service.chooser;

import android.os.Parcel;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class ChooserAction implements Parcelable
{
    @NonNull
    public static final Creator<ChooserAction> CREATOR;
    
    ChooserAction() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PendingIntent getAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final Icon icon, @NonNull final CharSequence label, @NonNull final PendingIntent action) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ChooserAction build() {
            throw new RuntimeException("Stub!");
        }
    }
}
