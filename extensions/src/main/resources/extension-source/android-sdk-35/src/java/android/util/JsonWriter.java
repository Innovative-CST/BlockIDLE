package android.util;

import java.io.IOException;
import java.io.Writer;
import java.io.Closeable;

public final class JsonWriter implements Closeable
{
    public JsonWriter(final Writer out) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndent(final String indent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLenient(final boolean lenient) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLenient() {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter beginArray() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter endArray() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter beginObject() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter endObject() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter name(final String name) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter value(final String value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter nullValue() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter value(final boolean value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter value(final double value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter value(final long value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public JsonWriter value(final Number value) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void flush() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
