package android.os;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.net.DatagramSocket;
import java.net.Socket;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Closeable;

public class ParcelFileDescriptor implements Parcelable, Closeable
{
    @NonNull
    public static final Creator<ParcelFileDescriptor> CREATOR;
    public static final int MODE_APPEND = 33554432;
    public static final int MODE_CREATE = 134217728;
    public static final int MODE_READ_ONLY = 268435456;
    public static final int MODE_READ_WRITE = 805306368;
    public static final int MODE_TRUNCATE = 67108864;
    @Deprecated
    public static final int MODE_WORLD_READABLE = 1;
    @Deprecated
    public static final int MODE_WORLD_WRITEABLE = 2;
    public static final int MODE_WRITE_ONLY = 536870912;
    
    public ParcelFileDescriptor(final ParcelFileDescriptor wrapped) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor open(final File file, final int mode) throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor open(final File file, final int mode, final Handler handler, final OnCloseListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ParcelFileDescriptor wrap(@NonNull final ParcelFileDescriptor pfd, @NonNull final Handler handler, @NonNull final OnCloseListener listener) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor dup(final FileDescriptor orig) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public ParcelFileDescriptor dup() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor fromFd(final int fd) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor adoptFd(final int fd) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor fromSocket(final Socket socket) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor fromDatagramSocket(final DatagramSocket datagramSocket) {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor[] createPipe() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor[] createReliablePipe() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor[] createSocketPair() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ParcelFileDescriptor[] createReliableSocketPair() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int parseMode(final String mode) {
        throw new RuntimeException("Stub!");
    }
    
    public FileDescriptor getFileDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public long getStatSize() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFd() {
        throw new RuntimeException("Stub!");
    }
    
    public int detachFd() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void closeWithError(final String msg) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canDetectErrors() {
        throw new RuntimeException("Stub!");
    }
    
    public void checkError() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
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
    
    public static class AutoCloseInputStream extends FileInputStream
    {
        public AutoCloseInputStream(final ParcelFileDescriptor pfd) {
            super((FileDescriptor)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read() throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(final byte[] b) throws IOException {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int read(final byte[] b, final int off, final int len) throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class AutoCloseOutputStream extends FileOutputStream
    {
        public AutoCloseOutputStream(final ParcelFileDescriptor pfd) {
            super((FileDescriptor)null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() throws IOException {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class FileDescriptorDetachedException extends IOException
    {
        public FileDescriptorDetachedException() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnCloseListener
    {
        void onClose(final IOException p0);
    }
}
