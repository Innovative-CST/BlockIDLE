package javax.xml.datatype;

import java.util.GregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class DatatypeFactory
{
    public static final String DATATYPEFACTORY_IMPLEMENTATION_CLASS;
    public static final String DATATYPEFACTORY_PROPERTY = "javax.xml.datatype.DatatypeFactory";
    
    protected DatatypeFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public static DatatypeFactory newInstance() throws DatatypeConfigurationException {
        throw new RuntimeException("Stub!");
    }
    
    public static DatatypeFactory newInstance(final String factoryClassName, final ClassLoader classLoader) throws DatatypeConfigurationException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract Duration newDuration(final String p0);
    
    public abstract Duration newDuration(final long p0);
    
    public abstract Duration newDuration(final boolean p0, final BigInteger p1, final BigInteger p2, final BigInteger p3, final BigInteger p4, final BigInteger p5, final BigDecimal p6);
    
    public Duration newDuration(final boolean isPositive, final int years, final int months, final int days, final int hours, final int minutes, final int seconds) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationDayTime(final String lexicalRepresentation) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationDayTime(final long durationInMilliseconds) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationDayTime(final boolean isPositive, final BigInteger day, final BigInteger hour, final BigInteger minute, final BigInteger second) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationDayTime(final boolean isPositive, final int day, final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationYearMonth(final String lexicalRepresentation) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationYearMonth(final long durationInMilliseconds) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationYearMonth(final boolean isPositive, final BigInteger year, final BigInteger month) {
        throw new RuntimeException("Stub!");
    }
    
    public Duration newDurationYearMonth(final boolean isPositive, final int year, final int month) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract XMLGregorianCalendar newXMLGregorianCalendar();
    
    public abstract XMLGregorianCalendar newXMLGregorianCalendar(final String p0);
    
    public abstract XMLGregorianCalendar newXMLGregorianCalendar(final GregorianCalendar p0);
    
    public abstract XMLGregorianCalendar newXMLGregorianCalendar(final BigInteger p0, final int p1, final int p2, final int p3, final int p4, final int p5, final BigDecimal p6, final int p7);
    
    public XMLGregorianCalendar newXMLGregorianCalendar(final int year, final int month, final int day, final int hour, final int minute, final int second, final int millisecond, final int timezone) {
        throw new RuntimeException("Stub!");
    }
    
    public XMLGregorianCalendar newXMLGregorianCalendarDate(final int year, final int month, final int day, final int timezone) {
        throw new RuntimeException("Stub!");
    }
    
    public XMLGregorianCalendar newXMLGregorianCalendarTime(final int hours, final int minutes, final int seconds, final int timezone) {
        throw new RuntimeException("Stub!");
    }
    
    public XMLGregorianCalendar newXMLGregorianCalendarTime(final int hours, final int minutes, final int seconds, final BigDecimal fractionalSecond, final int timezone) {
        throw new RuntimeException("Stub!");
    }
    
    public XMLGregorianCalendar newXMLGregorianCalendarTime(final int hours, final int minutes, final int seconds, final int milliseconds, final int timezone) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DATATYPEFACTORY_IMPLEMENTATION_CLASS = null;
    }
}
