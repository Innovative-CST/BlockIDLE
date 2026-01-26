package android.view.textclassifier;

import java.util.Collection;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.LocaleList;

public interface TextClassifier
{
    public static final String EXTRA_FROM_TEXT_CLASSIFIER = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER";
    public static final String HINT_TEXT_IS_EDITABLE = "android.text_is_editable";
    public static final String HINT_TEXT_IS_NOT_EDITABLE = "android.text_is_not_editable";
    public static final TextClassifier NO_OP = null;
    public static final String TYPE_ADDRESS = "address";
    public static final String TYPE_DATE = "date";
    public static final String TYPE_DATE_TIME = "datetime";
    public static final String TYPE_EMAIL = "email";
    public static final String TYPE_FLIGHT_NUMBER = "flight";
    public static final String TYPE_OTHER = "other";
    public static final String TYPE_PHONE = "phone";
    public static final String TYPE_UNKNOWN = "";
    public static final String TYPE_URL = "url";
    public static final String WIDGET_TYPE_CLIPBOARD = "clipboard";
    public static final String WIDGET_TYPE_CUSTOM_EDITTEXT = "customedit";
    public static final String WIDGET_TYPE_CUSTOM_TEXTVIEW = "customview";
    public static final String WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW = "nosel-customview";
    public static final String WIDGET_TYPE_EDITTEXT = "edittext";
    public static final String WIDGET_TYPE_EDIT_WEBVIEW = "edit-webview";
    public static final String WIDGET_TYPE_NOTIFICATION = "notification";
    public static final String WIDGET_TYPE_TEXTVIEW = "textview";
    public static final String WIDGET_TYPE_UNKNOWN = "unknown";
    public static final String WIDGET_TYPE_UNSELECTABLE_TEXTVIEW = "nosel-textview";
    public static final String WIDGET_TYPE_WEBVIEW = "webview";
    
    @NonNull
    default TextSelection suggestSelection(@NonNull final TextSelection.Request request) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default TextSelection suggestSelection(@NonNull final CharSequence text, final int selectionStartIndex, final int selectionEndIndex, @Nullable final LocaleList defaultLocales) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default TextClassification classifyText(@NonNull final TextClassification.Request request) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default TextClassification classifyText(@NonNull final CharSequence text, final int startIndex, final int endIndex, @Nullable final LocaleList defaultLocales) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default TextLinks generateLinks(@NonNull final TextLinks.Request request) {
        throw new RuntimeException("Stub!");
    }
    
    default int getMaxGenerateLinksTextLength() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default TextLanguage detectLanguage(@NonNull final TextLanguage.Request request) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default ConversationActions suggestConversationActions(@NonNull final ConversationActions.Request request) {
        throw new RuntimeException("Stub!");
    }
    
    default void onSelectionEvent(@NonNull final SelectionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    default void onTextClassifierEvent(@NonNull final TextClassifierEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    default void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    default boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class EntityConfig implements Parcelable
    {
        @NonNull
        public static final Creator<EntityConfig> CREATOR;
        
        EntityConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static EntityConfig createWithHints(@Nullable final Collection<String> hints) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static EntityConfig create(@Nullable final Collection<String> hints, @Nullable final Collection<String> includedEntityTypes, @Nullable final Collection<String> excludedEntityTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public static EntityConfig createWithExplicitEntityList(@Nullable final Collection<String> entityTypes) {
            throw new RuntimeException("Stub!");
        }
        
        public Collection<String> resolveEntityListModifications(@NonNull final Collection<String> entityTypes) {
            throw new RuntimeException("Stub!");
        }
        
        public Collection<String> getHints() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean shouldIncludeTypesFromTextClassifier() {
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
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setIncludedTypes(@Nullable final Collection<String> includedTypes) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExcludedTypes(@Nullable final Collection<String> excludedTypes) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder includeTypesFromTextClassifier(final boolean includeTypesFromTextClassifier) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setHints(@Nullable final Collection<String> hints) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public EntityConfig build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
