package java.security.cert;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class PKIXRevocationChecker extends PKIXCertPathChecker {
	protected PKIXRevocationChecker() {
		throw new RuntimeException("Stub!");
	}

	public void setOcspResponder(final URI uri) {
		throw new RuntimeException("Stub!");
	}

	public URI getOcspResponder() {
		throw new RuntimeException("Stub!");
	}

	public void setOcspResponderCert(final X509Certificate cert) {
		throw new RuntimeException("Stub!");
	}

	public X509Certificate getOcspResponderCert() {
		throw new RuntimeException("Stub!");
	}

	public void setOcspExtensions(final List<Extension> extensions) {
		throw new RuntimeException("Stub!");
	}

	public List<Extension> getOcspExtensions() {
		throw new RuntimeException("Stub!");
	}

	public void setOcspResponses(final Map<X509Certificate, byte[]> responses) {
		throw new RuntimeException("Stub!");
	}

	public Map<X509Certificate, byte[]> getOcspResponses() {
		throw new RuntimeException("Stub!");
	}

	public void setOptions(final Set<Option> options) {
		throw new RuntimeException("Stub!");
	}

	public Set<Option> getOptions() {
		throw new RuntimeException("Stub!");
	}

	public abstract List<CertPathValidatorException> getSoftFailExceptions();

	@Override
	public PKIXRevocationChecker clone() {
		throw new RuntimeException("Stub!");
	}

	public enum Option {
		ONLY_END_ENTITY, PREFER_CRLS, NO_FALLBACK, SOFT_FAIL;
	}
}
