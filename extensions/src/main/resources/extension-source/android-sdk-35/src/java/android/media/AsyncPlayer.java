package android.media;

import android.net.Uri;
import android.content.Context;

public class AsyncPlayer
{
    public AsyncPlayer(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void play(final Context context, final Uri uri, final boolean looping, final int stream) {
        throw new RuntimeException("Stub!");
    }
    
    public void play(@NonNull final Context context, @NonNull final Uri uri, final boolean looping, @NonNull final AudioAttributes attributes) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
}
