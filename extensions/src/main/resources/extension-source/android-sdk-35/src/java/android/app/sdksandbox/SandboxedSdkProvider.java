package android.app.sdksandbox;

import android.view.View;
import android.os.Bundle;
import android.content.Context;

public abstract class SandboxedSdkProvider
{
    public SandboxedSdkProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public final void attachContext(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public abstract SandboxedSdk onLoadSdk(@NonNull final Bundle p0) throws LoadSdkException;
    
    public void beforeUnloadSdk() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public abstract View getView(@NonNull final Context p0, @NonNull final Bundle p1, final int p2, final int p3);
}
