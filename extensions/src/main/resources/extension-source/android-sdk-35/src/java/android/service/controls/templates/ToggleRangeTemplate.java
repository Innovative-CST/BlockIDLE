package android.service.controls.templates;

public final class ToggleRangeTemplate extends ControlTemplate
{
    public ToggleRangeTemplate(@NonNull final String templateId, @NonNull final ControlButton button, @NonNull final RangeTemplate range) {
        throw new RuntimeException("Stub!");
    }
    
    public ToggleRangeTemplate(@NonNull final String templateId, final boolean checked, @NonNull final CharSequence actionDescription, @NonNull final RangeTemplate range) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public RangeTemplate getRange() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getActionDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getTemplateType() {
        throw new RuntimeException("Stub!");
    }
}
