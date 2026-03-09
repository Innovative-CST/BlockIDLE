package android.opengl;

import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.nio.Buffer;
import java.io.IOException;
import java.io.InputStream;

public class ETC1Util
{
    public ETC1Util() {
        throw new RuntimeException("Stub!");
    }
    
    public static void loadTexture(final int target, final int level, final int border, final int fallbackFormat, final int fallbackType, final InputStream input) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static void loadTexture(final int target, final int level, final int border, final int fallbackFormat, final int fallbackType, final ETC1Texture texture) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isETC1Supported() {
        throw new RuntimeException("Stub!");
    }
    
    public static ETC1Texture createTexture(final InputStream input) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static ETC1Texture compressTexture(final Buffer input, final int width, final int height, final int pixelSize, final int stride) {
        throw new RuntimeException("Stub!");
    }
    
    public static void writeTexture(final ETC1Texture texture, final OutputStream output) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public static class ETC1Texture
    {
        public ETC1Texture(final int width, final int height, final ByteBuffer data) {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public ByteBuffer getData() {
            throw new RuntimeException("Stub!");
        }
    }
}
