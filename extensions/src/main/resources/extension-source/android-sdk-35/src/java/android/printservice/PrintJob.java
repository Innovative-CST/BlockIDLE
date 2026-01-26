package android.printservice;

import android.print.PrintJobInfo;
import android.print.PrintJobId;

public final class PrintJob
{
    PrintJob() {
        throw new RuntimeException("Stub!");
    }
    
    public PrintJobId getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrintJobInfo getInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PrintDocument getDocument() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isQueued() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStarted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBlocked() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCompleted() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFailed() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCancelled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean start() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean block(@Nullable final String reason) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean complete() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean fail(@Nullable final String error) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean cancel() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgress(final float progress) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStatus(@Nullable final CharSequence status) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStatus(final int statusResId) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setTag(@NonNull final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public String getAdvancedStringOption(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAdvancedOption(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAdvancedIntOption(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
