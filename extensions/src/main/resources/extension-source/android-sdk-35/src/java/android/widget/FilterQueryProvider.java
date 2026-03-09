package android.widget;

import android.database.Cursor;

public interface FilterQueryProvider
{
    Cursor runQuery(final CharSequence p0);
}
