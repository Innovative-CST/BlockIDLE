package android.system;

import java.net.SocketAddress;
import java.nio.ByteBuffer;

public final class StructMsghdr
{
    @Nullable
    public StructCmsghdr[] msg_control;
    public int msg_flags;
    @NonNull
    public final ByteBuffer[] msg_iov;
    @Nullable
    public SocketAddress msg_name;
    
    public StructMsghdr(@Nullable final SocketAddress msg_name, @NonNull final ByteBuffer[] msg_iov, @Nullable final StructCmsghdr[] msg_control, final int msg_flags) {
        this.msg_iov = null;
        throw new RuntimeException("Stub!");
    }
}
