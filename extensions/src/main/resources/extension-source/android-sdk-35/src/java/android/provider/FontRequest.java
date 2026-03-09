package android.provider;

import java.util.List;

@Deprecated
public final class FontRequest
{
    @Deprecated
    public FontRequest(@NonNull final String providerAuthority, @NonNull final String providerPackage, @NonNull final String query) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FontRequest(@NonNull final String providerAuthority, @NonNull final String providerPackage, @NonNull final String query, @NonNull final List<List<byte[]>> certificates) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getProviderAuthority() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getProviderPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getQuery() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<List<byte[]>> getCertificates() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
