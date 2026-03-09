package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import javax.security.auth.x500.X500Principal;

public class X509CRLSelector implements CRLSelector {
	public X509CRLSelector() {
		throw new RuntimeException("Stub!");
	}

	public void setIssuers(final Collection<X500Principal> issuers) {
		throw new RuntimeException("Stub!");
	}

	public void setIssuerNames(final Collection<?> names) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addIssuer(final X500Principal issuer) {
		throw new RuntimeException("Stub!");
	}

	public void addIssuerName(final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addIssuerName(final byte[] name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setMinCRLNumber(final BigInteger minCRL) {
		throw new RuntimeException("Stub!");
	}

	public void setMaxCRLNumber(final BigInteger maxCRL) {
		throw new RuntimeException("Stub!");
	}

	public void setDateAndTime(final Date dateAndTime) {
		throw new RuntimeException("Stub!");
	}

	public void setCertificateChecking(final X509Certificate cert) {
		throw new RuntimeException("Stub!");
	}

	public Collection<X500Principal> getIssuers() {
		throw new RuntimeException("Stub!");
	}

	public Collection<Object> getIssuerNames() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getMinCRL() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getMaxCRL() {
		throw new RuntimeException("Stub!");
	}

	public Date getDateAndTime() {
		throw new RuntimeException("Stub!");
	}

	public X509Certificate getCertificateChecking() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean match(final CRL crl) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
