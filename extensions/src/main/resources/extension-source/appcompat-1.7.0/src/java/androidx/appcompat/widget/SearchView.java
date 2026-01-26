package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Parcel;
import androidx.customview.view.AbsSavedState;
import android.widget.AutoCompleteTextView;
import android.os.Build;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.content.res.Resources;
import android.os.Parcelable;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.content.pm.ResolveInfo;
import android.view.TouchDelegate;
import android.widget.ListAdapter;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.core.view.ViewCompat;
import android.text.Editable;
import android.view.KeyEvent;
import android.database.Cursor;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.text.TextWatcher;
import android.widget.AdapterView;
import android.widget.TextView;
import java.util.WeakHashMap;
import android.os.Bundle;
import android.app.SearchableInfo;
import androidx.cursoradapter.widget.CursorAdapter;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import androidx.appcompat.view.CollapsibleActionView;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView
{
    static final boolean DBG = false;
    static final String LOG_TAG = "SearchView";
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    final SearchAutoComplete mSearchSrcTextView;
    private final View mSearchEditFrame;
    private final View mSearchPlate;
    private final View mSubmitArea;
    final ImageView mSearchButton;
    final ImageView mGoButton;
    final ImageView mCloseButton;
    final ImageView mVoiceButton;
    private final View mDropDownAnchor;
    private UpdatableTouchDelegate mTouchDelegate;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    private int[] mTemp;
    private int[] mTemp2;
    private final ImageView mCollapsedIcon;
    private final Drawable mSearchHintIcon;
    private final int mSuggestionRowLayout;
    private final int mSuggestionCommitIconResId;
    private final Intent mVoiceWebSearchIntent;
    private final Intent mVoiceAppSearchIntent;
    private final CharSequence mDefaultQueryHint;
    private OnQueryTextListener mOnQueryChangeListener;
    private OnCloseListener mOnCloseListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private OnSuggestionListener mOnSuggestionListener;
    private View.OnClickListener mOnSearchClickListener;
    private boolean mIconifiedByDefault;
    private boolean mIconified;
    CursorAdapter mSuggestionsAdapter;
    private boolean mSubmitButtonEnabled;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private boolean mClearingFocus;
    private int mMaxWidth;
    private boolean mVoiceButtonEnabled;
    private CharSequence mOldQueryText;
    private CharSequence mUserQuery;
    private boolean mExpandedInActionView;
    private int mCollapsedImeOptions;
    SearchableInfo mSearchable;
    private Bundle mAppSearchData;
    static final PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER;
    private final Runnable mUpdateDrawableStateRunnable;
    private Runnable mReleaseCursorRunnable;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final View.OnClickListener mOnClickListener;
    View.OnKeyListener mTextKeyListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private TextWatcher mTextWatcher;
    
    public SearchView(@NonNull final Context context) {
        this(context, null);
    }
    
    public SearchView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.searchViewStyle);
    }
    
    public SearchView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = (Runnable)new Runnable() {
            public void run() {
                SearchView.this.updateFocusedState();
            }
        };
        this.mReleaseCursorRunnable = (Runnable)new Runnable() {
            public void run() {
                if (SearchView.this.mSuggestionsAdapter instanceof SuggestionsAdapter) {
                    SearchView.this.mSuggestionsAdapter.changeCursor((Cursor)null);
                }
            }
        };
        this.mOutsideDrawablesCache = (WeakHashMap<String, Drawable.ConstantState>)new WeakHashMap();
        this.mOnClickListener = (View.OnClickListener)new View.OnClickListener() {
            public void onClick(final View v) {
                if (v == SearchView.this.mSearchButton) {
                    SearchView.this.onSearchClicked();
                }
                else if (v == SearchView.this.mCloseButton) {
                    SearchView.this.onCloseClicked();
                }
                else if (v == SearchView.this.mGoButton) {
                    SearchView.this.onSubmitQuery();
                }
                else if (v == SearchView.this.mVoiceButton) {
                    SearchView.this.onVoiceClicked();
                }
                else if (v == SearchView.this.mSearchSrcTextView) {
                    SearchView.this.forceSuggestionQuery();
                }
            }
        };
        this.mTextKeyListener = (View.OnKeyListener)new View.OnKeyListener() {
            public boolean onKey(final View v, final int keyCode, final KeyEvent event) {
                if (SearchView.this.mSearchable == null) {
                    return false;
                }
                if (SearchView.this.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                    return SearchView.this.onSuggestionsKey(v, keyCode, event);
                }
                if (!SearchView.this.mSearchSrcTextView.isEmpty() && event.hasNoModifiers() && event.getAction() == 1 && keyCode == 66) {
                    v.cancelLongPress();
                    SearchView.this.launchQuerySearch(0, null, SearchView.this.mSearchSrcTextView.getText().toString());
                    return true;
                }
                return false;
            }
        };
        this.mOnEditorActionListener = (TextView.OnEditorActionListener)new TextView.OnEditorActionListener() {
            public boolean onEditorAction(final TextView v, final int actionId, final KeyEvent event) {
                SearchView.this.onSubmitQuery();
                return true;
            }
        };
        this.mOnItemClickListener = (AdapterView.OnItemClickListener)new AdapterView.OnItemClickListener() {
            public void onItemClick(final AdapterView<?> parent, final View view, final int position, final long id) {
                SearchView.this.onItemClicked(position, 0, null);
            }
        };
        this.mOnItemSelectedListener = (AdapterView.OnItemSelectedListener)new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(final AdapterView<?> parent, final View view, final int position, final long id) {
                SearchView.this.onItemSelected(position);
            }
            
            public void onNothingSelected(final AdapterView<?> parent) {
            }
        };
        this.mTextWatcher = (TextWatcher)new TextWatcher() {
            public void beforeTextChanged(final CharSequence s, final int start, final int before, final int after) {
            }
            
            public void onTextChanged(final CharSequence s, final int start, final int before, final int after) {
                SearchView.this.onTextChanged(s);
            }
            
            public void afterTextChanged(final Editable s) {
            }
        };
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.SearchView, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, context, R.styleable.SearchView, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        final LayoutInflater inflater = LayoutInflater.from(context);
        final int layoutResId = a.getResourceId(R.styleable.SearchView_layout, R.layout.abc_search_view);
        inflater.inflate(layoutResId, (ViewGroup)this, true);
        (this.mSearchSrcTextView = (SearchAutoComplete)this.findViewById(R.id.search_src_text)).setSearchView(this);
        this.mSearchEditFrame = this.findViewById(R.id.search_edit_frame);
        this.mSearchPlate = this.findViewById(R.id.search_plate);
        this.mSubmitArea = this.findViewById(R.id.submit_area);
        this.mSearchButton = (ImageView)this.findViewById(R.id.search_button);
        this.mGoButton = (ImageView)this.findViewById(R.id.search_go_btn);
        this.mCloseButton = (ImageView)this.findViewById(R.id.search_close_btn);
        this.mVoiceButton = (ImageView)this.findViewById(R.id.search_voice_btn);
        this.mCollapsedIcon = (ImageView)this.findViewById(R.id.search_mag_icon);
        ViewCompat.setBackground(this.mSearchPlate, a.getDrawable(R.styleable.SearchView_queryBackground));
        ViewCompat.setBackground(this.mSubmitArea, a.getDrawable(R.styleable.SearchView_submitBackground));
        this.mSearchButton.setImageDrawable(a.getDrawable(R.styleable.SearchView_searchIcon));
        this.mGoButton.setImageDrawable(a.getDrawable(R.styleable.SearchView_goIcon));
        this.mCloseButton.setImageDrawable(a.getDrawable(R.styleable.SearchView_closeIcon));
        this.mVoiceButton.setImageDrawable(a.getDrawable(R.styleable.SearchView_voiceIcon));
        this.mCollapsedIcon.setImageDrawable(a.getDrawable(R.styleable.SearchView_searchIcon));
        this.mSearchHintIcon = a.getDrawable(R.styleable.SearchView_searchHintIcon);
        TooltipCompat.setTooltipText((View)this.mSearchButton, (CharSequence)this.getResources().getString(R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = a.getResourceId(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = a.getResourceId(R.styleable.SearchView_commitIcon, 0);
        this.mSearchButton.setOnClickListener(this.mOnClickListener);
        this.mCloseButton.setOnClickListener(this.mOnClickListener);
        this.mGoButton.setOnClickListener(this.mOnClickListener);
        this.mVoiceButton.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener((View.OnFocusChangeListener)new View.OnFocusChangeListener() {
            public void onFocusChange(final View v, final boolean hasFocus) {
                if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
                    SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange((View)SearchView.this, hasFocus);
                }
            }
        });
        this.setIconifiedByDefault(a.getBoolean(R.styleable.SearchView_iconifiedByDefault, true));
        final int maxWidth = a.getDimensionPixelSize(R.styleable.SearchView_android_maxWidth, -1);
        if (maxWidth != -1) {
            this.setMaxWidth(maxWidth);
        }
        this.mDefaultQueryHint = a.getText(R.styleable.SearchView_defaultQueryHint);
        this.mQueryHint = a.getText(R.styleable.SearchView_queryHint);
        final int imeOptions = a.getInt(R.styleable.SearchView_android_imeOptions, -1);
        if (imeOptions != -1) {
            this.setImeOptions(imeOptions);
        }
        final int inputType = a.getInt(R.styleable.SearchView_android_inputType, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        boolean focusable = true;
        focusable = a.getBoolean(R.styleable.SearchView_android_focusable, focusable);
        this.setFocusable(focusable);
        a.recycle();
        (this.mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH")).addFlags(268435456);
        this.mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        this.mDropDownAnchor = this.findViewById(this.mSearchSrcTextView.getDropDownAnchor());
        if (this.mDropDownAnchor != null) {
            this.mDropDownAnchor.addOnLayoutChangeListener((View.OnLayoutChangeListener)new View.OnLayoutChangeListener() {
                public void onLayoutChange(final View v, final int left, final int top, final int right, final int bottom, final int oldLeft, final int oldTop, final int oldRight, final int oldBottom) {
                    SearchView.this.adjustDropDownSizeAndPosition();
                }
            });
        }
        this.updateViewsVisibility(this.mIconifiedByDefault);
        this.updateQueryHint();
    }
    
    int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }
    
    int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }
    
    public void setSearchableInfo(final SearchableInfo searchable) {
        this.mSearchable = searchable;
        if (this.mSearchable != null) {
            this.updateSearchAutoComplete();
            this.updateQueryHint();
        }
        this.mVoiceButtonEnabled = this.hasVoiceSearch();
        if (this.mVoiceButtonEnabled) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        this.updateViewsVisibility(this.isIconified());
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setAppSearchData(final Bundle appSearchData) {
        this.mAppSearchData = appSearchData;
    }
    
    public void setImeOptions(final int imeOptions) {
        this.mSearchSrcTextView.setImeOptions(imeOptions);
    }
    
    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }
    
    public void setInputType(final int inputType) {
        this.mSearchSrcTextView.setInputType(inputType);
    }
    
    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }
    
    public boolean requestFocus(final int direction, final Rect previouslyFocusedRect) {
        if (this.mClearingFocus) {
            return false;
        }
        if (!this.isFocusable()) {
            return false;
        }
        if (!this.isIconified()) {
            final boolean result = this.mSearchSrcTextView.requestFocus(direction, previouslyFocusedRect);
            if (result) {
                this.updateViewsVisibility(false);
            }
            return result;
        }
        return super.requestFocus(direction, previouslyFocusedRect);
    }
    
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }
    
    public void setOnQueryTextListener(final OnQueryTextListener listener) {
        this.mOnQueryChangeListener = listener;
    }
    
    public void setOnCloseListener(final OnCloseListener listener) {
        this.mOnCloseListener = listener;
    }
    
    public void setOnQueryTextFocusChangeListener(final View.OnFocusChangeListener listener) {
        this.mOnQueryTextFocusChangeListener = listener;
    }
    
    public void setOnSuggestionListener(final OnSuggestionListener listener) {
        this.mOnSuggestionListener = listener;
    }
    
    public void setOnSearchClickListener(final View.OnClickListener listener) {
        this.mOnSearchClickListener = listener;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)this.mSearchSrcTextView.getText();
    }
    
    public void setQuery(final CharSequence query, final boolean submit) {
        this.mSearchSrcTextView.setText(query);
        if (query != null) {
            this.mSearchSrcTextView.setSelection(this.mSearchSrcTextView.length());
            this.mUserQuery = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            this.onSubmitQuery();
        }
    }
    
    public void setQueryHint(@Nullable final CharSequence hint) {
        this.mQueryHint = hint;
        this.updateQueryHint();
    }
    
    @Nullable
    public CharSequence getQueryHint() {
        CharSequence hint;
        if (this.mQueryHint != null) {
            hint = this.mQueryHint;
        }
        else if (this.mSearchable != null && this.mSearchable.getHintId() != 0) {
            hint = this.getContext().getText(this.mSearchable.getHintId());
        }
        else {
            hint = this.mDefaultQueryHint;
        }
        return hint;
    }
    
    public void setIconifiedByDefault(final boolean iconified) {
        if (this.mIconifiedByDefault == iconified) {
            return;
        }
        this.updateViewsVisibility(this.mIconifiedByDefault = iconified);
        this.updateQueryHint();
    }
    
    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }
    
    public void setIconified(final boolean iconify) {
        if (iconify) {
            this.onCloseClicked();
        }
        else {
            this.onSearchClicked();
        }
    }
    
    public boolean isIconified() {
        return this.mIconified;
    }
    
    public void setSubmitButtonEnabled(final boolean enabled) {
        this.mSubmitButtonEnabled = enabled;
        this.updateViewsVisibility(this.isIconified());
    }
    
    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }
    
    public void setQueryRefinementEnabled(final boolean enable) {
        this.mQueryRefinement = enable;
        if (this.mSuggestionsAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter)this.mSuggestionsAdapter).setQueryRefinement(enable ? 2 : 1);
        }
    }
    
    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }
    
    public void setSuggestionsAdapter(final CursorAdapter adapter) {
        this.mSuggestionsAdapter = adapter;
        this.mSearchSrcTextView.setAdapter((ListAdapter)this.mSuggestionsAdapter);
    }
    
    public CursorAdapter getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }
    
    public void setMaxWidth(final int maxpixels) {
        this.mMaxWidth = maxpixels;
        this.requestLayout();
    }
    
    public int getMaxWidth() {
        return this.mMaxWidth;
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        if (this.isIconified()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        switch (widthMode) {
            case Integer.MIN_VALUE: {
                if (this.mMaxWidth > 0) {
                    width = Math.min(this.mMaxWidth, width);
                    break;
                }
                width = Math.min(this.getPreferredWidth(), width);
                break;
            }
            case 1073741824: {
                if (this.mMaxWidth > 0) {
                    width = Math.min(this.mMaxWidth, width);
                    break;
                }
                break;
            }
            case 0: {
                width = ((this.mMaxWidth > 0) ? this.mMaxWidth : this.getPreferredWidth());
                break;
            }
        }
        widthMode = 1073741824;
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        switch (heightMode) {
            case Integer.MIN_VALUE: {
                height = Math.min(this.getPreferredHeight(), height);
                break;
            }
            case 0: {
                height = this.getPreferredHeight();
                break;
            }
        }
        heightMode = 1073741824;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, widthMode), View.MeasureSpec.makeMeasureSpec(height, heightMode));
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            this.getChildBoundsWithinSearchView((View)this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, bottom - top);
            if (this.mTouchDelegate == null) {
                this.setTouchDelegate((TouchDelegate)(this.mTouchDelegate = new UpdatableTouchDelegate(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, (View)this.mSearchSrcTextView)));
            }
            else {
                this.mTouchDelegate.setBounds(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
            }
        }
    }
    
    private void getChildBoundsWithinSearchView(final View view, final Rect rect) {
        view.getLocationInWindow(this.mTemp);
        this.getLocationInWindow(this.mTemp2);
        final int top = this.mTemp[1] - this.mTemp2[1];
        final int left = this.mTemp[0] - this.mTemp2[0];
        rect.set(left, top, left + view.getWidth(), top + view.getHeight());
    }
    
    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }
    
    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }
    
    private void updateViewsVisibility(final boolean collapsed) {
        this.mIconified = collapsed;
        final int visCollapsed = collapsed ? 0 : 8;
        final boolean hasText = !TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(visCollapsed);
        this.updateSubmitButton(hasText);
        this.mSearchEditFrame.setVisibility(collapsed ? 8 : 0);
        int iconVisibility;
        if (this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) {
            iconVisibility = 8;
        }
        else {
            iconVisibility = 0;
        }
        this.mCollapsedIcon.setVisibility(iconVisibility);
        this.updateCloseButton();
        this.updateVoiceButton(!hasText);
        this.updateSubmitArea();
    }
    
    private boolean hasVoiceSearch() {
        if (this.mSearchable != null && this.mSearchable.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.mVoiceWebSearchIntent;
            }
            else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.mVoiceAppSearchIntent;
            }
            if (testIntent != null) {
                final ResolveInfo ri = this.getContext().getPackageManager().resolveActivity(testIntent, 65536);
                return ri != null;
            }
        }
        return false;
    }
    
    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !this.isIconified();
    }
    
    private void updateSubmitButton(final boolean hasText) {
        int visibility = 8;
        if (this.mSubmitButtonEnabled && this.isSubmitAreaEnabled() && this.hasFocus() && (hasText || !this.mVoiceButtonEnabled)) {
            visibility = 0;
        }
        this.mGoButton.setVisibility(visibility);
    }
    
    private void updateSubmitArea() {
        int visibility = 8;
        if (this.isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
            visibility = 0;
        }
        this.mSubmitArea.setVisibility(visibility);
    }
    
    private void updateCloseButton() {
        final boolean hasText = !TextUtils.isEmpty((CharSequence)this.mSearchSrcTextView.getText());
        final boolean showClose = hasText || (this.mIconifiedByDefault && !this.mExpandedInActionView);
        this.mCloseButton.setVisibility(showClose ? 0 : 8);
        final Drawable closeButtonImg = this.mCloseButton.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? SearchView.ENABLED_STATE_SET : SearchView.EMPTY_STATE_SET);
        }
    }
    
    private void postUpdateFocusedState() {
        this.post(this.mUpdateDrawableStateRunnable);
    }
    
    void updateFocusedState() {
        final boolean focused = this.mSearchSrcTextView.hasFocus();
        final int[] stateSet = focused ? SearchView.FOCUSED_STATE_SET : SearchView.EMPTY_STATE_SET;
        final Drawable searchPlateBg = this.mSearchPlate.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        final Drawable submitAreaBg = this.mSubmitArea.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        this.invalidate();
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.mUpdateDrawableStateRunnable);
        this.post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }
    
    protected void onQueryRefine(@Nullable final CharSequence queryText) {
        this.setQuery(queryText);
    }
    
    boolean onSuggestionsKey(final View v, final int keyCode, final KeyEvent event) {
        if (this.mSearchable == null) {
            return false;
        }
        if (this.mSuggestionsAdapter == null) {
            return false;
        }
        if (event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                final int position = this.mSearchSrcTextView.getListSelection();
                return this.onItemClicked(position, 0, null);
            }
            if (keyCode == 21 || keyCode == 22) {
                final int selPoint = (keyCode == 21) ? 0 : this.mSearchSrcTextView.length();
                this.mSearchSrcTextView.setSelection(selPoint);
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.ensureImeVisible();
                return true;
            }
            if (keyCode == 19 && 0 == this.mSearchSrcTextView.getListSelection()) {
                return false;
            }
        }
        return false;
    }
    
    private CharSequence getDecoratedHint(final CharSequence hintText) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return hintText;
        }
        final int textSize = (int)(this.mSearchSrcTextView.getTextSize() * 1.25);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        final SpannableStringBuilder ssb = new SpannableStringBuilder((CharSequence)"   ");
        ssb.setSpan((Object)new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        ssb.append(hintText);
        return (CharSequence)ssb;
    }
    
    private void updateQueryHint() {
        final CharSequence hint = this.getQueryHint();
        this.mSearchSrcTextView.setHint(this.getDecoratedHint((CharSequence)((hint == null) ? "" : hint)));
    }
    
    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        if ((inputType & 0xF) == 0x1) {
            inputType &= 0xFFFEFFFF;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType |= 0x10000;
                inputType |= 0x80000;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        if (this.mSuggestionsAdapter != null) {
            this.mSuggestionsAdapter.changeCursor((Cursor)null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            this.mSuggestionsAdapter = (CursorAdapter)new SuggestionsAdapter(this.getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSearchSrcTextView.setAdapter((ListAdapter)this.mSuggestionsAdapter);
            ((SuggestionsAdapter)this.mSuggestionsAdapter).setQueryRefinement(this.mQueryRefinement ? 2 : 1);
        }
    }
    
    private void updateVoiceButton(final boolean empty) {
        int visibility = 8;
        if (this.mVoiceButtonEnabled && !this.isIconified() && empty) {
            visibility = 0;
            this.mGoButton.setVisibility(8);
        }
        this.mVoiceButton.setVisibility(visibility);
    }
    
    void onTextChanged(final CharSequence newText) {
        final CharSequence text = (CharSequence)this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        final boolean hasText = !TextUtils.isEmpty(text);
        this.updateSubmitButton(hasText);
        this.updateVoiceButton(!hasText);
        this.updateCloseButton();
        this.updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(newText, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(newText.toString());
        }
        this.mOldQueryText = (CharSequence)newText.toString();
    }
    
    void onSubmitQuery() {
        final CharSequence query = (CharSequence)this.mSearchSrcTextView.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0 && (this.mOnQueryChangeListener == null || !this.mOnQueryChangeListener.onQueryTextSubmit(query.toString()))) {
            if (this.mSearchable != null) {
                this.launchQuerySearch(0, null, query.toString());
            }
            this.mSearchSrcTextView.setImeVisibility(false);
            this.dismissSuggestions();
        }
    }
    
    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }
    
    void onCloseClicked() {
        final CharSequence text = (CharSequence)this.mSearchSrcTextView.getText();
        if (TextUtils.isEmpty(text)) {
            if (this.mIconifiedByDefault && (this.mOnCloseListener == null || !this.mOnCloseListener.onClose())) {
                this.clearFocus();
                this.updateViewsVisibility(true);
            }
        }
        else {
            this.mSearchSrcTextView.setText((CharSequence)"");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        }
    }
    
    void onSearchClicked() {
        this.updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        if (this.mOnSearchClickListener != null) {
            this.mOnSearchClickListener.onClick((View)this);
        }
    }
    
    void onVoiceClicked() {
        if (this.mSearchable == null) {
            return;
        }
        final SearchableInfo searchable = this.mSearchable;
        try {
            if (searchable.getVoiceSearchLaunchWebSearch()) {
                final Intent webSearchIntent = this.createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchable);
                this.getContext().startActivity(webSearchIntent);
            }
            else if (searchable.getVoiceSearchLaunchRecognizer()) {
                final Intent appSearchIntent = this.createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchable);
                this.getContext().startActivity(appSearchIntent);
            }
        }
        catch (final ActivityNotFoundException e) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
    
    void onTextFocusChanged() {
        this.updateViewsVisibility(this.isIconified());
        this.postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            this.forceSuggestionQuery();
        }
    }
    
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        this.postUpdateFocusedState();
    }
    
    @Override
    public void onActionViewCollapsed() {
        this.setQuery((CharSequence)"", false);
        this.clearFocus();
        this.updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }
    
    @Override
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions | 0x2000000);
        this.mSearchSrcTextView.setText((CharSequence)"");
        this.setIconified(false);
    }
    
    protected Parcelable onSaveInstanceState() {
        final Parcelable superState = super.onSaveInstanceState();
        final SavedState ss = new SavedState(superState);
        ss.isIconified = this.isIconified();
        return (Parcelable)ss;
    }
    
    protected void onRestoreInstanceState(final Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        final SavedState ss = (SavedState)state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.updateViewsVisibility(ss.isIconified);
        this.requestLayout();
    }
    
    void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            final Resources res = this.getContext().getResources();
            final int anchorPadding = this.mSearchPlate.getPaddingLeft();
            final Rect dropDownPadding = new Rect();
            final boolean isLayoutRtl = ViewUtils.isLayoutRtl((View)this);
            final int iconOffset = this.mIconifiedByDefault ? (res.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left)) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(dropDownPadding);
            int offset;
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            }
            else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(offset);
            final int width = this.mDropDownAnchor.getWidth() + dropDownPadding.left + dropDownPadding.right + iconOffset - anchorPadding;
            this.mSearchSrcTextView.setDropDownWidth(width);
        }
    }
    
    boolean onItemClicked(final int position, final int actionKey, final String actionMsg) {
        if (this.mOnSuggestionListener == null || !this.mOnSuggestionListener.onSuggestionClick(position)) {
            this.launchSuggestion(position, 0, null);
            this.mSearchSrcTextView.setImeVisibility(false);
            this.dismissSuggestions();
            return true;
        }
        return false;
    }
    
    boolean onItemSelected(final int position) {
        if (this.mOnSuggestionListener == null || !this.mOnSuggestionListener.onSuggestionSelect(position)) {
            this.rewriteQueryFromSuggestion(position);
            return true;
        }
        return false;
    }
    
    private void rewriteQueryFromSuggestion(final int position) {
        final CharSequence oldQuery = (CharSequence)this.mSearchSrcTextView.getText();
        final Cursor c = this.mSuggestionsAdapter.getCursor();
        if (c == null) {
            return;
        }
        if (c.moveToPosition(position)) {
            final CharSequence newQuery = this.mSuggestionsAdapter.convertToString(c);
            if (newQuery != null) {
                this.setQuery(newQuery);
            }
            else {
                this.setQuery(oldQuery);
            }
        }
        else {
            this.setQuery(oldQuery);
        }
    }
    
    private boolean launchSuggestion(final int position, final int actionKey, final String actionMsg) {
        final Cursor c = this.mSuggestionsAdapter.getCursor();
        if (c != null && c.moveToPosition(position)) {
            final Intent intent = this.createIntentFromSuggestion(c, actionKey, actionMsg);
            this.launchIntent(intent);
            return true;
        }
        return false;
    }
    
    private void launchIntent(final Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            this.getContext().startActivity(intent);
        }
        catch (final RuntimeException ex) {
            Log.e("SearchView", "Failed launch activity: " + (Object)intent, (Throwable)ex);
        }
    }
    
    private void setQuery(final CharSequence query) {
        this.mSearchSrcTextView.setText(query);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }
    
    void launchQuerySearch(final int actionKey, final String actionMsg, final String query) {
        final String action = "android.intent.action.SEARCH";
        final Intent intent = this.createIntent(action, null, null, query, actionKey, actionMsg);
        this.getContext().startActivity(intent);
    }
    
    private Intent createIntent(final String action, final Uri data, final String extraData, final String query, final int actionKey, final String actionMsg) {
        final Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        if (this.mAppSearchData != null) {
            intent.putExtra("app_data", this.mAppSearchData);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }
    
    private Intent createVoiceWebSearchIntent(final Intent baseIntent, final SearchableInfo searchable) {
        final Intent voiceIntent = new Intent(baseIntent);
        final ComponentName searchActivity = searchable.getSearchActivity();
        voiceIntent.putExtra("calling_package", (searchActivity == null) ? null : searchActivity.flattenToShortString());
        return voiceIntent;
    }
    
    private Intent createVoiceAppSearchIntent(final Intent baseIntent, final SearchableInfo searchable) {
        final ComponentName searchActivity = searchable.getSearchActivity();
        final Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        final PendingIntent pending = PendingIntent.getActivity(this.getContext(), 0, queryIntent, 1107296256);
        final Bundle queryExtras = new Bundle();
        if (this.mAppSearchData != null) {
            queryExtras.putParcelable("app_data", (Parcelable)this.mAppSearchData);
        }
        final Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        final Resources resources = this.getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        voiceIntent.putExtra("calling_package", (searchActivity == null) ? null : searchActivity.flattenToShortString());
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }
    
    private Intent createIntentFromSuggestion(final Cursor c, final int actionKey, final String actionMsg) {
        try {
            String action = SuggestionsAdapter.getColumnString(c, "suggest_intent_action");
            if (action == null) {
                action = this.mSearchable.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data = SuggestionsAdapter.getColumnString(c, "suggest_intent_data");
            if (data == null) {
                data = this.mSearchable.getSuggestIntentData();
            }
            if (data != null) {
                final String id = SuggestionsAdapter.getColumnString(c, "suggest_intent_data_id");
                if (id != null) {
                    data = data + "/" + Uri.encode(id);
                }
            }
            final Uri dataUri = (data == null) ? null : Uri.parse(data);
            final String query = SuggestionsAdapter.getColumnString(c, "suggest_intent_query");
            final String extraData = SuggestionsAdapter.getColumnString(c, "suggest_intent_extra_data");
            return this.createIntent(action, dataUri, extraData, query, actionKey, actionMsg);
        }
        catch (final RuntimeException e) {
            int rowNum;
            try {
                rowNum = c.getPosition();
            }
            catch (final RuntimeException e2) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", (Throwable)e);
            return null;
        }
    }
    
    void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.refreshAutoCompleteResults(this.mSearchSrcTextView);
        }
        else {
            SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.doBeforeTextChanged(this.mSearchSrcTextView);
            SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.doAfterTextChanged(this.mSearchSrcTextView);
        }
    }
    
    static boolean isLandscapeMode(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
    
    static {
        PRE_API_29_HIDDEN_METHOD_INVOKER = ((Build.VERSION.SDK_INT < 29) ? new PreQAutoCompleteTextViewReflector() : null);
    }
    
    static class SavedState extends AbsSavedState
    {
        boolean isIconified;
        public static final Parcelable.Creator<SavedState> CREATOR;
        
        SavedState(final Parcelable superState) {
            super(superState);
        }
        
        public SavedState(final Parcel source, final ClassLoader loader) {
            super(source, loader);
            this.isIconified = (boolean)source.readValue((ClassLoader)null);
        }
        
        public void writeToParcel(final Parcel dest, final int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue((Object)this.isIconified);
        }
        
        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode((Object)this)) + " isIconified=" + this.isIconified + "}";
        }
        
        static {
            CREATOR = (Parcelable.Creator)new Parcelable.ClassLoaderCreator<SavedState>() {
                public SavedState createFromParcel(final Parcel in, final ClassLoader loader) {
                    return new SavedState(in, loader);
                }
                
                public SavedState createFromParcel(final Parcel in) {
                    return new SavedState(in, null);
                }
                
                public SavedState[] newArray(final int size) {
                    return new SavedState[size];
                }
            };
        }
    }
    
    private static class UpdatableTouchDelegate extends TouchDelegate
    {
        private final View mDelegateView;
        private final Rect mTargetBounds;
        private final Rect mActualBounds;
        private final Rect mSlopBounds;
        private final int mSlop;
        private boolean mDelegateTargeted;
        
        public UpdatableTouchDelegate(final Rect targetBounds, final Rect actualBounds, final View delegateView) {
            super(targetBounds, delegateView);
            this.mSlop = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            this.mTargetBounds = new Rect();
            this.mSlopBounds = new Rect();
            this.mActualBounds = new Rect();
            this.setBounds(targetBounds, actualBounds);
            this.mDelegateView = delegateView;
        }
        
        public void setBounds(final Rect desiredBounds, final Rect actualBounds) {
            this.mTargetBounds.set(desiredBounds);
            this.mSlopBounds.set(desiredBounds);
            this.mSlopBounds.inset(-this.mSlop, -this.mSlop);
            this.mActualBounds.set(actualBounds);
        }
        
        public boolean onTouchEvent(final MotionEvent event) {
            final int x = (int)event.getX();
            final int y = (int)event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            boolean handled = false;
            switch (event.getAction()) {
                case 0: {
                    if (this.mTargetBounds.contains(x, y)) {
                        this.mDelegateTargeted = true;
                        sendToDelegate = true;
                        break;
                    }
                    break;
                }
                case 1:
                case 2: {
                    sendToDelegate = this.mDelegateTargeted;
                    if (sendToDelegate && !this.mSlopBounds.contains(x, y)) {
                        hit = false;
                        break;
                    }
                    break;
                }
                case 3: {
                    sendToDelegate = this.mDelegateTargeted;
                    this.mDelegateTargeted = false;
                    break;
                }
            }
            if (sendToDelegate) {
                if (hit && !this.mActualBounds.contains(x, y)) {
                    event.setLocation((float)(this.mDelegateView.getWidth() / 2), (float)(this.mDelegateView.getHeight() / 2));
                }
                else {
                    event.setLocation((float)(x - this.mActualBounds.left), (float)(y - this.mActualBounds.top));
                }
                handled = this.mDelegateView.dispatchTouchEvent(event);
            }
            return handled;
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView
    {
        private int mThreshold;
        private SearchView mSearchView;
        private boolean mHasPendingShowSoftInputRequest;
        final Runnable mRunShowSoftInputIfNecessary;
        
        public SearchAutoComplete(final Context context) {
            this(context, null);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet attrs) {
            this(context, attrs, R.attr.autoCompleteTextViewStyle);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet attrs, final int defStyle) {
            super(context, attrs, defStyle);
            this.mRunShowSoftInputIfNecessary = (Runnable)new Runnable() {
                public void run() {
                    SearchAutoComplete.this.showSoftInputIfNecessary();
                }
            };
            this.mThreshold = this.getThreshold();
        }
        
        protected void onFinishInflate() {
            super.onFinishInflate();
            final DisplayMetrics metrics = this.getResources().getDisplayMetrics();
            this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), metrics));
        }
        
        void setSearchView(final SearchView searchView) {
            this.mSearchView = searchView;
        }
        
        public void setThreshold(final int threshold) {
            super.setThreshold(threshold);
            this.mThreshold = threshold;
        }
        
        boolean isEmpty() {
            return TextUtils.getTrimmedLength((CharSequence)this.getText()) == 0;
        }
        
        protected void replaceText(final CharSequence text) {
        }
        
        public void performCompletion() {
        }
        
        public void onWindowFocusChanged(final boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.mSearchView.hasFocus() && this.getVisibility() == 0) {
                this.mHasPendingShowSoftInputRequest = true;
                if (SearchView.isLandscapeMode(this.getContext())) {
                    this.ensureImeVisible();
                }
            }
        }
        
        protected void onFocusChanged(final boolean focused, final int direction, final Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.mSearchView.onTextFocusChanged();
        }
        
        public boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }
        
        public boolean onKeyPreIme(final int keyCode, final KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    final KeyEvent.DispatcherState state = this.getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, (Object)this);
                    }
                    return true;
                }
                if (event.getAction() == 1) {
                    final KeyEvent.DispatcherState state = this.getKeyDispatcherState();
                    if (state != null) {
                        state.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.mSearchView.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }
        
        private int getSearchViewTextMinWidthDp() {
            final Configuration config = this.getResources().getConfiguration();
            final int widthDp = config.screenWidthDp;
            final int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600 || (widthDp >= 640 && heightDp >= 480)) {
                return 192;
            }
            return 160;
        }
        
        @Override
        public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
            final InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.mHasPendingShowSoftInputRequest) {
                this.removeCallbacks(this.mRunShowSoftInputIfNecessary);
                this.post(this.mRunShowSoftInputIfNecessary);
            }
            return ic;
        }
        
        void showSoftInputIfNecessary() {
            if (this.mHasPendingShowSoftInputRequest) {
                final InputMethodManager imm = (InputMethodManager)this.getContext().getSystemService("input_method");
                imm.showSoftInput((View)this, 0);
                this.mHasPendingShowSoftInputRequest = false;
            }
        }
        
        void setImeVisibility(final boolean visible) {
            final InputMethodManager imm = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (!visible) {
                this.mHasPendingShowSoftInputRequest = false;
                this.removeCallbacks(this.mRunShowSoftInputIfNecessary);
                imm.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if (imm.isActive((View)this)) {
                this.mHasPendingShowSoftInputRequest = false;
                this.removeCallbacks(this.mRunShowSoftInputIfNecessary);
                imm.showSoftInput((View)this, 0);
                return;
            }
            this.mHasPendingShowSoftInputRequest = true;
        }
        
        void ensureImeVisible() {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.setInputMethodMode(this, 1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.ensureImeVisible(this);
            }
        }
    }
    
    private static class PreQAutoCompleteTextViewReflector
    {
        private Method mDoBeforeTextChanged;
        private Method mDoAfterTextChanged;
        private Method mEnsureImeVisible;
        
        @SuppressLint({ "DiscouragedPrivateApi", "SoonBlockedPrivateApi" })
        PreQAutoCompleteTextViewReflector() {
            this.mDoBeforeTextChanged = null;
            this.mDoAfterTextChanged = null;
            this.mEnsureImeVisible = null;
            preApi29Check();
            try {
                (this.mDoBeforeTextChanged = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", (Class<?>[])new Class[0])).setAccessible(true);
            }
            catch (final NoSuchMethodException ex) {}
            try {
                (this.mDoAfterTextChanged = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", (Class<?>[])new Class[0])).setAccessible(true);
            }
            catch (final NoSuchMethodException ex2) {}
            try {
                (this.mEnsureImeVisible = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE)).setAccessible(true);
            }
            catch (final NoSuchMethodException ex3) {}
        }
        
        void doBeforeTextChanged(final AutoCompleteTextView view) {
            preApi29Check();
            if (this.mDoBeforeTextChanged != null) {
                try {
                    this.mDoBeforeTextChanged.invoke((Object)view, new Object[0]);
                }
                catch (final Exception ex) {}
            }
        }
        
        void doAfterTextChanged(final AutoCompleteTextView view) {
            preApi29Check();
            if (this.mDoAfterTextChanged != null) {
                try {
                    this.mDoAfterTextChanged.invoke((Object)view, new Object[0]);
                }
                catch (final Exception ex) {}
            }
        }
        
        void ensureImeVisible(final AutoCompleteTextView view) {
            preApi29Check();
            if (this.mEnsureImeVisible != null) {
                try {
                    this.mEnsureImeVisible.invoke((Object)view, new Object[] { true });
                }
                catch (final Exception ex) {}
            }
        }
        
        private static void preApi29Check() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }
    
    @RequiresApi(29)
    static class Api29Impl
    {
        private Api29Impl() {
        }
        
        @DoNotInline
        static void setInputMethodMode(final SearchAutoComplete searchAutoComplete, final int mode) {
            searchAutoComplete.setInputMethodMode(mode);
        }
        
        @DoNotInline
        static void refreshAutoCompleteResults(final AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }
    }
    
    public interface OnQueryTextListener
    {
        boolean onQueryTextSubmit(final String p0);
        
        boolean onQueryTextChange(final String p0);
    }
    
    public interface OnCloseListener
    {
        boolean onClose();
    }
    
    public interface OnSuggestionListener
    {
        boolean onSuggestionSelect(final int p0);
        
        boolean onSuggestionClick(final int p0);
    }
}
