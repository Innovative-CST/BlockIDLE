package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.os.Build;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class TintTypedArray
{
    private final Context mContext;
    private final TypedArray mWrapped;
    private TypedValue mTypedValue;
    
    public static TintTypedArray obtainStyledAttributes(final Context context, final AttributeSet set, final int[] attrs) {
        return new TintTypedArray(context, context.obtainStyledAttributes(set, attrs));
    }
    
    public static TintTypedArray obtainStyledAttributes(final Context context, final AttributeSet set, final int[] attrs, final int defStyleAttr, final int defStyleRes) {
        return new TintTypedArray(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }
    
    public static TintTypedArray obtainStyledAttributes(final Context context, final int resid, final int[] attrs) {
        return new TintTypedArray(context, context.obtainStyledAttributes(resid, attrs));
    }
    
    private TintTypedArray(final Context context, final TypedArray array) {
        this.mContext = context;
        this.mWrapped = array;
    }
    
    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }
    
    public Drawable getDrawable(final int index) {
        if (this.mWrapped.hasValue(index)) {
            final int resourceId = this.mWrapped.getResourceId(index, 0);
            if (resourceId != 0) {
                return AppCompatResources.getDrawable(this.mContext, resourceId);
            }
        }
        return this.mWrapped.getDrawable(index);
    }
    
    public Drawable getDrawableIfKnown(final int index) {
        if (this.mWrapped.hasValue(index)) {
            final int resourceId = this.mWrapped.getResourceId(index, 0);
            if (resourceId != 0) {
                return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
            }
        }
        return null;
    }
    
    @Nullable
    public Typeface getFont(@StyleableRes final int index, final int style, @Nullable final ResourcesCompat.FontCallback fontCallback) {
        final int resourceId = this.mWrapped.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, style, fontCallback);
    }
    
    public int length() {
        return this.mWrapped.length();
    }
    
    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }
    
    public int getIndex(final int at) {
        return this.mWrapped.getIndex(at);
    }
    
    public Resources getResources() {
        return this.mWrapped.getResources();
    }
    
    public CharSequence getText(final int index) {
        return this.mWrapped.getText(index);
    }
    
    public String getString(final int index) {
        return this.mWrapped.getString(index);
    }
    
    public String getNonResourceString(final int index) {
        return this.mWrapped.getNonResourceString(index);
    }
    
    public boolean getBoolean(final int index, final boolean defValue) {
        return this.mWrapped.getBoolean(index, defValue);
    }
    
    public int getInt(final int index, final int defValue) {
        return this.mWrapped.getInt(index, defValue);
    }
    
    public float getFloat(final int index, final float defValue) {
        return this.mWrapped.getFloat(index, defValue);
    }
    
    public int getColor(final int index, final int defValue) {
        return this.mWrapped.getColor(index, defValue);
    }
    
    public ColorStateList getColorStateList(final int index) {
        if (this.mWrapped.hasValue(index)) {
            final int resourceId = this.mWrapped.getResourceId(index, 0);
            if (resourceId != 0) {
                final ColorStateList value = AppCompatResources.getColorStateList(this.mContext, resourceId);
                if (value != null) {
                    return value;
                }
            }
        }
        return this.mWrapped.getColorStateList(index);
    }
    
    public int getInteger(final int index, final int defValue) {
        return this.mWrapped.getInteger(index, defValue);
    }
    
    public float getDimension(final int index, final float defValue) {
        return this.mWrapped.getDimension(index, defValue);
    }
    
    public int getDimensionPixelOffset(final int index, final int defValue) {
        return this.mWrapped.getDimensionPixelOffset(index, defValue);
    }
    
    public int getDimensionPixelSize(final int index, final int defValue) {
        return this.mWrapped.getDimensionPixelSize(index, defValue);
    }
    
    public int getLayoutDimension(final int index, final String name) {
        return this.mWrapped.getLayoutDimension(index, name);
    }
    
    public int getLayoutDimension(final int index, final int defValue) {
        return this.mWrapped.getLayoutDimension(index, defValue);
    }
    
    public float getFraction(final int index, final int base, final int pbase, final float defValue) {
        return this.mWrapped.getFraction(index, base, pbase, defValue);
    }
    
    public int getResourceId(final int index, final int defValue) {
        return this.mWrapped.getResourceId(index, defValue);
    }
    
    public CharSequence[] getTextArray(final int index) {
        return this.mWrapped.getTextArray(index);
    }
    
    public boolean getValue(final int index, final TypedValue outValue) {
        return this.mWrapped.getValue(index, outValue);
    }
    
    public int getType(final int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Api21Impl.getType(this.mWrapped, index);
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        this.mWrapped.getValue(index, this.mTypedValue);
        return this.mTypedValue.type;
    }
    
    public boolean hasValue(final int index) {
        return this.mWrapped.hasValue(index);
    }
    
    public TypedValue peekValue(final int index) {
        return this.mWrapped.peekValue(index);
    }
    
    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }
    
    public void recycle() {
        this.mWrapped.recycle();
    }
    
    @RequiresApi(21)
    public int getChangingConfigurations() {
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }
    
    @RequiresApi(21)
    static class Api21Impl
    {
        private Api21Impl() {
        }
        
        @DoNotInline
        static int getType(final TypedArray typedArray, final int index) {
            return typedArray.getType(index);
        }
        
        @DoNotInline
        static int getChangingConfigurations(final TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }
    }
}
