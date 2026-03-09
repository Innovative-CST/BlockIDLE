package android.system;

public final class StructCmsghdr
{
    @NonNull
    public final byte[] cmsg_data;
    public final int cmsg_level;
    public final int cmsg_type;
    
    public StructCmsghdr(final int cmsg_level, final int cmsg_type, final short value) {
        this.cmsg_data = null;
        this.cmsg_level = 0;
        this.cmsg_type = 0;
        throw new RuntimeException("Stub!");
    }
    
    public StructCmsghdr(final int cmsg_level, final int cmsg_type, @NonNull final byte[] value) {
        this.cmsg_data = null;
        this.cmsg_level = 0;
        this.cmsg_type = 0;
        throw new RuntimeException("Stub!");
    }
}
