package java.lang.invoke;

public class VolatileCallSite extends CallSite {
	public VolatileCallSite(final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public VolatileCallSite(final MethodHandle target) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final MethodHandle getTarget() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void setTarget(final MethodHandle newTarget) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final MethodHandle dynamicInvoker() {
		throw new RuntimeException("Stub!");
	}
}
