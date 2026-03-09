package android.view.inspector;

import android.graphics.Color;

public interface PropertyReader
{
    void readBoolean(final int p0, final boolean p1);
    
    void readByte(final int p0, final byte p1);
    
    void readChar(final int p0, final char p1);
    
    void readDouble(final int p0, final double p1);
    
    void readFloat(final int p0, final float p1);
    
    void readInt(final int p0, final int p1);
    
    void readLong(final int p0, final long p1);
    
    void readShort(final int p0, final short p1);
    
    void readObject(final int p0, @Nullable final Object p1);
    
    void readColor(final int p0, final int p1);
    
    void readColor(final int p0, final long p1);
    
    void readColor(final int p0, @Nullable final Color p1);
    
    void readGravity(final int p0, final int p1);
    
    void readIntEnum(final int p0, final int p1);
    
    void readIntFlag(final int p0, final int p1);
    
    void readResourceId(final int p0, final int p1);
    
    public static class PropertyTypeMismatchException extends RuntimeException
    {
        public PropertyTypeMismatchException(final int id, @NonNull final String expectedPropertyType, @NonNull final String actualPropertyType, @Nullable final String propertyName) {
            throw new RuntimeException("Stub!");
        }
        
        public PropertyTypeMismatchException(final int id, @NonNull final String expectedPropertyType, @NonNull final String actualPropertyType) {
            throw new RuntimeException("Stub!");
        }
    }
}
