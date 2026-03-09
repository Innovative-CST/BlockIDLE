package java.lang.invoke;

public class MutableCallSite extends CallSite {
	public MutableCallSite(final MethodType type) {
		throw new RuntimeException("Stub!");
	}

	public MutableCallSite(final MethodHandle target) {
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
