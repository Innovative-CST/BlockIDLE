package java.lang;

public final class StrictMath {
	public static final double E = 2.718281828459045;
	public static final double PI = 3.141592653589793;
	public static final double TAU = 6.283185307179586;

	StrictMath() {
		throw new RuntimeException("Stub!");
	}

	public static native double sin(final double p0);

	public static native double cos(final double p0);

	public static native double tan(final double p0);

	public static native double asin(final double p0);

	public static native double acos(final double p0);

	public static native double atan(final double p0);

	public static double toRadians(final double angdeg) {
		throw new RuntimeException("Stub!");
	}

	public static double toDegrees(final double angrad) {
		throw new RuntimeException("Stub!");
	}

	public static native double exp(final double p0);

	public static native double log(final double p0);

	public static native double log10(final double p0);

	public static native double sqrt(final double p0);

	public static native double cbrt(final double p0);

	public static native double IEEEremainder(final double p0, final double p1);

	public static double ceil(final double a) {
		throw new RuntimeException("Stub!");
	}

	public static double floor(final double a) {
		throw new RuntimeException("Stub!");
	}

	public static double rint(final double a) {
		throw new RuntimeException("Stub!");
	}

	public static native double atan2(final double p0, final double p1);

	public static native double pow(final double p0, final double p1);

	public static int round(final float a) {
		throw new RuntimeException("Stub!");
	}

	public static long round(final double a) {
		throw new RuntimeException("Stub!");
	}

	public static double random() {
		throw new RuntimeException("Stub!");
	}

	public static int addExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long addExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int subtractExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long subtractExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int multiplyExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long multiplyExact(final long x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long multiplyExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int divideExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long divideExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int floorDivExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long floorDivExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int ceilDivExact(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long ceilDivExact(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int incrementExact(final int a) {
		throw new RuntimeException("Stub!");
	}

	public static long incrementExact(final long a) {
		throw new RuntimeException("Stub!");
	}

	public static int decrementExact(final int a) {
		throw new RuntimeException("Stub!");
	}

	public static long decrementExact(final long a) {
		throw new RuntimeException("Stub!");
	}

	public static int negateExact(final int a) {
		throw new RuntimeException("Stub!");
	}

	public static long negateExact(final long a) {
		throw new RuntimeException("Stub!");
	}

	public static int toIntExact(final long value) {
		throw new RuntimeException("Stub!");
	}

	public static long multiplyFull(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long multiplyHigh(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static long unsignedMultiplyHigh(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int floorDiv(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long floorDiv(final long x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long floorDiv(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int floorMod(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static int floorMod(final long x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long floorMod(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int ceilDiv(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long ceilDiv(final long x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long ceilDiv(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int ceilMod(final int x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static int ceilMod(final long x, final int y) {
		throw new RuntimeException("Stub!");
	}

	public static long ceilMod(final long x, final long y) {
		throw new RuntimeException("Stub!");
	}

	public static int abs(final int a) {
		throw new RuntimeException("Stub!");
	}

	public static int absExact(final int a) {
		throw new RuntimeException("Stub!");
	}

	public static long abs(final long a) {
		throw new RuntimeException("Stub!");
	}

	public static long absExact(final long a) {
		throw new RuntimeException("Stub!");
	}

	public static float abs(final float a) {
		throw new RuntimeException("Stub!");
	}

	public static double abs(final double a) {
		throw new RuntimeException("Stub!");
	}

	public static int max(final int a, final int b) {
		throw new RuntimeException("Stub!");
	}

	public static long max(final long a, final long b) {
		throw new RuntimeException("Stub!");
	}

	public static float max(final float a, final float b) {
		throw new RuntimeException("Stub!");
	}

	public static double max(final double a, final double b) {
		throw new RuntimeException("Stub!");
	}

	public static int min(final int a, final int b) {
		throw new RuntimeException("Stub!");
	}

	public static long min(final long a, final long b) {
		throw new RuntimeException("Stub!");
	}

	public static float min(final float a, final float b) {
		throw new RuntimeException("Stub!");
	}

	public static double min(final double a, final double b) {
		throw new RuntimeException("Stub!");
	}

	public static int clamp(final long value, final int min, final int max) {
		throw new RuntimeException("Stub!");
	}

	public static long clamp(final long value, final long min, final long max) {
		throw new RuntimeException("Stub!");
	}

	public static double clamp(final double value, final double min, final double max) {
		throw new RuntimeException("Stub!");
	}

	public static float clamp(final float value, final float min, final float max) {
		throw new RuntimeException("Stub!");
	}

	public static double fma(final double a, final double b, final double c) {
		throw new RuntimeException("Stub!");
	}

	public static float fma(final float a, final float b, final float c) {
		throw new RuntimeException("Stub!");
	}

	public static double ulp(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static float ulp(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static double signum(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static float signum(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static native double sinh(final double p0);

	public static native double cosh(final double p0);

	public static native double tanh(final double p0);

	public static native double hypot(final double p0, final double p1);

	public static native double expm1(final double p0);

	public static native double log1p(final double p0);

	public static double copySign(final double magnitude, final double sign) {
		throw new RuntimeException("Stub!");
	}

	public static float copySign(final float magnitude, final float sign) {
		throw new RuntimeException("Stub!");
	}

	public static int getExponent(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static int getExponent(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static double nextAfter(final double start, final double direction) {
		throw new RuntimeException("Stub!");
	}

	public static float nextAfter(final float start, final double direction) {
		throw new RuntimeException("Stub!");
	}

	public static double nextUp(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static float nextUp(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static double nextDown(final double d) {
		throw new RuntimeException("Stub!");
	}

	public static float nextDown(final float f) {
		throw new RuntimeException("Stub!");
	}

	public static double scalb(final double d, final int scaleFactor) {
		throw new RuntimeException("Stub!");
	}

	public static float scalb(final float f, final int scaleFactor) {
		throw new RuntimeException("Stub!");
	}
}
