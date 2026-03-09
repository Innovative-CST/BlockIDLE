package javax.security.auth;

import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.PrivilegedAction;
import java.security.AccessControlContext;
import java.security.Principal;
import java.util.Set;
import java.io.Serializable;

public final class Subject implements Serializable
{
    public Subject() {
        throw new RuntimeException("Stub!");
    }
    
    public Subject(final boolean readOnly, final Set<? extends Principal> principals, final Set<?> pubCredentials, final Set<?> privCredentials) {
        throw new RuntimeException("Stub!");
    }
    
    public void setReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isReadOnly() {
        throw new RuntimeException("Stub!");
    }
    
    public static Subject getSubject(final AccessControlContext acc) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> T doAs(final Subject subject, final PrivilegedAction<T> action) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> T doAs(final Subject subject, final PrivilegedExceptionAction<T> action) throws PrivilegedActionException {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> T doAsPrivileged(final Subject subject, final PrivilegedAction<T> action, final AccessControlContext acc) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> T doAsPrivileged(final Subject subject, final PrivilegedExceptionAction<T> action, final AccessControlContext acc) throws PrivilegedActionException {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Principal> getPrincipals() {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends Principal> Set<T> getPrincipals(final Class<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Object> getPublicCredentials() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<Object> getPrivateCredentials() {
        throw new RuntimeException("Stub!");
    }
    
    public <T> Set<T> getPublicCredentials(final Class<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    public <T> Set<T> getPrivateCredentials(final Class<T> c) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
