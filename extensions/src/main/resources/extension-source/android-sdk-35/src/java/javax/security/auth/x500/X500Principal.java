package javax.security.auth.x500;

import java.io.InputStream;
import java.util.Map;
import java.io.Serializable;
import java.security.Principal;

public final class X500Principal implements Principal, Serializable
{
    public static final String CANONICAL = "CANONICAL";
    public static final String RFC1779 = "RFC1779";
    public static final String RFC2253 = "RFC2253";
    
    public X500Principal(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public X500Principal(final String name, final Map<String, String> keywordMap) {
        throw new RuntimeException("Stub!");
    }
    
    public X500Principal(final byte[] name) {
        throw new RuntimeException("Stub!");
    }
    
    public X500Principal(final InputStream is) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final String format) {
        throw new RuntimeException("Stub!");
    }
    
    public String getName(final String format, final Map<String, String> oidMap) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getEncoded() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
