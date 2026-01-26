package java.security.interfaces;

import java.security.PublicKey;
import java.security.spec.EdECPoint;

public interface EdECPublicKey extends EdECKey, PublicKey {
	EdECPoint getPoint();
}
