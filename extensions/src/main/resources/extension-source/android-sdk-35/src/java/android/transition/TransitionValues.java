package android.transition;

import android.view.View;
import java.util.Map;

public class TransitionValues
{
    @NonNull
    public final Map<String, Object> values;
    @NonNull
    public View view;
    
    @Deprecated
    public TransitionValues() {
        this.values = null;
        throw new RuntimeException("Stub!");
    }
    
    public TransitionValues(@NonNull final View view) {
        this.values = null;
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
