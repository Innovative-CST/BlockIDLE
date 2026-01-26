package android.database;

import android.database.sqlite.SQLiteDatabase;

public interface DatabaseErrorHandler
{
    void onCorruption(final SQLiteDatabase p0);
}
