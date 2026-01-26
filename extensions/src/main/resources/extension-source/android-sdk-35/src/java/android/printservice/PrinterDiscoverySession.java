package android.printservice;

import android.os.CancellationSignal;
import android.print.PrinterId;
import android.print.PrinterInfo;
import java.util.List;

public abstract class PrinterDiscoverySession
{
    public PrinterDiscoverySession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final List<PrinterInfo> getPrinters() {
        throw new RuntimeException("Stub!");
    }
    
    public final void addPrinters(@NonNull final List<PrinterInfo> printers) {
        throw new RuntimeException("Stub!");
    }
    
    public final void removePrinters(@NonNull final List<PrinterId> printerIds) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onStartPrinterDiscovery(@NonNull final List<PrinterId> p0);
    
    public abstract void onStopPrinterDiscovery();
    
    public abstract void onValidatePrinters(@NonNull final List<PrinterId> p0);
    
    public abstract void onStartPrinterStateTracking(@NonNull final PrinterId p0);
    
    public void onRequestCustomPrinterIcon(@NonNull final PrinterId printerId, @NonNull final CancellationSignal cancellationSignal, @NonNull final CustomPrinterIconCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onStopPrinterStateTracking(@NonNull final PrinterId p0);
    
    @NonNull
    public final List<PrinterId> getTrackedPrinters() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onDestroy();
    
    public final boolean isDestroyed() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isPrinterDiscoveryStarted() {
        throw new RuntimeException("Stub!");
    }
}
