package android.hardware.camera2.params;

import android.graphics.Point;
import android.graphics.Rect;

public final class Face
{
    public static final int ID_UNSUPPORTED = -1;
    public static final int SCORE_MAX = 100;
    public static final int SCORE_MIN = 1;
    
    Face() {
        throw new RuntimeException("Stub!");
    }
    
    public Rect getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public int getScore() {
        throw new RuntimeException("Stub!");
    }
    
    public int getId() {
        throw new RuntimeException("Stub!");
    }
    
    public Point getLeftEyePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public Point getRightEyePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public Point getMouthPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final Face current) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setBounds(@NonNull final Rect bounds) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setScore(final int score) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(final int id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLeftEyePosition(@NonNull final Point leftEyePosition) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRightEyePosition(@NonNull final Point rightEyePosition) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMouthPosition(@NonNull final Point mouthPosition) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Face build() {
            throw new RuntimeException("Stub!");
        }
    }
}
