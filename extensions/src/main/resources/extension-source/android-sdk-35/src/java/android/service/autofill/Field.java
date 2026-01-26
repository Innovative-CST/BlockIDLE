package android.service.autofill;

import java.util.regex.Pattern;
import android.view.autofill.AutofillValue;

public final class Field
{
    Field() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AutofillValue getValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Pattern getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Presentations getPresentations() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setValue(@NonNull final AutofillValue value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFilter(@Nullable final Pattern value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPresentations(@NonNull final Presentations value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Field build() {
            throw new RuntimeException("Stub!");
        }
    }
}
