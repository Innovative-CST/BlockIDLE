package javax.sql;

import java.sql.SQLException;

public interface RowSetWriter
{
    boolean writeData(final RowSetInternal p0) throws SQLException;
}
