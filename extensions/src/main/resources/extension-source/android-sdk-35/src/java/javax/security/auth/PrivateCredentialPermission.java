package javax.security.auth;

import java.security.Permission;

public final class PrivateCredentialPermission extends Permission
{
    public PrivateCredentialPermission(final String name, final String actions) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public String getCredentialClass() {
        throw new RuntimeException("Stub!");
    }
    
    public String[][] getPrincipals() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean implies(final Permission p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getActions() {
        throw new RuntimeException("Stub!");
    }
}
