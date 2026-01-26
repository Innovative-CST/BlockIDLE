package android.webkit;

import java.util.Map;
import android.net.Uri;

public interface WebResourceRequest
{
    Uri getUrl();
    
    boolean isForMainFrame();
    
    boolean isRedirect();
    
    boolean hasGesture();
    
    String getMethod();
    
    Map<String, String> getRequestHeaders();
}
