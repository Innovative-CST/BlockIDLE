package android.gesture;

import android.os.Parcel;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import android.os.Parcelable;

public class Gesture implements Parcelable
{
    @NonNull
    public static final Creator<Gesture> CREATOR;
    
    public Gesture() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<GestureStroke> getStrokes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStrokesCount() {
        throw new RuntimeException("Stub!");
    }
    
    public void addStroke(final GestureStroke stroke) {
        throw new RuntimeException("Stub!");
    }
    
    public float getLength() {
        throw new RuntimeException("Stub!");
    }
    
    public RectF getBoundingBox() {
        throw new RuntimeException("Stub!");
    }
    
    public Path toPath() {
        throw new RuntimeException("Stub!");
    }
    
    public Path toPath(final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public Path toPath(final int width, final int height, final int edge, final int numSample) {
        throw new RuntimeException("Stub!");
    }
    
    public Path toPath(final Path path, final int width, final int height, final int edge, final int numSample) {
        throw new RuntimeException("Stub!");
    }
    
    public long getID() {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap toBitmap(final int width, final int height, final int edge, final int numSample, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap toBitmap(final int width, final int height, final int inset, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
