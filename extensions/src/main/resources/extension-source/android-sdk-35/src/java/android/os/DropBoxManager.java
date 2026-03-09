package android.os;

import java.io.InputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.File;

public class DropBoxManager
{
    public static final String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
    public static final String EXTRA_DROPPED_COUNT = "android.os.extra.DROPPED_COUNT";
    public static final String EXTRA_TAG = "tag";
    public static final String EXTRA_TIME = "time";
    public static final int IS_EMPTY = 1;
    public static final int IS_GZIPPED = 4;
    public static final int IS_TEXT = 2;
    
    protected DropBoxManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void addText(@NonNull final String tag, @NonNull final String data) {
        throw new RuntimeException("Stub!");
    }
    
    public void addData(@NonNull final String tag, @Nullable final byte[] data, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void addFile(@NonNull final String tag, @NonNull final File file, final int flags) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTagEnabled(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Entry getNextEntry(final String tag, final long msec) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Entry implements Parcelable, Closeable
    {
        @NonNull
        public static final Creator<Entry> CREATOR;
        
        public Entry(@NonNull final String tag, final long millis) {
            throw new RuntimeException("Stub!");
        }
        
        public Entry(@NonNull final String tag, final long millis, @NonNull final String text) {
            throw new RuntimeException("Stub!");
        }
        
        public Entry(@NonNull final String tag, final long millis, @Nullable final byte[] data, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public Entry(@NonNull final String tag, final long millis, @Nullable final ParcelFileDescriptor data, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public Entry(@NonNull final String tag, final long millis, @NonNull final File data, final int flags) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getTag() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeMillis() {
            throw new RuntimeException("Stub!");
        }
        
        public int getFlags() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getText(final int maxBytes) {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public InputStream getInputStream() throws IOException {
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
    }
}
