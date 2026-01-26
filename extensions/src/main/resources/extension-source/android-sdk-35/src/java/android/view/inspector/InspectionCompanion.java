package android.view.inspector;

public interface InspectionCompanion<T>
{
    void mapProperties(@NonNull final PropertyMapper p0);
    
    void readProperties(@NonNull final T p0, @NonNull final PropertyReader p1);
    
    public static class UninitializedPropertyMapException extends RuntimeException
    {
        public UninitializedPropertyMapException() {
            throw new RuntimeException("Stub!");
        }
    }
}
