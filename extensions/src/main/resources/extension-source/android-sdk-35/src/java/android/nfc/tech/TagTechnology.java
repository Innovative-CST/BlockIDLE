package android.nfc.tech;

import java.io.IOException;
import android.nfc.Tag;
import java.io.Closeable;

public interface TagTechnology extends Closeable
{
    Tag getTag();
    
    void connect() throws IOException;
    
    void close() throws IOException;
    
    boolean isConnected();
}
