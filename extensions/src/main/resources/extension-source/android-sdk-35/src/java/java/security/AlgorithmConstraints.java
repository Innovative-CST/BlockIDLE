package java.security;

import java.util.Set;

public interface AlgorithmConstraints {
	boolean permits(final Set<CryptoPrimitive> p0, final String p1, final AlgorithmParameters p2);

	boolean permits(final Set<CryptoPrimitive> p0, final Key p1);

	boolean permits(final Set<CryptoPrimitive> p0, final String p1, final Key p2, final AlgorithmParameters p3);
}
