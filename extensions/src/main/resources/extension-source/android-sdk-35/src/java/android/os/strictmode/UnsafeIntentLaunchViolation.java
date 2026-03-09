package android.os.strictmode;

import android.content.Intent;

public final class UnsafeIntentLaunchViolation extends Violation
{
    public UnsafeIntentLaunchViolation(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
}
