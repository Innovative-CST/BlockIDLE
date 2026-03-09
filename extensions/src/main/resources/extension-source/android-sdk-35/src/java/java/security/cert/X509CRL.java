package java.security.cert;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.Date;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

public abstract class X509CRL extends CRL implements X509Extension {
	protected X509CRL() {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] getEncoded() throws CRLException;

	public abstract void verify(final PublicKey p0) throws CRLException, InvalidKeyException, NoSuchAlgorithmException,
			NoSuchProviderException, SignatureException;

	public abstract void verify(final PublicKey p0, final String p1) throws CRLException, InvalidKeyException,
			NoSuchAlgorithmException, NoSuchProviderException, SignatureException;

	public void verify(final PublicKey key, final Provider sigProvider)
			throws CRLException, InvalidKeyException, NoSuchAlgorithmException, SignatureException {
		throw new RuntimeException("Stub!");
	}

	public abstract int getVersion();

	public abstract Principal getIssuerDN();

	public X500Principal getIssuerX500Principal() {
		throw new RuntimeException("Stub!");
	}

	public abstract Date getThisUpdate();

	public abstract Date getNextUpdate();

	public abstract X509CRLEntry getRevokedCertificate(final BigInteger p0);

	public X509CRLEntry getRevokedCertificate(final X509Certificate certificate) {
		throw new RuntimeException("Stub!");
	}

	public abstract Set<? extends X509CRLEntry> getRevokedCertificates();

	public abstract byte[] getTBSCertList() throws CRLException;

	public abstract byte[] getSignature();

	public abstract String getSigAlgName();

	public abstract String getSigAlgOID();

	public abstract byte[] getSigAlgParams();
}
