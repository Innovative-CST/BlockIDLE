package android.system;

public final class StructStatVfs
{
    public final long f_bavail;
    public final long f_bfree;
    public final long f_blocks;
    public final long f_bsize;
    public final long f_favail;
    public final long f_ffree;
    public final long f_files;
    public final long f_flag;
    public final long f_frsize;
    public final long f_fsid;
    public final long f_namemax;
    
    public StructStatVfs(final long f_bsize, final long f_frsize, final long f_blocks, final long f_bfree, final long f_bavail, final long f_files, final long f_ffree, final long f_favail, final long f_fsid, final long f_flag, final long f_namemax) {
        this.f_bavail = 0L;
        this.f_bfree = 0L;
        this.f_blocks = 0L;
        this.f_bsize = 0L;
        this.f_favail = 0L;
        this.f_ffree = 0L;
        this.f_files = 0L;
        this.f_flag = 0L;
        this.f_frsize = 0L;
        this.f_fsid = 0L;
        this.f_namemax = 0L;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
