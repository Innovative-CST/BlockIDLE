package androidx.appcompat.widget;

import android.graphics.PorterDuffColorFilter;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.DimenRes;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import androidx.annotation.ColorInt;
import android.content.res.ColorStateList;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.appcompat.R;
import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public final class AppCompatDrawableManager
{
    private static final String TAG = "AppCompatDrawableManag";
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE;
    private static AppCompatDrawableManager INSTANCE;
    private ResourceManagerInternal mResourceManager;
    
    public static synchronized void preload() {
        if (AppCompatDrawableManager.INSTANCE == null) {
            AppCompatDrawableManager.INSTANCE = new AppCompatDrawableManager();
            (AppCompatDrawableManager.INSTANCE.mResourceManager = ResourceManagerInternal.get()).setHooks((ResourceManagerInternal.ResourceManagerHooks)new ResourceManagerInternal.ResourceManagerHooks() {
                private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = { R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha };
                private final int[] TINT_COLOR_CONTROL_NORMAL = { R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha };
                private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = { R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl };
                private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = { R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult };
                private final int[] TINT_COLOR_CONTROL_STATE_LIST = { R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material };
                private final int[] TINT_CHECKABLE_BUTTON_LIST = { R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim };
                
                private ColorStateList createDefaultButtonColorStateList(@NonNull final Context context) {
                    return this.createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                }
                
                private ColorStateList createBorderlessButtonColorStateList(@NonNull final Context context) {
                    return this.createButtonColorStateList(context, 0);
                }
                
                private ColorStateList createColoredButtonColorStateList(@NonNull final Context context) {
                    return this.createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                }
                
                private ColorStateList createButtonColorStateList(@NonNull final Context context, @ColorInt final int baseColor) {
                    final int[][] states = new int[4][];
                    final int[] colors = new int[4];
                    int i = 0;
                    final int colorControlHighlight = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
                    final int disabledColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
                    states[i] = ThemeUtils.DISABLED_STATE_SET;
                    colors[i] = disabledColor;
                    ++i;
                    states[i] = ThemeUtils.PRESSED_STATE_SET;
                    colors[i] = ColorUtils.compositeColors(colorControlHighlight, baseColor);
                    ++i;
                    states[i] = ThemeUtils.FOCUSED_STATE_SET;
                    colors[i] = ColorUtils.compositeColors(colorControlHighlight, baseColor);
                    ++i;
                    states[i] = ThemeUtils.EMPTY_STATE_SET;
                    colors[i] = baseColor;
                    ++i;
                    return new ColorStateList(states, colors);
                }
                
                private ColorStateList createSwitchThumbColorStateList(final Context context) {
                    final int[][] states = new int[3][];
                    final int[] colors = new int[3];
                    int i = 0;
                    final ColorStateList thumbColor = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
                    if (thumbColor != null && thumbColor.isStateful()) {
                        states[i] = ThemeUtils.DISABLED_STATE_SET;
                        colors[i] = thumbColor.getColorForState(states[i], 0);
                        ++i;
                        states[i] = ThemeUtils.CHECKED_STATE_SET;
                        colors[i] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                        ++i;
                        states[i] = ThemeUtils.EMPTY_STATE_SET;
                        colors[i] = thumbColor.getDefaultColor();
                        ++i;
                    }
                    else {
                        states[i] = ThemeUtils.DISABLED_STATE_SET;
                        colors[i] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
                        ++i;
                        states[i] = ThemeUtils.CHECKED_STATE_SET;
                        colors[i] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                        ++i;
                        states[i] = ThemeUtils.EMPTY_STATE_SET;
                        colors[i] = ThemeUtils.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
                        ++i;
                    }
                    return new ColorStateList(states, colors);
                }
                
                public Drawable createDrawableFor(@NonNull final ResourceManagerInternal resourceManager, @NonNull final Context context, final int resId) {
                    if (resId == R.drawable.abc_cab_background_top_material) {
                        return (Drawable)new LayerDrawable(new Drawable[] { resourceManager.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManager.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha) });
                    }
                    if (resId == R.drawable.abc_ratingbar_material) {
                        return (Drawable)this.getRatingBarLayerDrawable(resourceManager, context, R.dimen.abc_star_big);
                    }
                    if (resId == R.drawable.abc_ratingbar_indicator_material) {
                        return (Drawable)this.getRatingBarLayerDrawable(resourceManager, context, R.dimen.abc_star_medium);
                    }
                    if (resId == R.drawable.abc_ratingbar_small_material) {
                        return (Drawable)this.getRatingBarLayerDrawable(resourceManager, context, R.dimen.abc_star_small);
                    }
                    return null;
                }
                
                private LayerDrawable getRatingBarLayerDrawable(@NonNull final ResourceManagerInternal resourceManager, @NonNull final Context context, @DimenRes final int dimenResId) {
                    final int starSize = context.getResources().getDimensionPixelSize(dimenResId);
                    final Drawable star = resourceManager.getDrawable(context, R.drawable.abc_star_black_48dp);
                    final Drawable halfStar = resourceManager.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                    BitmapDrawable starBitmapDrawable;
                    BitmapDrawable tiledStarBitmapDrawable;
                    if (star instanceof BitmapDrawable && star.getIntrinsicWidth() == starSize && star.getIntrinsicHeight() == starSize) {
                        starBitmapDrawable = (BitmapDrawable)star;
                        tiledStarBitmapDrawable = new BitmapDrawable(starBitmapDrawable.getBitmap());
                    }
                    else {
                        final Bitmap bitmapStar = Bitmap.createBitmap(starSize, starSize, Bitmap.Config.ARGB_8888);
                        final Canvas canvasStar = new Canvas(bitmapStar);
                        star.setBounds(0, 0, starSize, starSize);
                        star.draw(canvasStar);
                        starBitmapDrawable = new BitmapDrawable(bitmapStar);
                        tiledStarBitmapDrawable = new BitmapDrawable(bitmapStar);
                    }
                    tiledStarBitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                    BitmapDrawable halfStarBitmapDrawable;
                    if (halfStar instanceof BitmapDrawable && halfStar.getIntrinsicWidth() == starSize && halfStar.getIntrinsicHeight() == starSize) {
                        halfStarBitmapDrawable = (BitmapDrawable)halfStar;
                    }
                    else {
                        final Bitmap bitmapHalfStar = Bitmap.createBitmap(starSize, starSize, Bitmap.Config.ARGB_8888);
                        final Canvas canvasHalfStar = new Canvas(bitmapHalfStar);
                        halfStar.setBounds(0, 0, starSize, starSize);
                        halfStar.draw(canvasHalfStar);
                        halfStarBitmapDrawable = new BitmapDrawable(bitmapHalfStar);
                    }
                    final LayerDrawable result = new LayerDrawable(new Drawable[] { (Drawable)starBitmapDrawable, (Drawable)halfStarBitmapDrawable, (Drawable)tiledStarBitmapDrawable });
                    result.setId(0, 16908288);
                    result.setId(1, 16908303);
                    result.setId(2, 16908301);
                    return result;
                }
                
                private void setPorterDuffColorFilter(Drawable d, final int color, final PorterDuff.Mode mode) {
                    d = d.mutate();
                    d.setColorFilter((ColorFilter)AppCompatDrawableManager.getPorterDuffColorFilter(color, (mode == null) ? AppCompatDrawableManager.DEFAULT_MODE : mode));
                }
                
                public boolean tintDrawable(@NonNull final Context context, final int resId, @NonNull final Drawable drawable) {
                    if (resId == R.drawable.abc_seekbar_track_material) {
                        final LayerDrawable ld = (LayerDrawable)drawable;
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908288), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    if (resId == R.drawable.abc_ratingbar_material || resId == R.drawable.abc_ratingbar_indicator_material || resId == R.drawable.abc_ratingbar_small_material) {
                        final LayerDrawable ld = (LayerDrawable)drawable;
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        this.setPorterDuffColorFilter(ld.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    return false;
                }
                
                private boolean arrayContains(final int[] array, final int value) {
                    for (final int id : array) {
                        if (id == value) {
                            return true;
                        }
                    }
                    return false;
                }
                
                public ColorStateList getTintListForDrawableRes(@NonNull final Context context, final int resId) {
                    if (resId == R.drawable.abc_edit_text_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
                    }
                    if (resId == R.drawable.abc_switch_track_mtrl_alpha) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
                    }
                    if (resId == R.drawable.abc_switch_thumb_material) {
                        return this.createSwitchThumbColorStateList(context);
                    }
                    if (resId == R.drawable.abc_btn_default_mtrl_shape) {
                        return this.createDefaultButtonColorStateList(context);
                    }
                    if (resId == R.drawable.abc_btn_borderless_material) {
                        return this.createBorderlessButtonColorStateList(context);
                    }
                    if (resId == R.drawable.abc_btn_colored_material) {
                        return this.createColoredButtonColorStateList(context);
                    }
                    if (resId == R.drawable.abc_spinner_mtrl_am_alpha || resId == R.drawable.abc_spinner_textfield_background_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                    }
                    if (this.arrayContains(this.TINT_COLOR_CONTROL_NORMAL, resId)) {
                        return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                    }
                    if (this.arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, resId)) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                    }
                    if (this.arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, resId)) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                    }
                    if (resId == R.drawable.abc_seekbar_thumb_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                
                public boolean tintDrawableUsingColorFilter(@NonNull final Context context, final int resId, @NonNull Drawable drawable) {
                    PorterDuff.Mode tintMode = AppCompatDrawableManager.DEFAULT_MODE;
                    boolean colorAttrSet = false;
                    int colorAttr = 0;
                    int alpha = -1;
                    if (this.arrayContains(this.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, resId)) {
                        colorAttr = R.attr.colorControlNormal;
                        colorAttrSet = true;
                    }
                    else if (this.arrayContains(this.COLORFILTER_COLOR_CONTROL_ACTIVATED, resId)) {
                        colorAttr = R.attr.colorControlActivated;
                        colorAttrSet = true;
                    }
                    else if (this.arrayContains(this.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, resId)) {
                        colorAttr = 16842801;
                        colorAttrSet = true;
                        tintMode = PorterDuff.Mode.MULTIPLY;
                    }
                    else if (resId == R.drawable.abc_list_divider_mtrl_alpha) {
                        colorAttr = 16842800;
                        colorAttrSet = true;
                        alpha = Math.round(40.8f);
                    }
                    else if (resId == R.drawable.abc_dialog_material_background) {
                        colorAttr = 16842801;
                        colorAttrSet = true;
                    }
                    if (colorAttrSet) {
                        drawable = drawable.mutate();
                        final int color = ThemeUtils.getThemeAttrColor(context, colorAttr);
                        drawable.setColorFilter((ColorFilter)AppCompatDrawableManager.getPorterDuffColorFilter(color, tintMode));
                        if (alpha != -1) {
                            drawable.setAlpha(alpha);
                        }
                        return true;
                    }
                    return false;
                }
                
                public PorterDuff.Mode getTintModeForDrawableRes(final int resId) {
                    PorterDuff.Mode mode = null;
                    if (resId == R.drawable.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    return mode;
                }
            });
        }
    }
    
    public static synchronized AppCompatDrawableManager get() {
        if (AppCompatDrawableManager.INSTANCE == null) {
            preload();
        }
        return AppCompatDrawableManager.INSTANCE;
    }
    
    public synchronized Drawable getDrawable(@NonNull final Context context, @DrawableRes final int resId) {
        return this.mResourceManager.getDrawable(context, resId);
    }
    
    synchronized Drawable getDrawable(@NonNull final Context context, @DrawableRes final int resId, final boolean failIfNotKnown) {
        return this.mResourceManager.getDrawable(context, resId, failIfNotKnown);
    }
    
    public synchronized void onConfigurationChanged(@NonNull final Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }
    
    synchronized Drawable onDrawableLoadedFromResources(@NonNull final Context context, @NonNull final VectorEnabledTintResources resources, @DrawableRes final int resId) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, resources, resId);
    }
    
    boolean tintDrawableUsingColorFilter(@NonNull final Context context, @DrawableRes final int resId, @NonNull final Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, resId, drawable);
    }
    
    synchronized ColorStateList getTintList(@NonNull final Context context, @DrawableRes final int resId) {
        return this.mResourceManager.getTintList(context, resId);
    }
    
    static void tintDrawable(final Drawable drawable, final TintInfo tint, final int[] state) {
        ResourceManagerInternal.tintDrawable(drawable, tint, state);
    }
    
    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(final int color, final PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(color, mode);
    }
    
    static {
        DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    }
}
