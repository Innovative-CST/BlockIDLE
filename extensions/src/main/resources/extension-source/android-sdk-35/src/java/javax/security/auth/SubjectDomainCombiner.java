package javax.security.auth;

import java.security.ProtectionDomain;
import java.security.DomainCombiner;

public class SubjectDomainCombiner implements DomainCombiner
{
    public SubjectDomainCombiner(final Subject subject) {
        throw new RuntimeException("Stub!");
    }
    
    public Subject getSubject() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ProtectionDomain[] combine(final ProtectionDomain[] currentDomains, final ProtectionDomain[] assignedDomains) {
        throw new RuntimeException("Stub!");
    }
}
