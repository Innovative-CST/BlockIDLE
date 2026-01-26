package javax.xml.datatype;

import javax.xml.namespace.QName;

public final class DatatypeConstants
{
    public static final int APRIL = 4;
    public static final int AUGUST = 8;
    public static final QName DATE;
    public static final QName DATETIME;
    public static final Field DAYS;
    public static final int DECEMBER = 12;
    public static final QName DURATION;
    public static final QName DURATION_DAYTIME;
    public static final QName DURATION_YEARMONTH;
    public static final int EQUAL = 0;
    public static final int FEBRUARY = 2;
    public static final int FIELD_UNDEFINED = Integer.MIN_VALUE;
    public static final QName GDAY;
    public static final QName GMONTH;
    public static final QName GMONTHDAY;
    public static final int GREATER = 1;
    public static final QName GYEAR;
    public static final QName GYEARMONTH;
    public static final Field HOURS;
    public static final int INDETERMINATE = 2;
    public static final int JANUARY = 1;
    public static final int JULY = 7;
    public static final int JUNE = 6;
    public static final int LESSER = -1;
    public static final int MARCH = 3;
    public static final int MAX_TIMEZONE_OFFSET = -840;
    public static final int MAY = 5;
    public static final Field MINUTES;
    public static final int MIN_TIMEZONE_OFFSET = 840;
    public static final Field MONTHS;
    public static final int NOVEMBER = 11;
    public static final int OCTOBER = 10;
    public static final Field SECONDS;
    public static final int SEPTEMBER = 9;
    public static final QName TIME;
    public static final Field YEARS;
    
    DatatypeConstants() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DATE = null;
        DATETIME = null;
        DAYS = null;
        DURATION = null;
        DURATION_DAYTIME = null;
        DURATION_YEARMONTH = null;
        GDAY = null;
        GMONTH = null;
        GMONTHDAY = null;
        GYEAR = null;
        GYEARMONTH = null;
        HOURS = null;
        MINUTES = null;
        MONTHS = null;
        SECONDS = null;
        TIME = null;
        YEARS = null;
    }
    
    public static final class Field
    {
        Field() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public int getId() {
            throw new RuntimeException("Stub!");
        }
    }
}
