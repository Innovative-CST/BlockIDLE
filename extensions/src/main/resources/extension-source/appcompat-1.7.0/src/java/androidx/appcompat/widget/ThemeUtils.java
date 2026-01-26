package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.Log;
import androidx.appcompat.R;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import android.graphics.Color;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.NonNull;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY })
public class ThemeUtils
{
    private static final String TAG = "ThemeUtils";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE;
    static final int[] DISABLED_STATE_SET;
    static final int[] FOCUSED_STATE_SET;
    static final int[] ACTIVATED_STATE_SET;
    static final int[] PRESSED_STATE_SET;
    static final int[] CHECKED_STATE_SET;
    static final int[] SELECTED_STATE_SET;
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET;
    static final int[] EMPTY_STATE_SET;
    private static final int[] TEMP_ARRAY;
    
    @NonNull
    public static ColorStateList createDisabledStateList(final int textColor, final int disabledTextColor) {
        final int[][] states = new int[2][];
        final int[] colors = new int[2];
        int i = 0;
        states[i] = ThemeUtils.DISABLED_STATE_SET;
        colors[i] = disabledTextColor;
        ++i;
        states[i] = ThemeUtils.EMPTY_STATE_SET;
        colors[i] = textColor;
        ++i;
        return new ColorStateList(states, colors);
    }
    
    public static int getThemeAttrColor(@NonNull final Context context, final int attr) {
        ThemeUtils.TEMP_ARRAY[0] = attr;
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, null, ThemeUtils.TEMP_ARRAY);
        try {
            return a.getColor(0, 0);
        }
        finally {
            a.recycle();
        }
    }
    
    @Nullable
    public static ColorStateList getThemeAttrColorStateList(@NonNull final Context context, final int attr) {
        ThemeUtils.TEMP_ARRAY[0] = attr;
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, null, ThemeUtils.TEMP_ARRAY);
        try {
            return a.getColorStateList(0);
        }
        finally {
            a.recycle();
        }
    }
    
    public static int getDisabledThemeAttrColor(@NonNull final Context context, final int attr) {
        final ColorStateList csl = getThemeAttrColorStateList(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(ThemeUtils.DISABLED_STATE_SET, csl.getDefaultColor());
        }
        final TypedValue tv = getTypedValue();
        context.getTheme().resolveAttribute(16842803, tv, true);
        final float disabledAlpha = tv.getFloat();
        return getThemeAttrColor(context, attr, disabledAlpha);
    }
    
    private static TypedValue getTypedValue() {
        TypedValue typedValue = (TypedValue)ThemeUtils.TL_TYPED_VALUE.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            ThemeUtils.TL_TYPED_VALUE.set((Object)typedValue);
        }
        return typedValue;
    }
    
    static int getThemeAttrColor(@NonNull final Context context, final int attr, final float alpha) {
        final int color = getThemeAttrColor(context, attr);
        final int originalAlpha = Color.alpha(color);
        return ColorUtils.setAlphaComponent(color, Math.round(originalAlpha * alpha));
    }
    
    public static void checkAppCompatTheme(@NonNull final View view, @NonNull final Context context) {
        final TypedArray a = context.obtainStyledAttributes(R.styleable.AppCompatTheme);
        try {
            if (!a.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + (Object)view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        }
        finally {
            a.recycle();
        }
    }
    
    private ThemeUtils() {
    }
    
    static {
        TL_TYPED_VALUE = new ThreadLocal();
        DISABLED_STATE_SET = new int[] { -16842910 };
        FOCUSED_STATE_SET = new int[] { 16842908 };
        ACTIVATED_STATE_SET = new int[] { 16843518 };
        PRESSED_STATE_SET = new int[] { 16842919 };
        CHECKED_STATE_SET = new int[] { 16842912 };
        SELECTED_STATE_SET = new int[] { 16842913 };
        NOT_PRESSED_OR_FOCUSED_STATE_SET = new int[] { -16842919, -16842908 };
        EMPTY_STATE_SET = new int[0];
        TEMP_ARRAY = new int[1];
    }
}
