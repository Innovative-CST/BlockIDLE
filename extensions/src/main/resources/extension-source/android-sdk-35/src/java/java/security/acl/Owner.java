package java.security.acl;

import java.security.Principal;

@Deprecated
public interface Owner {
	@Deprecated
	boolean addOwner(final Principal p0, final Principal p1) throws NotOwnerException;

	@Deprecated
	boolean deleteOwner(final Principal p0, final Principal p1) throws LastOwnerException, NotOwnerException;

	@Deprecated
	boolean isOwner(final Principal p0);
}
