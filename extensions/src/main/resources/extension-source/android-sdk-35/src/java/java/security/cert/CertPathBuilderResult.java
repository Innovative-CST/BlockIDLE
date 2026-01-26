package java.security.cert;

public interface CertPathBuilderResult extends Cloneable {
	CertPath getCertPath();

	Object clone();
}
