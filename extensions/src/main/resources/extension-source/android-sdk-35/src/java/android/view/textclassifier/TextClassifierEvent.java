package android.view.textclassifier;

import android.os.Bundle;
import android.icu.util.ULocale;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class TextClassifierEvent implements Parcelable
{
    public static final int CATEGORY_CONVERSATION_ACTIONS = 3;
    public static final int CATEGORY_LANGUAGE_DETECTION = 4;
    public static final int CATEGORY_LINKIFY = 2;
    public static final int CATEGORY_SELECTION = 1;
    @NonNull
    public static final Creator<TextClassifierEvent> CREATOR;
    public static final int TYPE_ACTIONS_GENERATED = 20;
    public static final int TYPE_ACTIONS_SHOWN = 6;
    public static final int TYPE_AUTO_SELECTION = 5;
    public static final int TYPE_COPY_ACTION = 9;
    public static final int TYPE_CUT_ACTION = 11;
    public static final int TYPE_LINKS_GENERATED = 21;
    public static final int TYPE_LINK_CLICKED = 7;
    public static final int TYPE_MANUAL_REPLY = 19;
    public static final int TYPE_OTHER_ACTION = 16;
    public static final int TYPE_OVERTYPE = 8;
    public static final int TYPE_PASTE_ACTION = 10;
    public static final int TYPE_SELECTION_DESTROYED = 15;
    public static final int TYPE_SELECTION_DRAG = 14;
    public static final int TYPE_SELECTION_MODIFIED = 2;
    public static final int TYPE_SELECTION_RESET = 18;
    public static final int TYPE_SELECTION_STARTED = 1;
    public static final int TYPE_SELECT_ALL = 17;
    public static final int TYPE_SHARE_ACTION = 12;
    public static final int TYPE_SMART_ACTION = 13;
    public static final int TYPE_SMART_SELECTION_MULTI = 4;
    public static final int TYPE_SMART_SELECTION_SINGLE = 3;
    
    TextClassifierEvent() {
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
    
    public int getEventCategory() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String[] getEntityTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TextClassificationContext getEventContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getResultId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public float[] getScores() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getModelName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getActionIndices() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ULocale getLocale() {
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
    
    static {
        CREATOR = null;
    }
    
    public abstract static class Builder<T extends Builder<T>>
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setEntityTypes(@NonNull final String... entityTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setEventContext(@Nullable final TextClassificationContext eventContext) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setResultId(@Nullable final String resultId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setEventIndex(final int eventIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setScores(@NonNull final float... scores) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setModelName(@Nullable final String modelVersion) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setActionIndices(@NonNull final int... actionIndices) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setLocale(@Nullable final ULocale locale) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public T setExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class ConversationActionsEvent extends TextClassifierEvent implements Parcelable
    {
        @NonNull
        public static final Creator<ConversationActionsEvent> CREATOR;
        
        ConversationActionsEvent() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder extends TextClassifierEvent.Builder<Builder>
        {
            public Builder(final int eventType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public ConversationActionsEvent build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class LanguageDetectionEvent extends TextClassifierEvent implements Parcelable
    {
        @NonNull
        public static final Creator<LanguageDetectionEvent> CREATOR;
        
        LanguageDetectionEvent() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder extends TextClassifierEvent.Builder<Builder>
        {
            public Builder(final int eventType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public LanguageDetectionEvent build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class TextLinkifyEvent extends TextClassifierEvent implements Parcelable
    {
        @NonNull
        public static final Creator<TextLinkifyEvent> CREATOR;
        
        TextLinkifyEvent() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder extends TextClassifierEvent.Builder<Builder>
        {
            public Builder(final int eventType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public TextLinkifyEvent build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class TextSelectionEvent extends TextClassifierEvent implements Parcelable
    {
        @NonNull
        public static final Creator<TextSelectionEvent> CREATOR;
        
        TextSelectionEvent() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public int getRelativeWordStartIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRelativeWordEndIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRelativeSuggestedWordStartIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRelativeSuggestedWordEndIndex() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder extends TextClassifierEvent.Builder<Builder>
        {
            public Builder(final int eventType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setRelativeWordStartIndex(final int relativeWordStartIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setRelativeWordEndIndex(final int relativeWordEndIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setRelativeSuggestedWordStartIndex(final int relativeSuggestedWordStartIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setRelativeSuggestedWordEndIndex(final int relativeSuggestedWordEndIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public TextSelectionEvent build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
