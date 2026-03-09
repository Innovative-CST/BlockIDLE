package android.renderscript;

@Deprecated
public class Type extends BaseObj
{
    Type() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Element getElement() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getX() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getY() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getZ() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getYuv() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasMipmaps() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasFaces() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Type createX(final RenderScript rs, final Element e, final int dimX) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Type createXY(final RenderScript rs, final Element e, final int dimX, final int dimY) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Type createXYZ(final RenderScript rs, final Element e, final int dimX, final int dimY, final int dimZ) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class Builder
    {
        @Deprecated
        public Builder(final RenderScript rs, final Element e) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setX(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setY(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setZ(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setMipmaps(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setFaces(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder setYuvFormat(final int yuvFormat) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Type create() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public enum CubemapFace
    {
        @Deprecated
        POSITIVE_X, 
        @Deprecated
        NEGATIVE_X, 
        @Deprecated
        POSITIVE_Y, 
        @Deprecated
        NEGATIVE_Y, 
        @Deprecated
        POSITIVE_Z, 
        @Deprecated
        NEGATIVE_Z, 
        @Deprecated
        POSITVE_X, 
        @Deprecated
        POSITVE_Y, 
        @Deprecated
        POSITVE_Z;
    }
}
