package android.provider;

import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.graphics.Typeface;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.content.Context;

@Deprecated
public class FontsContract
{
    FontsContract() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static void requestFonts(@NonNull final Context context, @NonNull final FontRequest request, @NonNull final Handler handler, @Nullable final CancellationSignal cancellationSignal, @NonNull final FontRequestCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull final Context context, @Nullable final CancellationSignal cancellationSignal, @NonNull final FontRequest request) throws PackageManager.NameNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Typeface buildTypeface(@NonNull final Context context, @Nullable final CancellationSignal cancellationSignal, @NonNull final FontInfo[] fonts) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static final class Columns implements BaseColumns
    {
        @Deprecated
        public static final String FILE_ID = "file_id";
        @Deprecated
        public static final String ITALIC = "font_italic";
        @Deprecated
        public static final String RESULT_CODE = "result_code";
        @Deprecated
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        @Deprecated
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        @Deprecated
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        @Deprecated
        public static final int RESULT_CODE_OK = 0;
        @Deprecated
        public static final String TTC_INDEX = "font_ttc_index";
        @Deprecated
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        @Deprecated
        public static final String WEIGHT = "font_weight";
        
        Columns() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class FontFamilyResult
    {
        @Deprecated
        public static final int STATUS_OK = 0;
        @Deprecated
        public static final int STATUS_REJECTED = 3;
        @Deprecated
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        @Deprecated
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        
        FontFamilyResult() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getStatusCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public FontInfo[] getFonts() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class FontInfo
    {
        FontInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public Uri getUri() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getTtcIndex() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Nullable
        public FontVariationAxis[] getAxes() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getWeight() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public boolean isItalic() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public int getResultCode() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class FontRequestCallback
    {
        @Deprecated
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        @Deprecated
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        @Deprecated
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        @Deprecated
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        @Deprecated
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        @Deprecated
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        
        @Deprecated
        public FontRequestCallback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onTypefaceRetrieved(final Typeface typeface) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onTypefaceRequestFailed(final int reason) {
            throw new RuntimeException("Stub!");
        }
    }
}
