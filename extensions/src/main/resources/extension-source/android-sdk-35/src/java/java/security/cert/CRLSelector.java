package java.security.cert;

public interface CRLSelector extends Cloneable {
	boolean match(final CRL p0);

	Object clone();
}
