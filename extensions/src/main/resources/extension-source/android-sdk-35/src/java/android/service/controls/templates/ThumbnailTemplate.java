package android.service.controls.templates;

import android.graphics.drawable.Icon;

public final class ThumbnailTemplate extends ControlTemplate
{
    public ThumbnailTemplate(@NonNull final String templateId, final boolean active, @NonNull final Icon thumbnail, @NonNull final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon getThumbnail() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getTemplateType() {
        throw new RuntimeException("Stub!");
    }
}
