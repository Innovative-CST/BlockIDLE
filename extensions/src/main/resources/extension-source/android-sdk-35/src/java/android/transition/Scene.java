package android.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class Scene
{
    public Scene(final ViewGroup sceneRoot) {
        throw new RuntimeException("Stub!");
    }
    
    public Scene(final ViewGroup sceneRoot, final View layout) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Scene(final ViewGroup sceneRoot, final ViewGroup layout) {
        throw new RuntimeException("Stub!");
    }
    
    public static Scene getSceneForLayout(final ViewGroup sceneRoot, final int layoutId, final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public ViewGroup getSceneRoot() {
        throw new RuntimeException("Stub!");
    }
    
    public void exit() {
        throw new RuntimeException("Stub!");
    }
    
    public void enter() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Scene getCurrentScene(@NonNull final ViewGroup sceneRoot) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnterAction(final Runnable action) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExitAction(final Runnable action) {
        throw new RuntimeException("Stub!");
    }
}
