package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

@Deprecated
public interface AclEntry extends Cloneable {
	@Deprecated
	boolean setPrincipal(final Principal p0);

	@Deprecated
	Principal getPrincipal();

	@Deprecated
	void setNegativePermissions();

	@Deprecated
	boolean isNegative();

	@Deprecated
	boolean addPermission(final Permission p0);

	@Deprecated
	boolean removePermission(final Permission p0);

	@Deprecated
	boolean checkPermission(final Permission p0);

	@Deprecated
	Enumeration<Permission> permissions();

	@Deprecated
	String toString();

	@Deprecated
	Object clone();
}
