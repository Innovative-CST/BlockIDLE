package android.text;

@Deprecated
public abstract class ClipboardManager
{
    @Deprecated
    public ClipboardManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract CharSequence getText();
    
    @Deprecated
    public abstract void setText(final CharSequence p0);
    
    @Deprecated
    public abstract boolean hasText();
}
