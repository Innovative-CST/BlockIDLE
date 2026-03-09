package android.os;

import java.io.PrintWriter;
import java.io.FileDescriptor;

public class Binder implements IBinder
{
    public Binder() {
        throw new RuntimeException("Stub!");
    }
    
    public Binder(@Nullable final String descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    public static final native int getCallingPid();
    
    public static final native int getCallingUid();
    
    public static final int getCallingUidOrThrow() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static final UserHandle getCallingUserHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public static final native long clearCallingIdentity();
    
    public static final native void restoreCallingIdentity(final long p0);
    
    public static final native long setCallingWorkSourceUid(final int p0);
    
    public static final native int getCallingWorkSourceUid();
    
    public static final native long clearCallingWorkSource();
    
    public static final native void restoreCallingWorkSource(final long p0);
    
    public static final native void flushPendingCommands();
    
    public static final void joinThreadPool() {
        throw new RuntimeException("Stub!");
    }
    
    public void attachInterface(@Nullable final IInterface owner, @Nullable final String descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public String getInterfaceDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean pingBinder() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isBinderAlive() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IInterface queryLocalInterface(@NonNull final String descriptor) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onTransact(final int code, @NonNull final Parcel data, @Nullable final Parcel reply, final int flags) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dump(@NonNull final FileDescriptor fd, @Nullable final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void dumpAsync(@NonNull final FileDescriptor fd, @Nullable final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    protected void dump(@NonNull final FileDescriptor fd, @NonNull final PrintWriter fout, @Nullable final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean transact(final int code, @NonNull final Parcel data, @Nullable final Parcel reply, final int flags) throws RemoteException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void linkToDeath(@NonNull final DeathRecipient recipient, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean unlinkToDeath(@NonNull final DeathRecipient recipient, final int flags) {
        throw new RuntimeException("Stub!");
    }
}
