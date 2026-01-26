package android.view.animation;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class GridLayoutAnimationController extends LayoutAnimationController
{
    public static final int DIRECTION_BOTTOM_TO_TOP = 2;
    public static final int DIRECTION_HORIZONTAL_MASK = 1;
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int DIRECTION_TOP_TO_BOTTOM = 0;
    public static final int DIRECTION_VERTICAL_MASK = 2;
    public static final int PRIORITY_COLUMN = 1;
    public static final int PRIORITY_NONE = 0;
    public static final int PRIORITY_ROW = 2;
    
    public GridLayoutAnimationController(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridLayoutAnimationController(final Animation animation) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GridLayoutAnimationController(final Animation animation, final float columnDelay, final float rowDelay) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public float getColumnDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColumnDelay(final float columnDelay) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRowDelay() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRowDelay(final float rowDelay) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDirection(final int direction) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDirectionPriority() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDirectionPriority(final int directionPriority) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean willOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected long getDelayForView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public static class AnimationParameters extends LayoutAnimationController.AnimationParameters
    {
        public int column;
        public int columnsCount;
        public int row;
        public int rowsCount;
        
        public AnimationParameters() {
            throw new RuntimeException("Stub!");
        }
    }
}
