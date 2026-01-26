package android.media;

public interface AudioMetadataReadMap
{
     <T> boolean containsKey(@NonNull final AudioMetadata.Key<T> p0);
    
    @NonNull
    AudioMetadataMap dup();
    
    @Nullable
     <T> T get(@NonNull final AudioMetadata.Key<T> p0);
    
    int size();
}
