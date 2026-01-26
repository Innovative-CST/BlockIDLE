package java.security.acl;

import java.security.Principal;
import java.util.Enumeration;

@Deprecated
public interface Group extends Principal {
	@Deprecated
	boolean addMember(final Principal p0);

	@Deprecated
	boolean removeMember(final Principal p0);

	@Deprecated
	boolean isMember(final Principal p0);

	@Deprecated
	Enumeration<? extends Principal> members();
}
