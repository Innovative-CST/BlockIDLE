package android.media;

public interface VolumeAutomation
{
    @NonNull
    VolumeShaper createVolumeShaper(@NonNull final VolumeShaper.Configuration p0);
}
