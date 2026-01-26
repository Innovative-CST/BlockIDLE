package android.content;

import java.util.Iterator;

public interface EntityIterator extends Iterator<Entity>
{
    void reset();
    
    void close();
}
