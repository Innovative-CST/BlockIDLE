package android.app.admin;

public final class TargetUser
{
    @NonNull
    public static final TargetUser GLOBAL;
    @NonNull
    public static final TargetUser LOCAL_USER;
    @NonNull
    public static final TargetUser PARENT_USER;
    @NonNull
    public static final TargetUser UNKNOWN_USER;
    
    TargetUser() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        GLOBAL = null;
        LOCAL_USER = null;
        PARENT_USER = null;
        UNKNOWN_USER = null;
    }
}
