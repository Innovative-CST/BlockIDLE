package android.security.identity;

import java.util.Collection;

public abstract class CredentialDataResult
{
    CredentialDataResult() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract byte[] getDeviceNameSpaces();
    
    @Nullable
    public abstract byte[] getDeviceMac();
    
    @Nullable
    public byte[] getDeviceSignature() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract byte[] getStaticAuthenticationData();
    
    @NonNull
    public abstract Entries getDeviceSignedEntries();
    
    @NonNull
    public abstract Entries getIssuerSignedEntries();
    
    public interface Entries
    {
        public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
        public static final int STATUS_NOT_REQUESTED = 2;
        public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
        public static final int STATUS_NO_SUCH_ENTRY = 1;
        public static final int STATUS_OK = 0;
        public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
        public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
        
        @NonNull
        Collection<String> getNamespaces();
        
        @NonNull
        Collection<String> getEntryNames(@NonNull final String p0);
        
        @NonNull
        Collection<String> getRetrievedEntryNames(@NonNull final String p0);
        
        int getStatus(@NonNull final String p0, @NonNull final String p1);
        
        @Nullable
        byte[] getEntry(@NonNull final String p0, @NonNull final String p1);
    }
}
