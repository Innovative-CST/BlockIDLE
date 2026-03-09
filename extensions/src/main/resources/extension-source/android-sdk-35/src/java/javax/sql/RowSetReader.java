package javax.sql;

import java.sql.SQLException;

public interface RowSetReader
{
    void readData(final RowSetInternal p0) throws SQLException;
}
