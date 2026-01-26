package android.view.inspector;

public class StaticInspectionCompanionProvider implements InspectionCompanionProvider
{
    public StaticInspectionCompanionProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public <T> InspectionCompanion<T> provide(@NonNull final Class<T> cls) {
        throw new RuntimeException("Stub!");
    }
}
