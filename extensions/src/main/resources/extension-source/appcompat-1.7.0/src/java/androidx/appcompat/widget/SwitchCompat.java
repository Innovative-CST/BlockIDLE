package androidx.appcompat.widget;

import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import androidx.emoji2.text.EmojiCompat;
import android.text.InputFilter;
import androidx.core.widget.TextViewCompat;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Build;
import android.text.TextUtils;
import android.graphics.Region;
import android.graphics.Canvas;
import androidx.annotation.FloatRange;
import android.view.MotionEvent;
import android.text.StaticLayout;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.appcompat.content.res.AppCompatResources;
import android.graphics.Typeface;
import androidx.appcompat.text.AllCapsTransformationMethod;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import android.view.View;
import androidx.appcompat.R;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import android.animation.ObjectAnimator;
import androidx.annotation.Nullable;
import android.text.method.TransformationMethod;
import android.text.Layout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView
{
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_IDLE = 0;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int MONOSPACE = 3;
    private static final Property<SwitchCompat, Float> THUMB_POS;
    private Drawable mThumbDrawable;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mThumbTextPadding;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private boolean mSplitTrack;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private boolean mShowText;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private VelocityTracker mVelocityTracker;
    private int mMinFlingVelocity;
    float mThumbPosition;
    private int mSwitchWidth;
    private int mSwitchHeight;
    private int mThumbWidth;
    private int mSwitchLeft;
    private int mSwitchTop;
    private int mSwitchRight;
    private int mSwitchBottom;
    private boolean mEnforceSwitchWidth;
    private final TextPaint mTextPaint;
    private ColorStateList mTextColors;
    private Layout mOnLayout;
    private Layout mOffLayout;
    @Nullable
    private TransformationMethod mSwitchTransformationMethod;
    ObjectAnimator mPositionAnimator;
    private final AppCompatTextHelper mTextHelper;
    @NonNull
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    @Nullable
    private EmojiCompatInitCallback mEmojiCompatInitCallback;
    private final Rect mTempRect;
    private static final int[] CHECKED_STATE_SET;
    
    public SwitchCompat(@NonNull final Context context) {
        this(context, null);
    }
    
    public SwitchCompat(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.switchStyle);
    }
    
    public SwitchCompat(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        this.mTextPaint = new TextPaint(1);
        final Resources res = this.getResources();
        this.mTextPaint.density = res.getDisplayMetrics().density;
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.SwitchCompat, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.SwitchCompat, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        this.mThumbDrawable = a.getDrawable(R.styleable.SwitchCompat_android_thumb);
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback((Drawable.Callback)this);
        }
        this.mTrackDrawable = a.getDrawable(R.styleable.SwitchCompat_track);
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback((Drawable.Callback)this);
        }
        this.setTextOnInternal(a.getText(R.styleable.SwitchCompat_android_textOn));
        this.setTextOffInternal(a.getText(R.styleable.SwitchCompat_android_textOff));
        this.mShowText = a.getBoolean(R.styleable.SwitchCompat_showText, true);
        this.mThumbTextPadding = a.getDimensionPixelSize(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = a.getDimensionPixelSize(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = a.getDimensionPixelSize(R.styleable.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = a.getBoolean(R.styleable.SwitchCompat_splitTrack, false);
        final ColorStateList thumbTintList = a.getColorStateList(R.styleable.SwitchCompat_thumbTint);
        if (thumbTintList != null) {
            this.mThumbTintList = thumbTintList;
            this.mHasThumbTint = true;
        }
        final PorterDuff.Mode thumbTintMode = DrawableUtils.parseTintMode(a.getInt(R.styleable.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode)null);
        if (this.mThumbTintMode != thumbTintMode) {
            this.mThumbTintMode = thumbTintMode;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            this.applyThumbTint();
        }
        final ColorStateList trackTintList = a.getColorStateList(R.styleable.SwitchCompat_trackTint);
        if (trackTintList != null) {
            this.mTrackTintList = trackTintList;
            this.mHasTrackTint = true;
        }
        final PorterDuff.Mode trackTintMode = DrawableUtils.parseTintMode(a.getInt(R.styleable.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode)null);
        if (this.mTrackTintMode != trackTintMode) {
            this.mTrackTintMode = trackTintMode;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            this.applyTrackTint();
        }
        final int appearance = a.getResourceId(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (appearance != 0) {
            this.setSwitchTextAppearance(context, appearance);
        }
        (this.mTextHelper = new AppCompatTextHelper((TextView)this)).loadFromAttributes(attrs, defStyleAttr);
        a.recycle();
        final ViewConfiguration config = ViewConfiguration.get(context);
        this.mTouchSlop = config.getScaledTouchSlop();
        this.mMinFlingVelocity = config.getScaledMinimumFlingVelocity();
        final AppCompatEmojiTextHelper emojiTextViewHelper = this.getEmojiTextViewHelper();
        emojiTextViewHelper.loadFromAttributes(attrs, defStyleAttr);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    public void setSwitchTextAppearance(final Context context, final int resid) {
        final TintTypedArray appearance = TintTypedArray.obtainStyledAttributes(context, resid, R.styleable.TextAppearance);
        final ColorStateList colors = appearance.getColorStateList(R.styleable.TextAppearance_android_textColor);
        if (colors != null) {
            this.mTextColors = colors;
        }
        else {
            this.mTextColors = this.getTextColors();
        }
        final int ts = appearance.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
        if (ts != 0 && ts != this.mTextPaint.getTextSize()) {
            this.mTextPaint.setTextSize((float)ts);
            this.requestLayout();
        }
        final int typefaceIndex = appearance.getInt(R.styleable.TextAppearance_android_typeface, -1);
        final int styleIndex = appearance.getInt(R.styleable.TextAppearance_android_textStyle, -1);
        this.setSwitchTypefaceByIndex(typefaceIndex, styleIndex);
        final boolean allCaps = appearance.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        if (allCaps) {
            this.mSwitchTransformationMethod = (TransformationMethod)new AllCapsTransformationMethod(this.getContext());
        }
        else {
            this.mSwitchTransformationMethod = null;
        }
        this.setTextOnInternal(this.mTextOn);
        this.setTextOffInternal(this.mTextOff);
        appearance.recycle();
    }
    
    private void setSwitchTypefaceByIndex(final int typefaceIndex, final int styleIndex) {
        Typeface tf = null;
        switch (typefaceIndex) {
            case 1: {
                tf = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                tf = Typeface.SERIF;
                break;
            }
            case 3: {
                tf = Typeface.MONOSPACE;
                break;
            }
        }
        this.setSwitchTypeface(tf, styleIndex);
    }
    
    public void setSwitchTypeface(Typeface tf, final int style) {
        if (style > 0) {
            if (tf == null) {
                tf = Typeface.defaultFromStyle(style);
            }
            else {
                tf = Typeface.create(tf, style);
            }
            this.setSwitchTypeface(tf);
            final int typefaceStyle = (tf != null) ? tf.getStyle() : 0;
            final int need = style & ~typefaceStyle;
            this.mTextPaint.setFakeBoldText((need & 0x1) != 0x0);
            this.mTextPaint.setTextSkewX(((need & 0x2) != 0x0) ? -0.25f : 0.0f);
        }
        else {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            this.setSwitchTypeface(tf);
        }
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if ((this.mTextPaint.getTypeface() != null && !this.mTextPaint.getTypeface().equals((Object)typeface)) || (this.mTextPaint.getTypeface() == null && typeface != null)) {
            this.mTextPaint.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setSwitchPadding(final int pixels) {
        this.mSwitchPadding = pixels;
        this.requestLayout();
    }
    
    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }
    
    public void setSwitchMinWidth(final int pixels) {
        this.mSwitchMinWidth = pixels;
        this.requestLayout();
    }
    
    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }
    
    public void setThumbTextPadding(final int pixels) {
        this.mThumbTextPadding = pixels;
        this.requestLayout();
    }
    
    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }
    
    public void setTrackDrawable(final Drawable track) {
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback((Drawable.Callback)null);
        }
        if ((this.mTrackDrawable = track) != null) {
            track.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }
    
    public void setTrackResource(final int resId) {
        this.setTrackDrawable(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }
    
    public void setTrackTintList(@Nullable final ColorStateList tint) {
        this.mTrackTintList = tint;
        this.mHasTrackTint = true;
        this.applyTrackTint();
    }
    
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }
    
    public void setTrackTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mTrackTintMode = tintMode;
        this.mHasTrackTintMode = true;
        this.applyTrackTint();
    }
    
    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }
    
    private void applyTrackTint() {
        if (this.mTrackDrawable != null && (this.mHasTrackTint || this.mHasTrackTintMode)) {
            this.mTrackDrawable = DrawableCompat.wrap(this.mTrackDrawable).mutate();
            if (this.mHasTrackTint) {
                DrawableCompat.setTintList(this.mTrackDrawable, this.mTrackTintList);
            }
            if (this.mHasTrackTintMode) {
                DrawableCompat.setTintMode(this.mTrackDrawable, this.mTrackTintMode);
            }
            if (this.mTrackDrawable.isStateful()) {
                this.mTrackDrawable.setState(this.getDrawableState());
            }
        }
    }
    
    public void setThumbDrawable(final Drawable thumb) {
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback((Drawable.Callback)null);
        }
        if ((this.mThumbDrawable = thumb) != null) {
            thumb.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }
    
    public void setThumbResource(final int resId) {
        this.setThumbDrawable(AppCompatResources.getDrawable(this.getContext(), resId));
    }
    
    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }
    
    public void setThumbTintList(@Nullable final ColorStateList tint) {
        this.mThumbTintList = tint;
        this.mHasThumbTint = true;
        this.applyThumbTint();
    }
    
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }
    
    public void setThumbTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mThumbTintMode = tintMode;
        this.mHasThumbTintMode = true;
        this.applyThumbTint();
    }
    
    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }
    
    private void applyThumbTint() {
        if (this.mThumbDrawable != null && (this.mHasThumbTint || this.mHasThumbTintMode)) {
            this.mThumbDrawable = DrawableCompat.wrap(this.mThumbDrawable).mutate();
            if (this.mHasThumbTint) {
                DrawableCompat.setTintList(this.mThumbDrawable, this.mThumbTintList);
            }
            if (this.mHasThumbTintMode) {
                DrawableCompat.setTintMode(this.mThumbDrawable, this.mThumbTintMode);
            }
            if (this.mThumbDrawable.isStateful()) {
                this.mThumbDrawable.setState(this.getDrawableState());
            }
        }
    }
    
    public void setSplitTrack(final boolean splitTrack) {
        this.mSplitTrack = splitTrack;
        this.invalidate();
    }
    
    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }
    
    public CharSequence getTextOn() {
        return this.mTextOn;
    }
    
    private void setTextOnInternal(final CharSequence textOn) {
        this.mTextOn = textOn;
        this.mTextOnTransformed = this.doTransformForOnOffText(textOn);
        this.mOnLayout = null;
        if (this.mShowText) {
            this.setupEmojiCompatLoadCallback();
        }
    }
    
    public void setTextOn(final CharSequence textOn) {
        this.setTextOnInternal(textOn);
        this.requestLayout();
        if (this.isChecked()) {
            this.setOnStateDescriptionOnRAndAbove();
        }
    }
    
    public CharSequence getTextOff() {
        return this.mTextOff;
    }
    
    private void setTextOffInternal(final CharSequence textOff) {
        this.mTextOff = textOff;
        this.mTextOffTransformed = this.doTransformForOnOffText(textOff);
        this.mOffLayout = null;
        if (this.mShowText) {
            this.setupEmojiCompatLoadCallback();
        }
    }
    
    public void setTextOff(final CharSequence textOff) {
        this.setTextOffInternal(textOff);
        this.requestLayout();
        if (!this.isChecked()) {
            this.setOffStateDescriptionOnRAndAbove();
        }
    }
    
    @Nullable
    private CharSequence doTransformForOnOffText(@Nullable final CharSequence onOffText) {
        final TransformationMethod transformationMethod = this.getEmojiTextViewHelper().wrapTransformationMethod(this.mSwitchTransformationMethod);
        return (transformationMethod != null) ? transformationMethod.getTransformation(onOffText, (View)this) : onOffText;
    }
    
    public void setShowText(final boolean showText) {
        if (this.mShowText != showText) {
            this.mShowText = showText;
            this.requestLayout();
            if (showText) {
                this.setupEmojiCompatLoadCallback();
            }
        }
    }
    
    public boolean getShowText() {
        return this.mShowText;
    }
    
    public void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = this.makeLayout(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = this.makeLayout(this.mTextOffTransformed);
            }
        }
        final Rect padding = this.mTempRect;
        int thumbWidth;
        int thumbHeight;
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.getPadding(padding);
            thumbWidth = this.mThumbDrawable.getIntrinsicWidth() - padding.left - padding.right;
            thumbHeight = this.mThumbDrawable.getIntrinsicHeight();
        }
        else {
            thumbWidth = 0;
            thumbHeight = 0;
        }
        int maxTextWidth;
        if (this.mShowText) {
            maxTextWidth = Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + this.mThumbTextPadding * 2;
        }
        else {
            maxTextWidth = 0;
        }
        this.mThumbWidth = Math.max(maxTextWidth, thumbWidth);
        int trackHeight;
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.getPadding(padding);
            trackHeight = this.mTrackDrawable.getIntrinsicHeight();
        }
        else {
            padding.setEmpty();
            trackHeight = 0;
        }
        int paddingLeft = padding.left;
        int paddingRight = padding.right;
        if (this.mThumbDrawable != null) {
            final Rect inset = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            paddingLeft = Math.max(paddingLeft, inset.left);
            paddingRight = Math.max(paddingRight, inset.right);
        }
        final int switchWidth = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, 2 * this.mThumbWidth + paddingLeft + paddingRight) : this.mSwitchMinWidth;
        final int switchHeight = Math.max(trackHeight, thumbHeight);
        this.mSwitchWidth = switchWidth;
        this.mSwitchHeight = switchHeight;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int measuredHeight = this.getMeasuredHeight();
        if (measuredHeight < switchHeight) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), switchHeight);
        }
    }
    
    public void onPopulateAccessibilityEvent(final AccessibilityEvent event) {
        super.onPopulateAccessibilityEvent(event);
        final CharSequence text = this.isChecked() ? this.mTextOn : this.mTextOff;
        if (text != null) {
            event.getText().add((Object)text);
        }
    }
    
    private Layout makeLayout(final CharSequence transformedText) {
        return (Layout)new StaticLayout(transformedText, this.mTextPaint, (transformedText != null) ? ((int)Math.ceil((double)Layout.getDesiredWidth(transformedText, this.mTextPaint))) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private boolean hitThumb(final float x, final float y) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        final int thumbOffset = this.getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        final int thumbTop = this.mSwitchTop - this.mTouchSlop;
        final int thumbLeft = this.mSwitchLeft + thumbOffset - this.mTouchSlop;
        final int thumbRight = thumbLeft + this.mThumbWidth + this.mTempRect.left + this.mTempRect.right + this.mTouchSlop;
        final int thumbBottom = this.mSwitchBottom + this.mTouchSlop;
        return x > thumbLeft && x < thumbRight && y > thumbTop && y < thumbBottom;
    }
    
    public boolean onTouchEvent(final MotionEvent ev) {
        this.mVelocityTracker.addMovement(ev);
        final int action = ev.getActionMasked();
        switch (action) {
            case 0: {
                final float x = ev.getX();
                final float y = ev.getY();
                if (this.isEnabled() && this.hitThumb(x, y)) {
                    this.mTouchMode = 1;
                    this.mTouchX = x;
                    this.mTouchY = y;
                    break;
                }
                break;
            }
            case 2: {
                switch (this.mTouchMode) {
                    case 1: {
                        final float x = ev.getX();
                        final float y = ev.getY();
                        if (Math.abs(x - this.mTouchX) > this.mTouchSlop || Math.abs(y - this.mTouchY) > this.mTouchSlop) {
                            this.mTouchMode = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.mTouchX = x;
                            this.mTouchY = y;
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        final float x = ev.getX();
                        final int thumbScrollRange = this.getThumbScrollRange();
                        final float thumbScrollOffset = x - this.mTouchX;
                        float dPos;
                        if (thumbScrollRange != 0) {
                            dPos = thumbScrollOffset / thumbScrollRange;
                        }
                        else {
                            dPos = ((thumbScrollOffset > 0.0f) ? 1.0f : -1.0f);
                        }
                        if (ViewUtils.isLayoutRtl((View)this)) {
                            dPos = -dPos;
                        }
                        final float newPos = constrain(this.mThumbPosition + dPos, 0.0f, 1.0f);
                        if (newPos != this.mThumbPosition) {
                            this.mTouchX = x;
                            this.setThumbPosition(newPos);
                        }
                        return true;
                    }
                }
                break;
            }
            case 1:
            case 3: {
                if (this.mTouchMode == 2) {
                    this.stopDrag(ev);
                    super.onTouchEvent(ev);
                    return true;
                }
                this.mTouchMode = 0;
                this.mVelocityTracker.clear();
                break;
            }
        }
        return super.onTouchEvent(ev);
    }
    
    private void cancelSuperTouch(final MotionEvent ev) {
        final MotionEvent cancel = MotionEvent.obtain(ev);
        cancel.setAction(3);
        super.onTouchEvent(cancel);
        cancel.recycle();
    }
    
    private void stopDrag(final MotionEvent ev) {
        this.mTouchMode = 0;
        final boolean commitChange = ev.getAction() == 1 && this.isEnabled();
        final boolean oldState = this.isChecked();
        boolean newState;
        if (commitChange) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            final float xvel = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xvel) > this.mMinFlingVelocity) {
                newState = (ViewUtils.isLayoutRtl((View)this) ? (xvel < 0.0f) : (xvel > 0.0f));
            }
            else {
                newState = this.getTargetCheckedState();
            }
        }
        else {
            newState = oldState;
        }
        if (newState != oldState) {
            this.playSoundEffect(0);
        }
        this.setChecked(newState);
        this.cancelSuperTouch(ev);
    }
    
    private void animateThumbToCheckedState(final boolean newCheckedState) {
        final float targetPosition = newCheckedState ? 1.0f : 0.0f;
        (this.mPositionAnimator = ObjectAnimator.ofFloat((Object)this, (Property)SwitchCompat.THUMB_POS, new float[] { targetPosition })).setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }
    
    private void cancelPositionAnimator() {
        if (this.mPositionAnimator != null) {
            this.mPositionAnimator.cancel();
        }
    }
    
    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }
    
    @FloatRange(from = 0.0, to = 1.0)
    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }
    
    void setThumbPosition(final float position) {
        this.mThumbPosition = position;
        this.invalidate();
    }
    
    public void toggle() {
        this.setChecked(!this.isChecked());
    }
    
    public void setChecked(boolean checked) {
        super.setChecked(checked);
        checked = this.isChecked();
        if (checked) {
            this.setOnStateDescriptionOnRAndAbove();
        }
        else {
            this.setOffStateDescriptionOnRAndAbove();
        }
        if (this.getWindowToken() != null && this.isLaidOut()) {
            this.animateThumbToCheckedState(checked);
        }
        else {
            this.cancelPositionAnimator();
            this.setThumbPosition(checked ? 1.0f : 0.0f);
        }
    }
    
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int opticalInsetLeft = 0;
        int opticalInsetRight = 0;
        if (this.mThumbDrawable != null) {
            final Rect trackPadding = this.mTempRect;
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.getPadding(trackPadding);
            }
            else {
                trackPadding.setEmpty();
            }
            final Rect insets = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            opticalInsetLeft = Math.max(0, insets.left - trackPadding.left);
            opticalInsetRight = Math.max(0, insets.right - trackPadding.right);
        }
        int switchLeft;
        int switchRight;
        if (ViewUtils.isLayoutRtl((View)this)) {
            switchLeft = this.getPaddingLeft() + opticalInsetLeft;
            switchRight = switchLeft + this.mSwitchWidth - opticalInsetLeft - opticalInsetRight;
        }
        else {
            switchRight = this.getWidth() - this.getPaddingRight() - opticalInsetRight;
            switchLeft = switchRight - this.mSwitchWidth + opticalInsetLeft + opticalInsetRight;
        }
        int switchTop = 0;
        int switchBottom = 0;
        switch (this.getGravity() & 0x70) {
            default: {
                switchTop = this.getPaddingTop();
                switchBottom = switchTop + this.mSwitchHeight;
                break;
            }
            case 16: {
                switchTop = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2 - this.mSwitchHeight / 2;
                switchBottom = switchTop + this.mSwitchHeight;
                break;
            }
            case 80: {
                switchBottom = this.getHeight() - this.getPaddingBottom();
                switchTop = switchBottom - this.mSwitchHeight;
                break;
            }
        }
        this.mSwitchLeft = switchLeft;
        this.mSwitchTop = switchTop;
        this.mSwitchBottom = switchBottom;
        this.mSwitchRight = switchRight;
    }
    
    public void draw(@NonNull final Canvas c) {
        final Rect padding = this.mTempRect;
        final int switchLeft = this.mSwitchLeft;
        final int switchTop = this.mSwitchTop;
        final int switchRight = this.mSwitchRight;
        final int switchBottom = this.mSwitchBottom;
        int thumbInitialLeft = switchLeft + this.getThumbOffset();
        Rect thumbInsets;
        if (this.mThumbDrawable != null) {
            thumbInsets = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
        }
        else {
            thumbInsets = DrawableUtils.INSETS_NONE;
        }
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.getPadding(padding);
            thumbInitialLeft += padding.left;
            int trackLeft = switchLeft;
            int trackTop = switchTop;
            int trackRight = switchRight;
            int trackBottom = switchBottom;
            if (thumbInsets != null) {
                if (thumbInsets.left > padding.left) {
                    trackLeft += thumbInsets.left - padding.left;
                }
                if (thumbInsets.top > padding.top) {
                    trackTop += thumbInsets.top - padding.top;
                }
                if (thumbInsets.right > padding.right) {
                    trackRight -= thumbInsets.right - padding.right;
                }
                if (thumbInsets.bottom > padding.bottom) {
                    trackBottom -= thumbInsets.bottom - padding.bottom;
                }
            }
            this.mTrackDrawable.setBounds(trackLeft, trackTop, trackRight, trackBottom);
        }
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.getPadding(padding);
            final int thumbLeft = thumbInitialLeft - padding.left;
            final int thumbRight = thumbInitialLeft + this.mThumbWidth + padding.right;
            this.mThumbDrawable.setBounds(thumbLeft, switchTop, thumbRight, switchBottom);
            final Drawable background = this.getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, thumbLeft, switchTop, thumbRight, switchBottom);
            }
        }
        super.draw(c);
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final Rect padding = this.mTempRect;
        final Drawable trackDrawable = this.mTrackDrawable;
        if (trackDrawable != null) {
            trackDrawable.getPadding(padding);
        }
        else {
            padding.setEmpty();
        }
        final int switchTop = this.mSwitchTop;
        final int switchBottom = this.mSwitchBottom;
        final int switchInnerTop = switchTop + padding.top;
        final int switchInnerBottom = switchBottom - padding.bottom;
        final Drawable thumbDrawable = this.mThumbDrawable;
        if (trackDrawable != null) {
            if (this.mSplitTrack && thumbDrawable != null) {
                final Rect insets = DrawableUtils.getOpticalBounds(thumbDrawable);
                thumbDrawable.copyBounds(padding);
                final Rect rect = padding;
                rect.left += insets.left;
                final Rect rect2 = padding;
                rect2.right -= insets.right;
                final int saveCount = canvas.save();
                canvas.clipRect(padding, Region.Op.DIFFERENCE);
                trackDrawable.draw(canvas);
                canvas.restoreToCount(saveCount);
            }
            else {
                trackDrawable.draw(canvas);
            }
        }
        final int saveCount2 = canvas.save();
        if (thumbDrawable != null) {
            thumbDrawable.draw(canvas);
        }
        final Layout switchText = this.getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (switchText != null) {
            final int[] drawableState = this.getDrawableState();
            if (this.mTextColors != null) {
                this.mTextPaint.setColor(this.mTextColors.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            int cX;
            if (thumbDrawable != null) {
                final Rect bounds = thumbDrawable.getBounds();
                cX = bounds.left + bounds.right;
            }
            else {
                cX = this.getWidth();
            }
            final int left = cX / 2 - switchText.getWidth() / 2;
            final int top = (switchInnerTop + switchInnerBottom) / 2 - switchText.getHeight() / 2;
            canvas.translate((float)left, (float)top);
            switchText.draw(canvas);
        }
        canvas.restoreToCount(saveCount2);
    }
    
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int padding = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(this.getText())) {
            padding += this.mSwitchPadding;
        }
        return padding;
    }
    
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int padding = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(this.getText())) {
            padding += this.mSwitchPadding;
        }
        return padding;
    }
    
    private int getThumbOffset() {
        float thumbPosition;
        if (ViewUtils.isLayoutRtl((View)this)) {
            thumbPosition = 1.0f - this.mThumbPosition;
        }
        else {
            thumbPosition = this.mThumbPosition;
        }
        return (int)(thumbPosition * this.getThumbScrollRange() + 0.5f);
    }
    
    private int getThumbScrollRange() {
        if (this.mTrackDrawable != null) {
            final Rect padding = this.mTempRect;
            this.mTrackDrawable.getPadding(padding);
            Rect insets;
            if (this.mThumbDrawable != null) {
                insets = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            }
            else {
                insets = DrawableUtils.INSETS_NONE;
            }
            return this.mSwitchWidth - this.mThumbWidth - padding.left - padding.right - insets.left - insets.right;
        }
        return 0;
    }
    
    protected int[] onCreateDrawableState(final int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        if (this.isChecked()) {
            mergeDrawableStates(drawableState, SwitchCompat.CHECKED_STATE_SET);
        }
        return drawableState;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] state = this.getDrawableState();
        boolean changed = false;
        final Drawable thumbDrawable = this.mThumbDrawable;
        if (thumbDrawable != null && thumbDrawable.isStateful()) {
            changed |= thumbDrawable.setState(state);
        }
        final Drawable trackDrawable = this.mTrackDrawable;
        if (trackDrawable != null && trackDrawable.isStateful()) {
            changed |= trackDrawable.setState(state);
        }
        if (changed) {
            this.invalidate();
        }
    }
    
    public void drawableHotspotChanged(final float x, final float y) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(x, y);
        }
        if (this.mThumbDrawable != null) {
            DrawableCompat.setHotspot(this.mThumbDrawable, x, y);
        }
        if (this.mTrackDrawable != null) {
            DrawableCompat.setHotspot(this.mTrackDrawable, x, y);
        }
    }
    
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        return super.verifyDrawable(who) || who == this.mThumbDrawable || who == this.mTrackDrawable;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.jumpToCurrentState();
        }
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.jumpToCurrentState();
        }
        if (this.mPositionAnimator != null && this.mPositionAnimator.isStarted()) {
            this.mPositionAnimator.end();
            this.mPositionAnimator = null;
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName((CharSequence)"android.widget.Switch");
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName((CharSequence)"android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            final CharSequence switchText = this.isChecked() ? this.mTextOn : this.mTextOff;
            if (!TextUtils.isEmpty(switchText)) {
                final CharSequence oldText = info.getText();
                if (TextUtils.isEmpty(oldText)) {
                    info.setText(switchText);
                }
                else {
                    final StringBuilder newText = new StringBuilder();
                    newText.append(oldText).append(' ').append(switchText);
                    info.setText((CharSequence)newText);
                }
            }
        }
    }
    
    public void setCustomSelectionActionModeCallback(@Nullable final ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback((TextView)this, actionModeCallback));
    }
    
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }
    
    protected final void setEnforceSwitchWidth(final boolean enforceSwitchWidth) {
        this.mEnforceSwitchWidth = enforceSwitchWidth;
        this.invalidate();
    }
    
    private static float constrain(final float amount, final float low, final float high) {
        return (amount < low) ? low : ((amount > high) ? high : amount);
    }
    
    private void setOnStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            ViewCompat.setStateDescription((View)this, (CharSequence)((this.mTextOn == null) ? this.getResources().getString(R.string.abc_capital_on) : this.mTextOn));
        }
    }
    
    private void setOffStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            ViewCompat.setStateDescription((View)this, (CharSequence)((this.mTextOff == null) ? this.getResources().getString(R.string.abc_capital_off) : this.mTextOff));
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper().setAllCaps(allCaps);
    }
    
    public void setFilters(@NonNull final InputFilter[] filters) {
        super.setFilters(this.getEmojiTextViewHelper().getFilters(filters));
    }
    
    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper((TextView)this);
        }
        return this.mAppCompatEmojiTextHelper;
    }
    
    public void setEmojiCompatEnabled(final boolean enabled) {
        this.getEmojiTextViewHelper().setEnabled(enabled);
        this.setTextOnInternal(this.mTextOn);
        this.setTextOffInternal(this.mTextOff);
        this.requestLayout();
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().isEnabled();
    }
    
    private void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback != null || !this.mAppCompatEmojiTextHelper.isEnabled()) {
            return;
        }
        if (EmojiCompat.isConfigured()) {
            final EmojiCompat emojiCompat = EmojiCompat.get();
            final int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                emojiCompat.registerInitCallback((EmojiCompat.InitCallback)(this.mEmojiCompatInitCallback = new EmojiCompatInitCallback(this)));
            }
        }
    }
    
    void onEmojiCompatInitializedForSwitchText() {
        this.setTextOnInternal(this.mTextOn);
        this.setTextOffInternal(this.mTextOff);
        this.requestLayout();
    }
    
    static {
        THUMB_POS = new Property<SwitchCompat, Float>("thumbPos") {
            public Float get(final SwitchCompat object) {
                return object.mThumbPosition;
            }
            
            public void set(final SwitchCompat object, final Float value) {
                object.setThumbPosition(value);
            }
        };
        CHECKED_STATE_SET = new int[] { 16842912 };
    }
    
    static class EmojiCompatInitCallback extends EmojiCompat.InitCallback
    {
        private final Reference<SwitchCompat> mOuterWeakRef;
        
        EmojiCompatInitCallback(final SwitchCompat view) {
            this.mOuterWeakRef = (Reference<SwitchCompat>)new WeakReference((Object)view);
        }
        
        public void onInitialized() {
            final SwitchCompat view = (SwitchCompat)this.mOuterWeakRef.get();
            if (view != null) {
                view.onEmojiCompatInitializedForSwitchText();
            }
        }
        
        public void onFailed(@Nullable final Throwable throwable) {
            final SwitchCompat view = (SwitchCompat)this.mOuterWeakRef.get();
            if (view != null) {
                view.onEmojiCompatInitializedForSwitchText();
            }
        }
    }
}
