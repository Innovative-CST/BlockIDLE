package android.content.res;

import java.nio.channels.FileChannel;
import android.os.Parcel;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileDescriptor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import android.os.Parcelable;

public class AssetFileDescriptor implements Parcelable, Closeable
{
    @NonNull
    public static final Creator<AssetFileDescriptor> CREATOR;
    public static final long UNKNOWN_LENGTH = -1L;
    
    public AssetFileDescriptor(final ParcelFileDescriptor fd, final long startOffset, final long length) {
        throw new RuntimeException("Stub!");
    }
    
    public AssetFileDescriptor(final ParcelFileDescriptor fd, final long startOffset, final long length, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelFileDescriptor getParcelFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public FileDescriptor getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStartOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLength() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDeclaredLength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public FileInputStream createInputStream() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public FileOutputStream createOutputStream() throws IOException {
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
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class AutoCloseInputStream extends ParcelFileDescriptor.AutoCloseInputStream
    {
        public AutoCloseInputStream(final AssetFileDescriptor fd) throws IOException {
            super((ParcelFileDescriptor)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int available() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(final byte[] buffer, final int offset, final int count) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(final byte[] buffer) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public long skip(final long count) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void mark(final int readlimit) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean markSupported() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public synchronized void reset() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public FileChannel getChannel() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class AutoCloseOutputStream extends ParcelFileDescriptor.AutoCloseOutputStream
    {
        public AutoCloseOutputStream(final AssetFileDescriptor fd) throws IOException {
            super((ParcelFileDescriptor)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void write(final byte[] buffer, final int offset, final int count) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void write(final byte[] buffer) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void write(final int oneByte) throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
}
