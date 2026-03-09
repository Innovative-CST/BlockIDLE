package android.content.res;

import android.util.TypedValue;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public class TypedArray implements AutoCloseable
{
    TypedArray() {
        throw new RuntimeException("Stub!");
    }
    
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIndexCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIndex(final int at) {
        throw new RuntimeException("Stub!");
    }
    
    public Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getText(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getString(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public String getNonResourceString(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBoolean(final int index, final boolean defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInt(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFloat(final int index, final float defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getColorStateList(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInteger(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getDimension(final int index, final float defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDimensionPixelOffset(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDimensionPixelSize(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutDimension(final int index, final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutDimension(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public float getFraction(final int index, final int base, final int pbase, final float defValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getResourceId(final int index, final int defValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getDrawable(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Typeface getFont(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence[] getTextArray(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getValue(final int index, final TypedValue outValue) {
        throw new RuntimeException("Stub!");
    }
    
    public int getType(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSourceResourceId(final int index, final int defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasValue(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasValueOrEmpty(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public TypedValue peekValue(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPositionDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public void recycle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
