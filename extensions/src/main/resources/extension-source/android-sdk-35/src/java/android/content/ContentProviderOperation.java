package android.content;

import android.os.Bundle;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class ContentProviderOperation implements Parcelable
{
    @NonNull
    public static final Creator<ContentProviderOperation> CREATOR;
    
    ContentProviderOperation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Builder newInsert(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Builder newUpdate(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Builder newDelete(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Builder newAssertQuery(@NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Builder newCall(@NonNull final Uri uri, @Nullable final String method, @Nullable final String arg) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isYieldAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isExceptionAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInsert() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isDelete() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUpdate() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAssertQuery() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCall() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isWriteOperation() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadOperation() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ContentProviderResult apply(@NonNull final ContentProvider provider, @NonNull final ContentProviderResult[] backRefs, final int numBackRefs) throws OperationApplicationException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ContentValues resolveValueBackReferences(@NonNull final ContentProviderResult[] backRefs, final int numBackRefs) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle resolveExtrasBackReferences(@NonNull final ContentProviderResult[] backRefs, final int numBackRefs) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String[] resolveSelectionArgsBackReferences(@NonNull final ContentProviderResult[] backRefs, final int numBackRefs) {
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
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ContentProviderOperation build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withValues(@NonNull final ContentValues values) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withValue(@NonNull final String key, @Nullable final Object value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withValueBackReferences(@NonNull final ContentValues backReferences) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withValueBackReference(@NonNull final String key, final int fromIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withValueBackReference(@NonNull final String key, final int fromIndex, @NonNull final String fromKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExtras(@NonNull final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExtra(@NonNull final String key, @Nullable final Object value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExtraBackReference(@NonNull final String key, final int fromIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExtraBackReference(@NonNull final String key, final int fromIndex, @NonNull final String fromKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withSelection(@Nullable final String selection, @Nullable final String[] selectionArgs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withSelectionBackReference(final int index, final int fromIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withSelectionBackReference(final int index, final int fromIndex, @NonNull final String fromKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExpectedCount(final int count) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withYieldAllowed(final boolean yieldAllowed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder withExceptionAllowed(final boolean exceptionAllowed) {
            throw new RuntimeException("Stub!");
        }
    }
}
