package android.widget;

import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.graphics.Rect;
import android.app.SearchableInfo;
import android.util.AttributeSet;
import android.content.Context;
import android.view.CollapsibleActionView;

public class SearchView extends LinearLayout implements CollapsibleActionView
{
    public SearchView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SearchView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SearchView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SearchView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setSearchableInfo(final SearchableInfo searchable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImeOptions(final int imeOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public int getImeOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputType(final int inputType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean requestFocus(final int direction, final Rect previouslyFocusedRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clearFocus() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnQueryTextListener(final OnQueryTextListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCloseListener(final OnCloseListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnQueryTextFocusChangeListener(final OnFocusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSuggestionListener(final OnSuggestionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnSearchClickListener(final OnClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getQuery() {
        throw new RuntimeException("Stub!");
    }
    
    public void setQuery(final CharSequence query, final boolean submit) {
        throw new RuntimeException("Stub!");
    }
    
    public void setQueryHint(@Nullable final CharSequence hint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getQueryHint() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIconifiedByDefault(final boolean iconified) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isIconfiedByDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIconifiedByDefault() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIconified(final boolean iconify) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIconified() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubmitButtonEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSubmitButtonEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setQueryRefinementEnabled(final boolean enable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isQueryRefinementEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSuggestionsAdapter(final CursorAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public CursorAdapter getSuggestionsAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxWidth(final int maxpixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onWindowFocusChanged(final boolean hasWindowFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onActionViewCollapsed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onActionViewExpanded() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnSuggestionListener
    {
        boolean onSuggestionSelect(final int p0);
        
        boolean onSuggestionClick(final int p0);
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
}
