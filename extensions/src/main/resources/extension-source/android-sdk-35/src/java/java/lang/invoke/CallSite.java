package java.lang.invoke;

public abstract class CallSite {
	CallSite() {
		throw new RuntimeException("Stub!");
	}

	public MethodType type() {
		throw new RuntimeException("Stub!");
	}

	public abstract MethodHandle getTarget();

	public abstract void setTarget(final MethodHandle p0);

	public abstract MethodHandle dynamicInvoker();
}
