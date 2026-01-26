package javax.security.auth.callback;

import java.io.Serializable;

public class PasswordCallback implements Callback, Serializable
{
    public PasswordCallback(final String prompt, final boolean echoOn) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPrompt() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEchoOn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPassword(final char[] password) {
        throw new RuntimeException("Stub!");
    }
    
    public char[] getPassword() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPassword() {
        throw new RuntimeException("Stub!");
    }
}
