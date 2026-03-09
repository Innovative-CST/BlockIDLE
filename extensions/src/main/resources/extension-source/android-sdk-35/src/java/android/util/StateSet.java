package android.util;

public class StateSet
{
    public static final int[] NOTHING;
    public static final int[] WILD_CARD;
    
    StateSet() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isWildCard(final int[] stateSetOrSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean stateSetMatches(final int[] stateSpec, final int[] stateSet) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean stateSetMatches(final int[] stateSpec, final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public static int[] trimStateSet(final int[] states, final int newSize) {
        throw new RuntimeException("Stub!");
    }
    
    public static String dump(final int[] states) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        NOTHING = null;
        WILD_CARD = null;
    }
}
