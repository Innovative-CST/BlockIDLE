package android.graphics.pdf.models;

import android.os.Parcel;
import java.util.List;
import android.graphics.Rect;
import android.os.Parcelable;

public final class FormWidgetInfo implements Parcelable
{
    @NonNull
    public static final Creator<FormWidgetInfo> CREATOR;
    public static final int WIDGET_TYPE_CHECKBOX = 2;
    public static final int WIDGET_TYPE_COMBOBOX = 4;
    public static final int WIDGET_TYPE_LISTBOX = 5;
    public static final int WIDGET_TYPE_PUSHBUTTON = 1;
    public static final int WIDGET_TYPE_RADIOBUTTON = 3;
    public static final int WIDGET_TYPE_SIGNATURE = 7;
    public static final int WIDGET_TYPE_TEXTFIELD = 6;
    public static final int WIDGET_TYPE_UNKNOWN = 0;
    
    FormWidgetInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidgetType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidgetIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getWidgetRect() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTextValue() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAccessibilityLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEditableText() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMultiSelect() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMultiLineText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxLength() {
        throw new RuntimeException("Stub!");
    }
    
    public float getFontSize() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ListItem> getListItems() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int widgetType, final int widgetIndex, @NonNull final Rect widgetRect, @NonNull final String textValue, @NonNull final String accessibilityLabel) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setReadOnly(final boolean readOnly) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEditableText(final boolean editableText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMultiSelect(final boolean multiSelect) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMultiLineText(final boolean multiLineText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxLength(final int maxLength) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFontSize(final float fontSize) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setListItems(@NonNull final List<ListItem> listItems) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FormWidgetInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
