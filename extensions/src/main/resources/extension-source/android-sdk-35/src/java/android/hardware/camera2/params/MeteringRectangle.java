package android.hardware.camera2.params;

import android.graphics.Rect;
import android.util.Size;
import android.graphics.Point;

public final class MeteringRectangle
{
    public static final int METERING_WEIGHT_DONT_CARE = 0;
    public static final int METERING_WEIGHT_MAX = 1000;
    public static final int METERING_WEIGHT_MIN = 0;
    
    public MeteringRectangle(final int x, final int y, final int width, final int height, final int meteringWeight) {
        throw new RuntimeException("Stub!");
    }
    
    public MeteringRectangle(final Point xy, final Size dimensions, final int meteringWeight) {
        throw new RuntimeException("Stub!");
    }
    
    public MeteringRectangle(final Rect rect, final int meteringWeight) {
        throw new RuntimeException("Stub!");
    }
    
    public int getX() {
        throw new RuntimeException("Stub!");
    }
    
    public int getY() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMeteringWeight() {
        throw new RuntimeException("Stub!");
    }
    
    public Point getUpperLeftPoint() {
        throw new RuntimeException("Stub!");
    }
    
    public Size getSize() {
        throw new RuntimeException("Stub!");
    }
    
    public Rect getRect() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equals(final MeteringRectangle other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
