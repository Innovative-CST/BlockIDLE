package android.service.autofill;

import android.os.Bundle;
import android.widget.RemoteViews;
import android.content.IntentSender;
import android.view.autofill.AutofillId;
import android.service.assist.classification.FieldClassification;
import java.util.Set;
import android.os.Parcel;
import android.os.Parcelable;

public final class FillResponse implements Parcelable
{
    @NonNull
    public static final Creator<FillResponse> CREATOR;
    public static final int FLAG_DELAY_FILL = 4;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = 2;
    public static final int FLAG_TRACK_CONTEXT_COMMITED = 1;
    
    FillResponse() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDetectedFieldClassifications(@NonNull final Set<FieldClassification> fieldInfos) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setAuthentication(@NonNull final AutofillId[] ids, @Nullable final IntentSender authentication, @Nullable final RemoteViews presentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setAuthentication(@NonNull final AutofillId[] ids, @Nullable final IntentSender authentication, @Nullable final RemoteViews presentation, @Nullable final InlinePresentation inlinePresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Builder setAuthentication(@NonNull final AutofillId[] ids, @Nullable final IntentSender authentication, @Nullable final RemoteViews presentation, @Nullable final InlinePresentation inlinePresentation, @Nullable final InlinePresentation inlineTooltipPresentation) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAuthentication(@NonNull final AutofillId[] ids, @Nullable final IntentSender authentication, @Nullable final Presentations presentations) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIgnoredIds(final AutofillId... ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDataset(@Nullable final Dataset dataset) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSaveInfo(@NonNull final SaveInfo saveInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClientState(@Nullable final Bundle clientState) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFieldClassificationIds(@NonNull final AutofillId... ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder disableAutofill(final long duration) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIconResourceId(final int id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setServiceDisplayNameResourceId(final int id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShowFillDialogIcon(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShowSaveDialogIcon(final boolean show) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHeader(@NonNull final RemoteViews header) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFooter(@NonNull final RemoteViews footer) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setUserData(@NonNull final UserData userData) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPresentationCancelIds(@Nullable final int[] ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDialogHeader(@NonNull final RemoteViews header) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFillDialogTriggerIds(@NonNull final AutofillId... ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FillResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
}
