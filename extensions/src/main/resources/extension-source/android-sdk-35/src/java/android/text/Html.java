package android.text;

import android.graphics.drawable.Drawable;
import org.xml.sax.XMLReader;

public class Html
{
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
    
    Html() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Spanned fromHtml(final String source) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spanned fromHtml(final String source, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Spanned fromHtml(final String source, final ImageGetter imageGetter, final TagHandler tagHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public static Spanned fromHtml(final String source, final int flags, final ImageGetter imageGetter, final TagHandler tagHandler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static String toHtml(final Spanned text) {
        throw new RuntimeException("Stub!");
    }
    
    public static String toHtml(final Spanned text, final int option) {
        throw new RuntimeException("Stub!");
    }
    
    public static String escapeHtml(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public interface TagHandler
    {
        void handleTag(final boolean p0, final String p1, final Editable p2, final XMLReader p3);
    }
    
    public interface ImageGetter
    {
        Drawable getDrawable(final String p0);
    }
}
