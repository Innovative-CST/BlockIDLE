package android.app;

import android.content.Intent;
import android.content.ComponentName;

public class TaskInfo
{
    @Nullable
    public ComponentName baseActivity;
    @NonNull
    public Intent baseIntent;
    public boolean isRunning;
    public int numActivities;
    @Nullable
    public ComponentName origActivity;
    @Nullable
    public ActivityManager.TaskDescription taskDescription;
    public int taskId;
    @Nullable
    public ComponentName topActivity;
    
    TaskInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
