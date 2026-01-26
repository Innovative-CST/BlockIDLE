package java.security;

public interface DomainCombiner {
	ProtectionDomain[] combine(final ProtectionDomain[] p0, final ProtectionDomain[] p1);
}
