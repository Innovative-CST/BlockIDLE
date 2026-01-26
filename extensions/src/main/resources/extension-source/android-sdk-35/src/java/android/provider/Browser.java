package android.provider;

import android.content.Context;

public class Browser
{
    public static final String EXTRA_APPLICATION_ID = "com.android.browser.application_id";
    public static final String EXTRA_CREATE_NEW_TAB = "create_new_tab";
    public static final String EXTRA_HEADERS = "com.android.browser.headers";
    public static final String INITIAL_ZOOM_LEVEL = "browser.initialZoomLevel";
    
    public Browser() {
        throw new RuntimeException("Stub!");
    }
    
    public static final void sendString(final Context context, final String string) {
        throw new RuntimeException("Stub!");
    }
}
