package android.service.autofill;

import android.widget.RemoteViews;

public final class Presentations
{
    Presentations() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteViews getMenuPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InlinePresentation getInlinePresentation() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public RemoteViews getDialogPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public InlinePresentation getInlineTooltipPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMenuPresentation(@NonNull final RemoteViews value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInlinePresentation(@NonNull final InlinePresentation value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDialogPresentation(@NonNull final RemoteViews value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInlineTooltipPresentation(@NonNull final InlinePresentation value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Presentations build() {
            throw new RuntimeException("Stub!");
        }
    }
}
