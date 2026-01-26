package java.awt.font;

import java.io.InvalidObjectException;
import java.text.AttributedCharacterIterator;

public final class TextAttribute extends AttributedCharacterIterator.Attribute {
	public static final TextAttribute BACKGROUND;
	public static final TextAttribute BIDI_EMBEDDING;
	public static final TextAttribute CHAR_REPLACEMENT;
	public static final TextAttribute FAMILY;
	public static final TextAttribute FONT;
	public static final TextAttribute FOREGROUND;
	public static final TextAttribute INPUT_METHOD_HIGHLIGHT;
	public static final TextAttribute INPUT_METHOD_UNDERLINE;
	public static final TextAttribute JUSTIFICATION;
	public static final Float JUSTIFICATION_FULL;
	public static final Float JUSTIFICATION_NONE;
	public static final TextAttribute KERNING;
	public static final Integer KERNING_ON;
	public static final TextAttribute LIGATURES;
	public static final Integer LIGATURES_ON;
	public static final TextAttribute NUMERIC_SHAPING;
	public static final TextAttribute POSTURE;
	public static final Float POSTURE_OBLIQUE;
	public static final Float POSTURE_REGULAR;
	public static final TextAttribute RUN_DIRECTION;
	public static final Boolean RUN_DIRECTION_LTR;
	public static final Boolean RUN_DIRECTION_RTL;
	public static final TextAttribute SIZE;
	public static final TextAttribute STRIKETHROUGH;
	public static final Boolean STRIKETHROUGH_ON;
	public static final TextAttribute SUPERSCRIPT;
	public static final Integer SUPERSCRIPT_SUB;
	public static final Integer SUPERSCRIPT_SUPER;
	public static final TextAttribute SWAP_COLORS;
	public static final Boolean SWAP_COLORS_ON;
	public static final TextAttribute TRACKING;
	public static final Float TRACKING_LOOSE;
	public static final Float TRACKING_TIGHT;
	public static final TextAttribute TRANSFORM;
	public static final TextAttribute UNDERLINE;
	public static final Integer UNDERLINE_LOW_DASHED;
	public static final Integer UNDERLINE_LOW_DOTTED;
	public static final Integer UNDERLINE_LOW_GRAY;
	public static final Integer UNDERLINE_LOW_ONE_PIXEL;
	public static final Integer UNDERLINE_LOW_TWO_PIXEL;
	public static final Integer UNDERLINE_ON;
	public static final TextAttribute WEIGHT;
	public static final Float WEIGHT_BOLD;
	public static final Float WEIGHT_DEMIBOLD;
	public static final Float WEIGHT_DEMILIGHT;
	public static final Float WEIGHT_EXTRABOLD;
	public static final Float WEIGHT_EXTRA_LIGHT;
	public static final Float WEIGHT_HEAVY;
	public static final Float WEIGHT_LIGHT;
	public static final Float WEIGHT_MEDIUM;
	public static final Float WEIGHT_REGULAR;
	public static final Float WEIGHT_SEMIBOLD;
	public static final Float WEIGHT_ULTRABOLD;
	public static final TextAttribute WIDTH;
	public static final Float WIDTH_CONDENSED;
	public static final Float WIDTH_EXTENDED;
	public static final Float WIDTH_REGULAR;
	public static final Float WIDTH_SEMI_CONDENSED;
	public static final Float WIDTH_SEMI_EXTENDED;

	protected TextAttribute(final String name) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	protected Object readResolve() throws InvalidObjectException {
		throw new RuntimeException("Stub!");
	}

	static {
		BACKGROUND = null;
		BIDI_EMBEDDING = null;
		CHAR_REPLACEMENT = null;
		FAMILY = null;
		FONT = null;
		FOREGROUND = null;
		INPUT_METHOD_HIGHLIGHT = null;
		INPUT_METHOD_UNDERLINE = null;
		JUSTIFICATION = null;
		JUSTIFICATION_FULL = null;
		JUSTIFICATION_NONE = null;
		KERNING = null;
		KERNING_ON = null;
		LIGATURES = null;
		LIGATURES_ON = null;
		NUMERIC_SHAPING = null;
		POSTURE = null;
		POSTURE_OBLIQUE = null;
		POSTURE_REGULAR = null;
		RUN_DIRECTION = null;
		RUN_DIRECTION_LTR = null;
		RUN_DIRECTION_RTL = null;
		SIZE = null;
		STRIKETHROUGH = null;
		STRIKETHROUGH_ON = null;
		SUPERSCRIPT = null;
		SUPERSCRIPT_SUB = null;
		SUPERSCRIPT_SUPER = null;
		SWAP_COLORS = null;
		SWAP_COLORS_ON = null;
		TRACKING = null;
		TRACKING_LOOSE = null;
		TRACKING_TIGHT = null;
		TRANSFORM = null;
		UNDERLINE = null;
		UNDERLINE_LOW_DASHED = null;
		UNDERLINE_LOW_DOTTED = null;
		UNDERLINE_LOW_GRAY = null;
		UNDERLINE_LOW_ONE_PIXEL = null;
		UNDERLINE_LOW_TWO_PIXEL = null;
		UNDERLINE_ON = null;
		WEIGHT = null;
		WEIGHT_BOLD = null;
		WEIGHT_DEMIBOLD = null;
		WEIGHT_DEMILIGHT = null;
		WEIGHT_EXTRABOLD = null;
		WEIGHT_EXTRA_LIGHT = null;
		WEIGHT_HEAVY = null;
		WEIGHT_LIGHT = null;
		WEIGHT_MEDIUM = null;
		WEIGHT_REGULAR = null;
		WEIGHT_SEMIBOLD = null;
		WEIGHT_ULTRABOLD = null;
		WIDTH = null;
		WIDTH_CONDENSED = null;
		WIDTH_EXTENDED = null;
		WIDTH_REGULAR = null;
		WIDTH_SEMI_CONDENSED = null;
		WIDTH_SEMI_EXTENDED = null;
	}
}
