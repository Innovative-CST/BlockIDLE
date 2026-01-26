package java.security.interfaces;

import java.security.PrivateKey;
import java.util.Optional;

public interface XECPrivateKey extends XECKey, PrivateKey {
	Optional<byte[]> getScalar();
}
