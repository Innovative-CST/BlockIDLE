package android.gesture;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;

public class GestureStore
{
    public static final int ORIENTATION_INVARIANT = 1;
    public static final int ORIENTATION_SENSITIVE = 2;
    public static final int SEQUENCE_INVARIANT = 1;
    public static final int SEQUENCE_SENSITIVE = 2;
    
    public GestureStore() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientationStyle(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrientationStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSequenceType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSequenceType() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getGestureEntries() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<Prediction> recognize(final Gesture gesture) {
        throw new RuntimeException("Stub!");
    }
    
    public void addGesture(final String entryName, final Gesture gesture) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeGesture(final String entryName, final Gesture gesture) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeEntry(final String entryName) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<Gesture> getGestures(final String entryName) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public void save(final OutputStream stream) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void save(final OutputStream stream, final boolean closeStream) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void load(final InputStream stream) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void load(final InputStream stream, final boolean closeStream) throws IOException {
        throw new RuntimeException("Stub!");
    }
}
