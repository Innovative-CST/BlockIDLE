package android.content;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.net.Uri;
import android.database.Cursor;

@Deprecated
public class CursorLoader extends AsyncTaskLoader<Cursor>
{
    @Deprecated
    public CursorLoader(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CursorLoader(final Context context, final Uri uri, final String[] projection, final String selection, final String[] selectionArgs, final String sortOrder) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public Cursor loadInBackground() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void cancelLoadInBackground() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void deliverResult(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onStartLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onStopLoading() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCanceled(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onReset() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Uri getUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUri(final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String[] getProjection() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProjection(final String[] projection) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSelection() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelection(final String selection) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String[] getSelectionArgs() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectionArgs(final String[] selectionArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getSortOrder() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSortOrder(final String sortOrder) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
