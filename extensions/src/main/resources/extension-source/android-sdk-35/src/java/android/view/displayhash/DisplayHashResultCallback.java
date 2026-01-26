package android.view.displayhash;

public interface DisplayHashResultCallback
{
    public static final int DISPLAY_HASH_ERROR_INVALID_BOUNDS = -2;
    public static final int DISPLAY_HASH_ERROR_INVALID_HASH_ALGORITHM = -5;
    public static final int DISPLAY_HASH_ERROR_MISSING_WINDOW = -3;
    public static final int DISPLAY_HASH_ERROR_NOT_VISIBLE_ON_SCREEN = -4;
    public static final int DISPLAY_HASH_ERROR_TOO_MANY_REQUESTS = -6;
    public static final int DISPLAY_HASH_ERROR_UNKNOWN = -1;
    
    void onDisplayHashResult(@NonNull final DisplayHash p0);
    
    void onDisplayHashError(final int p0);
}
