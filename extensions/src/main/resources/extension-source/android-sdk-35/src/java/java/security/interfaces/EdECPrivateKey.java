package java.security.interfaces;

import java.security.PrivateKey;
import java.util.Optional;

public interface EdECPrivateKey extends EdECKey, PrivateKey {
	Optional<byte[]> getBytes();
}
