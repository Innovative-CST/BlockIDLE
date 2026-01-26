package java.security;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

public abstract class AuthProvider extends Provider {
	protected AuthProvider(final String name, final double version, final String info) {
		super(null, 0.0, null);
		throw new RuntimeException("Stub!");
	}

	public abstract void login(final Subject p0, final CallbackHandler p1) throws LoginException;

	public abstract void logout() throws LoginException;

	public abstract void setCallbackHandler(final CallbackHandler p0);
}
