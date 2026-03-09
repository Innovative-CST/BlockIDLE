package android.util;

import java.io.IOException;
import java.io.Reader;
import java.io.Closeable;

public final class JsonReader implements Closeable
{
    public JsonReader(final Reader in) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLenient(final boolean lenient) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLenient() {
        throw new RuntimeException("Stub!");
    }
    
    public void beginArray() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void endArray() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void beginObject() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void endObject() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNext() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonToken peek() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public String nextName() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public String nextString() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean nextBoolean() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void nextNull() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public double nextDouble() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public long nextLong() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public int nextInt() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void skipValue() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
