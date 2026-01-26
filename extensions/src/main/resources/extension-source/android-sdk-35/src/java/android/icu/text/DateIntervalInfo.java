package android.icu.text;

import java.util.Locale;
import android.icu.util.ULocale;
import java.io.Serializable;
import android.icu.util.Freezable;

public class DateIntervalInfo implements Cloneable, Freezable<DateIntervalInfo>, Serializable
{
    public DateIntervalInfo(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public DateIntervalInfo(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntervalPattern(final String skeleton, final int lrgDiffCalUnit, final String intervalPattern) {
        throw new RuntimeException("Stub!");
    }
    
    public PatternInfo getIntervalPattern(final String skeleton, final int field) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFallbackIntervalPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFallbackIntervalPattern(final String fallbackPattern) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getDefaultOrder() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public DateIntervalInfo freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public DateIntervalInfo cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object a) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class PatternInfo implements Cloneable, Serializable
    {
        public PatternInfo(final String firstPart, final String secondPart, final boolean firstDateInPtnIsLaterDate) {
            throw new RuntimeException("Stub!");
        }
        
        public String getFirstPart() {
            throw new RuntimeException("Stub!");
        }
        
        public String getSecondPart() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean firstDateInPtnIsLaterDate() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object a) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
