package android.view.textclassifier;

import android.os.Bundle;
import java.time.ZonedDateTime;
import android.app.Person;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class ConversationActions implements Parcelable
{
    @NonNull
    public static final Creator<ConversationActions> CREATOR;
    
    public ConversationActions(@NonNull final List<ConversationAction> conversationActions, @Nullable final String id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ConversationAction> getConversationActions() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Message implements Parcelable
    {
        @NonNull
        public static final Creator<Message> CREATOR;
        @NonNull
        public static final Person PERSON_USER_OTHERS;
        @NonNull
        public static final Person PERSON_USER_SELF;
        
        Message() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Person getAuthor() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public ZonedDateTime getReferenceTime() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public CharSequence getText() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
            PERSON_USER_OTHERS = null;
            PERSON_USER_SELF = null;
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final Person author) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setText(@Nullable final CharSequence text) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setReferenceTime(@Nullable final ZonedDateTime referenceTime) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@Nullable final Bundle bundle) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Message build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Request implements Parcelable
    {
        @NonNull
        public static final Creator<Request> CREATOR;
        public static final String HINT_FOR_IN_APP = "in_app";
        public static final String HINT_FOR_NOTIFICATION = "notification";
        
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextClassifier.EntityConfig getTypeConfig() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<Message> getConversation() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMaxSuggestions() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public List<String> getHints() {
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
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final List<Message> conversation) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setHints(@Nullable final List<String> hints) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setTypeConfig(@Nullable final TextClassifier.EntityConfig typeConfig) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setMaxSuggestions(final int maxSuggestions) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@Nullable final Bundle bundle) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
