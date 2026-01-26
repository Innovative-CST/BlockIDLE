package android.app;

import android.os.Parcel;
import android.content.ComponentName;
import android.os.Parcelable;

public final class SearchableInfo implements Parcelable
{
    @NonNull
    public static final Creator<SearchableInfo> CREATOR;
    
    SearchableInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestAuthority() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public ComponentName getSearchActivity() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldRewriteQueryFromData() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldRewriteQueryFromText() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSettingsDescriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestPath() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestSelection() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestIntentAction() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSuggestIntentData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSuggestThreshold() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHintId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getVoiceSearchEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getVoiceSearchLaunchWebSearch() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getVoiceSearchLaunchRecognizer() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoiceLanguageModeId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoicePromptTextId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoiceLanguageId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVoiceMaxResults() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getImeOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldIncludeInGlobalSearch() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean queryAfterZeroResults() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean autoUrlDetect() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
