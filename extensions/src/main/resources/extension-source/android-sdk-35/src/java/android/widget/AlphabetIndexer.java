package android.widget;

import android.database.Cursor;
import android.database.DataSetObserver;

public class AlphabetIndexer extends DataSetObserver implements SectionIndexer
{
    protected CharSequence mAlphabet;
    protected int mColumnIndex;
    protected Cursor mDataCursor;
    
    public AlphabetIndexer(final Cursor cursor, final int sortedColumnIndex, final CharSequence alphabet) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object[] getSections() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCursor(final Cursor cursor) {
        throw new RuntimeException("Stub!");
    }
    
    protected int compare(final String word, final String letter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getPositionForSection(final int sectionIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSectionForPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInvalidated() {
        throw new RuntimeException("Stub!");
    }
}
