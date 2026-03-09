package android.text;

public class TextDirectionHeuristics
{
    public static final TextDirectionHeuristic ANYRTL_LTR;
    public static final TextDirectionHeuristic FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristic FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristic LOCALE;
    public static final TextDirectionHeuristic LTR;
    public static final TextDirectionHeuristic RTL;
    
    public TextDirectionHeuristics() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ANYRTL_LTR = null;
        FIRSTSTRONG_LTR = null;
        FIRSTSTRONG_RTL = null;
        LOCALE = null;
        LTR = null;
        RTL = null;
    }
}
