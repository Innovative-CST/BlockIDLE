package android.media;

import android.icu.util.ULocale;
import android.os.Parcel;
import java.util.Locale;
import java.util.Map;
import android.os.Parcelable;

public final class AudioPresentation implements Parcelable
{
    public static final int CONTENT_COMMENTARY = 5;
    public static final int CONTENT_DIALOG = 4;
    public static final int CONTENT_EMERGENCY = 6;
    public static final int CONTENT_HEARING_IMPAIRED = 3;
    public static final int CONTENT_MAIN = 0;
    public static final int CONTENT_MUSIC_AND_EFFECTS = 1;
    public static final int CONTENT_UNKNOWN = -1;
    public static final int CONTENT_VISUALLY_IMPAIRED = 2;
    public static final int CONTENT_VOICEOVER = 7;
    @NonNull
    public static final Creator<AudioPresentation> CREATOR;
    public static final int MASTERED_FOR_3D = 3;
    public static final int MASTERED_FOR_HEADPHONE = 4;
    public static final int MASTERED_FOR_STEREO = 1;
    public static final int MASTERED_FOR_SURROUND = 2;
    public static final int MASTERING_NOT_INDICATED = 0;
    public static final int PRESENTATION_ID_UNKNOWN = -1;
    public static final int PROGRAM_ID_UNKNOWN = -1;
    
    AudioPresentation() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPresentationId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getProgramId() {
        throw new RuntimeException("Stub!");
    }
    
    public Map<Locale, String> getLabels() {
        throw new RuntimeException("Stub!");
    }
    
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMasteringIndication() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAudioDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSpokenSubtitles() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasDialogueEnhancement() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int presentationId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setProgramId(final int programId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocale(@NonNull final ULocale language) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMasteringIndication(final int masteringIndication) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLabels(@NonNull final Map<ULocale, CharSequence> labels) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasAudioDescription(final boolean audioDescriptionAvailable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasSpokenSubtitles(final boolean spokenSubtitlesAvailable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setHasDialogueEnhancement(final boolean dialogueEnhancementAvailable) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AudioPresentation build() {
            throw new RuntimeException("Stub!");
        }
    }
}
