package android.os;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.io.File;

public class RecoverySystem
{
    RecoverySystem() {
        throw new RuntimeException("Stub!");
    }
    
    public static void verifyPackage(final File packageFile, final ProgressListener listener, final File deviceCertsZipFile) throws GeneralSecurityException, IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void installPackage(final Context context, final File packageFile) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void rebootWipeUserData(final Context context) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void rebootWipeCache(final Context context) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public interface ProgressListener
    {
        void onProgress(final int p0);
    }
}
