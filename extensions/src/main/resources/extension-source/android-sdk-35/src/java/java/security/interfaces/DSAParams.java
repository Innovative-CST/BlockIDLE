package java.security.interfaces;

import java.math.BigInteger;

public interface DSAParams {
	BigInteger getP();

	BigInteger getQ();

	BigInteger getG();
}
