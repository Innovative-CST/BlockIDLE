package android.icu.number;

import android.icu.util.Currency;
import java.math.BigDecimal;

public abstract class Precision
{
    Precision() {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision unlimited() {
        throw new RuntimeException("Stub!");
    }
    
    public static FractionPrecision integer() {
        throw new RuntimeException("Stub!");
    }
    
    public static FractionPrecision fixedFraction(final int minMaxFractionPlaces) {
        throw new RuntimeException("Stub!");
    }
    
    public static FractionPrecision minFraction(final int minFractionPlaces) {
        throw new RuntimeException("Stub!");
    }
    
    public static FractionPrecision maxFraction(final int maxFractionPlaces) {
        throw new RuntimeException("Stub!");
    }
    
    public static FractionPrecision minMaxFraction(final int minFractionPlaces, final int maxFractionPlaces) {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision fixedSignificantDigits(final int minMaxSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision minSignificantDigits(final int minSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision maxSignificantDigits(final int maxSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision minMaxSignificantDigits(final int minSignificantDigits, final int maxSignificantDigits) {
        throw new RuntimeException("Stub!");
    }
    
    public static Precision increment(final BigDecimal roundingIncrement) {
        throw new RuntimeException("Stub!");
    }
    
    public static CurrencyPrecision currency(final Currency.CurrencyUsage currencyUsage) {
        throw new RuntimeException("Stub!");
    }
    
    public Precision trailingZeroDisplay(final NumberFormatter.TrailingZeroDisplay trailingZeroDisplay) {
        throw new RuntimeException("Stub!");
    }
}
