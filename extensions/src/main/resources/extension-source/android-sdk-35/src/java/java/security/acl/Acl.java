package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

@Deprecated
public interface Acl extends Owner {
	@Deprecated
	void setName(final Principal p0, final String p1) throws NotOwnerException;

	@Deprecated
	String getName();

	@Deprecated
	boolean addEntry(final Principal p0, final AclEntry p1) throws NotOwnerException;

	@Deprecated
	boolean removeEntry(final Principal p0, final AclEntry p1) throws NotOwnerException;

	@Deprecated
	Enumeration<Permission> getPermissions(final Principal p0);

	@Deprecated
	Enumeration<AclEntry> entries();

	@Deprecated
	boolean checkPermission(final Principal p0, final Permission p1);

	@Deprecated
	String toString();
}
