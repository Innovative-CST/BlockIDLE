package javax.net.ssl;

import java.util.List;
import java.security.KeyStore;

public class KeyStoreBuilderParameters implements ManagerFactoryParameters
{
    public KeyStoreBuilderParameters(final KeyStore.Builder builder) {
        throw new RuntimeException("Stub!");
    }
    
    public KeyStoreBuilderParameters(final List<KeyStore.Builder> parameters) {
        throw new RuntimeException("Stub!");
    }
    
    public List<KeyStore.Builder> getParameters() {
        throw new RuntimeException("Stub!");
    }
}
