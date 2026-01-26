package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public interface RSAMultiPrimePrivateCrtKey extends RSAPrivateKey {
	@Deprecated
	long serialVersionUID = 618058533534628008L;

	BigInteger getPublicExponent();

	BigInteger getPrimeP();

	BigInteger getPrimeQ();

	BigInteger getPrimeExponentP();

	BigInteger getPrimeExponentQ();

	BigInteger getCrtCoefficient();

	RSAOtherPrimeInfo[] getOtherPrimeInfo();
}
