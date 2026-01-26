package android.security.identity;

import java.util.Collection;

@Deprecated
public abstract class ResultData
{
    @Deprecated
    public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
    @Deprecated
    public static final int STATUS_NOT_REQUESTED = 2;
    @Deprecated
    public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
    @Deprecated
    public static final int STATUS_NO_SUCH_ENTRY = 1;
    @Deprecated
    public static final int STATUS_OK = 0;
    @Deprecated
    public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
    @Deprecated
    public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
    
    ResultData() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract byte[] getAuthenticatedData();
    
    @Deprecated
    @Nullable
    public abstract byte[] getMessageAuthenticationCode();
    
    @Deprecated
    @NonNull
    public abstract byte[] getStaticAuthenticationData();
    
    @Deprecated
    @NonNull
    public abstract Collection<String> getNamespaces();
    
    @Deprecated
    @Nullable
    public abstract Collection<String> getEntryNames(@NonNull final String p0);
    
    @Deprecated
    @Nullable
    public abstract Collection<String> getRetrievedEntryNames(@NonNull final String p0);
    
    @Deprecated
    public abstract int getStatus(@NonNull final String p0, @NonNull final String p1);
    
    @Deprecated
    @Nullable
    public abstract byte[] getEntry(@NonNull final String p0, @NonNull final String p1);
}
