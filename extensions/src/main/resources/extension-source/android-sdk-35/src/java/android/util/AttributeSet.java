package android.util;

public interface AttributeSet
{
    int getAttributeCount();
    
    default String getAttributeNamespace(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    String getAttributeName(final int p0);
    
    String getAttributeValue(final int p0);
    
    String getAttributeValue(final String p0, final String p1);
    
    String getPositionDescription();
    
    int getAttributeNameResource(final int p0);
    
    int getAttributeListValue(final String p0, final String p1, final String[] p2, final int p3);
    
    boolean getAttributeBooleanValue(final String p0, final String p1, final boolean p2);
    
    int getAttributeResourceValue(final String p0, final String p1, final int p2);
    
    int getAttributeIntValue(final String p0, final String p1, final int p2);
    
    int getAttributeUnsignedIntValue(final String p0, final String p1, final int p2);
    
    float getAttributeFloatValue(final String p0, final String p1, final float p2);
    
    int getAttributeListValue(final int p0, final String[] p1, final int p2);
    
    boolean getAttributeBooleanValue(final int p0, final boolean p1);
    
    int getAttributeResourceValue(final int p0, final int p1);
    
    int getAttributeIntValue(final int p0, final int p1);
    
    int getAttributeUnsignedIntValue(final int p0, final int p1);
    
    float getAttributeFloatValue(final int p0, final float p1);
    
    String getIdAttribute();
    
    String getClassAttribute();
    
    int getIdAttributeResourceValue(final int p0);
    
    int getStyleAttribute();
}
