package java.security.interfaces;

import java.security.InvalidParameterException;
import java.security.SecureRandom;

public interface DSAKeyPairGenerator {
	void initialize(final DSAParams p0, final SecureRandom p1) throws InvalidParameterException;

	void initialize(final int p0, final boolean p1, final SecureRandom p2) throws InvalidParameterException;
}
