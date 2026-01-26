package android.view.inputmethod;

import android.os.Parcel;
import android.os.Bundle;
import android.os.LocaleList;
import android.widget.inline.InlinePresentationSpec;
import java.util.List;
import android.os.Parcelable;

public final class InlineSuggestionsRequest implements Parcelable
{
    @NonNull
    public static final Creator<InlineSuggestionsRequest> CREATOR;
    public static final int SUGGESTION_COUNT_UNLIMITED = Integer.MAX_VALUE;
    
    InlineSuggestionsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSuggestionCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<InlinePresentationSpec> getInlinePresentationSpecs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getHostPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public LocaleList getSupportedLocales() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InlinePresentationSpec getInlineTooltipPresentationSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final List<InlinePresentationSpec> inlinePresentationSpecs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxSuggestionCount(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInlinePresentationSpecs(@NonNull final List<InlinePresentationSpec> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addInlinePresentationSpecs(@NonNull final InlinePresentationSpec value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSupportedLocales(@NonNull final LocaleList value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final Bundle value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInlineTooltipPresentationSpec(@NonNull final InlinePresentationSpec value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public InlineSuggestionsRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
