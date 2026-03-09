package android.view.inputmethod;

import android.os.Parcel;
import android.os.PersistableBundle;
import java.util.List;
import android.os.Parcelable;

public final class TextAttribute implements Parcelable
{
    @NonNull
    public static final Creator<TextAttribute> CREATOR;
    
    TextAttribute() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getTextConversionSuggestions() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PersistableBundle getExtras() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextConversionSuggestions(@NonNull final List<String> textConversionSuggestions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final PersistableBundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextAttribute build() {
            throw new RuntimeException("Stub!");
        }
    }
}
