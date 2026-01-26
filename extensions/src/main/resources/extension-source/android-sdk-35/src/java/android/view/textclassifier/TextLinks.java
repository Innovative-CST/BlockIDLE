package android.view.textclassifier;

import android.view.View;
import android.text.style.ClickableSpan;
import java.time.ZonedDateTime;
import android.os.LocaleList;
import java.util.Map;
import android.os.Parcel;
import java.util.function.Function;
import android.text.Spannable;
import android.os.Bundle;
import java.util.Collection;
import android.os.Parcelable;

public final class TextLinks implements Parcelable
{
    public static final int APPLY_STRATEGY_IGNORE = 0;
    public static final int APPLY_STRATEGY_REPLACE = 1;
    @NonNull
    public static final Creator<TextLinks> CREATOR;
    public static final int STATUS_DIFFERENT_TEXT = 3;
    public static final int STATUS_LINKS_APPLIED = 0;
    public static final int STATUS_NO_LINKS_APPLIED = 2;
    public static final int STATUS_NO_LINKS_FOUND = 1;
    public static final int STATUS_UNSUPPORTED_CHARACTER = 4;
    
    TextLinks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<TextLink> getLinks() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public int apply(@NonNull final Spannable text, final int applyStrategy, @Nullable final Function<TextLink, TextLinkSpan> spanFactory) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final String fullText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addLink(final int start, final int end, @NonNull final Map<String, Float> entityScores) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addLink(final int start, final int end, @NonNull final Map<String, Float> entityScores, @NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearTextLinks() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextLinks build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Request implements Parcelable
    {
        @NonNull
        public static final Creator<Request> CREATOR;
        
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getText() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public LocaleList getDefaultLocales() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public TextClassifier.EntityConfig getEntityConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ZonedDateTime getReferenceTime() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getCallingPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
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
        
        public static final class Builder
        {
            public Builder(@NonNull final CharSequence text) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDefaultLocales(@Nullable final LocaleList defaultLocales) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setEntityConfig(@Nullable final TextClassifier.EntityConfig entityConfig) {
                throw new RuntimeException("Stub!");
            }
            
            public Builder setExtras(@Nullable final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setReferenceTime(@Nullable final ZonedDateTime referenceTime) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class TextLink implements Parcelable
    {
        @NonNull
        public static final Creator<TextLink> CREATOR;
        
        TextLink() {
            throw new RuntimeException("Stub!");
        }
        
        public int getStart() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEnd() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEntityCount() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getEntity(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        public float getConfidenceScore(final String entityType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
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
    }
    
    public static class TextLinkSpan extends ClickableSpan
    {
        public TextLinkSpan(@NonNull final TextLink textLink) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onClick(final View widget) {
            throw new RuntimeException("Stub!");
        }
        
        public final TextLink getTextLink() {
            throw new RuntimeException("Stub!");
        }
    }
}
