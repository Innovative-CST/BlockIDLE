package android.view.inspector;

public interface InspectionCompanionProvider
{
    @Nullable
     <T> InspectionCompanion<T> provide(@NonNull final Class<T> p0);
}
