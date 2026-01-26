package android.print;

import android.content.ComponentName;
import java.util.List;

public final class PrintManager
{
    PrintManager() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PrintJob> getPrintJobs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrintJob print(@NonNull final String printJobName, @NonNull final PrintDocumentAdapter documentAdapter, @Nullable final PrintAttributes attributes) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPrintServiceEnabled(@NonNull final ComponentName service) {
        throw new RuntimeException("Stub!");
    }
}
