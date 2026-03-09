package android.view;

import android.util.Pair;
import java.util.List;
import android.os.LocaleList;
import android.view.autofill.AutofillValue;
import android.view.autofill.AutofillId;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.graphics.Matrix;

public abstract class ViewStructure
{
    public ViewStructure() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setId(final int p0, final String p1, final String p2, final String p3);
    
    public abstract void setDimens(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    public abstract void setTransformation(final Matrix p0);
    
    public abstract void setElevation(final float p0);
    
    public abstract void setAlpha(final float p0);
    
    public abstract void setVisibility(final int p0);
    
    public abstract void setEnabled(final boolean p0);
    
    public abstract void setClickable(final boolean p0);
    
    public abstract void setLongClickable(final boolean p0);
    
    public abstract void setContextClickable(final boolean p0);
    
    public abstract void setFocusable(final boolean p0);
    
    public abstract void setFocused(final boolean p0);
    
    public abstract void setAccessibilityFocused(final boolean p0);
    
    public abstract void setCheckable(final boolean p0);
    
    public abstract void setChecked(final boolean p0);
    
    public abstract void setSelected(final boolean p0);
    
    public abstract void setActivated(final boolean p0);
    
    public abstract void setOpaque(final boolean p0);
    
    public abstract void setClassName(final String p0);
    
    public abstract void setContentDescription(final CharSequence p0);
    
    public abstract void setText(final CharSequence p0);
    
    public abstract void setText(final CharSequence p0, final int p1, final int p2);
    
    public abstract void setTextStyle(final float p0, final int p1, final int p2, final int p3);
    
    public abstract void setTextLines(final int[] p0, final int[] p1);
    
    public void setTextIdEntry(@NonNull final String entryName) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setHint(final CharSequence p0);
    
    public void setHintIdEntry(@NonNull final String entryName) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract CharSequence getText();
    
    public abstract int getTextSelectionStart();
    
    public abstract int getTextSelectionEnd();
    
    public abstract CharSequence getHint();
    
    public abstract Bundle getExtras();
    
    public abstract boolean hasExtras();
    
    public abstract void setChildCount(final int p0);
    
    public abstract int addChildCount(final int p0);
    
    public abstract int getChildCount();
    
    public abstract ViewStructure newChild(final int p0);
    
    public abstract ViewStructure asyncNewChild(final int p0);
    
    @Nullable
    public GetCredentialRequest getPendingCredentialRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public OutcomeReceiver<GetCredentialResponse, GetCredentialException> getPendingCredentialCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public abstract AutofillId getAutofillId();
    
    public abstract void setAutofillId(@NonNull final AutofillId p0);
    
    public abstract void setAutofillId(@NonNull final AutofillId p0, final int p1);
    
    public abstract void setAutofillType(final int p0);
    
    public abstract void setAutofillHints(@Nullable final String[] p0);
    
    public abstract void setAutofillValue(final AutofillValue p0);
    
    public abstract void setAutofillOptions(final CharSequence[] p0);
    
    public void setImportantForAutofill(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setReceiveContentMimeTypes(@Nullable final String[] mimeTypes) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setInputType(final int p0);
    
    public abstract void setDataIsSensitive(final boolean p0);
    
    public void setMinTextEms(final int minEms) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxTextEms(final int maxEms) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxTextLength(final int maxLength) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void asyncCommit();
    
    public abstract void setWebDomain(@Nullable final String p0);
    
    public abstract void setLocaleList(final LocaleList p0);
    
    public abstract HtmlInfo.Builder newHtmlInfoBuilder(@NonNull final String p0);
    
    public abstract void setHtmlInfo(@NonNull final HtmlInfo p0);
    
    public void setPendingCredentialRequest(@NonNull final GetCredentialRequest request, @NonNull final OutcomeReceiver<GetCredentialResponse, GetCredentialException> callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearCredentialManagerRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class HtmlInfo
    {
        public HtmlInfo() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract String getTag();
        
        @Nullable
        public abstract List<Pair<String, String>> getAttributes();
        
        public abstract static class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public abstract Builder addAttribute(@NonNull final String p0, @NonNull final String p1);
            
            public abstract HtmlInfo build();
        }
    }
}
