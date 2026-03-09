package android.view.textclassifier;

import android.os.Bundle;
import android.app.RemoteAction;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConversationAction implements Parcelable
{
    @NonNull
    public static final Creator<ConversationAction> CREATOR;
    public static final String TYPE_CALL_PHONE = "call_phone";
    public static final String TYPE_CREATE_REMINDER = "create_reminder";
    public static final String TYPE_OPEN_URL = "open_url";
    public static final String TYPE_SEND_EMAIL = "send_email";
    public static final String TYPE_SEND_SMS = "send_sms";
    public static final String TYPE_SHARE_LOCATION = "share_location";
    public static final String TYPE_TEXT_REPLY = "text_reply";
    public static final String TYPE_TRACK_FLIGHT = "track_flight";
    public static final String TYPE_VIEW_CALENDAR = "view_calendar";
    public static final String TYPE_VIEW_MAP = "view_map";
    
    ConversationAction() {
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
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteAction getAction() {
        throw new RuntimeException("Stub!");
    }
    
    public float getConfidenceScore() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTextReply() {
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
        public Builder(@NonNull final String actionType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAction(@Nullable final RemoteAction action) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextReply(@Nullable final CharSequence textReply) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfidenceScore(final float score) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ConversationAction build() {
            throw new RuntimeException("Stub!");
        }
    }
}
