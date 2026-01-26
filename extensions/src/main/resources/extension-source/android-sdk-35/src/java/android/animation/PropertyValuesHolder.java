package android.animation;

import android.graphics.PointF;
import android.graphics.Path;
import android.util.Property;

public class PropertyValuesHolder implements Cloneable
{
    PropertyValuesHolder() {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofInt(final String propertyName, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofInt(final Property<?, Integer> property, final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofMultiInt(final String propertyName, final int[][] values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofMultiInt(final String propertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <V> PropertyValuesHolder ofMultiInt(final String propertyName, final TypeConverter<V, int[]> converter, final TypeEvaluator<V> evaluator, final V... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> PropertyValuesHolder ofMultiInt(final String propertyName, final TypeConverter<T, int[]> converter, final TypeEvaluator<T> evaluator, final Keyframe... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofFloat(final String propertyName, final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofFloat(final Property<?, Float> property, final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofMultiFloat(final String propertyName, final float[][] values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofMultiFloat(final String propertyName, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <V> PropertyValuesHolder ofMultiFloat(final String propertyName, final TypeConverter<V, float[]> converter, final TypeEvaluator<V> evaluator, final V... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <T> PropertyValuesHolder ofMultiFloat(final String propertyName, final TypeConverter<T, float[]> converter, final TypeEvaluator<T> evaluator, final Keyframe... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofObject(final String propertyName, final TypeEvaluator evaluator, final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofObject(final String propertyName, final TypeConverter<PointF, ?> converter, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <V> PropertyValuesHolder ofObject(final Property property, final TypeEvaluator<V> evaluator, final V... values) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static <T, V> PropertyValuesHolder ofObject(final Property<?, V> property, final TypeConverter<T, V> converter, final TypeEvaluator<T> evaluator, final T... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static <V> PropertyValuesHolder ofObject(final Property<?, V> property, final TypeConverter<PointF, V> converter, final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofKeyframe(final String propertyName, final Keyframe... values) {
        throw new RuntimeException("Stub!");
    }
    
    public static PropertyValuesHolder ofKeyframe(final Property property, final Keyframe... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntValues(final int... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatValues(final float... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setKeyframes(final Keyframe... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setObjectValues(final Object... values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setConverter(final TypeConverter converter) {
        throw new RuntimeException("Stub!");
    }
    
    public PropertyValuesHolder clone() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEvaluator(final TypeEvaluator evaluator) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPropertyName(final String propertyName) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProperty(final Property property) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPropertyName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
