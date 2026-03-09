package android.animation;

import android.graphics.PointF;
import android.graphics.Path;
import android.util.Property;

public final class ObjectAnimator extends ValueAnimator
{
    public ObjectAnimator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPropertyName(@NonNull final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProperty(@NonNull final Property property) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getPropertyName() {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofInt(final Object target, final String propertyName, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofInt(final Object target, final String xPropertyName, final String yPropertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> ObjectAnimator ofInt(final T target, final Property<T, Integer> property, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> ObjectAnimator ofInt(final T target, final Property<T, Integer> xProperty, final Property<T, Integer> yProperty, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofMultiInt(final Object target, final String propertyName, final int[][] values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofMultiInt(final Object target, final String propertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <T> ObjectAnimator ofMultiInt(final Object target, final String propertyName, final TypeConverter<T, int[]> converter, final TypeEvaluator<T> evaluator, final T... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofArgb(final Object target, final String propertyName, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> ObjectAnimator ofArgb(final T target, final Property<T, Integer> property, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofFloat(final Object target, final String propertyName, final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofFloat(final Object target, final String xPropertyName, final String yPropertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> ObjectAnimator ofFloat(final T target, final Property<T, Float> property, final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> ObjectAnimator ofFloat(final T target, final Property<T, Float> xProperty, final Property<T, Float> yProperty, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofMultiFloat(final Object target, final String propertyName, final float[][] values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofMultiFloat(final Object target, final String propertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <T> ObjectAnimator ofMultiFloat(final Object target, final String propertyName, final TypeConverter<T, float[]> converter, final TypeEvaluator<T> evaluator, final T... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static ObjectAnimator ofObject(final Object target, final String propertyName, final TypeEvaluator evaluator, final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ObjectAnimator ofObject(final Object target, final String propertyName, @Nullable final TypeConverter<PointF, ?> converter, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    @NonNull
    public static <T, V> ObjectAnimator ofObject(final T target, final Property<T, V> property, final TypeEvaluator<V> evaluator, final V... values) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    @NonNull
    public static <T, V, P> ObjectAnimator ofObject(final T target, final Property<T, P> property, final TypeConverter<V, P> converter, final TypeEvaluator<V> evaluator, final V... values) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static <T, V> ObjectAnimator ofObject(final T target, @NonNull final Property<T, V> property, @Nullable final TypeConverter<PointF, V> converter, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ObjectAnimator ofPropertyValuesHolder(final Object target, final PropertyValuesHolder... values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setIntValues(final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFloatValues(final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setObjectValues(final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoCancel(final boolean cancel) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public ObjectAnimator setDuration(final long duration) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Object getTarget() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTarget(@Nullable final Object target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setupStartValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setupEndValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ObjectAnimator clone() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
