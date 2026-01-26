package android.icu.util;

public final class LocaleData
{
    public static final int ALT_QUOTATION_END = 3;
    public static final int ALT_QUOTATION_START = 2;
    public static final int QUOTATION_END = 1;
    public static final int QUOTATION_START = 0;
    
    LocaleData() {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleData getInstance(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static LocaleData getInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNoSubstitute(final boolean setting) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getNoSubstitute() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDelimiter(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public static MeasurementSystem getMeasurementSystem(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static PaperSize getPaperSize(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static VersionInfo getCLDRVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class MeasurementSystem
    {
        public static final MeasurementSystem SI;
        public static final MeasurementSystem UK;
        public static final MeasurementSystem US;
        
        MeasurementSystem() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            SI = null;
            UK = null;
            US = null;
        }
    }
    
    public static final class PaperSize
    {
        PaperSize() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidth() {
            throw new RuntimeException("Stub!");
        }
    }
}
