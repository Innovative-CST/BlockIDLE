package android.telecom;

import java.util.function.Consumer;

public interface CallControlCallback
{
    void onSetActive(@NonNull final Consumer<Boolean> p0);
    
    void onSetInactive(@NonNull final Consumer<Boolean> p0);
    
    void onAnswer(final int p0, @NonNull final Consumer<Boolean> p1);
    
    void onDisconnect(@NonNull final DisconnectCause p0, @NonNull final Consumer<Boolean> p1);
    
    void onCallStreamingStarted(@NonNull final Consumer<Boolean> p0);
}
