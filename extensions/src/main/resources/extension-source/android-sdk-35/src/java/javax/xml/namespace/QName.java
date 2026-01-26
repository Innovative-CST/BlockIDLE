package javax.xml.namespace;

import java.io.Serializable;

public class QName implements Serializable
{
    public QName(final String namespaceURI, final String localPart) {
        throw new RuntimeException("Stub!");
    }
    
    public QName(final String namespaceURI, final String localPart, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    public QName(final String localPart) {
        throw new RuntimeException("Stub!");
    }
    
    public String getNamespaceURI() {
        throw new RuntimeException("Stub!");
    }
    
    public String getLocalPart() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPrefix() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean equals(final Object objectToTest) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static QName valueOf(final String qNameAsString) {
        throw new RuntimeException("Stub!");
    }
}
