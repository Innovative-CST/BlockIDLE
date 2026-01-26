package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

public class X509CertSelector implements CertSelector {
	public X509CertSelector() {
		throw new RuntimeException("Stub!");
	}

	public void setCertificate(final X509Certificate cert) {
		throw new RuntimeException("Stub!");
	}

	public void setSerialNumber(final BigInteger serial) {
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(final X500Principal issuer) {
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(final String issuerDN) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setIssuer(final byte[] issuerDN) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setSubject(final X500Principal subject) {
		throw new RuntimeException("Stub!");
	}

	public void setSubject(final String subjectDN) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setSubject(final byte[] subjectDN) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setSubjectKeyIdentifier(final byte[] subjectKeyID) {
		throw new RuntimeException("Stub!");
	}

	public void setAuthorityKeyIdentifier(final byte[] authorityKeyID) {
		throw new RuntimeException("Stub!");
	}

	public void setCertificateValid(final Date certValid) {
		throw new RuntimeException("Stub!");
	}

	public void setPrivateKeyValid(final Date privateKeyValid) {
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKeyAlgID(final String oid) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKey(final PublicKey key) {
		throw new RuntimeException("Stub!");
	}

	public void setSubjectPublicKey(final byte[] key) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setKeyUsage(final boolean[] keyUsage) {
		throw new RuntimeException("Stub!");
	}

	public void setExtendedKeyUsage(final Set<String> keyPurposeSet) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setMatchAllSubjectAltNames(final boolean matchAllNames) {
		throw new RuntimeException("Stub!");
	}

	public void setSubjectAlternativeNames(final Collection<List<?>> names) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addSubjectAlternativeName(final int type, final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addSubjectAlternativeName(final int type, final byte[] name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setNameConstraints(final byte[] bytes) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setBasicConstraints(final int minMaxPathLen) {
		throw new RuntimeException("Stub!");
	}

	public void setPolicy(final Set<String> certPolicySet) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setPathToNames(final Collection<List<?>> names) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addPathToName(final int type, final String name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void addPathToName(final int type, final byte[] name) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public X509Certificate getCertificate() {
		throw new RuntimeException("Stub!");
	}

	public BigInteger getSerialNumber() {
		throw new RuntimeException("Stub!");
	}

	public X500Principal getIssuer() {
		throw new RuntimeException("Stub!");
	}

	public String getIssuerAsString() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getIssuerAsBytes() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public X500Principal getSubject() {
		throw new RuntimeException("Stub!");
	}

	public String getSubjectAsString() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getSubjectAsBytes() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public byte[] getSubjectKeyIdentifier() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getAuthorityKeyIdentifier() {
		throw new RuntimeException("Stub!");
	}

	public Date getCertificateValid() {
		throw new RuntimeException("Stub!");
	}

	public Date getPrivateKeyValid() {
		throw new RuntimeException("Stub!");
	}

	public String getSubjectPublicKeyAlgID() {
		throw new RuntimeException("Stub!");
	}

	public PublicKey getSubjectPublicKey() {
		throw new RuntimeException("Stub!");
	}

	public boolean[] getKeyUsage() {
		throw new RuntimeException("Stub!");
	}

	public Set<String> getExtendedKeyUsage() {
		throw new RuntimeException("Stub!");
	}

	public boolean getMatchAllSubjectAltNames() {
		throw new RuntimeException("Stub!");
	}

	public Collection<List<?>> getSubjectAlternativeNames() {
		throw new RuntimeException("Stub!");
	}

	public byte[] getNameConstraints() {
		throw new RuntimeException("Stub!");
	}

	public int getBasicConstraints() {
		throw new RuntimeException("Stub!");
	}

	public Set<String> getPolicy() {
		throw new RuntimeException("Stub!");
	}

	public Collection<List<?>> getPathToNames() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean match(final Certificate cert) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
