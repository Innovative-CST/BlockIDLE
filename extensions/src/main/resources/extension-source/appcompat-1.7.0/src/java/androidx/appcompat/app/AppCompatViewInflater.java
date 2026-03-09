package androidx.appcompat.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import androidx.core.view.ViewCompat;
import android.os.Build;
import androidx.appcompat.view.ContextThemeWrapper;
import android.util.Log;
import androidx.appcompat.R;
import android.view.InflateException;
import android.content.res.TypedArray;
import android.content.ContextWrapper;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
import java.lang.reflect.Constructor;
import androidx.collection.SimpleArrayMap;

public class AppCompatViewInflater
{
    private static final Class<?>[] sConstructorSignature;
    private static final int[] sOnClickAttrs;
    private static final int[] sAccessibilityHeading;
    private static final int[] sAccessibilityPaneTitle;
    private static final int[] sScreenReaderFocusable;
    private static final String[] sClassPrefixList;
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final SimpleArrayMap<String, Constructor<? extends View>> sConstructorMap;
    private final Object[] mConstructorArgs;
    
    public AppCompatViewInflater() {
        this.mConstructorArgs = new Object[2];
    }
    
    @Nullable
    public final View createView(@Nullable final View parent, @NonNull final String name, @NonNull Context context, @NonNull final AttributeSet attrs, final boolean inheritContext, final boolean readAndroidTheme, final boolean readAppTheme, final boolean wrapContext) {
        final Context originalContext = context;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = themifyContext(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = TintContextWrapper.wrap(context);
        }
        View view = null;
        int n = -1;
        switch (name.hashCode()) {
            case -938935918: {
                if (name.equals((Object)"TextView")) {
                    n = 0;
                    break;
                }
                break;
            }
            case 1125864064: {
                if (name.equals((Object)"ImageView")) {
                    n = 1;
                    break;
                }
                break;
            }
            case 2001146706: {
                if (name.equals((Object)"Button")) {
                    n = 2;
                    break;
                }
                break;
            }
            case 1666676343: {
                if (name.equals((Object)"EditText")) {
                    n = 3;
                    break;
                }
                break;
            }
            case -339785223: {
                if (name.equals((Object)"Spinner")) {
                    n = 4;
                    break;
                }
                break;
            }
            case -937446323: {
                if (name.equals((Object)"ImageButton")) {
                    n = 5;
                    break;
                }
                break;
            }
            case 1601505219: {
                if (name.equals((Object)"CheckBox")) {
                    n = 6;
                    break;
                }
                break;
            }
            case 776382189: {
                if (name.equals((Object)"RadioButton")) {
                    n = 7;
                    break;
                }
                break;
            }
            case -1455429095: {
                if (name.equals((Object)"CheckedTextView")) {
                    n = 8;
                    break;
                }
                break;
            }
            case 1413872058: {
                if (name.equals((Object)"AutoCompleteTextView")) {
                    n = 9;
                    break;
                }
                break;
            }
            case -1346021293: {
                if (name.equals((Object)"MultiAutoCompleteTextView")) {
                    n = 10;
                    break;
                }
                break;
            }
            case -1946472170: {
                if (name.equals((Object)"RatingBar")) {
                    n = 11;
                    break;
                }
                break;
            }
            case -658531749: {
                if (name.equals((Object)"SeekBar")) {
                    n = 12;
                    break;
                }
                break;
            }
            case 799298502: {
                if (name.equals((Object)"ToggleButton")) {
                    n = 13;
                    break;
                }
                break;
            }
        }
        switch (n) {
            case 0: {
                view = (View)this.createTextView(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 1: {
                view = (View)this.createImageView(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 2: {
                view = (View)this.createButton(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 3: {
                view = (View)this.createEditText(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 4: {
                view = (View)this.createSpinner(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 5: {
                view = (View)this.createImageButton(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 6: {
                view = (View)this.createCheckBox(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 7: {
                view = (View)this.createRadioButton(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 8: {
                view = (View)this.createCheckedTextView(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 9: {
                view = (View)this.createAutoCompleteTextView(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 10: {
                view = (View)this.createMultiAutoCompleteTextView(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 11: {
                view = (View)this.createRatingBar(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 12: {
                view = (View)this.createSeekBar(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            case 13: {
                view = (View)this.createToggleButton(context, attrs);
                this.verifyNotNull(view, name);
                break;
            }
            default: {
                view = this.createView(context, name, attrs);
                break;
            }
        }
        if (view == null && originalContext != context) {
            view = this.createViewFromTag(context, name, attrs);
        }
        if (view != null) {
            this.checkOnClickListener(view, attrs);
            this.backportAccessibilityAttributes(context, view, attrs);
        }
        return view;
    }
    
    @NonNull
    protected AppCompatTextView createTextView(final Context context, final AttributeSet attrs) {
        return new AppCompatTextView(context, attrs);
    }
    
    @NonNull
    protected AppCompatImageView createImageView(final Context context, final AttributeSet attrs) {
        return new AppCompatImageView(context, attrs);
    }
    
    @NonNull
    protected AppCompatButton createButton(final Context context, final AttributeSet attrs) {
        return new AppCompatButton(context, attrs);
    }
    
    @NonNull
    protected AppCompatEditText createEditText(final Context context, final AttributeSet attrs) {
        return new AppCompatEditText(context, attrs);
    }
    
    @NonNull
    protected AppCompatSpinner createSpinner(final Context context, final AttributeSet attrs) {
        return new AppCompatSpinner(context, attrs);
    }
    
    @NonNull
    protected AppCompatImageButton createImageButton(final Context context, final AttributeSet attrs) {
        return new AppCompatImageButton(context, attrs);
    }
    
    @NonNull
    protected AppCompatCheckBox createCheckBox(final Context context, final AttributeSet attrs) {
        return new AppCompatCheckBox(context, attrs);
    }
    
    @NonNull
    protected AppCompatRadioButton createRadioButton(final Context context, final AttributeSet attrs) {
        return new AppCompatRadioButton(context, attrs);
    }
    
    @NonNull
    protected AppCompatCheckedTextView createCheckedTextView(final Context context, final AttributeSet attrs) {
        return new AppCompatCheckedTextView(context, attrs);
    }
    
    @NonNull
    protected AppCompatAutoCompleteTextView createAutoCompleteTextView(final Context context, final AttributeSet attrs) {
        return new AppCompatAutoCompleteTextView(context, attrs);
    }
    
    @NonNull
    protected AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(final Context context, final AttributeSet attrs) {
        return new AppCompatMultiAutoCompleteTextView(context, attrs);
    }
    
    @NonNull
    protected AppCompatRatingBar createRatingBar(final Context context, final AttributeSet attrs) {
        return new AppCompatRatingBar(context, attrs);
    }
    
    @NonNull
    protected AppCompatSeekBar createSeekBar(final Context context, final AttributeSet attrs) {
        return new AppCompatSeekBar(context, attrs);
    }
    
    @NonNull
    protected AppCompatToggleButton createToggleButton(final Context context, final AttributeSet attrs) {
        return new AppCompatToggleButton(context, attrs);
    }
    
    private void verifyNotNull(final View view, final String name) {
        if (view == null) {
            throw new IllegalStateException(this.getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }
    
    @Nullable
    protected View createView(final Context context, final String name, final AttributeSet attrs) {
        return null;
    }
    
    private View createViewFromTag(final Context context, String name, final AttributeSet attrs) {
        if (name.equals((Object)"view")) {
            name = attrs.getAttributeValue((String)null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attrs;
            if (-1 == name.indexOf(46)) {
                for (int i = 0; i < AppCompatViewInflater.sClassPrefixList.length; ++i) {
                    final View view = this.createViewByPrefix(context, name, AppCompatViewInflater.sClassPrefixList[i]);
                    if (view != null) {
                        return view;
                    }
                }
                return null;
            }
            return this.createViewByPrefix(context, name, null);
        }
        catch (final Exception e) {
            return null;
        }
        finally {
            this.mConstructorArgs[0] = null;
            this.mConstructorArgs[1] = null;
        }
    }
    
    private void checkOnClickListener(final View view, final AttributeSet attrs) {
        final Context context = view.getContext();
        if (!(context instanceof ContextWrapper) || !view.hasOnClickListeners()) {
            return;
        }
        final TypedArray a = context.obtainStyledAttributes(attrs, AppCompatViewInflater.sOnClickAttrs);
        final String handlerName = a.getString(0);
        if (handlerName != null) {
            view.setOnClickListener((View.OnClickListener)new DeclaredOnClickListener(view, handlerName));
        }
        a.recycle();
    }
    
    private View createViewByPrefix(final Context context, final String name, final String prefix) throws ClassNotFoundException, InflateException {
        Constructor<? extends View> constructor = (Constructor<? extends View>)AppCompatViewInflater.sConstructorMap.get((Object)name);
        try {
            if (constructor == null) {
                final Class<? extends View> clazz = Class.forName((prefix != null) ? (prefix + name) : name, false, context.getClassLoader()).asSubclass(View.class);
                constructor = clazz.getConstructor(AppCompatViewInflater.sConstructorSignature);
                AppCompatViewInflater.sConstructorMap.put((Object)name, (Object)constructor);
            }
            constructor.setAccessible(true);
            return (View)constructor.newInstance(this.mConstructorArgs);
        }
        catch (final Exception e) {
            return null;
        }
    }
    
    private static Context themifyContext(Context context, final AttributeSet attrs, final boolean useAndroidTheme, final boolean useAppTheme) {
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.View, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a.getResourceId(R.styleable.View_android_theme, 0);
        }
        if (useAppTheme && themeId == 0) {
            themeId = a.getResourceId(R.styleable.View_theme, 0);
            if (themeId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        a.recycle();
        if (themeId != 0 && (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context).getThemeResId() != themeId)) {
            context = (Context)new ContextThemeWrapper(context, themeId);
        }
        return context;
    }
    
    private void backportAccessibilityAttributes(@NonNull final Context context, @NonNull final View view, @NonNull final AttributeSet attrs) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray a = context.obtainStyledAttributes(attrs, AppCompatViewInflater.sAccessibilityHeading);
        if (a.hasValue(0)) {
            ViewCompat.setAccessibilityHeading(view, a.getBoolean(0, false));
        }
        a.recycle();
        a = context.obtainStyledAttributes(attrs, AppCompatViewInflater.sAccessibilityPaneTitle);
        if (a.hasValue(0)) {
            ViewCompat.setAccessibilityPaneTitle(view, (CharSequence)a.getString(0));
        }
        a.recycle();
        a = context.obtainStyledAttributes(attrs, AppCompatViewInflater.sScreenReaderFocusable);
        if (a.hasValue(0)) {
            ViewCompat.setScreenReaderFocusable(view, a.getBoolean(0, false));
        }
        a.recycle();
    }
    
    static {
        sConstructorSignature = new Class[] { Context.class, AttributeSet.class };
        sOnClickAttrs = new int[] { 16843375 };
        sAccessibilityHeading = new int[] { 16844160 };
        sAccessibilityPaneTitle = new int[] { 16844156 };
        sScreenReaderFocusable = new int[] { 16844148 };
        sClassPrefixList = new String[] { "android.widget.", "android.view.", "android.webkit." };
        sConstructorMap = new SimpleArrayMap();
    }
    
    private static class DeclaredOnClickListener implements View.OnClickListener
    {
        private final View mHostView;
        private final String mMethodName;
        private Method mResolvedMethod;
        private Context mResolvedContext;
        
        public DeclaredOnClickListener(@NonNull final View hostView, @NonNull final String methodName) {
            this.mHostView = hostView;
            this.mMethodName = methodName;
        }
        
        public void onClick(@NonNull final View v) {
            if (this.mResolvedMethod == null) {
                this.resolveMethod(this.mHostView.getContext());
            }
            try {
                this.mResolvedMethod.invoke((Object)this.mResolvedContext, new Object[] { v });
            }
            catch (final IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", (Throwable)e);
            }
            catch (final InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", (Throwable)e2);
            }
        }
        
        private void resolveMethod(@Nullable Context context) {
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        final Method method = context.getClass().getMethod(this.mMethodName, View.class);
                        if (method != null) {
                            this.mResolvedMethod = method;
                            this.mResolvedContext = context;
                            return;
                        }
                    }
                }
                catch (final NoSuchMethodException ex) {}
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper)context).getBaseContext();
                }
                else {
                    context = null;
                }
            }
            final int id = this.mHostView.getId();
            final String idText = (id == -1) ? "" : (" with id '" + this.mHostView.getContext().getResources().getResourceEntryName(id) + "'");
            throw new IllegalStateException("Could not find method " + this.mMethodName + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + (Object)this.mHostView.getClass() + idText);
        }
    }
}
