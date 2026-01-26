package java.security;

import javax.security.auth.Destroyable;

public interface PrivateKey extends Key, Destroyable {
	@Deprecated
	long serialVersionUID = 6034044314589513430L;
}
