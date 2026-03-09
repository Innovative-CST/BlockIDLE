package android.text.style;

import android.os.Parcel;
import android.os.PersistableBundle;
import android.text.ParcelableSpan;

public class TtsSpan implements ParcelableSpan
{
    public static final String ANIMACY_ANIMATE = "android.animate";
    public static final String ANIMACY_INANIMATE = "android.inanimate";
    public static final String ARG_ANIMACY = "android.arg.animacy";
    public static final String ARG_CASE = "android.arg.case";
    public static final String ARG_COUNTRY_CODE = "android.arg.country_code";
    public static final String ARG_CURRENCY = "android.arg.money";
    public static final String ARG_DAY = "android.arg.day";
    public static final String ARG_DENOMINATOR = "android.arg.denominator";
    public static final String ARG_DIGITS = "android.arg.digits";
    public static final String ARG_DOMAIN = "android.arg.domain";
    public static final String ARG_EXTENSION = "android.arg.extension";
    public static final String ARG_FRACTIONAL_PART = "android.arg.fractional_part";
    public static final String ARG_FRAGMENT_ID = "android.arg.fragment_id";
    public static final String ARG_GENDER = "android.arg.gender";
    public static final String ARG_HOURS = "android.arg.hours";
    public static final String ARG_INTEGER_PART = "android.arg.integer_part";
    public static final String ARG_MINUTES = "android.arg.minutes";
    public static final String ARG_MONTH = "android.arg.month";
    public static final String ARG_MULTIPLICITY = "android.arg.multiplicity";
    public static final String ARG_NUMBER = "android.arg.number";
    public static final String ARG_NUMBER_PARTS = "android.arg.number_parts";
    public static final String ARG_NUMERATOR = "android.arg.numerator";
    public static final String ARG_PASSWORD = "android.arg.password";
    public static final String ARG_PATH = "android.arg.path";
    public static final String ARG_PORT = "android.arg.port";
    public static final String ARG_PROTOCOL = "android.arg.protocol";
    public static final String ARG_QUANTITY = "android.arg.quantity";
    public static final String ARG_QUERY_STRING = "android.arg.query_string";
    public static final String ARG_TEXT = "android.arg.text";
    public static final String ARG_UNIT = "android.arg.unit";
    public static final String ARG_USERNAME = "android.arg.username";
    public static final String ARG_VERBATIM = "android.arg.verbatim";
    public static final String ARG_WEEKDAY = "android.arg.weekday";
    public static final String ARG_YEAR = "android.arg.year";
    public static final String CASE_ABLATIVE = "android.ablative";
    public static final String CASE_ACCUSATIVE = "android.accusative";
    public static final String CASE_DATIVE = "android.dative";
    public static final String CASE_GENITIVE = "android.genitive";
    public static final String CASE_INSTRUMENTAL = "android.instrumental";
    public static final String CASE_LOCATIVE = "android.locative";
    public static final String CASE_NOMINATIVE = "android.nominative";
    public static final String CASE_VOCATIVE = "android.vocative";
    public static final String GENDER_FEMALE = "android.female";
    public static final String GENDER_MALE = "android.male";
    public static final String GENDER_NEUTRAL = "android.neutral";
    public static final int MONTH_APRIL = 3;
    public static final int MONTH_AUGUST = 7;
    public static final int MONTH_DECEMBER = 11;
    public static final int MONTH_FEBRUARY = 1;
    public static final int MONTH_JANUARY = 0;
    public static final int MONTH_JULY = 6;
    public static final int MONTH_JUNE = 5;
    public static final int MONTH_MARCH = 2;
    public static final int MONTH_MAY = 4;
    public static final int MONTH_NOVEMBER = 10;
    public static final int MONTH_OCTOBER = 9;
    public static final int MONTH_SEPTEMBER = 8;
    public static final String MULTIPLICITY_DUAL = "android.dual";
    public static final String MULTIPLICITY_PLURAL = "android.plural";
    public static final String MULTIPLICITY_SINGLE = "android.single";
    public static final String TYPE_CARDINAL = "android.type.cardinal";
    public static final String TYPE_DATE = "android.type.date";
    public static final String TYPE_DECIMAL = "android.type.decimal";
    public static final String TYPE_DIGITS = "android.type.digits";
    public static final String TYPE_ELECTRONIC = "android.type.electronic";
    public static final String TYPE_FRACTION = "android.type.fraction";
    public static final String TYPE_MEASURE = "android.type.measure";
    public static final String TYPE_MONEY = "android.type.money";
    public static final String TYPE_ORDINAL = "android.type.ordinal";
    public static final String TYPE_TELEPHONE = "android.type.telephone";
    public static final String TYPE_TEXT = "android.type.text";
    public static final String TYPE_TIME = "android.type.time";
    public static final String TYPE_VERBATIM = "android.type.verbatim";
    public static final int WEEKDAY_FRIDAY = 6;
    public static final int WEEKDAY_MONDAY = 2;
    public static final int WEEKDAY_SATURDAY = 7;
    public static final int WEEKDAY_SUNDAY = 1;
    public static final int WEEKDAY_THURSDAY = 5;
    public static final int WEEKDAY_TUESDAY = 3;
    public static final int WEEKDAY_WEDNESDAY = 4;
    
    public TtsSpan(final String type, final PersistableBundle args) {
        throw new RuntimeException("Stub!");
    }
    
    public TtsSpan(final Parcel src) {
        throw new RuntimeException("Stub!");
    }
    
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    public PersistableBundle getArgs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanTypeId() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder<C extends Builder<?>>
    {
        public Builder(final String type) {
            throw new RuntimeException("Stub!");
        }
        
        public TtsSpan build() {
            throw new RuntimeException("Stub!");
        }
        
        public C setStringArgument(final String arg, final String value) {
            throw new RuntimeException("Stub!");
        }
        
        public C setIntArgument(final String arg, final int value) {
            throw new RuntimeException("Stub!");
        }
        
        public C setLongArgument(final String arg, final long value) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class CardinalBuilder extends SemioticClassBuilder<CardinalBuilder>
    {
        public CardinalBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public CardinalBuilder(final long number) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public CardinalBuilder(final String number) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public CardinalBuilder setNumber(final long number) {
            throw new RuntimeException("Stub!");
        }
        
        public CardinalBuilder setNumber(final String number) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class DateBuilder extends SemioticClassBuilder<DateBuilder>
    {
        public DateBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DateBuilder(final Integer weekday, final Integer day, final Integer month, final Integer year) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DateBuilder setWeekday(final int weekday) {
            throw new RuntimeException("Stub!");
        }
        
        public DateBuilder setDay(final int day) {
            throw new RuntimeException("Stub!");
        }
        
        public DateBuilder setMonth(final int month) {
            throw new RuntimeException("Stub!");
        }
        
        public DateBuilder setYear(final int year) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class DecimalBuilder extends SemioticClassBuilder<DecimalBuilder>
    {
        public DecimalBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder(final double number, final int minimumFractionDigits, final int maximumFractionDigits) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder(final String integerPart, final String fractionalPart) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder setArgumentsFromDouble(final double number, final int minimumFractionDigits, final int maximumFractionDigits) {
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder setIntegerPart(final long integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder setIntegerPart(final String integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public DecimalBuilder setFractionalPart(final String fractionalPart) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class DigitsBuilder extends SemioticClassBuilder<DigitsBuilder>
    {
        public DigitsBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DigitsBuilder(final String digits) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public DigitsBuilder setDigits(final String digits) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class ElectronicBuilder extends SemioticClassBuilder<ElectronicBuilder>
    {
        public ElectronicBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setEmailArguments(final String username, final String domain) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setProtocol(final String protocol) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setUsername(final String username) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setPassword(final String password) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setDomain(final String domain) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setPort(final int port) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setPath(final String path) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setQueryString(final String queryString) {
            throw new RuntimeException("Stub!");
        }
        
        public ElectronicBuilder setFragmentId(final String fragmentId) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class FractionBuilder extends SemioticClassBuilder<FractionBuilder>
    {
        public FractionBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder(final long integerPart, final long numerator, final long denominator) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setIntegerPart(final long integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setIntegerPart(final String integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setNumerator(final long numerator) {
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setNumerator(final String numerator) {
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setDenominator(final long denominator) {
            throw new RuntimeException("Stub!");
        }
        
        public FractionBuilder setDenominator(final String denominator) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MeasureBuilder extends SemioticClassBuilder<MeasureBuilder>
    {
        public MeasureBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setNumber(final long number) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setNumber(final String number) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setIntegerPart(final long integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setIntegerPart(final String integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setFractionalPart(final String fractionalPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setNumerator(final long numerator) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setNumerator(final String numerator) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setDenominator(final long denominator) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setDenominator(final String denominator) {
            throw new RuntimeException("Stub!");
        }
        
        public MeasureBuilder setUnit(final String unit) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MoneyBuilder extends SemioticClassBuilder<MoneyBuilder>
    {
        public MoneyBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public MoneyBuilder setIntegerPart(final long integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MoneyBuilder setIntegerPart(final String integerPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MoneyBuilder setFractionalPart(final String fractionalPart) {
            throw new RuntimeException("Stub!");
        }
        
        public MoneyBuilder setCurrency(final String currency) {
            throw new RuntimeException("Stub!");
        }
        
        public MoneyBuilder setQuantity(final String quantity) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class OrdinalBuilder extends SemioticClassBuilder<OrdinalBuilder>
    {
        public OrdinalBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public OrdinalBuilder(final long number) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public OrdinalBuilder(final String number) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public OrdinalBuilder setNumber(final long number) {
            throw new RuntimeException("Stub!");
        }
        
        public OrdinalBuilder setNumber(final String number) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class SemioticClassBuilder<C extends SemioticClassBuilder<?>> extends Builder<C>
    {
        public SemioticClassBuilder(final String type) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public C setGender(final String gender) {
            throw new RuntimeException("Stub!");
        }
        
        public C setAnimacy(final String animacy) {
            throw new RuntimeException("Stub!");
        }
        
        public C setMultiplicity(final String multiplicity) {
            throw new RuntimeException("Stub!");
        }
        
        public C setCase(final String grammaticalCase) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class TelephoneBuilder extends SemioticClassBuilder<TelephoneBuilder>
    {
        public TelephoneBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TelephoneBuilder(final String numberParts) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TelephoneBuilder setCountryCode(final String countryCode) {
            throw new RuntimeException("Stub!");
        }
        
        public TelephoneBuilder setNumberParts(final String numberParts) {
            throw new RuntimeException("Stub!");
        }
        
        public TelephoneBuilder setExtension(final String extension) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class TextBuilder extends SemioticClassBuilder<TextBuilder>
    {
        public TextBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TextBuilder(final String text) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TextBuilder setText(final String text) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class TimeBuilder extends SemioticClassBuilder<TimeBuilder>
    {
        public TimeBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TimeBuilder(final int hours, final int minutes) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public TimeBuilder setHours(final int hours) {
            throw new RuntimeException("Stub!");
        }
        
        public TimeBuilder setMinutes(final int minutes) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class VerbatimBuilder extends SemioticClassBuilder<VerbatimBuilder>
    {
        public VerbatimBuilder() {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public VerbatimBuilder(final String verbatim) {
            super(null);
            throw new RuntimeException("Stub!");
        }
        
        public VerbatimBuilder setVerbatim(final String verbatim) {
            throw new RuntimeException("Stub!");
        }
    }
}
