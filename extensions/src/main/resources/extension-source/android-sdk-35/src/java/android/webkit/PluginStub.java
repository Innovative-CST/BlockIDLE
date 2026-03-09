package android.webkit;

import android.view.View;
import android.content.Context;

public interface PluginStub
{
    View getEmbeddedView(final int p0, final Context p1);
    
    View getFullScreenView(final int p0, final Context p1);
}
