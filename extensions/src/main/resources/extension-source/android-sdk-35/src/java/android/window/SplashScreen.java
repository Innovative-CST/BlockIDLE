package android.window;

public interface SplashScreen
{
    public static final int SPLASH_SCREEN_STYLE_ICON = 1;
    public static final int SPLASH_SCREEN_STYLE_SOLID_COLOR = 0;
    
    void setOnExitAnimationListener(@NonNull final OnExitAnimationListener p0);
    
    void clearOnExitAnimationListener();
    
    void setSplashScreenTheme(final int p0);
    
    public interface OnExitAnimationListener
    {
        void onSplashScreenExit(@NonNull final SplashScreenView p0);
    }
}
