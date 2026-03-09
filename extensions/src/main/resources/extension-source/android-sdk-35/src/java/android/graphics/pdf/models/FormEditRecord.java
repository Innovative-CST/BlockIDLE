package android.graphics.pdf.models;

import android.os.Parcel;
import android.graphics.Point;
import android.os.Parcelable;

public final class FormEditRecord implements Parcelable
{
    @NonNull
    public static final Creator<FormEditRecord> CREATOR;
    public static final int EDIT_TYPE_CLICK = 0;
    public static final int EDIT_TYPE_SET_INDICES = 1;
    public static final int EDIT_TYPE_SET_TEXT = 2;
    
    FormEditRecord() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidgetIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Point getClickPoint() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getSelectedIndices() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getText() {
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
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int type, final int pageNumber, final int widgetIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FormEditRecord build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClickPoint(@Nullable final Point clickPoint) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSelectedIndices(@Nullable final int[] selectedIndices) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setText(@Nullable final String text) {
            throw new RuntimeException("Stub!");
        }
    }
}
