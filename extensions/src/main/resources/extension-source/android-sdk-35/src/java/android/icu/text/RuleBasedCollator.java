package android.icu.text;

import android.icu.util.VersionInfo;
import java.text.CharacterIterator;

public final class RuleBasedCollator extends Collator
{
    public RuleBasedCollator(final String rules) throws Exception {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    public CollationElementIterator getCollationElementIterator(final String source) {
        throw new RuntimeException("Stub!");
    }
    
    public CollationElementIterator getCollationElementIterator(final CharacterIterator source) {
        throw new RuntimeException("Stub!");
    }
    
    public CollationElementIterator getCollationElementIterator(final UCharacterIterator source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Collator freeze() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public RuleBasedCollator cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUpperCaseFirst(final boolean upperfirst) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLowerCaseFirst(final boolean lowerfirst) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaseFirstDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlternateHandlingDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaseLevelDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecompositionDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrenchCollationDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStrengthDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumericCollationDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFrenchCollation(final boolean flag) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlternateHandlingShifted(final boolean shifted) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCaseLevel(final boolean flag) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDecomposition(final int decomposition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStrength(final int newStrength) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public RuleBasedCollator setMaxVariable(final int group) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getMaxVariable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumericCollation(final boolean flag) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setReorderCodes(final int... order) {
        throw new RuntimeException("Stub!");
    }
    
    public String getRules() {
        throw new RuntimeException("Stub!");
    }
    
    public String getRules(final boolean fullrules) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public UnicodeSet getTailoredSet() {
        throw new RuntimeException("Stub!");
    }
    
    public void getContractionsAndExpansions(final UnicodeSet contractions, final UnicodeSet expansions, final boolean addPrefixes) throws Exception {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CollationKey getCollationKey(final String source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getStrength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getDecomposition() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isUpperCaseFirst() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLowerCaseFirst() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlternateHandlingShifted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCaseLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFrenchCollation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getVariableTop() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getNumericCollation() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int[] getReorderCodes() {
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
    
    @Override
    public int compare(final String source, final String target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public VersionInfo getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public VersionInfo getUCAVersion() {
        throw new RuntimeException("Stub!");
    }
}
