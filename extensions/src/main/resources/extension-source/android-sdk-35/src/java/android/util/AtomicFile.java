package android.util;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class AtomicFile
{
    public AtomicFile(final File baseName) {
        throw new RuntimeException("Stub!");
    }
    
    public File getBaseFile() {
        throw new RuntimeException("Stub!");
    }
    
    public void delete() {
        throw new RuntimeException("Stub!");
    }
    
    public FileOutputStream startWrite() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void finishWrite(final FileOutputStream str) {
        throw new RuntimeException("Stub!");
    }
    
    public void failWrite(final FileOutputStream str) {
        throw new RuntimeException("Stub!");
    }
    
    public FileInputStream openRead() throws FileNotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastModifiedTime() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] readFully() throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
