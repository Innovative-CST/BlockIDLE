package android.view.textclassifier;

import java.time.ZonedDateTime;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.app.RemoteAction;
import java.util.List;
import android.os.Parcelable;

public final class TextClassification implements Parcelable
{
    @NonNull
    public static final Creator<TextClassification> CREATOR;
    
    TextClassification() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEntityCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getEntity(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public float getConfidenceScore(final String entity) {
        throw new RuntimeException("Stub!");
    }
    
    public List<RemoteAction> getActions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Drawable getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public View.OnClickListener getOnClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getId() {
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
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setText(@Nullable final String text) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEntityType(@NonNull final String type, final float confidenceScore) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAction(@NonNull final RemoteAction action) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setIcon(@Nullable final Drawable icon) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setLabel(@Nullable final String label) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setIntent(@Nullable final Intent intent) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@Nullable final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextClassification build() {
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
        
        public int getStartIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEndIndex() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public LocaleList getDefaultLocales() {
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
            public Builder(@NonNull final CharSequence text, final int startIndex, final int endIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDefaultLocales(@Nullable final LocaleList defaultLocales) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setReferenceTime(@Nullable final ZonedDateTime referenceTime) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@Nullable final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
