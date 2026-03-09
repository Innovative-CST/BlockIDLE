package androidx.appcompat.widget;

import java.util.List;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import android.widget.TextView;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import android.util.TypedValue;
import android.text.TextUtils;
import androidx.appcompat.R;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.os.Bundle;
import android.util.Log;
import android.database.Cursor;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.view.View;
import androidx.cursoradapter.widget.ResourceCursorAdapter;

class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener
{
    private static final boolean DBG = false;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_NONE = 0;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_ALL = 2;
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private final Context mProviderContext;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private final int mCommitIconResId;
    private boolean mClosed;
    private int mQueryRefinement;
    private ColorStateList mUrlColor;
    static final int INVALID_INDEX = -1;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private int mFlagsCol;
    
    public SuggestionsAdapter(final Context context, final SearchView searchView, final SearchableInfo searchable, final WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor)null, true);
        this.mClosed = false;
        this.mQueryRefinement = 1;
        this.mText1Col = -1;
        this.mText2Col = -1;
        this.mText2UrlCol = -1;
        this.mIconName1Col = -1;
        this.mIconName2Col = -1;
        this.mFlagsCol = -1;
        this.mSearchView = searchView;
        this.mSearchable = searchable;
        this.mCommitIconResId = searchView.getSuggestionCommitIconResId();
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = outsideDrawablesCache;
    }
    
    public void setQueryRefinement(final int refineWhat) {
        this.mQueryRefinement = refineWhat;
    }
    
    public int getQueryRefinement() {
        return this.mQueryRefinement;
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    public Cursor runQueryOnBackgroundThread(final CharSequence constraint) {
        final String query = (constraint == null) ? "" : constraint.toString();
        Cursor cursor = null;
        if (this.mSearchView.getVisibility() != 0 || this.mSearchView.getWindowVisibility() != 0) {
            return null;
        }
        try {
            cursor = this.getSearchManagerSuggestions(this.mSearchable, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        }
        catch (final RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", (Throwable)e);
        }
        return null;
    }
    
    public void close() {
        this.changeCursor(null);
        this.mClosed = true;
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.updateSpinnerState(this.getCursor());
    }
    
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.updateSpinnerState(this.getCursor());
    }
    
    private void updateSpinnerState(final Cursor cursor) {
        final Bundle extras = (cursor != null) ? cursor.getExtras() : null;
        if (extras != null && extras.getBoolean("in_progress")) {
            return;
        }
    }
    
    public void changeCursor(final Cursor c) {
        if (this.mClosed) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c != null) {
                c.close();
            }
            return;
        }
        try {
            super.changeCursor(c);
            if (c != null) {
                this.mText1Col = c.getColumnIndex("suggest_text_1");
                this.mText2Col = c.getColumnIndex("suggest_text_2");
                this.mText2UrlCol = c.getColumnIndex("suggest_text_2_url");
                this.mIconName1Col = c.getColumnIndex("suggest_icon_1");
                this.mIconName2Col = c.getColumnIndex("suggest_icon_2");
                this.mFlagsCol = c.getColumnIndex("suggest_flags");
            }
        }
        catch (final Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)e);
        }
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup parent) {
        final View v = super.newView(context, cursor, parent);
        v.setTag((Object)new ChildViewCache(v));
        final ImageView iconRefine = (ImageView)v.findViewById(R.id.edit_query);
        iconRefine.setImageResource(this.mCommitIconResId);
        return v;
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final ChildViewCache views = (ChildViewCache)view.getTag();
        int flags = 0;
        if (this.mFlagsCol != -1) {
            flags = cursor.getInt(this.mFlagsCol);
        }
        if (views.mText1 != null) {
            final String text1 = getStringOrNull(cursor, this.mText1Col);
            this.setViewText(views.mText1, (CharSequence)text1);
        }
        if (views.mText2 != null) {
            CharSequence text2 = (CharSequence)getStringOrNull(cursor, this.mText2UrlCol);
            if (text2 != null) {
                text2 = this.formatUrl(text2);
            }
            else {
                text2 = (CharSequence)getStringOrNull(cursor, this.mText2Col);
            }
            if (TextUtils.isEmpty(text2)) {
                if (views.mText1 != null) {
                    views.mText1.setSingleLine(false);
                    views.mText1.setMaxLines(2);
                }
            }
            else if (views.mText1 != null) {
                views.mText1.setSingleLine(true);
                views.mText1.setMaxLines(1);
            }
            this.setViewText(views.mText2, text2);
        }
        if (views.mIcon1 != null) {
            this.setViewDrawable(views.mIcon1, this.getIcon1(cursor), 4);
        }
        if (views.mIcon2 != null) {
            this.setViewDrawable(views.mIcon2, this.getIcon2(cursor), 8);
        }
        if (this.mQueryRefinement == 2 || (this.mQueryRefinement == 1 && (flags & 0x1) != 0x0)) {
            views.mIconRefine.setVisibility(0);
            views.mIconRefine.setTag((Object)views.mText1.getText());
            views.mIconRefine.setOnClickListener((View.OnClickListener)this);
        }
        else {
            views.mIconRefine.setVisibility(8);
        }
    }
    
    public void onClick(final View v) {
        final Object tag = v.getTag();
        if (tag instanceof CharSequence) {
            this.mSearchView.onQueryRefine((CharSequence)tag);
        }
    }
    
    private CharSequence formatUrl(final CharSequence url) {
        if (this.mUrlColor == null) {
            final TypedValue colorValue = new TypedValue();
            this.mProviderContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, colorValue, true);
            this.mUrlColor = this.mProviderContext.getResources().getColorStateList(colorValue.resourceId);
        }
        final SpannableString text = new SpannableString(url);
        text.setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.mUrlColor, (ColorStateList)null), 0, url.length(), 33);
        return (CharSequence)text;
    }
    
    private void setViewText(final TextView v, final CharSequence text) {
        v.setText(text);
        if (TextUtils.isEmpty(text)) {
            v.setVisibility(8);
        }
        else {
            v.setVisibility(0);
        }
    }
    
    private Drawable getIcon1(final Cursor cursor) {
        if (this.mIconName1Col == -1) {
            return null;
        }
        final String value = cursor.getString(this.mIconName1Col);
        final Drawable drawable = this.getDrawableFromResourceValue(value);
        if (drawable != null) {
            return drawable;
        }
        return this.getDefaultIcon1();
    }
    
    private Drawable getIcon2(final Cursor cursor) {
        if (this.mIconName2Col == -1) {
            return null;
        }
        final String value = cursor.getString(this.mIconName2Col);
        return this.getDrawableFromResourceValue(value);
    }
    
    private void setViewDrawable(final ImageView v, final Drawable drawable, final int nullVisibility) {
        v.setImageDrawable(drawable);
        if (drawable == null) {
            v.setVisibility(nullVisibility);
        }
        else {
            v.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
        }
    }
    
    public CharSequence convertToString(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String query = getColumnString(cursor, "suggest_intent_query");
        if (query != null) {
            return (CharSequence)query;
        }
        if (this.mSearchable.shouldRewriteQueryFromData()) {
            final String data = getColumnString(cursor, "suggest_intent_data");
            if (data != null) {
                return (CharSequence)data;
            }
        }
        if (this.mSearchable.shouldRewriteQueryFromText()) {
            final String text1 = getColumnString(cursor, "suggest_text_1");
            if (text1 != null) {
                return (CharSequence)text1;
            }
        }
        return null;
    }
    
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        }
        catch (final RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)e);
            final View v = this.newView(this.mProviderContext, this.getCursor(), parent);
            if (v != null) {
                final ChildViewCache views = (ChildViewCache)v.getTag();
                final TextView tv = views.mText1;
                tv.setText((CharSequence)e.toString());
            }
            return v;
        }
    }
    
    public View getDropDownView(final int position, final View convertView, final ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        }
        catch (final RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)e);
            final View v = this.newDropDownView(this.mProviderContext, this.getCursor(), parent);
            if (v != null) {
                final ChildViewCache views = (ChildViewCache)v.getTag();
                final TextView tv = views.mText1;
                tv.setText((CharSequence)e.toString());
            }
            return v;
        }
    }
    
    private Drawable getDrawableFromResourceValue(final String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals((Object)drawableId)) {
            return null;
        }
        try {
            final int resourceId = Integer.parseInt(drawableId);
            final String drawableUri = "android.resource://" + this.mProviderContext.getPackageName() + "/" + resourceId;
            Drawable drawable = this.checkIconCache(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            drawable = ContextCompat.getDrawable(this.mProviderContext, resourceId);
            this.storeInIconCache(drawableUri, drawable);
            return drawable;
        }
        catch (final NumberFormatException nfe) {
            Drawable drawable2 = this.checkIconCache(drawableId);
            if (drawable2 != null) {
                return drawable2;
            }
            final Uri uri = Uri.parse(drawableId);
            drawable2 = this.getDrawable(uri);
            this.storeInIconCache(drawableId, drawable2);
            return drawable2;
        }
        catch (final Resources.NotFoundException nfe2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }
    
    private Drawable getDrawable(final Uri uri) {
        try {
            final String scheme = uri.getScheme();
            if ("android.resource".equals((Object)scheme)) {
                try {
                    return this.getDrawableFromResourceUri(uri);
                }
                catch (final Resources.NotFoundException ex) {
                    throw new FileNotFoundException("Resource does not exist: " + (Object)uri);
                }
            }
            final InputStream stream = this.mProviderContext.getContentResolver().openInputStream(uri);
            if (stream == null) {
                throw new FileNotFoundException("Failed to open " + (Object)uri);
            }
            try {
                return Drawable.createFromStream(stream, (String)null);
            }
            finally {
                try {
                    stream.close();
                }
                catch (final IOException ex2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + (Object)uri, (Throwable)ex2);
                }
            }
        }
        catch (final FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + (Object)uri + ", " + fnfe.getMessage());
            return null;
        }
    }
    
    private Drawable checkIconCache(final String resourceUri) {
        final Drawable.ConstantState cached = (Drawable.ConstantState)this.mOutsideDrawablesCache.get((Object)resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }
    
    private void storeInIconCache(final String resourceUri, final Drawable drawable) {
        if (drawable != null) {
            this.mOutsideDrawablesCache.put((Object)resourceUri, (Object)drawable.getConstantState());
        }
    }
    
    private Drawable getDefaultIcon1() {
        final Drawable drawable = this.getActivityIconWithCache(this.mSearchable.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.mProviderContext.getPackageManager().getDefaultActivityIcon();
    }
    
    private Drawable getActivityIconWithCache(final ComponentName component) {
        final String componentIconKey = component.flattenToShortString();
        if (this.mOutsideDrawablesCache.containsKey((Object)componentIconKey)) {
            final Drawable.ConstantState cached = (Drawable.ConstantState)this.mOutsideDrawablesCache.get((Object)componentIconKey);
            return (cached == null) ? null : cached.newDrawable(this.mProviderContext.getResources());
        }
        final Drawable drawable = this.getActivityIcon(component);
        final Drawable.ConstantState toCache = (drawable == null) ? null : drawable.getConstantState();
        this.mOutsideDrawablesCache.put((Object)componentIconKey, (Object)toCache);
        return drawable;
    }
    
    private Drawable getActivityIcon(final ComponentName component) {
        final PackageManager pm = this.mProviderContext.getPackageManager();
        ActivityInfo activityInfo;
        try {
            activityInfo = pm.getActivityInfo(component, 128);
        }
        catch (final PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
        final int iconId = activityInfo.getIconResource();
        if (iconId == 0) {
            return null;
        }
        final String pkg = component.getPackageName();
        final Drawable drawable = pm.getDrawable(pkg, iconId, activityInfo.applicationInfo);
        if (drawable == null) {
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        }
        return drawable;
    }
    
    public static String getColumnString(final Cursor cursor, final String columnName) {
        final int col = cursor.getColumnIndex(columnName);
        return getStringOrNull(cursor, col);
    }
    
    private static String getStringOrNull(final Cursor cursor, final int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        }
        catch (final Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)e);
            return null;
        }
    }
    
    Drawable getDrawableFromResourceUri(final Uri uri) throws FileNotFoundException {
        final String authority = uri.getAuthority();
        if (TextUtils.isEmpty((CharSequence)authority)) {
            throw new FileNotFoundException("No authority: " + (Object)uri);
        }
        Resources r;
        try {
            r = this.mProviderContext.getPackageManager().getResourcesForApplication(authority);
        }
        catch (final PackageManager.NameNotFoundException ex) {
            throw new FileNotFoundException("No package found for authority: " + (Object)uri);
        }
        final List<String> path = (List<String>)uri.getPathSegments();
        if (path == null) {
            throw new FileNotFoundException("No path: " + (Object)uri);
        }
        final int len = path.size();
        int id = 0;
        Label_0254: {
            if (len == 1) {
                try {
                    id = Integer.parseInt((String)path.get(0));
                    break Label_0254;
                }
                catch (final NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + (Object)uri);
                }
            }
            if (len != 2) {
                throw new FileNotFoundException("More than two path segments: " + (Object)uri);
            }
            id = r.getIdentifier((String)path.get(1), (String)path.get(0), authority);
        }
        if (id == 0) {
            throw new FileNotFoundException("No resource found for: " + (Object)uri);
        }
        return r.getDrawable(id);
    }
    
    Cursor getSearchManagerSuggestions(final SearchableInfo searchable, final String query, final int limit) {
        if (searchable == null) {
            return null;
        }
        final String authority = searchable.getSuggestAuthority();
        if (authority == null) {
            return null;
        }
        final Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query("").fragment("");
        final String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        final String selection = searchable.getSuggestSelection();
        String[] selArgs = null;
        if (selection != null) {
            selArgs = new String[] { query };
        }
        else {
            uriBuilder.appendPath(query);
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        final Uri uri = uriBuilder.build();
        return this.mProviderContext.getContentResolver().query(uri, (String[])null, selection, selArgs, (String)null);
    }
    
    private static final class ChildViewCache
    {
        public final TextView mText1;
        public final TextView mText2;
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        
        public ChildViewCache(final View v) {
            this.mText1 = (TextView)v.findViewById(16908308);
            this.mText2 = (TextView)v.findViewById(16908309);
            this.mIcon1 = (ImageView)v.findViewById(16908295);
            this.mIcon2 = (ImageView)v.findViewById(16908296);
            this.mIconRefine = (ImageView)v.findViewById(R.id.edit_query);
        }
    }
}
