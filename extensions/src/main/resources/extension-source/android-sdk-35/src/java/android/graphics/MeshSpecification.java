package android.graphics;

public class MeshSpecification
{
    public static final int ALPHA_TYPE_OPAQUE = 1;
    public static final int ALPHA_TYPE_PREMULTIPLIED = 2;
    public static final int ALPHA_TYPE_UNKNOWN = 0;
    public static final int ALPHA_TYPE_UNPREMULTIPLIED = 3;
    public static final int TYPE_FLOAT = 0;
    public static final int TYPE_FLOAT2 = 1;
    public static final int TYPE_FLOAT3 = 2;
    public static final int TYPE_FLOAT4 = 3;
    public static final int TYPE_UBYTE4 = 4;
    
    MeshSpecification() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MeshSpecification make(@NonNull final Attribute[] attributes, final int vertexStride, @NonNull final Varying[] varyings, @NonNull final String vertexShader, @NonNull final String fragmentShader) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MeshSpecification make(@NonNull final Attribute[] attributes, final int vertexStride, @NonNull final Varying[] varyings, @NonNull final String vertexShader, @NonNull final String fragmentShader, @NonNull final ColorSpace colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static MeshSpecification make(@NonNull final Attribute[] attributes, final int vertexStride, @NonNull final Varying[] varyings, @NonNull final String vertexShader, @NonNull final String fragmentShader, @NonNull final ColorSpace colorSpace, final int alphaType) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Attribute
    {
        public Attribute(final int type, final int offset, @NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
            throw new RuntimeException("Stub!");
        }
        
        public int getOffset() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Varying
    {
        public Varying(final int type, @NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        public int getType() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
