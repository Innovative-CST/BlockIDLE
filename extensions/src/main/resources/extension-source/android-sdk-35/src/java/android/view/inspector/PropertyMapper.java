package android.view.inspector;

import java.util.Set;
import java.util.function.IntFunction;

public interface PropertyMapper
{
    int mapBoolean(@NonNull final String p0, final int p1);
    
    int mapByte(@NonNull final String p0, final int p1);
    
    int mapChar(@NonNull final String p0, final int p1);
    
    int mapDouble(@NonNull final String p0, final int p1);
    
    int mapFloat(@NonNull final String p0, final int p1);
    
    int mapInt(@NonNull final String p0, final int p1);
    
    int mapLong(@NonNull final String p0, final int p1);
    
    int mapShort(@NonNull final String p0, final int p1);
    
    int mapObject(@NonNull final String p0, final int p1);
    
    int mapColor(@NonNull final String p0, final int p1);
    
    int mapGravity(@NonNull final String p0, final int p1);
    
    int mapIntEnum(@NonNull final String p0, final int p1, @NonNull final IntFunction<String> p2);
    
    int mapResourceId(@NonNull final String p0, final int p1);
    
    int mapIntFlag(@NonNull final String p0, final int p1, @NonNull final IntFunction<Set<String>> p2);
    
    public static class PropertyConflictException extends RuntimeException
    {
        public PropertyConflictException(@NonNull final String name, @NonNull final String newPropertyType, @NonNull final String existingPropertyType) {
            throw new RuntimeException("Stub!");
        }
    }
}
