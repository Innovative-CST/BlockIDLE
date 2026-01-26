package java.util.concurrent.locks;

import java.io.Serializable;

public abstract class AbstractOwnableSynchronizer implements Serializable {
	protected AbstractOwnableSynchronizer() {
		throw new RuntimeException("Stub!");
	}

	protected final void setExclusiveOwnerThread(final Thread thread) {
		throw new RuntimeException("Stub!");
	}

	protected final Thread getExclusiveOwnerThread() {
		throw new RuntimeException("Stub!");
	}
}
