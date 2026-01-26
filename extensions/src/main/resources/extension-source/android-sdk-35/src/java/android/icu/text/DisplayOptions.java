package android.icu.text;

import java.util.List;

public final class DisplayOptions
{
    DisplayOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public static Builder builder() {
        throw new RuntimeException("Stub!");
    }
    
    public Builder copyToBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    public GrammaticalCase getGrammaticalCase() {
        throw new RuntimeException("Stub!");
    }
    
    public NounClass getNounClass() {
        throw new RuntimeException("Stub!");
    }
    
    public PluralCategory getPluralCategory() {
        throw new RuntimeException("Stub!");
    }
    
    public Capitalization getCapitalization() {
        throw new RuntimeException("Stub!");
    }
    
    public NameStyle getNameStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public DisplayLength getDisplayLength() {
        throw new RuntimeException("Stub!");
    }
    
    public SubstituteHandling getSubstituteHandling() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Builder
    {
        Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setGrammaticalCase(final GrammaticalCase grammaticalCase) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setNounClass(final NounClass nounClass) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setPluralCategory(final PluralCategory pluralCategory) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setCapitalization(final Capitalization capitalization) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setNameStyle(final NameStyle nameStyle) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDisplayLength(final DisplayLength displayLength) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSubstituteHandling(final SubstituteHandling substituteHandling) {
            throw new RuntimeException("Stub!");
        }
        
        public DisplayOptions build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum Capitalization
    {
        UNDEFINED, 
        BEGINNING_OF_SENTENCE, 
        MIDDLE_OF_SENTENCE, 
        STANDALONE, 
        UI_LIST_OR_MENU;
        
        public static final List<Capitalization> VALUES;
        
        static {
            VALUES = null;
        }
    }
    
    public enum DisplayLength
    {
        UNDEFINED, 
        LENGTH_FULL, 
        LENGTH_SHORT;
        
        public static final List<DisplayLength> VALUES;
        
        static {
            VALUES = null;
        }
    }
    
    public enum GrammaticalCase
    {
        UNDEFINED, 
        ABLATIVE, 
        ACCUSATIVE, 
        COMITATIVE, 
        DATIVE, 
        ERGATIVE, 
        GENITIVE, 
        INSTRUMENTAL, 
        LOCATIVE, 
        LOCATIVE_COPULATIVE, 
        NOMINATIVE, 
        OBLIQUE, 
        PREPOSITIONAL, 
        SOCIATIVE, 
        VOCATIVE;
        
        public static final List<GrammaticalCase> VALUES;
        
        public String getIdentifier() {
            throw new RuntimeException("Stub!");
        }
        
        public static GrammaticalCase fromIdentifier(final String identifier) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            VALUES = null;
        }
    }
    
    public enum NameStyle
    {
        UNDEFINED, 
        STANDARD_NAMES, 
        DIALECT_NAMES;
        
        public static final List<NameStyle> VALUES;
        
        static {
            VALUES = null;
        }
    }
    
    public enum NounClass
    {
        UNDEFINED, 
        OTHER, 
        NEUTER, 
        FEMININE, 
        MASCULINE, 
        ANIMATE, 
        INANIMATE, 
        PERSONAL, 
        COMMON;
        
        public static final List<NounClass> VALUES;
        
        public String getIdentifier() {
            throw new RuntimeException("Stub!");
        }
        
        public static NounClass fromIdentifier(final String identifier) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            VALUES = null;
        }
    }
    
    public enum PluralCategory
    {
        UNDEFINED, 
        ZERO, 
        ONE, 
        TWO, 
        FEW, 
        MANY, 
        OTHER;
        
        public static final List<PluralCategory> VALUES;
        
        public String getIdentifier() {
            throw new RuntimeException("Stub!");
        }
        
        public static PluralCategory fromIdentifier(final String identifier) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            VALUES = null;
        }
    }
    
    public enum SubstituteHandling
    {
        UNDEFINED, 
        SUBSTITUTE, 
        NO_SUBSTITUTE;
        
        public static final List<SubstituteHandling> VALUES;
        
        static {
            VALUES = null;
        }
    }
}
