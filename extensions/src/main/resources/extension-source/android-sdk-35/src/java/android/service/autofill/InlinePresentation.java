package android.service.autofill;

import android.os.Parcel;
import android.widget.inline.InlinePresentationSpec;
import android.app.slice.Slice;
import android.os.Parcelable;

public final class InlinePresentation implements Parcelable
{
    @NonNull
    public static final Creator<InlinePresentation> CREATOR;
    
    public InlinePresentation(@NonNull final Slice slice, @NonNull final InlinePresentationSpec inlinePresentationSpec, final boolean pinned) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static InlinePresentation createTooltipPresentation(@NonNull final Slice slice, @NonNull final InlinePresentationSpec spec) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Slice getSlice() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public InlinePresentationSpec getInlinePresentationSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPinned() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
