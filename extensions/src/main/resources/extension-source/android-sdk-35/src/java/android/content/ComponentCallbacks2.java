package android.content;

public interface ComponentCallbacks2 extends ComponentCallbacks
{
    public static final int TRIM_MEMORY_BACKGROUND = 40;
    @Deprecated
    public static final int TRIM_MEMORY_COMPLETE = 80;
    @Deprecated
    public static final int TRIM_MEMORY_MODERATE = 60;
    @Deprecated
    public static final int TRIM_MEMORY_RUNNING_CRITICAL = 15;
    @Deprecated
    public static final int TRIM_MEMORY_RUNNING_LOW = 10;
    @Deprecated
    public static final int TRIM_MEMORY_RUNNING_MODERATE = 5;
    public static final int TRIM_MEMORY_UI_HIDDEN = 20;
    
    void onTrimMemory(final int p0);
}
