package java.lang;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

public class SecurityManager {
	@Deprecated
	protected boolean inCheck;

	public SecurityManager() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public boolean getInCheck() {
		throw new RuntimeException("Stub!");
	}

	protected Class[] getClassContext() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected ClassLoader currentClassLoader() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected Class<?> currentLoadedClass() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected int classDepth(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected int classLoaderDepth() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected boolean inClass(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected boolean inClassLoader() {
		throw new RuntimeException("Stub!");
	}

	public Object getSecurityContext() {
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(final Permission perm) {
		throw new RuntimeException("Stub!");
	}

	public void checkPermission(final Permission perm, final Object context) {
		throw new RuntimeException("Stub!");
	}

	public void checkCreateClassLoader() {
		throw new RuntimeException("Stub!");
	}

	public void checkAccess(final Thread t) {
		throw new RuntimeException("Stub!");
	}

	public void checkAccess(final ThreadGroup g) {
		throw new RuntimeException("Stub!");
	}

	public void checkExit(final int status) {
		throw new RuntimeException("Stub!");
	}

	public void checkExec(final String cmd) {
		throw new RuntimeException("Stub!");
	}

	public void checkLink(final String lib) {
		throw new RuntimeException("Stub!");
	}

	public void checkRead(final FileDescriptor fd) {
		throw new RuntimeException("Stub!");
	}

	public void checkRead(final String file) {
		throw new RuntimeException("Stub!");
	}

	public void checkRead(final String file, final Object context) {
		throw new RuntimeException("Stub!");
	}

	public void checkWrite(final FileDescriptor fd) {
		throw new RuntimeException("Stub!");
	}

	public void checkWrite(final String file) {
		throw new RuntimeException("Stub!");
	}

	public void checkDelete(final String file) {
		throw new RuntimeException("Stub!");
	}

	public void checkConnect(final String host, final int port) {
		throw new RuntimeException("Stub!");
	}

	public void checkConnect(final String host, final int port, final Object context) {
		throw new RuntimeException("Stub!");
	}

	public void checkListen(final int port) {
		throw new RuntimeException("Stub!");
	}

	public void checkAccept(final String host, final int port) {
		throw new RuntimeException("Stub!");
	}

	public void checkMulticast(final InetAddress maddr) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void checkMulticast(final InetAddress maddr, final byte ttl) {
		throw new RuntimeException("Stub!");
	}

	public void checkPropertiesAccess() {
		throw new RuntimeException("Stub!");
	}

	public void checkPropertyAccess(final String key) {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public boolean checkTopLevelWindow(final Object window) {
		throw new RuntimeException("Stub!");
	}

	public void checkPrintJobAccess() {
		throw new RuntimeException("Stub!");
	}

	public void checkSystemClipboardAccess() {
		throw new RuntimeException("Stub!");
	}

	public void checkAwtEventQueueAccess() {
		throw new RuntimeException("Stub!");
	}

	public void checkPackageAccess(final String pkg) {
		throw new RuntimeException("Stub!");
	}

	public void checkPackageDefinition(final String pkg) {
		throw new RuntimeException("Stub!");
	}

	public void checkSetFactory() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public void checkMemberAccess(final Class<?> clazz, final int which) {
		throw new RuntimeException("Stub!");
	}

	public void checkSecurityAccess(final String target) {
		throw new RuntimeException("Stub!");
	}

	public ThreadGroup getThreadGroup() {
		throw new RuntimeException("Stub!");
	}
}
