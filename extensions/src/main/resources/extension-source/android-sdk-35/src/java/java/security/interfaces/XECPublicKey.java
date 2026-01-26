package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public interface XECPublicKey extends XECKey, PublicKey {
	BigInteger getU();
}
