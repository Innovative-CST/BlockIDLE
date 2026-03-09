package java.security.cert;

public interface CertSelector extends Cloneable {
	boolean match(final Certificate p0);

	Object clone();
}
