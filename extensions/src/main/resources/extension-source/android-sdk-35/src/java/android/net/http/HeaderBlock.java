package android.net.http;

import java.util.Map;
import java.util.List;

public abstract class HeaderBlock
{
    public HeaderBlock() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract List<Map.Entry<String, String>> getAsList();
    
    @NonNull
    public abstract Map<String, List<String>> getAsMap();
}
