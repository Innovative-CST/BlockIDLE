package android.icu.text;

import java.text.AttributedCharacterIterator;

public class Bidi
{
    public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = 126;
    public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = 127;
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;
    public static final short DO_MIRRORING = 2;
    public static final short INSERT_LRM_FOR_NUMERIC = 4;
    public static final short KEEP_BASE_COMBINING = 1;
    public static final byte LEVEL_DEFAULT_LTR = 126;
    public static final byte LEVEL_DEFAULT_RTL = Byte.MAX_VALUE;
    public static final byte LEVEL_OVERRIDE = Byte.MIN_VALUE;
    public static final byte LTR = 0;
    public static final int MAP_NOWHERE = -1;
    public static final byte MAX_EXPLICIT_LEVEL = 125;
    public static final byte MIXED = 2;
    public static final byte NEUTRAL = 3;
    public static final int OPTION_DEFAULT = 0;
    public static final int OPTION_INSERT_MARKS = 1;
    public static final int OPTION_REMOVE_CONTROLS = 2;
    public static final int OPTION_STREAMING = 4;
    public static final short OUTPUT_REVERSE = 16;
    public static final short REMOVE_BIDI_CONTROLS = 8;
    public static final short REORDER_DEFAULT = 0;
    public static final short REORDER_GROUP_NUMBERS_WITH_R = 2;
    public static final short REORDER_INVERSE_FOR_NUMBERS_SPECIAL = 6;
    public static final short REORDER_INVERSE_LIKE_DIRECT = 5;
    public static final short REORDER_INVERSE_NUMBERS_AS_L = 4;
    public static final short REORDER_NUMBERS_SPECIAL = 1;
    public static final short REORDER_RUNS_ONLY = 3;
    public static final byte RTL = 1;
    
    public Bidi() {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi(final int maxLength, final int maxRunCount) {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi(final String paragraph, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi(final AttributedCharacterIterator paragraph) {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi(final char[] text, final int textStart, final byte[] embeddings, final int embStart, final int paragraphLength, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInverse(final boolean isInverse) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isInverse() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReorderingMode(final int reorderingMode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getReorderingMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setReorderingOptions(final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public int getReorderingOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public static byte getBaseDirection(final CharSequence paragraph) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContext(final String prologue, final String epilogue) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPara(final String text, final byte paraLevel, final byte[] embeddingLevels) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPara(final char[] chars, final byte paraLevel, final byte[] embeddingLevels) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPara(final AttributedCharacterIterator paragraph) {
        throw new RuntimeException("Stub!");
    }
    
    public void orderParagraphsLTR(final boolean ordarParaLTR) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOrderParagraphsLTR() {
        throw new RuntimeException("Stub!");
    }
    
    public byte getDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public String getTextAsString() {
        throw new RuntimeException("Stub!");
    }
    
    public char[] getText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProcessedLength() {
        throw new RuntimeException("Stub!");
    }
    
    public int getResultLength() {
        throw new RuntimeException("Stub!");
    }
    
    public byte getParaLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int countParagraphs() {
        throw new RuntimeException("Stub!");
    }
    
    public BidiRun getParagraphByIndex(final int paraIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public BidiRun getParagraph(final int charIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getParagraphIndex(final int charIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCustomClassifier(final BidiClassifier classifier) {
        throw new RuntimeException("Stub!");
    }
    
    public BidiClassifier getCustomClassifier() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCustomizedClass(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi setLine(final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public byte getLevelAt(final int charIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] getLevels() {
        throw new RuntimeException("Stub!");
    }
    
    public BidiRun getLogicalRun(final int logicalPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public int countRuns() {
        throw new RuntimeException("Stub!");
    }
    
    public BidiRun getVisualRun(final int runIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVisualIndex(final int logicalIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLogicalIndex(final int visualIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getLogicalMap() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getVisualMap() {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] reorderLogical(final byte[] levels) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] reorderVisual(final byte[] levels) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] invertMap(final int[] srcMap) {
        throw new RuntimeException("Stub!");
    }
    
    public Bidi createLineBidi(final int lineStart, final int lineLimit) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMixed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLeftToRight() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRightToLeft() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean baseIsLeftToRight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBaseLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRunCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRunLevel(final int run) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRunStart(final int run) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRunLimit(final int run) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean requiresBidi(final char[] text, final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static void reorderVisually(final byte[] levels, final int levelStart, final Object[] objects, final int objectStart, final int count) {
        throw new RuntimeException("Stub!");
    }
    
    public String writeReordered(final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static String writeReverse(final String src, final int options) {
        throw new RuntimeException("Stub!");
    }
}
