package java.lang.invoke;

public class ConstantCallSite extends CallSite {
	public ConstantCallSite(final MethodHandle target) {
		throw new RuntimeException("Stub!");
	}

	protected ConstantCallSite(final MethodType targetType, final MethodHandle createTargetHook) throws Throwable {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final MethodHandle getTarget() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void setTarget(final MethodHandle ignore) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final MethodHandle dynamicInvoker() {
		throw new RuntimeException("Stub!");
	}
}
