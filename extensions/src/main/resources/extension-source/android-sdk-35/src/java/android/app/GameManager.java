package android.app;

public final class GameManager
{
    public static final int GAME_MODE_BATTERY = 3;
    public static final int GAME_MODE_CUSTOM = 4;
    public static final int GAME_MODE_PERFORMANCE = 2;
    public static final int GAME_MODE_STANDARD = 1;
    public static final int GAME_MODE_UNSUPPORTED = 0;
    
    GameManager() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGameMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGameState(@NonNull final GameState gameState) {
        throw new RuntimeException("Stub!");
    }
}
