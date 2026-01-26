package android.content;

public class ClipboardManager extends android.text.ClipboardManager
{
    ClipboardManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrimaryClip(@NonNull final ClipData clip) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearPrimaryClip() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClipData getPrimaryClip() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClipDescription getPrimaryClipDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasPrimaryClip() {
        throw new RuntimeException("Stub!");
    }
    
    public void addPrimaryClipChangedListener(final OnPrimaryClipChangedListener what) {
        throw new RuntimeException("Stub!");
    }
    
    public void removePrimaryClipChangedListener(final OnPrimaryClipChangedListener what) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setText(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean hasText() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnPrimaryClipChangedListener
    {
        void onPrimaryClipChanged();
    }
}
