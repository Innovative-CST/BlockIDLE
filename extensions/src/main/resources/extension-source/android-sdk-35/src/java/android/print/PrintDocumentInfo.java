package android.print;

import android.os.Parcel;
import android.os.Parcelable;

public final class PrintDocumentInfo implements Parcelable
{
    public static final int CONTENT_TYPE_DOCUMENT = 0;
    public static final int CONTENT_TYPE_PHOTO = 1;
    public static final int CONTENT_TYPE_UNKNOWN = -1;
    @NonNull
    public static final Creator<PrintDocumentInfo> CREATOR;
    public static final int PAGE_COUNT_UNKNOWN = -1;
    
    PrintDocumentInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPageCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getContentType() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDataSize() {
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
    
    public static final class Builder
    {
        public Builder(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPageCount(final int pageCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setContentType(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PrintDocumentInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
