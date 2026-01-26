package android.app;

import android.os.Parcel;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class Person implements Parcelable
{
    @NonNull
    public static final Creator<Person> CREATOR;
    
    Person() {
        throw new RuntimeException("Stub!");
    }
    
    public Builder toBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBot() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isImportant() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setName(@Nullable final CharSequence name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIcon(@Nullable final Icon icon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUri(@Nullable final String uri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKey(@Nullable final String key) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setImportant(final boolean isImportant) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBot(final boolean isBot) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Person build() {
            throw new RuntimeException("Stub!");
        }
    }
}
