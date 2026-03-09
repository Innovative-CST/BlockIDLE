package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PKIXParameters implements CertPathParameters {
	public PKIXParameters(final Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public PKIXParameters(final KeyStore keystore) throws InvalidAlgorithmParameterException, KeyStoreException {
		throw new RuntimeException("Stub!");
	}

	public Set<TrustAnchor> getTrustAnchors() {
		throw new RuntimeException("Stub!");
	}

	public void setTrustAnchors(final Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public Set<String> getInitialPolicies() {
		throw new RuntimeException("Stub!");
	}

	public void setInitialPolicies(final Set<String> initialPolicies) {
		throw new RuntimeException("Stub!");
	}

	public void setCertStores(final List<CertStore> stores) {
		throw new RuntimeException("Stub!");
	}

	public void addCertStore(final CertStore store) {
		throw new RuntimeException("Stub!");
	}

	public List<CertStore> getCertStores() {
		throw new RuntimeException("Stub!");
	}

	public void setRevocationEnabled(final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public boolean isRevocationEnabled() {
		throw new RuntimeException("Stub!");
	}

	public void setExplicitPolicyRequired(final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public boolean isExplicitPolicyRequired() {
		throw new RuntimeException("Stub!");
	}

	public void setPolicyMappingInhibited(final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public boolean isPolicyMappingInhibited() {
		throw new RuntimeException("Stub!");
	}

	public void setAnyPolicyInhibited(final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAnyPolicyInhibited() {
		throw new RuntimeException("Stub!");
	}

	public void setPolicyQualifiersRejected(final boolean qualifiersRejected) {
		throw new RuntimeException("Stub!");
	}

	public boolean getPolicyQualifiersRejected() {
		throw new RuntimeException("Stub!");
	}

	public Date getDate() {
		throw new RuntimeException("Stub!");
	}

	public void setDate(final Date date) {
		throw new RuntimeException("Stub!");
	}

	public void setCertPathCheckers(final List<PKIXCertPathChecker> checkers) {
		throw new RuntimeException("Stub!");
	}

	public List<PKIXCertPathChecker> getCertPathCheckers() {
		throw new RuntimeException("Stub!");
	}

	public void addCertPathChecker(final PKIXCertPathChecker checker) {
		throw new RuntimeException("Stub!");
	}

	public String getSigProvider() {
		throw new RuntimeException("Stub!");
	}

	public void setSigProvider(final String sigProvider) {
		throw new RuntimeException("Stub!");
	}

	public CertSelector getTargetCertConstraints() {
		throw new RuntimeException("Stub!");
	}

	public void setTargetCertConstraints(final CertSelector selector) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
