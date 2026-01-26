package android.gesture;

import java.util.ArrayList;
import java.util.Set;

public abstract class GestureLibrary
{
    protected final GestureStore mStore;
    
    protected GestureLibrary() {
        this.mStore = null;
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean save();
    
    public abstract boolean load();
    
    public boolean isReadOnly() {
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
}
