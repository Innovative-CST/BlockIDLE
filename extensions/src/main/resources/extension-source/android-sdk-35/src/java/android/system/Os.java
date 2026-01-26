package android.system;

import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.InetSocketAddress;
import java.io.FileDescriptor;

public final class Os
{
    Os() {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor accept(final FileDescriptor fd, final InetSocketAddress peerAddress) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean access(final String path, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void bind(final FileDescriptor fd, final InetAddress address, final int port) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void bind(@NonNull final FileDescriptor fd, @NonNull final SocketAddress address) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void chmod(final String path, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void chown(final String path, final int uid, final int gid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void close(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void connect(final FileDescriptor fd, final InetAddress address, final int port) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void connect(@NonNull final FileDescriptor fd, @NonNull final SocketAddress address) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor dup(final FileDescriptor oldFd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor dup2(final FileDescriptor oldFd, final int newFd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] environ() {
        throw new RuntimeException("Stub!");
    }
    
    public static void execv(final String filename, final String[] argv) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void execve(final String filename, final String[] argv, final String[] envp) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void fchmod(final FileDescriptor fd, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void fchown(final FileDescriptor fd, final int uid, final int gid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int fcntlInt(@NonNull final FileDescriptor fd, final int cmd, final int arg) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void fdatasync(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static StructStat fstat(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static StructStatVfs fstatvfs(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void fsync(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void ftruncate(final FileDescriptor fd, final long length) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static String gai_strerror(final int error) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getegid() {
        throw new RuntimeException("Stub!");
    }
    
    public static int geteuid() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getgid() {
        throw new RuntimeException("Stub!");
    }
    
    public static String getenv(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static SocketAddress getpeername(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int getpid() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getppid() {
        throw new RuntimeException("Stub!");
    }
    
    public static SocketAddress getsockname(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static StructTimeval getsockoptTimeval(@NonNull final FileDescriptor fd, final int level, final int option) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int gettid() {
        throw new RuntimeException("Stub!");
    }
    
    public static int getuid() {
        throw new RuntimeException("Stub!");
    }
    
    public static byte[] getxattr(final String path, final String name) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static String if_indextoname(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static int if_nametoindex(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public static InetAddress inet_pton(final int family, final String address) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isatty(final FileDescriptor fd) {
        throw new RuntimeException("Stub!");
    }
    
    public static void kill(final int pid, final int signal) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void lchown(final String path, final int uid, final int gid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void link(final String oldPath, final String newPath) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void listen(final FileDescriptor fd, final int backlog) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static String[] listxattr(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static long lseek(final FileDescriptor fd, final long offset, final int whence) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static StructStat lstat(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static FileDescriptor memfd_create(@NonNull final String name, final int flags) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void mincore(final long address, final long byteCount, final byte[] vector) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void mkdir(final String path, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void mkfifo(final String path, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void mlock(final long address, final long byteCount) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static long mmap(final long address, final long byteCount, final int prot, final int flags, final FileDescriptor fd, final long offset) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void msync(final long address, final long byteCount, final int flags) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void munlock(final long address, final long byteCount) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void munmap(final long address, final long byteCount) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor open(final String path, final int flags, final int mode) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor[] pipe() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int poll(final StructPollfd[] fds, final int timeoutMs) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void posix_fallocate(final FileDescriptor fd, final long offset, final long length) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int prctl(final int option, final long arg2, final long arg3, final long arg4, final long arg5) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int pread(final FileDescriptor fd, final ByteBuffer buffer, final long offset) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int pread(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount, final long offset) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int pwrite(final FileDescriptor fd, final ByteBuffer buffer, final long offset) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int pwrite(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount, final long offset) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int read(final FileDescriptor fd, final ByteBuffer buffer) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int read(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static String readlink(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int readv(final FileDescriptor fd, final Object[] buffers, final int[] offsets, final int[] byteCounts) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int recvfrom(final FileDescriptor fd, final ByteBuffer buffer, final int flags, final InetSocketAddress srcAddress) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static int recvfrom(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount, final int flags, final InetSocketAddress srcAddress) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static int recvmsg(@NonNull final FileDescriptor fd, @NonNull final StructMsghdr msg, final int flags) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static void remove(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void removexattr(final String path, final String name) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void rename(final String oldPath, final String newPath) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static long sendfile(final FileDescriptor outFd, final FileDescriptor inFd, final Int64Ref offset, final long byteCount) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int sendmsg(@NonNull final FileDescriptor fd, @NonNull final StructMsghdr msg, final int flags) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static int sendto(final FileDescriptor fd, final ByteBuffer buffer, final int flags, final InetAddress inetAddress, final int port) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static int sendto(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount, final int flags, final InetAddress inetAddress, final int port) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    public static int sendto(@NonNull final FileDescriptor fd, @NonNull final byte[] bytes, final int byteOffset, final int byteCount, final int flags, @Nullable final SocketAddress address) throws ErrnoException, SocketException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setegid(final int egid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void setenv(final String name, final String value, final boolean overwrite) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void seteuid(final int euid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setgid(final int gid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int setsid() throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void setsockoptInt(final FileDescriptor fd, final int level, final int option, final int value) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void setsockoptTimeval(@NonNull final FileDescriptor fd, final int level, final int option, @NonNull final StructTimeval value) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void setuid(final int uid) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void setxattr(final String path, final String name, final byte[] value, final int flags) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void shutdown(final FileDescriptor fd, final int how) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static FileDescriptor socket(final int domain, final int type, final int protocol) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void socketpair(final int domain, final int type, final int protocol, final FileDescriptor fd1, final FileDescriptor fd2) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static StructStat stat(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static StructStatVfs statvfs(final String path) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static String strerror(final int errno) {
        throw new RuntimeException("Stub!");
    }
    
    public static String strsignal(final int signal) {
        throw new RuntimeException("Stub!");
    }
    
    public static void symlink(final String oldPath, final String newPath) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static long sysconf(final int name) {
        throw new RuntimeException("Stub!");
    }
    
    public static void tcdrain(final FileDescriptor fd) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static void tcsendbreak(final FileDescriptor fd, final int duration) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int umask(final int mask) {
        throw new RuntimeException("Stub!");
    }
    
    public static StructUtsname uname() {
        throw new RuntimeException("Stub!");
    }
    
    public static void unsetenv(final String name) throws ErrnoException {
        throw new RuntimeException("Stub!");
    }
    
    public static int write(final FileDescriptor fd, final ByteBuffer buffer) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int write(final FileDescriptor fd, final byte[] bytes, final int byteOffset, final int byteCount) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
    
    public static int writev(final FileDescriptor fd, final Object[] buffers, final int[] offsets, final int[] byteCounts) throws ErrnoException, InterruptedIOException {
        throw new RuntimeException("Stub!");
    }
}
