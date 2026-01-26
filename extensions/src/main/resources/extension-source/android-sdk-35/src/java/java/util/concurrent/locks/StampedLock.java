package java.util.concurrent.locks;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class StampedLock implements Serializable {
	public StampedLock() {
		throw new RuntimeException("Stub!");
	}

	public long writeLock() {
		throw new RuntimeException("Stub!");
	}

	public long tryWriteLock() {
		throw new RuntimeException("Stub!");
	}

	public long tryWriteLock(final long time, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public long writeLockInterruptibly() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public long readLock() {
		throw new RuntimeException("Stub!");
	}

	public long tryReadLock() {
		throw new RuntimeException("Stub!");
	}

	public long tryReadLock(final long time, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public long readLockInterruptibly() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public long tryOptimisticRead() {
		throw new RuntimeException("Stub!");
	}

	public boolean validate(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public void unlockWrite(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public void unlockRead(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public void unlock(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public long tryConvertToWriteLock(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public long tryConvertToReadLock(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public long tryConvertToOptimisticRead(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public boolean tryUnlockWrite() {
		throw new RuntimeException("Stub!");
	}

	public boolean tryUnlockRead() {
		throw new RuntimeException("Stub!");
	}

	public boolean isWriteLocked() {
		throw new RuntimeException("Stub!");
	}

	public boolean isReadLocked() {
		throw new RuntimeException("Stub!");
	}

	public static boolean isWriteLockStamp(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isReadLockStamp(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isLockStamp(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isOptimisticReadStamp(final long stamp) {
		throw new RuntimeException("Stub!");
	}

	public int getReadLockCount() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public Lock asReadLock() {
		throw new RuntimeException("Stub!");
	}

	public Lock asWriteLock() {
		throw new RuntimeException("Stub!");
	}

	public ReadWriteLock asReadWriteLock() {
		throw new RuntimeException("Stub!");
	}
}
