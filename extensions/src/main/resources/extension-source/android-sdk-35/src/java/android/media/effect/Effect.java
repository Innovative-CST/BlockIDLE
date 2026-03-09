package android.media.effect;

public abstract class Effect
{
    public Effect() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract String getName();
    
    public abstract void apply(final int p0, final int p1, final int p2, final int p3);
    
    public abstract void setParameter(final String p0, final Object p1);
    
    public void setUpdateListener(final EffectUpdateListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void release();
}
