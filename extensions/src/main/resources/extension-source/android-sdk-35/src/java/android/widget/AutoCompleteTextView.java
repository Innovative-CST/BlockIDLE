package android.widget;

import android.graphics.Rect;
import android.view.inputmethod.CompletionInfo;
import android.view.KeyEvent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;

public class AutoCompleteTextView extends EditText implements Filter.FilterListener
{
    public AutoCompleteTextView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AutoCompleteTextView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AutoCompleteTextView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AutoCompleteTextView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AutoCompleteTextView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes, final Resources.Theme popupTheme) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnClickListener(final OnClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompletionHint(final CharSequence hint) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getCompletionHint() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownWidth(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownAnchor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownAnchor(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getDropDownBackground() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownBackgroundDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownBackgroundResource(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownVerticalOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownVerticalOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownHorizontalOffset(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownHorizontalOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getThreshold() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThreshold(final int threshold) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnItemClickListener(final AdapterView.OnItemClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnItemSelectedListener(final AdapterView.OnItemSelectedListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AdapterView.OnItemClickListener getItemClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public AdapterView.OnItemSelectedListener getItemSelectedListener() {
        throw new RuntimeException("Stub!");
    }
    
    public AdapterView.OnItemClickListener getOnItemClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    public AdapterView.OnItemSelectedListener getOnItemSelectedListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDismissListener(final OnDismissListener dismissListener) {
        throw new RuntimeException("Stub!");
    }
    
    public ListAdapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends ListAdapter & Filterable> void setAdapter(final T adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyPreIme(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean enoughToFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public final void refreshAutoCompleteResults() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPopupShowing() {
        throw new RuntimeException("Stub!");
    }
    
    protected CharSequence convertSelectionToString(final Object selectedItem) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearListSelection() {
        throw new RuntimeException("Stub!");
    }
    
    public void setListSelection(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public int getListSelection() {
        throw new RuntimeException("Stub!");
    }
    
    protected void performFiltering(final CharSequence text, final int keyCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void performCompletion() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onCommitCompletion(final CompletionInfo completion) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPerformingCompletion() {
        throw new RuntimeException("Stub!");
    }
    
    public void setText(final CharSequence text, final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    protected void replaceText(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onFilterComplete(final int count) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDisplayHint(final int hint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onFocusChanged(final boolean focused, final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public void dismissDropDown() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean setFrame(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputMethodMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputMethodMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void showDropDown() {
        throw new RuntimeException("Stub!");
    }
    
    public void setValidator(final Validator validator) {
        throw new RuntimeException("Stub!");
    }
    
    public Validator getValidator() {
        throw new RuntimeException("Stub!");
    }
    
    public void performValidation() {
        throw new RuntimeException("Stub!");
    }
    
    protected Filter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface Validator
    {
        boolean isValid(final CharSequence p0);
        
        CharSequence fixText(final CharSequence p0);
    }
    
    public interface OnDismissListener
    {
        void onDismiss();
    }
}
