package android.graphics;

import java.nio.ShortBuffer;
import java.nio.Buffer;

public class Mesh
{
    public static final int TRIANGLES = 0;
    public static final int TRIANGLE_STRIP = 1;
    
    public Mesh(@NonNull final MeshSpecification meshSpec, final int mode, @NonNull final Buffer vertexBuffer, final int vertexCount, @NonNull final RectF bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public Mesh(@NonNull final MeshSpecification meshSpec, final int mode, @NonNull final Buffer vertexBuffer, final int vertexCount, @NonNull final ShortBuffer indexBuffer, @NonNull final RectF bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorUniform(@NonNull final String uniformName, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorUniform(@NonNull final String uniformName, final long color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorUniform(@NonNull final String uniformName, @NonNull final Color color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatUniform(@NonNull final String uniformName, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatUniform(@NonNull final String uniformName, final float value1, final float value2) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatUniform(@NonNull final String uniformName, final float value1, final float value2, final float value3) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatUniform(@NonNull final String uniformName, final float value1, final float value2, final float value3, final float value4) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatUniform(@NonNull final String uniformName, @NonNull final float[] values) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntUniform(@NonNull final String uniformName, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntUniform(@NonNull final String uniformName, final int value1, final int value2) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntUniform(@NonNull final String uniformName, final int value1, final int value2, final int value3) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntUniform(@NonNull final String uniformName, final int value1, final int value2, final int value3, final int value4) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntUniform(@NonNull final String uniformName, @NonNull final int[] values) {
        throw new RuntimeException("Stub!");
    }
}
