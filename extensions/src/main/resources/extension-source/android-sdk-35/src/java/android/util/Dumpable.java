package android.util;

import java.io.PrintWriter;

public interface Dumpable
{
    @NonNull
    default String getDumpableName() {
        throw new RuntimeException("Stub!");
    }
    
    void dump(@NonNull final PrintWriter p0, @Nullable final String[] p1);
}
