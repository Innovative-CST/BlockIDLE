package android.service.autofill;

import java.util.regex.Pattern;
import android.view.autofill.AutofillValue;
import android.view.autofill.AutofillId;
import android.content.IntentSender;
import android.widget.RemoteViews;
import android.os.Parcel;
import android.os.Parcelable;

public final class Dataset implements Parcelable
{
    @NonNull
    public static final Creator<Dataset> CREATOR;
    
    Dataset() {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        @Deprecated
        public Builder(@NonNull final RemoteViews presentation) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Presentations presentations) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setInlinePresentation(@NonNull final InlinePresentation inlinePresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setInlinePresentation(@NonNull final InlinePresentation inlinePresentation, @NonNull final InlinePresentation inlineTooltipPresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthentication(@Nullable final IntentSender authentication) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@Nullable final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @NonNull final RemoteViews presentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @Nullable final Pattern filter) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @Nullable final Pattern filter, @NonNull final RemoteViews presentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @NonNull final RemoteViews presentation, @NonNull final InlinePresentation inlinePresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @NonNull final RemoteViews presentation, @NonNull final InlinePresentation inlinePresentation, @NonNull final InlinePresentation inlineTooltipPresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @Nullable final Pattern filter, @NonNull final RemoteViews presentation, @NonNull final InlinePresentation inlinePresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setValue(@NonNull final AutofillId id, @Nullable final AutofillValue value, @Nullable final Pattern filter, @NonNull final RemoteViews presentation, @NonNull final InlinePresentation inlinePresentation, @NonNull final InlinePresentation inlineTooltipPresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setField(@NonNull final AutofillId id, @Nullable final Field field) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setField(@NonNull final String hint, @NonNull final Field field) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFieldForAllHints(@NonNull final Field field) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Dataset build() {
            throw new RuntimeException("Stub!");
        }
    }
}
