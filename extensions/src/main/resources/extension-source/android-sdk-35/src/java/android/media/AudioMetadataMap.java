package android.media;

public interface AudioMetadataMap extends AudioMetadataReadMap
{
    @Nullable
     <T> T remove(@NonNull final AudioMetadata.Key<T> p0);
    
    @Nullable
     <T> T set(@NonNull final AudioMetadata.Key<T> p0, @NonNull final T p1);
}
