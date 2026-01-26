package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.os.Build;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import java.lang.reflect.Method;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class ViewUtils
{
    private static final String TAG = "ViewUtils";
    private static boolean sInitComputeFitSystemWindowsMethod;
    private static Method sComputeFitSystemWindowsMethod;
    @RestrictTo({ RestrictTo.Scope.LIBRARY })
    @ChecksSdkIntAtLeast(api = 27)
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE;
    
    private ViewUtils() {
    }
    
    public static boolean isLayoutRtl(final View view) {
        return view.getLayoutDirection() == 1;
    }
    
    public static void computeFitSystemWindows(@NonNull final View view, @NonNull final Rect inoutInsets, @NonNull final Rect outLocalInsets) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.computeFitSystemWindows(view, inoutInsets, outLocalInsets);
        }
        else {
            if (!ViewUtils.sInitComputeFitSystemWindowsMethod) {
                ViewUtils.sInitComputeFitSystemWindowsMethod = true;
                try {
                    ViewUtils.sComputeFitSystemWindowsMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                    if (!ViewUtils.sComputeFitSystemWindowsMethod.isAccessible()) {
                        ViewUtils.sComputeFitSystemWindowsMethod.setAccessible(true);
                    }
                }
                catch (final NoSuchMethodException e) {
                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                }
            }
            if (ViewUtils.sComputeFitSystemWindowsMethod != null) {
                try {
                    ViewUtils.sComputeFitSystemWindowsMethod.invoke((Object)view, new Object[] { inoutInsets, outLocalInsets });
                }
                catch (final Exception e2) {
                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)e2);
                }
            }
        }
    }
    
    @SuppressLint({ "BanUncheckedReflection" })
    public static void makeOptionalFitsSystemWindows(final View view) {
        try {
            final Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke((Object)view, new Object[0]);
        }
        catch (final NoSuchMethodException e) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        }
        catch (final InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)e2);
        }
        catch (final IllegalAccessException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", (Throwable)e3);
        }
    }
    
    static {
        SDK_LEVEL_SUPPORTS_AUTOSIZE = (Build.VERSION.SDK_INT >= 27);
    }
    
    @RequiresApi(29)
    static class Api29Impl
    {
        private Api29Impl() {
        }
        
        @DoNotInline
        static void computeFitSystemWindows(@NonNull final View view, @NonNull final Rect inoutInsets, @NonNull final Rect outLocalInsets) {
            final WindowInsets in = new WindowInsets.Builder().setSystemWindowInsets(Insets.of(inoutInsets)).build();
            final WindowInsets innerInsets = view.computeSystemWindowInsets(in, outLocalInsets);
            final Insets systemWindowInsets = innerInsets.getSystemWindowInsets();
            inoutInsets.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }
}
