package android.app;

import android.os.Parcel;
import android.net.Uri;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import android.os.Parcelable;

public final class RemoteInput implements Parcelable
{
    @NonNull
    public static final Creator<RemoteInput> CREATOR;
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    
    RemoteInput() {
        throw new RuntimeException("Stub!");
    }
    
    public String getResultKey() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence[] getChoices() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getAllowedDataTypes() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDataOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAllowFreeFormInput() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEditChoicesBeforeSending() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public static Map<String, Uri> getDataResultsFromIntent(final Intent intent, final String remoteInputResultKey) {
        throw new RuntimeException("Stub!");
    }
    
    public static Bundle getResultsFromIntent(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public static void addResultsToIntent(final RemoteInput[] remoteInputs, final Intent intent, final Bundle results) {
        throw new RuntimeException("Stub!");
    }
    
    public static void addDataResultToIntent(final RemoteInput remoteInput, final Intent intent, final Map<String, Uri> results) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setResultsSource(final Intent intent, final int source) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getResultsSource(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String resultKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLabel(@Nullable final CharSequence label) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setChoices(@Nullable final CharSequence[] choices) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowDataType(@NonNull final String mimeType, final boolean doAllow) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAllowFreeFormInput(final boolean allowFreeFormTextInput) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEditChoicesBeforeSending(final int editChoicesBeforeSending) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RemoteInput build() {
            throw new RuntimeException("Stub!");
        }
    }
}
