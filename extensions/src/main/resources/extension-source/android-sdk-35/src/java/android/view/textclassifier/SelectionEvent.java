package android.view.textclassifier;

import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionEvent implements Parcelable
{
    public static final int ACTION_ABANDON = 107;
    public static final int ACTION_COPY = 101;
    public static final int ACTION_CUT = 103;
    public static final int ACTION_DRAG = 106;
    public static final int ACTION_OTHER = 108;
    public static final int ACTION_OVERTYPE = 100;
    public static final int ACTION_PASTE = 102;
    public static final int ACTION_RESET = 201;
    public static final int ACTION_SELECT_ALL = 200;
    public static final int ACTION_SHARE = 104;
    public static final int ACTION_SMART_SHARE = 105;
    @NonNull
    public static final Creator<SelectionEvent> CREATOR;
    public static final int EVENT_AUTO_SELECTION = 5;
    public static final int EVENT_SELECTION_MODIFIED = 2;
    public static final int EVENT_SELECTION_STARTED = 1;
    public static final int EVENT_SMART_SELECTION_MULTI = 4;
    public static final int EVENT_SMART_SELECTION_SINGLE = 3;
    public static final int INVOCATION_LINK = 2;
    public static final int INVOCATION_MANUAL = 1;
    public static final int INVOCATION_UNKNOWN = 0;
    
    SelectionEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionStartedEvent(final int invocationMethod, final int start) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionModifiedEvent(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionModifiedEvent(final int start, final int end, @NonNull final TextClassification classification) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionModifiedEvent(final int start, final int end, @NonNull final TextSelection selection) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionActionEvent(final int start, final int end, final int actionType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static SelectionEvent createSelectionActionEvent(final int start, final int end, final int actionType, @NonNull final TextClassification classification) {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getEntityType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getWidgetType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getWidgetVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInvocationMethod() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getResultId() {
        throw new RuntimeException("Stub!");
    }
    
    public long getEventTime() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDurationSinceSessionStart() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDurationSincePreviousEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEventIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TextClassificationSessionId getSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSmartStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSmartEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isTerminal(final int eventType) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
