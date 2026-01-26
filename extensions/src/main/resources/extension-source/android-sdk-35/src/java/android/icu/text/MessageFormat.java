package android.icu.text;

import java.io.InvalidObjectException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.util.Set;
import java.util.Map;
import java.text.Format;
import android.icu.util.ULocale;
import java.util.Locale;

public class MessageFormat extends UFormat
{
    public MessageFormat(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public MessageFormat(final String pattern, final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public MessageFormat(final String pattern, final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocale(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLocale(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public ULocale getULocale() {
        throw new RuntimeException("Stub!");
    }
    
    public void applyPattern(final String pttrn) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyPattern(final String pattern, final MessagePattern.ApostropheMode aposMode) {
        throw new RuntimeException("Stub!");
    }
    
    public MessagePattern.ApostropheMode getApostropheMode() {
        throw new RuntimeException("Stub!");
    }
    
    public String toPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormatsByArgumentIndex(final Format[] newFormats) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormatsByArgumentName(final Map<String, Format> newFormats) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormats(final Format[] newFormats) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormatByArgumentIndex(final int argumentIndex, final Format newFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormatByArgumentName(final String argumentName, final Format newFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormat(final int formatElementIndex, final Format newFormat) {
        throw new RuntimeException("Stub!");
    }
    
    public Format[] getFormatsByArgumentIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public Format[] getFormats() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getArgumentNames() {
        throw new RuntimeException("Stub!");
    }
    
    public Format getFormatByArgumentName(final String argumentName) {
        throw new RuntimeException("Stub!");
    }
    
    public final StringBuffer format(final Object[] arguments, final StringBuffer result, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public final StringBuffer format(final Map<String, Object> arguments, final StringBuffer result, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public static String format(final String pattern, final Object... arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public static String format(final String pattern, final Map<String, Object> arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean usesNamedArguments() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final StringBuffer format(final Object arguments, final StringBuffer result, final FieldPosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AttributedCharacterIterator formatToCharacterIterator(final Object arguments) {
        throw new RuntimeException("Stub!");
    }
    
    public Object[] parse(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, Object> parseToMap(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    public Object[] parse(final String source) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, Object> parseToMap(final String source) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public static String autoQuoteApostrophe(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Field extends Format.Field
    {
        public static final Field ARGUMENT;
        
        protected Field(final String name) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        @Override
        protected Object readResolve() throws InvalidObjectException {
            throw new RuntimeException("Stub!");
        }
        
        static {
            ARGUMENT = null;
        }
    }
}
