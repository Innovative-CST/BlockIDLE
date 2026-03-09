package android.text;

public class Selection
{
    public static final Object SELECTION_END;
    public static final Object SELECTION_START;
    
    Selection() {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getSelectionStart(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public static final int getSelectionEnd(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public static void setSelection(final Spannable text, final int start, final int stop) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void setSelection(final Spannable text, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void selectAll(final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void extendSelection(final Spannable text, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void removeSelection(final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveUp(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveDown(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveLeft(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveRight(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveToParagraphStart(@NonNull final Spannable text, @NonNull final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveToParagraphEnd(@NonNull final Spannable text, @NonNull final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendToParagraphStart(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendToParagraphEnd(@NonNull final Spannable text) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendUp(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendDown(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendLeft(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendRight(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendToLeftEdge(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean extendToRightEdge(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveToLeftEdge(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean moveToRightEdge(final Spannable text, final Layout layout) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        SELECTION_END = null;
        SELECTION_START = null;
    }
}
