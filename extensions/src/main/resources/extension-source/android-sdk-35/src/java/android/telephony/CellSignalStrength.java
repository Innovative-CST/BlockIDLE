package android.telephony;

public abstract class CellSignalStrength
{
    public static final int SIGNAL_STRENGTH_GOOD = 3;
    public static final int SIGNAL_STRENGTH_GREAT = 4;
    public static final int SIGNAL_STRENGTH_MODERATE = 2;
    public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
    public static final int SIGNAL_STRENGTH_POOR = 1;
    
    CellSignalStrength() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getLevel();
    
    public abstract int getAsuLevel();
    
    public abstract int getDbm();
    
    @Override
    public abstract int hashCode();
    
    @Override
    public abstract boolean equals(final Object p0);
}
