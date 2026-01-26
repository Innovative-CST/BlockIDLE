package javax.xml.datatype;

import java.util.Locale;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class XMLGregorianCalendar implements Cloneable
{
    public XMLGregorianCalendar() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void clear();
    
    public abstract void reset();
    
    public abstract void setYear(final BigInteger p0);
    
    public abstract void setYear(final int p0);
    
    public abstract void setMonth(final int p0);
    
    public abstract void setDay(final int p0);
    
    public abstract void setTimezone(final int p0);
    
    public void setTime(final int hour, final int minute, final int second) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setHour(final int p0);
    
    public abstract void setMinute(final int p0);
    
    public abstract void setSecond(final int p0);
    
    public abstract void setMillisecond(final int p0);
    
    public abstract void setFractionalSecond(final BigDecimal p0);
    
    public void setTime(final int hour, final int minute, final int second, final BigDecimal fractional) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTime(final int hour, final int minute, final int second, final int millisecond) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract BigInteger getEon();
    
    public abstract int getYear();
    
    public abstract BigInteger getEonAndYear();
    
    public abstract int getMonth();
    
    public abstract int getDay();
    
    public abstract int getTimezone();
    
    public abstract int getHour();
    
    public abstract int getMinute();
    
    public abstract int getSecond();
    
    public int getMillisecond() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract BigDecimal getFractionalSecond();
    
    public abstract int compare(final XMLGregorianCalendar p0);
    
    public abstract XMLGregorianCalendar normalize();
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String toXMLFormat();
    
    public abstract QName getXMLSchemaType();
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isValid();
    
    public abstract void add(final Duration p0);
    
    public abstract GregorianCalendar toGregorianCalendar();
    
    public abstract GregorianCalendar toGregorianCalendar(final TimeZone p0, final Locale p1, final XMLGregorianCalendar p2);
    
    public abstract TimeZone getTimeZone(final int p0);
    
    public abstract Object clone();
}
