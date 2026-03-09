package javax.sql;

import java.util.EventListener;

public interface StatementEventListener extends EventListener
{
    void statementClosed(final StatementEvent p0);
    
    void statementErrorOccurred(final StatementEvent p0);
}
