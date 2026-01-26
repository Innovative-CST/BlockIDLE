package javax.xml.datatype;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import javax.xml.namespace.QName;

public abstract class Duration
{
    public Duration() {
        throw new RuntimeException("Stub!");
    }
    
    public QName getXMLSchemaType() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getSign();
    
    public int getYears() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMonths() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDays() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHours() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinutes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSeconds() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeInMillis(final Calendar startInstant) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimeInMillis(final Date startInstant) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Number getField(final DatatypeConstants.Field p0);
    
    public abstract boolean isSet(final DatatypeConstants.Field p0);
    
    public abstract Duration add(final Duration p0);
    
    public abstract void addTo(final Calendar p0);
    
    public void addTo(final Date date) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration subtract(final Duration rhs) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration multiply(final int factor) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Duration multiply(final BigDecimal p0);
    
    public abstract Duration negate();
    
    public abstract Duration normalizeWith(final Calendar p0);
    
    public abstract int compare(final Duration p0);
    
    public boolean isLongerThan(final Duration duration) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShorterThan(final Duration duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public abstract int hashCode();
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
