package android.animation;

public interface TypeEvaluator<T>
{
    T evaluate(final float p0, final T p1, final T p2);
}
