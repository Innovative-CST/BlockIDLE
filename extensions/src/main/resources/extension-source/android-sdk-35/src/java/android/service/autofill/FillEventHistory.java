package android.service.autofill;

import android.view.autofill.AutofillId;
import java.util.Map;
import java.util.Set;
import android.os.Parcel;
import java.util.List;
import android.os.Bundle;
import android.os.Parcelable;

public final class FillEventHistory implements Parcelable
{
    @NonNull
    public static final Creator<FillEventHistory> CREATOR;
    
    FillEventHistory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Bundle getClientState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<Event> getEvents() {
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
    
    public static final class Event
    {
        public static final int NO_SAVE_UI_REASON_DATASET_MATCH = 6;
        public static final int NO_SAVE_UI_REASON_FIELD_VALIDATION_FAILED = 5;
        public static final int NO_SAVE_UI_REASON_HAS_EMPTY_REQUIRED = 3;
        public static final int NO_SAVE_UI_REASON_NONE = 0;
        public static final int NO_SAVE_UI_REASON_NO_SAVE_INFO = 1;
        public static final int NO_SAVE_UI_REASON_NO_VALUE_CHANGED = 4;
        public static final int NO_SAVE_UI_REASON_WITH_DELAY_SAVE_FLAG = 2;
        public static final int TYPE_AUTHENTICATION_SELECTED = 2;
        public static final int TYPE_CONTEXT_COMMITTED = 4;
        public static final int TYPE_DATASETS_SHOWN = 5;
        public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = 1;
        public static final int TYPE_DATASET_SELECTED = 0;
        public static final int TYPE_SAVE_SHOWN = 3;
        public static final int TYPE_VIEW_REQUESTED_AUTOFILL = 6;
        public static final int UI_TYPE_DIALOG = 3;
        public static final int UI_TYPE_INLINE = 2;
        public static final int UI_TYPE_MENU = 1;
        public static final int UI_TYPE_UNKNOWN = 0;
        
        Event() {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getDatasetId() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Bundle getClientState() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Set<String> getSelectedDatasetIds() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Set<String> getIgnoredDatasetIds() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Map<AutofillId, String> getChangedFields() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Map<AutofillId, FieldClassification> getFieldsClassification() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Map<AutofillId, Set<String>> getManuallyEnteredField() {
            throw new RuntimeException("Stub!");
        }
        
        public int getNoSaveUiReason() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUiType() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
