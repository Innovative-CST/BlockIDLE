package java.util;

public abstract class EventListenerProxy<T extends EventListener> implements EventListener {
	public EventListenerProxy(final T listener) {
		throw new RuntimeException("Stub!");
	}

	public T getListener() {
		throw new RuntimeException("Stub!");
	}
}
